package org.hl7.fhir.conversion.tests;

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


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.fhir.ucum.UcumEssenceService;
import org.hl7.fhir.convertors.loaders.loaderR5.NullLoaderKnowledgeProviderR5;
import org.hl7.fhir.convertors.loaders.loaderR5.R2016MayToR5Loader;
import org.hl7.fhir.convertors.loaders.loaderR5.R2ToR5Loader;
import org.hl7.fhir.convertors.loaders.loaderR5.R3ToR5Loader;
import org.hl7.fhir.convertors.loaders.loaderR5.R4ToR5Loader;
import org.hl7.fhir.r5.context.IContextResourceLoader;
import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.test.utils.TestingUtilities;
import org.hl7.fhir.utilities.FileUtilities;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.VersionUtilities;
import org.hl7.fhir.utilities.filesystem.ManagedFileAccess;
import org.hl7.fhir.utilities.npm.FilesystemPackageCacheManager;
import org.hl7.fhir.utilities.xml.XMLUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

public class UtilitiesXTests {
  private static final boolean SHOW_DIFF = true;
  
	static public Map<String, IWorkerContext> fcontexts;
	
	public static IWorkerContext context(String version) {
    if (fcontexts == null) {
      fcontexts = new HashMap<>();
    }
	  if (!fcontexts.containsKey(version)) {
	    FilesystemPackageCacheManager pcm;
	    try {
	      pcm = new FilesystemPackageCacheManager.Builder().build();
	      IWorkerContext fcontext = TestingUtilities.getWorkerContext(pcm.loadPackage(VersionUtilities.packageForVersion(version), version), loaderForVersion(version));
	      fcontext.setUcumService(new UcumEssenceService(UtilitiesXTests.loadTestResourceStream("ucum", "ucum-essence.xml")));
	      fcontext.setExpansionParameters(new Parameters());
	      fcontexts.put(version, fcontext);
	    } catch (Exception e) {
	      throw new Error(e);
	    }
	  }
	  return fcontexts.get(version);
	}

  private static IContextResourceLoader loaderForVersion(String version) {
    if (Utilities.noString(version))
      return null;
    if (version.startsWith("1.0"))
      return new R2ToR5Loader(Utilities.stringSet("Conformance", "StructureDefinition", "ValueSet", "SearchParameter", "OperationDefinition", "Questionnaire","ConceptMap","StructureMap", "NamingSystem"), new NullLoaderKnowledgeProviderR5());
    if (version.startsWith("1.4"))
      return new R2016MayToR5Loader(Utilities.stringSet("Conformance", "StructureDefinition", "ValueSet", "CodeSystem", "SearchParameter", "OperationDefinition", "Questionnaire","ConceptMap","StructureMap", "NamingSystem"), new NullLoaderKnowledgeProviderR5()); // special case
    if (version.startsWith("3.0"))
      return new R3ToR5Loader(Utilities.stringSet("CapabilityStatement", "StructureDefinition", "ValueSet", "CodeSystem", "SearchParameter", "OperationDefinition", "Questionnaire","ConceptMap","StructureMap", "NamingSystem"), new NullLoaderKnowledgeProviderR5());
    if (version.startsWith("4.0"))
      return new R4ToR5Loader(Utilities.stringSet("CapabilityStatement", "StructureDefinition", "ValueSet", "CodeSystem", "SearchParameter", "OperationDefinition", "Questionnaire","ConceptMap","StructureMap", "NamingSystem"), new NullLoaderKnowledgeProviderR5(), version);
    return null;
  }

	static public boolean silent;

  static public String fixedpath;
  static public String contentpath;

  public static String home() throws IOException {
    if (fixedpath != null)
     return fixedpath;
    String s = System.getenv("FHIR_HOME");
    if (!Utilities.noString(s))
      return s;
    s = "C:\\work\\org.hl7.fhir\\build";
    // TODO - what should we do here?
	  s = "/Users/jamesagnew/git/fhir";
    if (ManagedFileAccess.file(s).exists())
      return s;
    throw new Error("FHIR Home directory not configured");
  }
  

  public static String content() throws IOException {
    if (contentpath != null)
     return contentpath;
    String s = "R:\\fhir\\publish";
    if (ManagedFileAccess.file(s).exists())
      return s;
    return Utilities.path(home(), "publish");
  }
  
  // diretory that contains all the US implementation guides
  public static String us() throws IOException {
    if (fixedpath != null)
     return fixedpath;
    String s = System.getenv("FHIR_HOME");
    if (!Utilities.noString(s))
      return s;
    s = "C:\\work\\org.hl7.fhir.us";
    if (ManagedFileAccess.file(s).exists())
      return s;
    throw new Error("FHIR US directory not configured");
  }
  
  public static String checkXMLIsSame(InputStream f1, InputStream f2) throws Exception {
    String result = compareXml(f1, f2);
    return result;
  }
  
  public static String checkXMLIsSame(String f1, String f2) throws Exception {
		String result = compareXml(f1, f2);
		if (result != null && SHOW_DIFF) {
	    String diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge", "WinMergeU.exe");
	    List<String> command = new ArrayList<String>();
	    command.add("\"" + diff + "\" \"" + f1 + "\" \"" + f2 + "\"");

	    ProcessBuilder builder = new ProcessBuilder(command);
	    builder.directory(ManagedFileAccess.csfile(Utilities.path("tmp]")));
	    builder.start();
			
		}
		return result;
	}

  private static String compareXml(InputStream f1, InputStream f2) throws Exception {
    return compareElements("", loadXml(f1).getDocumentElement(), loadXml(f2).getDocumentElement());
  }

  private static String compareXml(String f1, String f2) throws Exception {
    return compareElements("", loadXml(f1).getDocumentElement(), loadXml(f2).getDocumentElement());
  }

	private static String compareElements(String path, Element e1, Element e2) {
		if (!e1.getNamespaceURI().equals(e2.getNamespaceURI())) 
			return "Namespaces differ at "+path+": "+e1.getNamespaceURI()+"/"+e2.getNamespaceURI();
		if (!e1.getLocalName().equals(e2.getLocalName())) 
			return "Names differ at "+path+": "+e1.getLocalName()+"/"+e2.getLocalName();
		path = path + "/"+e1.getLocalName();
		String s = compareAttributes(path, e1.getAttributes(), e2.getAttributes());
		if (!Utilities.noString(s))
			return s;
		s = compareAttributes(path, e2.getAttributes(), e1.getAttributes());
		if (!Utilities.noString(s))
			return s;

		Node c1 = e1.getFirstChild();
		Node c2 = e2.getFirstChild();
		c1 = skipBlankText(c1);
		c2 = skipBlankText(c2);
		while (c1 != null && c2 != null) {
			if (c1.getNodeType() != c2.getNodeType()) 
				return "node type mismatch in children of "+path+": "+Integer.toString(e1.getNodeType())+"/"+Integer.toString(e2.getNodeType());
			if (c1.getNodeType() == Node.TEXT_NODE) {    
				if (!normalise(c1.getTextContent()).equals(normalise(c2.getTextContent())))
					return "Text differs at "+path+": "+normalise(c1.getTextContent()) +"/"+ normalise(c2.getTextContent());
			}
			else if (c1.getNodeType() == Node.ELEMENT_NODE) {
				s = compareElements(path, (Element) c1, (Element) c2);
				if (!Utilities.noString(s))
					return s;
			}

			c1 = skipBlankText(c1.getNextSibling());
			c2 = skipBlankText(c2.getNextSibling());
		}
		if (c1 != null)
			return "node mismatch - more nodes in source in children of "+path;
		if (c2 != null)
			return "node mismatch - more nodes in target in children of "+path;
		return null;
	}

	private static Object normalise(String text) {
		String result = text.trim().replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
		while (result.contains("  ")) 
			result = result.replace("  ", " ");
		return result;
	}

	private static String compareAttributes(String path, NamedNodeMap src, NamedNodeMap tgt) {
	  for (int i = 0; i < src.getLength(); i++) {
	  
	    Node sa = src.item(i);
	    String sn = sa.getNodeName();
	    if (! (sn.equals("xmlns") || sn.startsWith("xmlns:"))) {
	      Node ta = tgt.getNamedItem(sn);
	      if (ta == null) 
	        return "Attributes differ at "+path+": missing attribute "+sn;
	      if (!normalise(sa.getTextContent()).equals(normalise(ta.getTextContent()))) {
	        byte[] b1 = unBase64(sa.getTextContent());
	        byte[] b2 = unBase64(ta.getTextContent());
	        if (!sameBytes(b1, b2))
	          return "Attributes differ at "+path+": value "+normalise(sa.getTextContent()) +"/"+ normalise(ta.getTextContent());
	      }
	    }
	  }
	  return null;
	}

	private static boolean sameBytes(byte[] b1, byte[] b2) {
		if (b1.length == 0 || b2.length == 0)
			return false;
		if (b1.length != b2.length)
			return false;
		for (int i = 0; i < b1.length; i++)
			if (b1[i] != b2[i])
				return false;
		return true;
	}

	private static byte[] unBase64(String text) {
		return Base64.decodeBase64(text);
	}

	private static Node skipBlankText(Node node) {
	  while (node != null && (((node.getNodeType() == Node.TEXT_NODE) && StringUtils.isWhitespace(node.getTextContent())) || (node.getNodeType() == Node.COMMENT_NODE))) 
	    node = node.getNextSibling();
	  return node;
	}

  private static Document loadXml(String fn) throws Exception {
    return loadXml(ManagedFileAccess.inStream(fn));
  }

  private static Document loadXml(InputStream fn) throws Exception {
    DocumentBuilderFactory factory = XMLUtil.newXXEProtectedDocumentBuilderFactory();
      factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
      factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
      factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
      factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
      factory.setXIncludeAware(false);
      factory.setExpandEntityReferences(false);
        
    factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      return builder.parse(fn);
  }

  public static String checkJsonSrcIsSame(String s1, String s2) throws JsonSyntaxException, FileNotFoundException, IOException {
    return checkJsonSrcIsSame(s1,s2,true);
  }

  public static String checkJsonSrcIsSame(String s1, String s2, boolean showDiff) throws JsonSyntaxException, FileNotFoundException, IOException {
    String result = compareJsonSrc(s1, s2);
    if (result != null && SHOW_DIFF && showDiff) {
      String diff = null; 
      if (System.getProperty("os.name").contains("Linux"))
        diff = Utilities.path("/", "usr", "bin", "meld");
      else {
    	if (FileUtilities.checkFileExists("WinMerge", Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge"), "\\WinMergeU.exe", null))
    		diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge", "WinMergeU.exe");
    	else if (FileUtilities.checkFileExists("WinMerge", Utilities.path(System.getenv("ProgramFiles(X86)"), "Meld"), "\\Meld.exe", null))
    		diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "Meld", "Meld.exe");
      }
      if (diff == null || diff.isEmpty())
    	  return result;
      
      List<String> command = new ArrayList<String>();
      String f1 = Utilities.path("[tmp]", "input" + s1.hashCode() + ".json");
      String f2 = Utilities.path("[tmp]", "output" + s2.hashCode() + ".json");
      FileUtilities.stringToFile(s1, f1);
      FileUtilities.stringToFile(s2, f2);
      command.add(diff);
      if (diff.toLowerCase().contains("meld"))
    	  command.add("--newtab");
      command.add(f1);
      command.add(f2);

      ProcessBuilder builder = new ProcessBuilder(command);
      builder.directory(ManagedFileAccess.csfile(Utilities.path("[tmp]")));
      builder.start();
      
    }
    return result;
  }
  public static String checkJsonIsSame(String f1, String f2) throws JsonSyntaxException, FileNotFoundException, IOException {
		String result = compareJson(f1, f2);
		if (result != null && SHOW_DIFF) {
	    String diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge", "WinMergeU.exe");
	    List<String> command = new ArrayList<String>();
	    command.add("\"" + diff + "\" \"" + f1 + "\" \"" + f2 + "\"");

	    ProcessBuilder builder = new ProcessBuilder(command);
	    builder.directory(ManagedFileAccess.csfile(Utilities.path("tmp]")));
	    builder.start();
			
		}
		return result;
	}

  private static String compareJsonSrc(String f1, String f2) throws JsonSyntaxException, FileNotFoundException, IOException {
    JsonObject o1 = (JsonObject) new com.google.gson.JsonParser().parse(f1);
    JsonObject o2 = (JsonObject) new com.google.gson.JsonParser().parse(f2);
    return compareObjects("", o1, o2);
  }

  private static String compareJson(String f1, String f2) throws JsonSyntaxException, FileNotFoundException, IOException {
    JsonObject o1 = (JsonObject) new com.google.gson.JsonParser().parse(FileUtilities.fileToString(f1));
    JsonObject o2 = (JsonObject) new com.google.gson.JsonParser().parse(FileUtilities.fileToString(f2));
    return compareObjects("", o1, o2);
  }

	private static String compareObjects(String path, JsonObject o1, JsonObject o2) {
	  for (Map.Entry<String, JsonElement> en : o1.entrySet()) {
	  	String n = en.getKey();
	    if (!n.equals("fhir_comments")) {
	      if (o2.has(n)) {
	        String s = compareNodes(path+'.'+n, en.getValue(), o2.get(n));
	    		if (!Utilities.noString(s))
	    			return s;
	      }
	      else
	        return "properties differ at "+path+": missing property "+n;
	    }
	  }
	  for (Map.Entry<String, JsonElement> en : o2.entrySet()) {
	  	String n = en.getKey();
	    if (!n.equals("fhir_comments")) {
	      if (!o1.has(n)) 
	        return "properties differ at "+path+": missing property "+n;
	    }
	  }
	  return null;
	}

	private static String compareNodes(String path, JsonElement n1, JsonElement n2) {
		if (n1.getClass() != n2.getClass())
			return "properties differ at "+path+": type "+n1.getClass().getName()+"/"+n2.getClass().getName();
		else if (n1 instanceof JsonPrimitive) {
			JsonPrimitive p1 = (JsonPrimitive) n1;
			JsonPrimitive p2 = (JsonPrimitive) n2;
			if (p1.isBoolean() && p2.isBoolean()) {
				if (p1.getAsBoolean() != p2.getAsBoolean())
					return "boolean property values differ at "+path+": type "+p1.getAsString()+"/"+p2.getAsString();
			}	else if (p1.isString() && p2.isString()) {
				String s1 = p1.getAsString();
				String s2 = p2.getAsString();
				if (!(s1.contains("<div") && s2.contains("<div")))
					if (!s1.equals(s2))
						if (!sameBytes(unBase64(s1), unBase64(s2)))
							return "string property values differ at "+path+": type "+s1+"/"+s2;
			} else if (p1.isNumber() && p2.isNumber()) {
	    if (!p1.getAsString().equals(p2.getAsString()))
				return "number property values differ at "+path+": type "+p1.getAsString()+"/"+p2.getAsString();
			} else
				return "property types differ at "+path+": type "+p1.getAsString()+"/"+p2.getAsString();
	  }
	  else if (n1 instanceof JsonObject) {
	    String s = compareObjects(path, (JsonObject) n1, (JsonObject) n2);
			if (!Utilities.noString(s))
				return s;
	  } else if (n1 instanceof JsonArray) {
	  	JsonArray a1 = (JsonArray) n1;
	  	JsonArray a2 = (JsonArray) n2;
	  
	    if (a1.size() != a2.size()) 
	      return "array properties differ at "+path+": count "+Integer.toString(a1.size())+"/"+Integer.toString(a2.size());
	    for (int i = 0; i < a1.size(); i++) {
	        String s = compareNodes(path+"["+Integer.toString(i)+"]", a1.get(i), a2.get(i));
	  			if (!Utilities.noString(s))
	  				return s;
	    }
	  }
	  else if (n1 instanceof JsonNull) {
	  	
	  } else
	    return "unhandled property "+n1.getClass().getName();
		return null;
	}

  public static String temp() throws IOException {
    if (ManagedFileAccess.file(Utilities.path("tmp]")).exists())
      return Utilities.path("tmp]");
    return System.getProperty("java.io.tmpdir");
  }

  public static String checkTextIsSame(String s1, String s2) throws JsonSyntaxException, FileNotFoundException, IOException {
    return checkTextIsSame(s1,s2,true);
  }

  public static String checkTextIsSame(String s1, String s2, boolean showDiff) throws JsonSyntaxException, FileNotFoundException, IOException {
    String result = compareText(s1, s2);
    if (result != null && SHOW_DIFF && showDiff) {
      String diff = null; 
      if (System.getProperty("os.name").contains("Linux"))
        diff = Utilities.path("/", "usr", "bin", "meld");
      else {
      if (FileUtilities.checkFileExists("WinMerge", Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge"), "\\WinMergeU.exe", null))
        diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "WinMerge", "WinMergeU.exe");
      else if (FileUtilities.checkFileExists("WinMerge", Utilities.path(System.getenv("ProgramFiles(X86)"), "Meld"), "\\Meld.exe", null))
        diff = Utilities.path(System.getenv("ProgramFiles(X86)"), "Meld", "Meld.exe");
      }
      if (diff == null || diff.isEmpty())
        return result;
      
      List<String> command = new ArrayList<String>();
      String f1 = Utilities.path("[tmp]", "input" + s1.hashCode() + ".json");
      String f2 = Utilities.path("[tmp]", "output" + s2.hashCode() + ".json");
      FileUtilities.stringToFile(s1, f1);
      FileUtilities.stringToFile(s2, f2);
      command.add(diff);
      if (diff.toLowerCase().contains("meld"))
        command.add("--newtab");
      command.add(f1);
      command.add(f2);

      ProcessBuilder builder = new ProcessBuilder(command);
      builder.directory(ManagedFileAccess.csfile(Utilities.path("[tmp]")));
      builder.start();
      
    }
    return result;
  }


  private static String compareText(String s1, String s2) {
    for (int i = 0; i < Integer.min(s1.length(), s2.length()); i++) {
      if (s1.charAt(i) != s2.charAt(i))
        return "Strings differ at character "+Integer.toString(i)+": '"+s1.charAt(i) +"' vs '"+s2.charAt(i)+"'";
    }
    if (s1.length() != s2.length())
      return "Strings differ in length: "+Integer.toString(s1.length())+" vs "+Integer.toString(s2.length())+" but match to the end of the shortest";
    return null;
  }

  public static boolean findTestResource(String... paths) throws IOException { 
    if (ManagedFileAccess.file("../../fhir-test-cases").exists() && isTryToLoadFromFileSystem()) {
      String n = Utilities.path(getUserDirFhirTestCases(), Utilities.path(paths));
      return ManagedFileAccess.file(n).exists();
    } else {
      String classpath = ("/org/hl7/fhir/testcases/"+ Utilities.pathURL(paths));
      try {
        InputStream inputStream = UtilitiesXTests.class.getResourceAsStream(classpath);
        return inputStream != null;
      } catch (Throwable t) {
        return false;
      }
    }
  }

  // TODO: JA need to figure out how to detect that we're running in maven
  private static boolean isTryToLoadFromFileSystem() {
    return !"true".equals(System.getProperty("dont_load_from_filesystem"));
  }

  public static String loadTestResource(String... paths) throws IOException {
    if (ManagedFileAccess.file("../../fhir-test-cases").exists() && isTryToLoadFromFileSystem()) {
      String n = Utilities.path(getUserDirFhirTestCases(), Utilities.path(paths));
      // ok, we'll resolve this locally
      return FileUtilities.fileToString(ManagedFileAccess.file(n));
    } else {
      // resolve from the package 
      String contents;
      String classpath = ("/org/hl7/fhir/testcases/"+ Utilities.pathURL(paths));
      try (InputStream inputStream = UtilitiesXTests.class.getResourceAsStream(classpath)) {
        if (inputStream == null) {
          throw new IOException("Can't find file on classpath: " + classpath);
        }
        contents = IOUtils.toString(inputStream, java.nio.charset.StandardCharsets.UTF_8);
      }
      return contents;
    }
  }

  @Nonnull
  private static String getUserDirFhirTestCases() {
    return Path.of(System.getProperty("user.dir"), "..", "..", "fhir-test-cases").normalize().toString();
  }

  public static InputStream loadTestResourceStream(String... paths) throws IOException {
    if (ManagedFileAccess.file("../../fhir-test-cases").exists() && isTryToLoadFromFileSystem()) {
      String n = Utilities.path(getUserDirFhirTestCases(), Utilities.path(paths));
      return ManagedFileAccess.inStream(n);
    } else {
      String classpath = ("/org/hl7/fhir/testcases/"+ Utilities.pathURL(paths));
      InputStream s = UtilitiesXTests.class.getResourceAsStream(classpath);
      if (s == null) {
        throw new Error("unable to find resource "+classpath);
      }
      return s;
    }
  }

  public static byte[] loadTestResourceBytes(String... paths) throws IOException {
    if (ManagedFileAccess.file("../../fhir-test-cases").exists() && isTryToLoadFromFileSystem()) {
      String n = Utilities.path(System.getProperty("user.dir"), "..", "..", "fhir-test-cases", Utilities.path(paths));
      return FileUtilities.fileToBytes(n);
    } else {
      String classpath = ("/org/hl7/fhir/testcases/"+ Utilities.pathURL(paths));
      InputStream s = UtilitiesXTests.class.getResourceAsStream(classpath);
      if (s == null) {
        throw new Error("unable to find resource "+classpath);
      }
      return FileUtilities.streamToBytes(s);
    }
  }


  public static String tempFile(String folder, String name) throws IOException {
    String tmp = tempFolder(folder);
    return Utilities.path(tmp, name);
  }
  
  public static String tempFolder(String name) throws IOException {
    File tmp = ManagedFileAccess.file(Utilities.path("tmp]"));
    if (tmp.exists() && tmp.isDirectory()) {
      String path = Utilities.path("[tmp]", name);
      FileUtilities.createDirectory(path);
      return path;
    } else if (ManagedFileAccess.file("/tmp").exists()) {
      String path = Utilities.path("/tmp", name);
      FileUtilities.createDirectory(path);
      return path;
    } else {
      String path = Utilities.path(System.getProperty("java.io.tmpdir"), name);
      FileUtilities.createDirectory(path);
      return path;
    }
  }
}
