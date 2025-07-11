package org.hl7.fhir.r5.utils.client;

import lombok.Getter;
import lombok.Setter;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.Bundle;
import org.hl7.fhir.r5.model.OperationOutcome;
import org.hl7.fhir.r5.model.Resource;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent;
import org.hl7.fhir.r5.utils.client.network.ByteUtils;
import org.hl7.fhir.r5.utils.client.network.Client;
import org.hl7.fhir.r5.utils.client.network.ResourceRequest;
import org.hl7.fhir.utilities.FHIRBaseToolingClient;
import org.hl7.fhir.utilities.ToolingClientLogger;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.http.HTTPHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Very Simple RESTful client. This is purely for use in the standalone
 * tools jar packages. It doesn't support many features, only what the tools
 * need.
 * <p>
 * To use, initialize class and set base service URI as follows:
 *
 * <pre><code>
 * FHIRSimpleClient fhirClient = new FHIRSimpleClient();
 * fhirClient.initialize("http://my.fhir.domain/myServiceRoot");
 * </code></pre>
 * <p>
 * Default Accept and Content-Type headers are application/fhir+xml and application/fhir+json.
 * <p>
 * These can be changed by invoking the following setter functions:
 *
 * <pre><code>
 * setPreferredResourceFormat()
 * setPreferredFeedFormat()
 * </code></pre>
 * <p>
 * TODO Review all sad paths.
 *
 * @author Claude Nanjo
 */
public class FHIRToolingClient extends FHIRBaseToolingClient {

  private static final Logger logger = LoggerFactory.getLogger(FHIRToolingClient.class);


  public static final String DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssK";
  public static final String DATE_FORMAT = "yyyy-MM-dd";
  public static final String hostKey = "http.proxyHost";
  public static final String portKey = "http.proxyPort";

  private String base;
  private ResourceAddress resourceAddress;
  @Setter
  private ResourceFormat preferredResourceFormat;
  private int maxResultSetSize = -1;//_count
  private CapabilityStatement capabilities;
  @Getter
  @Setter
  private Client client = new Client();
  private List<HTTPHeader> headers = new ArrayList<>();

  @Setter
  @Getter
  private String userAgent;

  @Setter
  private String acceptLanguage;

  @Setter
  private String contentLanguage;


  private int useCount;


  //Pass endpoint for client - URI
  public FHIRToolingClient(String baseServiceUrl, String userAgent) throws URISyntaxException {
    preferredResourceFormat = ResourceFormat.RESOURCE_JSON;
    this.userAgent = userAgent;
    initialize(baseServiceUrl);
  }

  public void initialize(String baseServiceUrl) throws URISyntaxException {
    base = baseServiceUrl;
    client.setBase(base);
    resourceAddress = new ResourceAddress(baseServiceUrl);
    this.maxResultSetSize = -1;
  }

  public String getPreferredResourceFormat() {
    return preferredResourceFormat.getHeader();
  }

  public int getMaximumRecordCount() {
    return maxResultSetSize;
  }

  public void setMaximumRecordCount(int maxResultSetSize) {
    this.maxResultSetSize = maxResultSetSize;
  }

  private List<ResourceFormat> getResourceFormatsWithPreferredFirst() {
    return Stream.concat(
      Arrays.stream(new ResourceFormat[]{preferredResourceFormat}),
      Arrays.stream(ResourceFormat.values()).filter(a -> a != preferredResourceFormat)
    ).collect(Collectors.toList());
  }

  private <T extends Resource> T getCapabilities(URI resourceUri, String message, String exceptionMessage) throws FHIRException {
    final List<ResourceFormat> resourceFormats = getResourceFormatsWithPreferredFirst();

    for (ResourceFormat attemptedResourceFormat : resourceFormats) {
      try {
        T output =  (T) client.issueGetResourceRequest(resourceUri,
          withVer(preferredResourceFormat.getHeader(), "5.0"),
          generateHeaders(false),
          message,
          timeoutNormal).getReference();
        if (attemptedResourceFormat != preferredResourceFormat) {
          setPreferredResourceFormat(attemptedResourceFormat);
        }
        return output;
      } catch (Exception e) {
        logger.warn("Failed attempt to fetch " + resourceUri, e);
      }
    }
    throw new FHIRException(exceptionMessage);
  }

  public TerminologyCapabilities getTerminologyCapabilities() {
    TerminologyCapabilities capabilities = null;

    try {
      capabilities = getCapabilities(resourceAddress.resolveMetadataTxCaps(),
        "TerminologyCapabilities",
        "Error fetching the server's terminology capabilities");
    } catch (ClassCastException e) {
      throw new FHIRException("Unexpected response format for Terminology Capability metadata", e);
    }
    return capabilities;
  }

  public CapabilityStatement getCapabilitiesStatement() {
    CapabilityStatement capabilityStatement = null;

      capabilityStatement = getCapabilities(resourceAddress.resolveMetadataUri(false),

        "CapabilitiesStatement", "Error fetching the server's conformance statement");
    return capabilityStatement;
  }

  public CapabilityStatement getCapabilitiesStatementQuick() throws EFhirClientException {
    if (capabilities != null) return capabilities;

       capabilities = getCapabilities(resourceAddress.resolveMetadataUri(true),

        "CapabilitiesStatement-Quick",
        "Error fetching the server's capability statement");

    return capabilities;
  }

  public Resource read(String resourceClass, String id) {// TODO Change this to AddressableResource
    recordUse();
    ResourceRequest<Resource> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveGetUriFromResourceClassAndId(resourceClass, id),
          withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(false), "Read " + resourceClass + "/" + id,
          timeoutNormal);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(),
            (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      throw new FHIRException(e);
    }
    return result.getPayload();
  }

  
  public <T extends Resource> T read(Class<T> resourceClass, String id) {//TODO Change this to AddressableResource
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveGetUriFromResourceClassAndId(resourceClass, id),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(false),
        "Read " + resourceClass.getName() + "/" + id,
        timeoutNormal);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      throw new FHIRException(e);
    }
    return result.getPayload();
  }

  public <T extends Resource> T vread(Class<T> resourceClass, String id, String version) {
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveGetUriFromResourceClassAndIdAndVersion(resourceClass, id, version),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(false),
        "VRead " + resourceClass.getName() + "/" + id + "/?_history/" + version,
        timeoutNormal);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      throw new FHIRException("Error trying to read this version of the resource", e);
    }
    return result.getPayload();
  }

  public <T extends Resource> T getCanonical(Class<T> resourceClass, String canonicalURL) {
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveGetUriFromResourceClassAndCanonical(resourceClass, canonicalURL),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(false),
        "Read " + resourceClass.getName() + "?url=" + canonicalURL,
        timeoutNormal);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      handleException(0, "An error has occurred while trying to read this version of the resource", e);
    }
    Bundle bnd = (Bundle) result.getPayload();
    if (bnd.getEntry().size() == 0)
      throw new EFhirClientException(0, "No matching resource found for canonical URL '" + canonicalURL + "'");
    if (bnd.getEntry().size() > 1)
      throw new EFhirClientException(0, "Multiple matching resources found for canonical URL '" + canonicalURL + "'");
    return (T) bnd.getEntry().get(0).getResource();
  }

  public Resource update(Resource resource) {
    recordUse();
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issuePutRequest(resourceAddress.resolveGetUriFromResourceClassAndId(resource.getClass(), resource.getId()),
        ByteUtils.resourceToByteArray(resource, false, isJson(getPreferredResourceFormat()), false),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "Update " + resource.fhirType() + "/" + resource.getId(),
        timeoutOperation);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      throw new EFhirClientException(0, "An error has occurred while trying to update this resource", e);
    }
    // TODO oe 26.1.2015 could be made nicer if only OperationOutcome locationheader is returned with an operationOutcome would be returned (and not  the resource also) we make another read
    try {
      OperationOutcome operationOutcome = (OperationOutcome) result.getPayload();
      ResourceAddress.ResourceVersionedIdentifier resVersionedIdentifier = ResourceAddress.parseCreateLocation(result.getLocation());
      return this.vread(resource.getClass(), resVersionedIdentifier.getId(), resVersionedIdentifier.getVersionId());
    } catch (ClassCastException e) {
      // if we fall throught we have the correct type already in the create
    }

    return result.getPayload();
  }

  public <T extends Resource> T update(Class<T> resourceClass, T resource, String id) {
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issuePutRequest(resourceAddress.resolveGetUriFromResourceClassAndId(resourceClass, id),
        ByteUtils.resourceToByteArray(resource, false, isJson(getPreferredResourceFormat()), false),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "Update " + resource.fhirType() + "/" + id,
        timeoutOperation);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      throw new EFhirClientException(0, "An error has occurred while trying to update this resource", e);
    }
    // TODO oe 26.1.2015 could be made nicer if only OperationOutcome	locationheader is returned with an operationOutcome would be returned (and not	the resource also) we make another read
    try {
      OperationOutcome operationOutcome = (OperationOutcome) result.getPayload();
      ResourceAddress.ResourceVersionedIdentifier resVersionedIdentifier = ResourceAddress.parseCreateLocation(result.getLocation());
      return this.vread(resourceClass, resVersionedIdentifier.getId(), resVersionedIdentifier.getVersionId());
    } catch (ClassCastException e) {
      // if we fall through we have the correct type already in the create
    }

    return result.getPayload();
  }

  public <T extends Resource> Parameters operateType(Class<T> resourceClass, String name, Parameters params) {
    recordUse();
    boolean complex = false;
    for (ParametersParameterComponent p : params.getParameter())
      complex = complex || !(p.getValue() instanceof PrimitiveType);
    String ps = "";
    try {
      if (!complex)
        for (ParametersParameterComponent p : params.getParameter())
          if (p.getValue() instanceof PrimitiveType)
            ps += Utilities.encodeUriParam(p.getName(), ((PrimitiveType) p.getValue()).asStringValue()) + "&";
      ResourceRequest<T> result;
      URI url = resourceAddress.resolveOperationURLFromClass(resourceClass, name, ps);
      if (complex) {
        byte[] body = ByteUtils.resourceToByteArray(params, false, isJson(getPreferredResourceFormat()), true);
        result = client.issuePostRequest(url, body, withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(true),
            "POST " + resourceClass.getName() + "/$" + name, timeoutLong);
      } else {
        result = client.issueGetResourceRequest(url, withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(false), "GET " + resourceClass.getName() + "/$" + name, timeoutLong);
      }
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
      if (result.getPayload() instanceof Parameters) {
        return (Parameters) result.getPayload();
      } else {
        Parameters p_out = new Parameters();
        p_out.addParameter().setName("return").setResource(result.getPayload());
        return p_out;
      }
    } catch (Exception e) {
      handleException(0, "Error performing tx5 operation '"+name+": "+e.getMessage()+"' (parameters = \"" + ps+"\")", e);  		
    }
    return null;
  }

  public Bundle transaction(Bundle batch) {
    recordUse();
    Bundle transactionResult = null;
    try {
      transactionResult = client.postBatchRequest(resourceAddress.getBaseServiceUri(), ByteUtils.resourceToByteArray(batch, false, isJson(getPreferredResourceFormat()), false), withVer(getPreferredResourceFormat(), "5.0"),
          generateHeaders(true),
          "transaction", timeoutOperation + (timeoutEntry * batch.getEntry().size()));
    } catch (Exception e) {
      handleException(0, "An error occurred trying to process this transaction request", e);
    }
    return transactionResult;
  }

  @SuppressWarnings("unchecked")
  public <T extends Resource> OperationOutcome validate(Class<T> resourceClass, T resource, String id) {
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveValidateUri(resourceClass, id),
        ByteUtils.resourceToByteArray(resource, false, isJson(getPreferredResourceFormat()), false),
        withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(true),
        "POST " + resourceClass.getName() + (id != null ? "/" + id : "") + "/$validate", timeoutLong);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      handleException(0, "An error has occurred while trying to validate this resource", e);
    }
    return (OperationOutcome) result.getPayload();
  }
  
  @SuppressWarnings("unchecked")
  public <T extends Resource> OperationOutcome validate(Resource resource, String id) {
    recordUse();
    ResourceRequest<T> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveValidateUri(resource.fhirType(), id),
        ByteUtils.resourceToByteArray(resource, false, isJson(getPreferredResourceFormat()), false),
        withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(true),
        "POST " + resource.fhirType() + (id != null ? "/" + id : "") + "/$validate", timeoutLong);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (Exception e) {
      handleException(0, "An error has occurred while trying to validate this resource", e);
    }
    return (OperationOutcome) result.getPayload();
  }

  /**
   * Helper method to prevent nesting of previously thrown EFhirClientExceptions. If the e param is an instance of
   * EFhirClientException, it will be rethrown. Otherwise, a new EFhirClientException will be thrown with e as the
   * cause.
   *
   * @param code The EFhirClientException code.
   * @param message The EFhirClientException message.
   * @param e The exception.
   * @throws EFhirClientException representing the exception.
   */
  protected void handleException(int code, String message, Exception e) throws EFhirClientException {
    if (e instanceof EFhirClientException) {
      throw (EFhirClientException) e;
    } else {
      throw new EFhirClientException(code, message, e);
    }
  }

  /**
   * Helper method to determine whether desired resource representation
   * is Json or XML.
   *
   * @param format The format
   * @return true if the format is JSON, false otherwise
   */
  protected boolean isJson(String format) {
    boolean isJson = false;
    if (format.toLowerCase().contains("json")) {
      isJson = true;
    }
    return isJson;
  }

  public Bundle fetchFeed(String url) {
    recordUse();
    Bundle feed = null;
    try {
      feed = client.issueGetFeedRequest(new URI(url), getPreferredResourceFormat());
    } catch (Exception e) {
      handleException(0, "An error has occurred while trying to read a bundle", e);
    }
    return feed;
  }

  public ValueSet expandValueset(ValueSet source, Parameters expParams) {
    recordUse();
    Parameters p = expParams == null ? new Parameters() : expParams.copy();
    if (source != null) {
      p.addParameter().setName("valueSet").setResource(source);
    }
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveOperationUri(ValueSet.class, "expand"),
          ByteUtils.resourceToByteArray(p, false, isJson(getPreferredResourceFormat()), true),
          withVer(getPreferredResourceFormat(), "5.0"),
          generateHeaders(true),
          source == null ? "ValueSet/$expand" : "ValueSet/$expand?url=" + source.getUrl(),
          timeoutExpand);
    } catch (IOException e) {
      throw new FHIRException(e);
    }
    if (result.isUnsuccessfulRequest()) {
      throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
    }
    return result == null ? null : (ValueSet) result.getPayload();
  }

  public Parameters lookupCode(Map<String, String> params) {
    recordUse();
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveOperationUri(CodeSystem.class, "lookup", params),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(false),
        "CodeSystem/$lookup",
        timeoutNormal);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (result.isUnsuccessfulRequest()) {
      throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
    }
    return (Parameters) result.getPayload();
  }

  public Parameters lookupCode(Parameters p) {
    recordUse();
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveOperationUri(CodeSystem.class, "lookup"),
          ByteUtils.resourceToByteArray(p, false, isJson(getPreferredResourceFormat()), true),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "CodeSystem/$lookup",
        timeoutNormal);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (result.isUnsuccessfulRequest()) {
      throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
    }
    return (Parameters) result.getPayload();
  }
  
  public Parameters translate(Parameters p) {
    recordUse();
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveOperationUri(ConceptMap.class, "translate"),
          ByteUtils.resourceToByteArray(p, false, isJson(getPreferredResourceFormat()), true),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "ConceptMap/$translate",
        timeoutNormal);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (result.isUnsuccessfulRequest()) {
      throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
    }
    return (Parameters) result.getPayload();
  }

  public String getAddress() {
    return base;
  }

  public ConceptMap initializeClosure(String name) {
    recordUse();
    Parameters params = new Parameters();
    params.addParameter().setName("name").setValue(new StringType(name));
    ResourceRequest<Resource> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveOperationUri(null, "closure", new HashMap<String, String>()),
        ByteUtils.resourceToByteArray(params, false, isJson(getPreferredResourceFormat()), true),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "Closure?name=" + name,
        timeoutNormal);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result == null ? null : (ConceptMap) result.getPayload();
  }

  public ConceptMap updateClosure(String name, Coding coding) {
    recordUse();
    Parameters params = new Parameters();
    params.addParameter().setName("name").setValue(new StringType(name));
    params.addParameter().setName("concept").setValue(coding);
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issuePostRequest(resourceAddress.resolveOperationUri(null, "closure", new HashMap<String, String>()),
        ByteUtils.resourceToByteArray(params, false, isJson(getPreferredResourceFormat()), true),
        withVer(getPreferredResourceFormat(), "5.0"),
        generateHeaders(true),
        "UpdateClosure?name=" + name,
        timeoutOperation);
      if (result.isUnsuccessfulRequest()) {
        throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(), (OperationOutcome) result.getPayload());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result == null ? null : (ConceptMap) result.getPayload();
  }

  public long getTimeout() {
    return client.getTimeout();
  }

  public void setTimeout(long timeout) {
    client.setTimeout(timeout);
  }

  public ToolingClientLogger getLogger() {
    return client.getLogger();
  }

  public void setLogger(ToolingClientLogger logger) {
    client.setLogger(logger);
  }

  public int getRetryCount() {
    return client.getRetryCount();
  }

  public void setRetryCount(int retryCount) {
    client.setRetryCount(retryCount);
  }

  public void setClientHeaders(Iterable<HTTPHeader> headers) {
    this.headers = new ArrayList<>();
    headers.forEach(this.headers::add);
  }

  private Iterable<HTTPHeader> generateHeaders(boolean hasBody) {
    // Add any other headers
    List<HTTPHeader> headers = new ArrayList<>(this.headers);
    if (!Utilities.noString(userAgent)) {
      headers.add(new HTTPHeader("User-Agent",userAgent));
    }

    if (!Utilities.noString(acceptLanguage)) {
      headers.add(new HTTPHeader("Accept-Language", acceptLanguage));
    }
    
    if (hasBody && !Utilities.noString(contentLanguage)) {
      headers.add(new HTTPHeader("Content-Language", contentLanguage));
    }
    
    return headers;
  }

  public String getServerVersion() {
    if (capabilities == null) {
      try {
        getCapabilitiesStatementQuick();
      } catch (Throwable e) {
        //#TODO  This is creepy. Shouldn't we report this at some level?
      }
    }
    return capabilities == null ? null : capabilities.getSoftware().getVersion();
  }

  public Bundle search(String type, String criteria) {
    recordUse();
    return fetchFeed(Utilities.pathURL(base, type+criteria));
  }
  
  public <T extends Resource> T fetchResource(Class<T> resourceClass, String id) {
    recordUse();
    org.hl7.fhir.r5.utils.client.network.ResourceRequest<Resource> result = null;
    try {
      result = client.issueGetResourceRequest(resourceAddress.resolveGetResource(resourceClass, id),
          withVer(getPreferredResourceFormat(), "5.0"), generateHeaders(false), resourceClass.getName()+"/"+id, timeoutNormal);
    } catch (IOException e) {
      throw new FHIRException(e);
    }
    if (result.isUnsuccessfulRequest()) {
      throw new EFhirClientException(result.getHttpStatus(), "Server returned error code " + result.getHttpStatus(),
          (OperationOutcome) result.getPayload());
    }
    return (T) result.getPayload();
  }

  private void recordUse() {
    useCount++;    
  }

  public int getUseCount() {
    return useCount;
  }
  
}

