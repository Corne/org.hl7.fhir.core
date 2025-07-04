package org.hl7.fhir.r4.model;

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

// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * Describes the event of a patient being administered a vaccine or a record of
 * an immunization as reported by a patient, a clinician or another party.
 */
@ResourceDef(name = "Immunization", profile = "http://hl7.org/fhir/StructureDefinition/Immunization")
public class Immunization extends DomainResource {

  public enum ImmunizationStatus {
    /**
     * null
     */
    COMPLETED,
    /**
     * null
     */
    ENTEREDINERROR,
    /**
     * null
     */
    NOTDONE,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static ImmunizationStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("completed".equals(codeString))
        return COMPLETED;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if ("not-done".equals(codeString))
        return NOTDONE;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown ImmunizationStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case COMPLETED:
        return "completed";
      case ENTEREDINERROR:
        return "entered-in-error";
      case NOTDONE:
        return "not-done";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case COMPLETED:
        return "http://hl7.org/fhir/event-status";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/event-status";
      case NOTDONE:
        return "http://hl7.org/fhir/event-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case COMPLETED:
        return "";
      case ENTEREDINERROR:
        return "";
      case NOTDONE:
        return "";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case COMPLETED:
        return "completed";
      case ENTEREDINERROR:
        return "entered-in-error";
      case NOTDONE:
        return "not-done";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ImmunizationStatusEnumFactory implements EnumFactory<ImmunizationStatus> {
    public ImmunizationStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("completed".equals(codeString))
        return ImmunizationStatus.COMPLETED;
      if ("entered-in-error".equals(codeString))
        return ImmunizationStatus.ENTEREDINERROR;
      if ("not-done".equals(codeString))
        return ImmunizationStatus.NOTDONE;
      throw new IllegalArgumentException("Unknown ImmunizationStatus code '" + codeString + "'");
    }

    public Enumeration<ImmunizationStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ImmunizationStatus>(this, ImmunizationStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ImmunizationStatus>(this, ImmunizationStatus.NULL, code);
      if ("completed".equals(codeString))
        return new Enumeration<ImmunizationStatus>(this, ImmunizationStatus.COMPLETED, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<ImmunizationStatus>(this, ImmunizationStatus.ENTEREDINERROR, code);
      if ("not-done".equals(codeString))
        return new Enumeration<ImmunizationStatus>(this, ImmunizationStatus.NOTDONE, code);
      throw new FHIRException("Unknown ImmunizationStatus code '" + codeString + "'");
    }

    public String toCode(ImmunizationStatus code) {
       if (code == ImmunizationStatus.NULL)
           return null;
       if (code == ImmunizationStatus.COMPLETED)
        return "completed";
      if (code == ImmunizationStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == ImmunizationStatus.NOTDONE)
        return "not-done";
      return "?";
   }

    public String toSystem(ImmunizationStatus code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class ImmunizationPerformerComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Describes the type of performance (e.g. ordering provider, administering
     * provider, etc.).
     */
    @Child(name = "function", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "What type of performance was done", formalDefinition = "Describes the type of performance (e.g. ordering provider, administering provider, etc.).")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-function")
    protected CodeableConcept function;

    /**
     * The practitioner or organization who performed the action.
     */
    @Child(name = "actor", type = { Practitioner.class, PractitionerRole.class,
        Organization.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Individual or organization who was performing", formalDefinition = "The practitioner or organization who performed the action.")
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (The practitioner or
     * organization who performed the action.)
     */
    protected Resource actorTarget;

    private static final long serialVersionUID = 1424001049L;

    /**
     * Constructor
     */
    public ImmunizationPerformerComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImmunizationPerformerComponent(Reference actor) {
      super();
      this.actor = actor;
    }

    /**
     * @return {@link #function} (Describes the type of performance (e.g. ordering
     *         provider, administering provider, etc.).)
     */
    public CodeableConcept getFunction() {
      if (this.function == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationPerformerComponent.function");
        else if (Configuration.doAutoCreate())
          this.function = new CodeableConcept(); // cc
      return this.function;
    }

    public boolean hasFunction() {
      return this.function != null && !this.function.isEmpty();
    }

    /**
     * @param value {@link #function} (Describes the type of performance (e.g.
     *              ordering provider, administering provider, etc.).)
     */
    public ImmunizationPerformerComponent setFunction(CodeableConcept value) {
      this.function = value;
      return this;
    }

    /**
     * @return {@link #actor} (The practitioner or organization who performed the
     *         action.)
     */
    public Reference getActor() {
      if (this.actor == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationPerformerComponent.actor");
        else if (Configuration.doAutoCreate())
          this.actor = new Reference(); // cc
      return this.actor;
    }

    public boolean hasActor() {
      return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (The practitioner or organization who performed
     *              the action.)
     */
    public ImmunizationPerformerComponent setActor(Reference value) {
      this.actor = value;
      return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference.
     *         The reference library doesn't populate this, but you can use it to
     *         hold the resource if you resolve it. (The practitioner or
     *         organization who performed the action.)
     */
    public Resource getActorTarget() {
      return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (The practitioner
     *              or organization who performed the action.)
     */
    public ImmunizationPerformerComponent setActorTarget(Resource value) {
      this.actorTarget = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("function", "CodeableConcept",
          "Describes the type of performance (e.g. ordering provider, administering provider, etc.).", 0, 1, function));
      children.add(new Property("actor", "Reference(Practitioner|PractitionerRole|Organization)",
          "The practitioner or organization who performed the action.", 0, 1, actor));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1380938712:
        /* function */ return new Property("function", "CodeableConcept",
            "Describes the type of performance (e.g. ordering provider, administering provider, etc.).", 0, 1,
            function);
      case 92645877:
        /* actor */ return new Property("actor", "Reference(Practitioner|PractitionerRole|Organization)",
            "The practitioner or organization who performed the action.", 0, 1, actor);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 1380938712:
        /* function */ return this.function == null ? new Base[0] : new Base[] { this.function }; // CodeableConcept
      case 92645877:
        /* actor */ return this.actor == null ? new Base[0] : new Base[] { this.actor }; // Reference
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 1380938712: // function
        this.function = castToCodeableConcept(value); // CodeableConcept
        return value;
      case 92645877: // actor
        this.actor = castToReference(value); // Reference
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("function")) {
        this.function = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("actor")) {
        this.actor = castToReference(value); // Reference
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("function")) {
        this.function = null;
      } else if (name.equals("actor")) {
        this.actor = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1380938712:
        return getFunction();
      case 92645877:
        return getActor();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1380938712:
        /* function */ return new String[] { "CodeableConcept" };
      case 92645877:
        /* actor */ return new String[] { "Reference" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("function")) {
        this.function = new CodeableConcept();
        return this.function;
      } else if (name.equals("actor")) {
        this.actor = new Reference();
        return this.actor;
      } else
        return super.addChild(name);
    }

    public ImmunizationPerformerComponent copy() {
      ImmunizationPerformerComponent dst = new ImmunizationPerformerComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImmunizationPerformerComponent dst) {
      super.copyValues(dst);
      dst.function = function == null ? null : function.copy();
      dst.actor = actor == null ? null : actor.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImmunizationPerformerComponent))
        return false;
      ImmunizationPerformerComponent o = (ImmunizationPerformerComponent) other_;
      return compareDeep(function, o.function, true) && compareDeep(actor, o.actor, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImmunizationPerformerComponent))
        return false;
      ImmunizationPerformerComponent o = (ImmunizationPerformerComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(function, actor);
    }

    public String fhirType() {
      return "Immunization.performer";

    }

  }

  @Block()
  public static class ImmunizationEducationComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Identifier of the material presented to the patient.
     */
    @Child(name = "documentType", type = {
        StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Educational material document identifier", formalDefinition = "Identifier of the material presented to the patient.")
    protected StringType documentType;

    /**
     * Reference pointer to the educational material given to the patient if the
     * information was on line.
     */
    @Child(name = "reference", type = { UriType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Educational material reference pointer", formalDefinition = "Reference pointer to the educational material given to the patient if the information was on line.")
    protected UriType reference;

    /**
     * Date the educational material was published.
     */
    @Child(name = "publicationDate", type = {
        DateTimeType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Educational material publication date", formalDefinition = "Date the educational material was published.")
    protected DateTimeType publicationDate;

    /**
     * Date the educational material was given to the patient.
     */
    @Child(name = "presentationDate", type = {
        DateTimeType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Educational material presentation date", formalDefinition = "Date the educational material was given to the patient.")
    protected DateTimeType presentationDate;

    private static final long serialVersionUID = -1277654827L;

    /**
     * Constructor
     */
    public ImmunizationEducationComponent() {
      super();
    }

    /**
     * @return {@link #documentType} (Identifier of the material presented to the
     *         patient.). This is the underlying object with id, value and
     *         extensions. The accessor "getDocumentType" gives direct access to the
     *         value
     */
    public StringType getDocumentTypeElement() {
      if (this.documentType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationEducationComponent.documentType");
        else if (Configuration.doAutoCreate())
          this.documentType = new StringType(); // bb
      return this.documentType;
    }

    public boolean hasDocumentTypeElement() {
      return this.documentType != null && !this.documentType.isEmpty();
    }

    public boolean hasDocumentType() {
      return this.documentType != null && !this.documentType.isEmpty();
    }

    /**
     * @param value {@link #documentType} (Identifier of the material presented to
     *              the patient.). This is the underlying object with id, value and
     *              extensions. The accessor "getDocumentType" gives direct access
     *              to the value
     */
    public ImmunizationEducationComponent setDocumentTypeElement(StringType value) {
      this.documentType = value;
      return this;
    }

    /**
     * @return Identifier of the material presented to the patient.
     */
    public String getDocumentType() {
      return this.documentType == null ? null : this.documentType.getValue();
    }

    /**
     * @param value Identifier of the material presented to the patient.
     */
    public ImmunizationEducationComponent setDocumentType(String value) {
      if (Utilities.noString(value))
        this.documentType = null;
      else {
        if (this.documentType == null)
          this.documentType = new StringType();
        this.documentType.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #reference} (Reference pointer to the educational material
     *         given to the patient if the information was on line.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getReference" gives direct access to the value
     */
    public UriType getReferenceElement() {
      if (this.reference == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationEducationComponent.reference");
        else if (Configuration.doAutoCreate())
          this.reference = new UriType(); // bb
      return this.reference;
    }

    public boolean hasReferenceElement() {
      return this.reference != null && !this.reference.isEmpty();
    }

    public boolean hasReference() {
      return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Reference pointer to the educational
     *              material given to the patient if the information was on line.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getReference" gives direct access to the value
     */
    public ImmunizationEducationComponent setReferenceElement(UriType value) {
      this.reference = value;
      return this;
    }

    /**
     * @return Reference pointer to the educational material given to the patient if
     *         the information was on line.
     */
    public String getReference() {
      return this.reference == null ? null : this.reference.getValue();
    }

    /**
     * @param value Reference pointer to the educational material given to the
     *              patient if the information was on line.
     */
    public ImmunizationEducationComponent setReference(String value) {
      if (Utilities.noString(value))
        this.reference = null;
      else {
        if (this.reference == null)
          this.reference = new UriType();
        this.reference.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #publicationDate} (Date the educational material was
     *         published.). This is the underlying object with id, value and
     *         extensions. The accessor "getPublicationDate" gives direct access to
     *         the value
     */
    public DateTimeType getPublicationDateElement() {
      if (this.publicationDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationEducationComponent.publicationDate");
        else if (Configuration.doAutoCreate())
          this.publicationDate = new DateTimeType(); // bb
      return this.publicationDate;
    }

    public boolean hasPublicationDateElement() {
      return this.publicationDate != null && !this.publicationDate.isEmpty();
    }

    public boolean hasPublicationDate() {
      return this.publicationDate != null && !this.publicationDate.isEmpty();
    }

    /**
     * @param value {@link #publicationDate} (Date the educational material was
     *              published.). This is the underlying object with id, value and
     *              extensions. The accessor "getPublicationDate" gives direct
     *              access to the value
     */
    public ImmunizationEducationComponent setPublicationDateElement(DateTimeType value) {
      this.publicationDate = value;
      return this;
    }

    /**
     * @return Date the educational material was published.
     */
    public Date getPublicationDate() {
      return this.publicationDate == null ? null : this.publicationDate.getValue();
    }

    /**
     * @param value Date the educational material was published.
     */
    public ImmunizationEducationComponent setPublicationDate(Date value) {
      if (value == null)
        this.publicationDate = null;
      else {
        if (this.publicationDate == null)
          this.publicationDate = new DateTimeType();
        this.publicationDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #presentationDate} (Date the educational material was given to
     *         the patient.). This is the underlying object with id, value and
     *         extensions. The accessor "getPresentationDate" gives direct access to
     *         the value
     */
    public DateTimeType getPresentationDateElement() {
      if (this.presentationDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationEducationComponent.presentationDate");
        else if (Configuration.doAutoCreate())
          this.presentationDate = new DateTimeType(); // bb
      return this.presentationDate;
    }

    public boolean hasPresentationDateElement() {
      return this.presentationDate != null && !this.presentationDate.isEmpty();
    }

    public boolean hasPresentationDate() {
      return this.presentationDate != null && !this.presentationDate.isEmpty();
    }

    /**
     * @param value {@link #presentationDate} (Date the educational material was
     *              given to the patient.). This is the underlying object with id,
     *              value and extensions. The accessor "getPresentationDate" gives
     *              direct access to the value
     */
    public ImmunizationEducationComponent setPresentationDateElement(DateTimeType value) {
      this.presentationDate = value;
      return this;
    }

    /**
     * @return Date the educational material was given to the patient.
     */
    public Date getPresentationDate() {
      return this.presentationDate == null ? null : this.presentationDate.getValue();
    }

    /**
     * @param value Date the educational material was given to the patient.
     */
    public ImmunizationEducationComponent setPresentationDate(Date value) {
      if (value == null)
        this.presentationDate = null;
      else {
        if (this.presentationDate == null)
          this.presentationDate = new DateTimeType();
        this.presentationDate.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("documentType", "string", "Identifier of the material presented to the patient.", 0, 1,
          documentType));
      children.add(new Property("reference", "uri",
          "Reference pointer to the educational material given to the patient if the information was on line.", 0, 1,
          reference));
      children.add(new Property("publicationDate", "dateTime", "Date the educational material was published.", 0, 1,
          publicationDate));
      children.add(new Property("presentationDate", "dateTime",
          "Date the educational material was given to the patient.", 0, 1, presentationDate));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -1473196299:
        /* documentType */ return new Property("documentType", "string",
            "Identifier of the material presented to the patient.", 0, 1, documentType);
      case -925155509:
        /* reference */ return new Property("reference", "uri",
            "Reference pointer to the educational material given to the patient if the information was on line.", 0, 1,
            reference);
      case 1470566394:
        /* publicationDate */ return new Property("publicationDate", "dateTime",
            "Date the educational material was published.", 0, 1, publicationDate);
      case 1602373096:
        /* presentationDate */ return new Property("presentationDate", "dateTime",
            "Date the educational material was given to the patient.", 0, 1, presentationDate);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -1473196299:
        /* documentType */ return this.documentType == null ? new Base[0] : new Base[] { this.documentType }; // StringType
      case -925155509:
        /* reference */ return this.reference == null ? new Base[0] : new Base[] { this.reference }; // UriType
      case 1470566394:
        /* publicationDate */ return this.publicationDate == null ? new Base[0] : new Base[] { this.publicationDate }; // DateTimeType
      case 1602373096:
        /* presentationDate */ return this.presentationDate == null ? new Base[0]
            : new Base[] { this.presentationDate }; // DateTimeType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -1473196299: // documentType
        this.documentType = castToString(value); // StringType
        return value;
      case -925155509: // reference
        this.reference = castToUri(value); // UriType
        return value;
      case 1470566394: // publicationDate
        this.publicationDate = castToDateTime(value); // DateTimeType
        return value;
      case 1602373096: // presentationDate
        this.presentationDate = castToDateTime(value); // DateTimeType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("documentType")) {
        this.documentType = castToString(value); // StringType
      } else if (name.equals("reference")) {
        this.reference = castToUri(value); // UriType
      } else if (name.equals("publicationDate")) {
        this.publicationDate = castToDateTime(value); // DateTimeType
      } else if (name.equals("presentationDate")) {
        this.presentationDate = castToDateTime(value); // DateTimeType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("documentType")) {
        this.documentType = null;
      } else if (name.equals("reference")) {
        this.reference = null;
      } else if (name.equals("publicationDate")) {
        this.publicationDate = null;
      } else if (name.equals("presentationDate")) {
        this.presentationDate = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1473196299:
        return getDocumentTypeElement();
      case -925155509:
        return getReferenceElement();
      case 1470566394:
        return getPublicationDateElement();
      case 1602373096:
        return getPresentationDateElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1473196299:
        /* documentType */ return new String[] { "string" };
      case -925155509:
        /* reference */ return new String[] { "uri" };
      case 1470566394:
        /* publicationDate */ return new String[] { "dateTime" };
      case 1602373096:
        /* presentationDate */ return new String[] { "dateTime" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("documentType")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.documentType");
      } else if (name.equals("reference")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.reference");
      } else if (name.equals("publicationDate")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.publicationDate");
      } else if (name.equals("presentationDate")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.presentationDate");
      } else
        return super.addChild(name);
    }

    public ImmunizationEducationComponent copy() {
      ImmunizationEducationComponent dst = new ImmunizationEducationComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImmunizationEducationComponent dst) {
      super.copyValues(dst);
      dst.documentType = documentType == null ? null : documentType.copy();
      dst.reference = reference == null ? null : reference.copy();
      dst.publicationDate = publicationDate == null ? null : publicationDate.copy();
      dst.presentationDate = presentationDate == null ? null : presentationDate.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImmunizationEducationComponent))
        return false;
      ImmunizationEducationComponent o = (ImmunizationEducationComponent) other_;
      return compareDeep(documentType, o.documentType, true) && compareDeep(reference, o.reference, true)
          && compareDeep(publicationDate, o.publicationDate, true)
          && compareDeep(presentationDate, o.presentationDate, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImmunizationEducationComponent))
        return false;
      ImmunizationEducationComponent o = (ImmunizationEducationComponent) other_;
      return compareValues(documentType, o.documentType, true) && compareValues(reference, o.reference, true)
          && compareValues(publicationDate, o.publicationDate, true)
          && compareValues(presentationDate, o.presentationDate, true);
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(documentType, reference, publicationDate, presentationDate);
    }

    public String fhirType() {
      return "Immunization.education";

    }

  }

  @Block()
  public static class ImmunizationReactionComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Date of reaction to the immunization.
     */
    @Child(name = "date", type = { DateTimeType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "When reaction started", formalDefinition = "Date of reaction to the immunization.")
    protected DateTimeType date;

    /**
     * Details of the reaction.
     */
    @Child(name = "detail", type = {
        Observation.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Additional information on reaction", formalDefinition = "Details of the reaction.")
    protected Reference detail;

    /**
     * The actual object that is the target of the reference (Details of the
     * reaction.)
     */
    protected Observation detailTarget;

    /**
     * Self-reported indicator.
     */
    @Child(name = "reported", type = {
        BooleanType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Indicates self-reported reaction", formalDefinition = "Self-reported indicator.")
    protected BooleanType reported;

    private static final long serialVersionUID = -1297668556L;

    /**
     * Constructor
     */
    public ImmunizationReactionComponent() {
      super();
    }

    /**
     * @return {@link #date} (Date of reaction to the immunization.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() {
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationReactionComponent.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() {
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() {
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (Date of reaction to the immunization.). This is
     *              the underlying object with id, value and extensions. The
     *              accessor "getDate" gives direct access to the value
     */
    public ImmunizationReactionComponent setDateElement(DateTimeType value) {
      this.date = value;
      return this;
    }

    /**
     * @return Date of reaction to the immunization.
     */
    public Date getDate() {
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value Date of reaction to the immunization.
     */
    public ImmunizationReactionComponent setDate(Date value) {
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #detail} (Details of the reaction.)
     */
    public Reference getDetail() {
      if (this.detail == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
        else if (Configuration.doAutoCreate())
          this.detail = new Reference(); // cc
      return this.detail;
    }

    public boolean hasDetail() {
      return this.detail != null && !this.detail.isEmpty();
    }

    /**
     * @param value {@link #detail} (Details of the reaction.)
     */
    public ImmunizationReactionComponent setDetail(Reference value) {
      this.detail = value;
      return this;
    }

    /**
     * @return {@link #detail} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Details of the
     *         reaction.)
     */
    public Observation getDetailTarget() {
      if (this.detailTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationReactionComponent.detail");
        else if (Configuration.doAutoCreate())
          this.detailTarget = new Observation(); // aa
      return this.detailTarget;
    }

    /**
     * @param value {@link #detail} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Details of the
     *              reaction.)
     */
    public ImmunizationReactionComponent setDetailTarget(Observation value) {
      this.detailTarget = value;
      return this;
    }

    /**
     * @return {@link #reported} (Self-reported indicator.). This is the underlying
     *         object with id, value and extensions. The accessor "getReported"
     *         gives direct access to the value
     */
    public BooleanType getReportedElement() {
      if (this.reported == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationReactionComponent.reported");
        else if (Configuration.doAutoCreate())
          this.reported = new BooleanType(); // bb
      return this.reported;
    }

    public boolean hasReportedElement() {
      return this.reported != null && !this.reported.isEmpty();
    }

    public boolean hasReported() {
      return this.reported != null && !this.reported.isEmpty();
    }

    /**
     * @param value {@link #reported} (Self-reported indicator.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getReported" gives direct access to the value
     */
    public ImmunizationReactionComponent setReportedElement(BooleanType value) {
      this.reported = value;
      return this;
    }

    /**
     * @return Self-reported indicator.
     */
    public boolean getReported() {
      return this.reported == null || this.reported.isEmpty() ? false : this.reported.getValue();
    }

    /**
     * @param value Self-reported indicator.
     */
    public ImmunizationReactionComponent setReported(boolean value) {
      if (this.reported == null)
        this.reported = new BooleanType();
      this.reported.setValue(value);
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("date", "dateTime", "Date of reaction to the immunization.", 0, 1, date));
      children.add(new Property("detail", "Reference(Observation)", "Details of the reaction.", 0, 1, detail));
      children.add(new Property("reported", "boolean", "Self-reported indicator.", 0, 1, reported));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3076014:
        /* date */ return new Property("date", "dateTime", "Date of reaction to the immunization.", 0, 1, date);
      case -1335224239:
        /* detail */ return new Property("detail", "Reference(Observation)", "Details of the reaction.", 0, 1, detail);
      case -427039533:
        /* reported */ return new Property("reported", "boolean", "Self-reported indicator.", 0, 1, reported);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3076014:
        /* date */ return this.date == null ? new Base[0] : new Base[] { this.date }; // DateTimeType
      case -1335224239:
        /* detail */ return this.detail == null ? new Base[0] : new Base[] { this.detail }; // Reference
      case -427039533:
        /* reported */ return this.reported == null ? new Base[0] : new Base[] { this.reported }; // BooleanType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3076014: // date
        this.date = castToDateTime(value); // DateTimeType
        return value;
      case -1335224239: // detail
        this.detail = castToReference(value); // Reference
        return value;
      case -427039533: // reported
        this.reported = castToBoolean(value); // BooleanType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("date")) {
        this.date = castToDateTime(value); // DateTimeType
      } else if (name.equals("detail")) {
        this.detail = castToReference(value); // Reference
      } else if (name.equals("reported")) {
        this.reported = castToBoolean(value); // BooleanType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("date")) {
        this.date = null;
      } else if (name.equals("detail")) {
        this.detail = null;
      } else if (name.equals("reported")) {
        this.reported = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3076014:
        return getDateElement();
      case -1335224239:
        return getDetail();
      case -427039533:
        return getReportedElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3076014:
        /* date */ return new String[] { "dateTime" };
      case -1335224239:
        /* detail */ return new String[] { "Reference" };
      case -427039533:
        /* reported */ return new String[] { "boolean" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("date")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.date");
      } else if (name.equals("detail")) {
        this.detail = new Reference();
        return this.detail;
      } else if (name.equals("reported")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.reported");
      } else
        return super.addChild(name);
    }

    public ImmunizationReactionComponent copy() {
      ImmunizationReactionComponent dst = new ImmunizationReactionComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImmunizationReactionComponent dst) {
      super.copyValues(dst);
      dst.date = date == null ? null : date.copy();
      dst.detail = detail == null ? null : detail.copy();
      dst.reported = reported == null ? null : reported.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImmunizationReactionComponent))
        return false;
      ImmunizationReactionComponent o = (ImmunizationReactionComponent) other_;
      return compareDeep(date, o.date, true) && compareDeep(detail, o.detail, true)
          && compareDeep(reported, o.reported, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImmunizationReactionComponent))
        return false;
      ImmunizationReactionComponent o = (ImmunizationReactionComponent) other_;
      return compareValues(date, o.date, true) && compareValues(reported, o.reported, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(date, detail, reported);
    }

    public String fhirType() {
      return "Immunization.reaction";

    }

  }

  @Block()
  public static class ImmunizationProtocolAppliedComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * One possible path to achieve presumed immunity against a disease - within the
     * context of an authority.
     */
    @Child(name = "series", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Name of vaccine series", formalDefinition = "One possible path to achieve presumed immunity against a disease - within the context of an authority.")
    protected StringType series;

    /**
     * Indicates the authority who published the protocol (e.g. ACIP) that is being
     * followed.
     */
    @Child(name = "authority", type = {
        Organization.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Who is responsible for publishing the recommendations", formalDefinition = "Indicates the authority who published the protocol (e.g. ACIP) that is being followed.")
    protected Reference authority;

    /**
     * The actual object that is the target of the reference (Indicates the
     * authority who published the protocol (e.g. ACIP) that is being followed.)
     */
    protected Organization authorityTarget;

    /**
     * The vaccine preventable disease the dose is being administered against.
     */
    @Child(name = "targetDisease", type = {
        CodeableConcept.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Vaccine preventatable disease being targetted", formalDefinition = "The vaccine preventable disease the dose is being administered against.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-target-disease")
    protected List<CodeableConcept> targetDisease;

    /**
     * Nominal position in a series.
     */
    @Child(name = "doseNumber", type = { PositiveIntType.class,
        StringType.class }, order = 4, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Dose number within series", formalDefinition = "Nominal position in a series.")
    protected Type doseNumber;

    /**
     * The recommended number of doses to achieve immunity.
     */
    @Child(name = "seriesDoses", type = { PositiveIntType.class,
        StringType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Recommended number of doses for immunity", formalDefinition = "The recommended number of doses to achieve immunity.")
    protected Type seriesDoses;

    private static final long serialVersionUID = -1022717242L;

    /**
     * Constructor
     */
    public ImmunizationProtocolAppliedComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImmunizationProtocolAppliedComponent(Type doseNumber) {
      super();
      this.doseNumber = doseNumber;
    }

    /**
     * @return {@link #series} (One possible path to achieve presumed immunity
     *         against a disease - within the context of an authority.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getSeries" gives direct access to the value
     */
    public StringType getSeriesElement() {
      if (this.series == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationProtocolAppliedComponent.series");
        else if (Configuration.doAutoCreate())
          this.series = new StringType(); // bb
      return this.series;
    }

    public boolean hasSeriesElement() {
      return this.series != null && !this.series.isEmpty();
    }

    public boolean hasSeries() {
      return this.series != null && !this.series.isEmpty();
    }

    /**
     * @param value {@link #series} (One possible path to achieve presumed immunity
     *              against a disease - within the context of an authority.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getSeries" gives direct access to the value
     */
    public ImmunizationProtocolAppliedComponent setSeriesElement(StringType value) {
      this.series = value;
      return this;
    }

    /**
     * @return One possible path to achieve presumed immunity against a disease -
     *         within the context of an authority.
     */
    public String getSeries() {
      return this.series == null ? null : this.series.getValue();
    }

    /**
     * @param value One possible path to achieve presumed immunity against a disease
     *              - within the context of an authority.
     */
    public ImmunizationProtocolAppliedComponent setSeries(String value) {
      if (Utilities.noString(value))
        this.series = null;
      else {
        if (this.series == null)
          this.series = new StringType();
        this.series.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #authority} (Indicates the authority who published the
     *         protocol (e.g. ACIP) that is being followed.)
     */
    public Reference getAuthority() {
      if (this.authority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationProtocolAppliedComponent.authority");
        else if (Configuration.doAutoCreate())
          this.authority = new Reference(); // cc
      return this.authority;
    }

    public boolean hasAuthority() {
      return this.authority != null && !this.authority.isEmpty();
    }

    /**
     * @param value {@link #authority} (Indicates the authority who published the
     *              protocol (e.g. ACIP) that is being followed.)
     */
    public ImmunizationProtocolAppliedComponent setAuthority(Reference value) {
      this.authority = value;
      return this;
    }

    /**
     * @return {@link #authority} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Indicates the
     *         authority who published the protocol (e.g. ACIP) that is being
     *         followed.)
     */
    public Organization getAuthorityTarget() {
      if (this.authorityTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationProtocolAppliedComponent.authority");
        else if (Configuration.doAutoCreate())
          this.authorityTarget = new Organization(); // aa
      return this.authorityTarget;
    }

    /**
     * @param value {@link #authority} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Indicates the
     *              authority who published the protocol (e.g. ACIP) that is being
     *              followed.)
     */
    public ImmunizationProtocolAppliedComponent setAuthorityTarget(Organization value) {
      this.authorityTarget = value;
      return this;
    }

    /**
     * @return {@link #targetDisease} (The vaccine preventable disease the dose is
     *         being administered against.)
     */
    public List<CodeableConcept> getTargetDisease() {
      if (this.targetDisease == null)
        this.targetDisease = new ArrayList<CodeableConcept>();
      return this.targetDisease;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImmunizationProtocolAppliedComponent setTargetDisease(List<CodeableConcept> theTargetDisease) {
      this.targetDisease = theTargetDisease;
      return this;
    }

    public boolean hasTargetDisease() {
      if (this.targetDisease == null)
        return false;
      for (CodeableConcept item : this.targetDisease)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addTargetDisease() { // 3
      CodeableConcept t = new CodeableConcept();
      if (this.targetDisease == null)
        this.targetDisease = new ArrayList<CodeableConcept>();
      this.targetDisease.add(t);
      return t;
    }

    public ImmunizationProtocolAppliedComponent addTargetDisease(CodeableConcept t) { // 3
      if (t == null)
        return this;
      if (this.targetDisease == null)
        this.targetDisease = new ArrayList<CodeableConcept>();
      this.targetDisease.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #targetDisease},
     *         creating it if it does not already exist
     */
    public CodeableConcept getTargetDiseaseFirstRep() {
      if (getTargetDisease().isEmpty()) {
        addTargetDisease();
      }
      return getTargetDisease().get(0);
    }

    /**
     * @return {@link #doseNumber} (Nominal position in a series.)
     */
    public Type getDoseNumber() {
      return this.doseNumber;
    }

    /**
     * @return {@link #doseNumber} (Nominal position in a series.)
     */
    public PositiveIntType getDoseNumberPositiveIntType() throws FHIRException {
      if (this.doseNumber == null)
        this.doseNumber = new PositiveIntType();
      if (!(this.doseNumber instanceof PositiveIntType))
        throw new FHIRException("Type mismatch: the type PositiveIntType was expected, but "
            + this.doseNumber.getClass().getName() + " was encountered");
      return (PositiveIntType) this.doseNumber;
    }

    public boolean hasDoseNumberPositiveIntType() {
      return this.doseNumber instanceof PositiveIntType;
    }

    /**
     * @return {@link #doseNumber} (Nominal position in a series.)
     */
    public StringType getDoseNumberStringType() throws FHIRException {
      if (this.doseNumber == null)
        this.doseNumber = new StringType();
      if (!(this.doseNumber instanceof StringType))
        throw new FHIRException("Type mismatch: the type StringType was expected, but "
            + this.doseNumber.getClass().getName() + " was encountered");
      return (StringType) this.doseNumber;
    }

    public boolean hasDoseNumberStringType() {
      return this.doseNumber instanceof StringType;
    }

    public boolean hasDoseNumber() {
      return this.doseNumber != null && !this.doseNumber.isEmpty();
    }

    /**
     * @param value {@link #doseNumber} (Nominal position in a series.)
     */
    public ImmunizationProtocolAppliedComponent setDoseNumber(Type value) {
      if (value != null && !(value instanceof PositiveIntType || value instanceof StringType))
        throw new Error("Not the right type for Immunization.protocolApplied.doseNumber[x]: " + value.fhirType());
      this.doseNumber = value;
      return this;
    }

    /**
     * @return {@link #seriesDoses} (The recommended number of doses to achieve
     *         immunity.)
     */
    public Type getSeriesDoses() {
      return this.seriesDoses;
    }

    /**
     * @return {@link #seriesDoses} (The recommended number of doses to achieve
     *         immunity.)
     */
    public PositiveIntType getSeriesDosesPositiveIntType() throws FHIRException {
      if (this.seriesDoses == null)
        this.seriesDoses = new PositiveIntType();
      if (!(this.seriesDoses instanceof PositiveIntType))
        throw new FHIRException("Type mismatch: the type PositiveIntType was expected, but "
            + this.seriesDoses.getClass().getName() + " was encountered");
      return (PositiveIntType) this.seriesDoses;
    }

    public boolean hasSeriesDosesPositiveIntType() {
      return this.seriesDoses instanceof PositiveIntType;
    }

    /**
     * @return {@link #seriesDoses} (The recommended number of doses to achieve
     *         immunity.)
     */
    public StringType getSeriesDosesStringType() throws FHIRException {
      if (this.seriesDoses == null)
        this.seriesDoses = new StringType();
      if (!(this.seriesDoses instanceof StringType))
        throw new FHIRException("Type mismatch: the type StringType was expected, but "
            + this.seriesDoses.getClass().getName() + " was encountered");
      return (StringType) this.seriesDoses;
    }

    public boolean hasSeriesDosesStringType() {
      return this.seriesDoses instanceof StringType;
    }

    public boolean hasSeriesDoses() {
      return this.seriesDoses != null && !this.seriesDoses.isEmpty();
    }

    /**
     * @param value {@link #seriesDoses} (The recommended number of doses to achieve
     *              immunity.)
     */
    public ImmunizationProtocolAppliedComponent setSeriesDoses(Type value) {
      if (value != null && !(value instanceof PositiveIntType || value instanceof StringType))
        throw new Error("Not the right type for Immunization.protocolApplied.seriesDoses[x]: " + value.fhirType());
      this.seriesDoses = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("series", "string",
          "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0,
          1, series));
      children.add(new Property("authority", "Reference(Organization)",
          "Indicates the authority who published the protocol (e.g. ACIP) that is being followed.", 0, 1, authority));
      children.add(new Property("targetDisease", "CodeableConcept",
          "The vaccine preventable disease the dose is being administered against.", 0, java.lang.Integer.MAX_VALUE,
          targetDisease));
      children
          .add(new Property("doseNumber[x]", "positiveInt|string", "Nominal position in a series.", 0, 1, doseNumber));
      children.add(new Property("seriesDoses[x]", "positiveInt|string",
          "The recommended number of doses to achieve immunity.", 0, 1, seriesDoses));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -905838985:
        /* series */ return new Property("series", "string",
            "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0,
            1, series);
      case 1475610435:
        /* authority */ return new Property("authority", "Reference(Organization)",
            "Indicates the authority who published the protocol (e.g. ACIP) that is being followed.", 0, 1, authority);
      case -319593813:
        /* targetDisease */ return new Property("targetDisease", "CodeableConcept",
            "The vaccine preventable disease the dose is being administered against.", 0, java.lang.Integer.MAX_VALUE,
            targetDisease);
      case -1632295686:
        /* doseNumber[x] */ return new Property("doseNumber[x]", "positiveInt|string", "Nominal position in a series.",
            0, 1, doseNumber);
      case -887709242:
        /* doseNumber */ return new Property("doseNumber[x]", "positiveInt|string", "Nominal position in a series.", 0,
            1, doseNumber);
      case -1826134640:
        /* doseNumberPositiveInt */ return new Property("doseNumber[x]", "positiveInt|string",
            "Nominal position in a series.", 0, 1, doseNumber);
      case -333053577:
        /* doseNumberString */ return new Property("doseNumber[x]", "positiveInt|string",
            "Nominal position in a series.", 0, 1, doseNumber);
      case 1553560673:
        /* seriesDoses[x] */ return new Property("seriesDoses[x]", "positiveInt|string",
            "The recommended number of doses to achieve immunity.", 0, 1, seriesDoses);
      case -1936727105:
        /* seriesDoses */ return new Property("seriesDoses[x]", "positiveInt|string",
            "The recommended number of doses to achieve immunity.", 0, 1, seriesDoses);
      case -220897801:
        /* seriesDosesPositiveInt */ return new Property("seriesDoses[x]", "positiveInt|string",
            "The recommended number of doses to achieve immunity.", 0, 1, seriesDoses);
      case -673569616:
        /* seriesDosesString */ return new Property("seriesDoses[x]", "positiveInt|string",
            "The recommended number of doses to achieve immunity.", 0, 1, seriesDoses);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -905838985:
        /* series */ return this.series == null ? new Base[0] : new Base[] { this.series }; // StringType
      case 1475610435:
        /* authority */ return this.authority == null ? new Base[0] : new Base[] { this.authority }; // Reference
      case -319593813:
        /* targetDisease */ return this.targetDisease == null ? new Base[0]
            : this.targetDisease.toArray(new Base[this.targetDisease.size()]); // CodeableConcept
      case -887709242:
        /* doseNumber */ return this.doseNumber == null ? new Base[0] : new Base[] { this.doseNumber }; // Type
      case -1936727105:
        /* seriesDoses */ return this.seriesDoses == null ? new Base[0] : new Base[] { this.seriesDoses }; // Type
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -905838985: // series
        this.series = castToString(value); // StringType
        return value;
      case 1475610435: // authority
        this.authority = castToReference(value); // Reference
        return value;
      case -319593813: // targetDisease
        this.getTargetDisease().add(castToCodeableConcept(value)); // CodeableConcept
        return value;
      case -887709242: // doseNumber
        this.doseNumber = castToType(value); // Type
        return value;
      case -1936727105: // seriesDoses
        this.seriesDoses = castToType(value); // Type
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("series")) {
        this.series = castToString(value); // StringType
      } else if (name.equals("authority")) {
        this.authority = castToReference(value); // Reference
      } else if (name.equals("targetDisease")) {
        this.getTargetDisease().add(castToCodeableConcept(value));
      } else if (name.equals("doseNumber[x]")) {
        this.doseNumber = castToType(value); // Type
      } else if (name.equals("seriesDoses[x]")) {
        this.seriesDoses = castToType(value); // Type
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("series")) {
        this.series = null;
      } else if (name.equals("authority")) {
        this.authority = null;
      } else if (name.equals("targetDisease")) {
        this.getTargetDisease().remove(castToCodeableConcept(value));
      } else if (name.equals("doseNumber[x]")) {
        this.doseNumber = null;
      } else if (name.equals("seriesDoses[x]")) {
        this.seriesDoses = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -905838985:
        return getSeriesElement();
      case 1475610435:
        return getAuthority();
      case -319593813:
        return addTargetDisease();
      case -1632295686:
        return getDoseNumber();
      case -887709242:
        return getDoseNumber();
      case 1553560673:
        return getSeriesDoses();
      case -1936727105:
        return getSeriesDoses();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -905838985:
        /* series */ return new String[] { "string" };
      case 1475610435:
        /* authority */ return new String[] { "Reference" };
      case -319593813:
        /* targetDisease */ return new String[] { "CodeableConcept" };
      case -887709242:
        /* doseNumber */ return new String[] { "positiveInt", "string" };
      case -1936727105:
        /* seriesDoses */ return new String[] { "positiveInt", "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("series")) {
        throw new FHIRException("Cannot call addChild on a singleton property Immunization.series");
      } else if (name.equals("authority")) {
        this.authority = new Reference();
        return this.authority;
      } else if (name.equals("targetDisease")) {
        return addTargetDisease();
      } else if (name.equals("doseNumberPositiveInt")) {
        this.doseNumber = new PositiveIntType();
        return this.doseNumber;
      } else if (name.equals("doseNumberString")) {
        this.doseNumber = new StringType();
        return this.doseNumber;
      } else if (name.equals("seriesDosesPositiveInt")) {
        this.seriesDoses = new PositiveIntType();
        return this.seriesDoses;
      } else if (name.equals("seriesDosesString")) {
        this.seriesDoses = new StringType();
        return this.seriesDoses;
      } else
        return super.addChild(name);
    }

    public ImmunizationProtocolAppliedComponent copy() {
      ImmunizationProtocolAppliedComponent dst = new ImmunizationProtocolAppliedComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImmunizationProtocolAppliedComponent dst) {
      super.copyValues(dst);
      dst.series = series == null ? null : series.copy();
      dst.authority = authority == null ? null : authority.copy();
      if (targetDisease != null) {
        dst.targetDisease = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : targetDisease)
          dst.targetDisease.add(i.copy());
      }
      ;
      dst.doseNumber = doseNumber == null ? null : doseNumber.copy();
      dst.seriesDoses = seriesDoses == null ? null : seriesDoses.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImmunizationProtocolAppliedComponent))
        return false;
      ImmunizationProtocolAppliedComponent o = (ImmunizationProtocolAppliedComponent) other_;
      return compareDeep(series, o.series, true) && compareDeep(authority, o.authority, true)
          && compareDeep(targetDisease, o.targetDisease, true) && compareDeep(doseNumber, o.doseNumber, true)
          && compareDeep(seriesDoses, o.seriesDoses, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImmunizationProtocolAppliedComponent))
        return false;
      ImmunizationProtocolAppliedComponent o = (ImmunizationProtocolAppliedComponent) other_;
      return compareValues(series, o.series, true);
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(series, authority, targetDisease, doseNumber, seriesDoses);
    }

    public String fhirType() {
      return "Immunization.protocolApplied";

    }

  }

  /**
   * A unique identifier assigned to this immunization record.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Business identifier", formalDefinition = "A unique identifier assigned to this immunization record.")
  protected List<Identifier> identifier;

  /**
   * Indicates the current status of the immunization event.
   */
  @Child(name = "status", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "completed | entered-in-error | not-done", formalDefinition = "Indicates the current status of the immunization event.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-status")
  protected Enumeration<ImmunizationStatus> status;

  /**
   * Indicates the reason the immunization event was not performed.
   */
  @Child(name = "statusReason", type = {
      CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Reason not done", formalDefinition = "Indicates the reason the immunization event was not performed.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-status-reason")
  protected CodeableConcept statusReason;

  /**
   * Vaccine that was administered or was to be administered.
   */
  @Child(name = "vaccineCode", type = {
      CodeableConcept.class }, order = 3, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Vaccine product administered", formalDefinition = "Vaccine that was administered or was to be administered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/vaccine-code")
  protected CodeableConcept vaccineCode;

  /**
   * The patient who either received or did not receive the immunization.
   */
  @Child(name = "patient", type = { Patient.class }, order = 4, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Who was immunized", formalDefinition = "The patient who either received or did not receive the immunization.")
  protected Reference patient;

  /**
   * The actual object that is the target of the reference (The patient who either
   * received or did not receive the immunization.)
   */
  protected Patient patientTarget;

  /**
   * The visit or admission or other contact between patient and health care
   * provider the immunization was performed as part of.
   */
  @Child(name = "encounter", type = { Encounter.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Encounter immunization was part of", formalDefinition = "The visit or admission or other contact between patient and health care provider the immunization was performed as part of.")
  protected Reference encounter;

  /**
   * The actual object that is the target of the reference (The visit or admission
   * or other contact between patient and health care provider the immunization
   * was performed as part of.)
   */
  protected Encounter encounterTarget;

  /**
   * Date vaccine administered or was to be administered.
   */
  @Child(name = "occurrence", type = { DateTimeType.class,
      StringType.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Vaccine administration date", formalDefinition = "Date vaccine administered or was to be administered.")
  protected Type occurrence;

  /**
   * The date the occurrence of the immunization was first captured in the record
   * - potentially significantly after the occurrence of the event.
   */
  @Child(name = "recorded", type = {
      DateTimeType.class }, order = 7, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "When the immunization was first captured in the subject's record", formalDefinition = "The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.")
  protected DateTimeType recorded;

  /**
   * An indication that the content of the record is based on information from the
   * person who administered the vaccine. This reflects the context under which
   * the data was originally recorded.
   */
  @Child(name = "primarySource", type = {
      BooleanType.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Indicates context the data was recorded in", formalDefinition = "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.")
  protected BooleanType primarySource;

  /**
   * The source of the data when the report of the immunization event is not based
   * on information from the person who administered the vaccine.
   */
  @Child(name = "reportOrigin", type = {
      CodeableConcept.class }, order = 9, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Indicates the source of a secondarily reported record", formalDefinition = "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-origin")
  protected CodeableConcept reportOrigin;

  /**
   * The service delivery location where the vaccine administration occurred.
   */
  @Child(name = "location", type = { Location.class }, order = 10, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Where immunization occurred", formalDefinition = "The service delivery location where the vaccine administration occurred.")
  protected Reference location;

  /**
   * The actual object that is the target of the reference (The service delivery
   * location where the vaccine administration occurred.)
   */
  protected Location locationTarget;

  /**
   * Name of vaccine manufacturer.
   */
  @Child(name = "manufacturer", type = {
      Organization.class }, order = 11, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Vaccine manufacturer", formalDefinition = "Name of vaccine manufacturer.")
  protected Reference manufacturer;

  /**
   * The actual object that is the target of the reference (Name of vaccine
   * manufacturer.)
   */
  protected Organization manufacturerTarget;

  /**
   * Lot number of the vaccine product.
   */
  @Child(name = "lotNumber", type = {
      StringType.class }, order = 12, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Vaccine lot number", formalDefinition = "Lot number of the  vaccine product.")
  protected StringType lotNumber;

  /**
   * Date vaccine batch expires.
   */
  @Child(name = "expirationDate", type = {
      DateType.class }, order = 13, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Vaccine expiration date", formalDefinition = "Date vaccine batch expires.")
  protected DateType expirationDate;

  /**
   * Body site where vaccine was administered.
   */
  @Child(name = "site", type = {
      CodeableConcept.class }, order = 14, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Body site vaccine  was administered", formalDefinition = "Body site where vaccine was administered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-site")
  protected CodeableConcept site;

  /**
   * The path by which the vaccine product is taken into the body.
   */
  @Child(name = "route", type = {
      CodeableConcept.class }, order = 15, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "How vaccine entered body", formalDefinition = "The path by which the vaccine product is taken into the body.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-route")
  protected CodeableConcept route;

  /**
   * The quantity of vaccine product that was administered.
   */
  @Child(name = "doseQuantity", type = {
      Quantity.class }, order = 16, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Amount of vaccine administered", formalDefinition = "The quantity of vaccine product that was administered.")
  protected Quantity doseQuantity;

  /**
   * Indicates who performed the immunization event.
   */
  @Child(name = "performer", type = {}, order = 17, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Who performed event", formalDefinition = "Indicates who performed the immunization event.")
  protected List<ImmunizationPerformerComponent> performer;

  /**
   * Extra information about the immunization that is not conveyed by the other
   * attributes.
   */
  @Child(name = "note", type = {
      Annotation.class }, order = 18, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Additional immunization notes", formalDefinition = "Extra information about the immunization that is not conveyed by the other attributes.")
  protected List<Annotation> note;

  /**
   * Reasons why the vaccine was administered.
   */
  @Child(name = "reasonCode", type = {
      CodeableConcept.class }, order = 19, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Why immunization occurred", formalDefinition = "Reasons why the vaccine was administered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-reason")
  protected List<CodeableConcept> reasonCode;

  /**
   * Condition, Observation or DiagnosticReport that supports why the immunization
   * was administered.
   */
  @Child(name = "reasonReference", type = { Condition.class, Observation.class,
      DiagnosticReport.class }, order = 20, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Why immunization occurred", formalDefinition = "Condition, Observation or DiagnosticReport that supports why the immunization was administered.")
  protected List<Reference> reasonReference;
  /**
   * The actual objects that are the target of the reference (Condition,
   * Observation or DiagnosticReport that supports why the immunization was
   * administered.)
   */
  protected List<Resource> reasonReferenceTarget;

  /**
   * Indication if a dose is considered to be subpotent. By default, a dose should
   * be considered to be potent.
   */
  @Child(name = "isSubpotent", type = {
      BooleanType.class }, order = 21, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "Dose potency", formalDefinition = "Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.")
  protected BooleanType isSubpotent;

  /**
   * Reason why a dose is considered to be subpotent.
   */
  @Child(name = "subpotentReason", type = {
      CodeableConcept.class }, order = 22, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Reason for being subpotent", formalDefinition = "Reason why a dose is considered to be subpotent.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-subpotent-reason")
  protected List<CodeableConcept> subpotentReason;

  /**
   * Educational material presented to the patient (or guardian) at the time of
   * vaccine administration.
   */
  @Child(name = "education", type = {}, order = 23, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Educational material presented to patient", formalDefinition = "Educational material presented to the patient (or guardian) at the time of vaccine administration.")
  protected List<ImmunizationEducationComponent> education;

  /**
   * Indicates a patient's eligibility for a funding program.
   */
  @Child(name = "programEligibility", type = {
      CodeableConcept.class }, order = 24, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Patient eligibility for a vaccination program", formalDefinition = "Indicates a patient's eligibility for a funding program.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-program-eligibility")
  protected List<CodeableConcept> programEligibility;

  /**
   * Indicates the source of the vaccine actually administered. This may be
   * different than the patient eligibility (e.g. the patient may be eligible for
   * a publically purchased vaccine but due to inventory issues, vaccine purchased
   * with private funds was actually administered).
   */
  @Child(name = "fundingSource", type = {
      CodeableConcept.class }, order = 25, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Funding source for the vaccine", formalDefinition = "Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/immunization-funding-source")
  protected CodeableConcept fundingSource;

  /**
   * Categorical data indicating that an adverse event is associated in time to an
   * immunization.
   */
  @Child(name = "reaction", type = {}, order = 26, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Details of a reaction that follows immunization", formalDefinition = "Categorical data indicating that an adverse event is associated in time to an immunization.")
  protected List<ImmunizationReactionComponent> reaction;

  /**
   * The protocol (set of recommendations) being followed by the provider who
   * administered the dose.
   */
  @Child(name = "protocolApplied", type = {}, order = 27, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Protocol followed by the provider", formalDefinition = "The protocol (set of recommendations) being followed by the provider who administered the dose.")
  protected List<ImmunizationProtocolAppliedComponent> protocolApplied;

  private static final long serialVersionUID = 1946730839L;

  /**
   * Constructor
   */
  public Immunization() {
    super();
  }

  /**
   * Constructor
   */
  public Immunization(Enumeration<ImmunizationStatus> status, CodeableConcept vaccineCode, Reference patient,
      Type occurrence) {
    super();
    this.status = status;
    this.vaccineCode = vaccineCode;
    this.patient = patient;
    this.occurrence = occurrence;
  }

  /**
   * @return {@link #identifier} (A unique identifier assigned to this
   *         immunization record.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setIdentifier(List<Identifier> theIdentifier) {
    this.identifier = theIdentifier;
    return this;
  }

  public boolean hasIdentifier() {
    if (this.identifier == null)
      return false;
    for (Identifier item : this.identifier)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Identifier addIdentifier() { // 3
    Identifier t = new Identifier();
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return t;
  }

  public Immunization addIdentifier(Identifier t) { // 3
    if (t == null)
      return this;
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #identifier}, creating
   *         it if it does not already exist
   */
  public Identifier getIdentifierFirstRep() {
    if (getIdentifier().isEmpty()) {
      addIdentifier();
    }
    return getIdentifier().get(0);
  }

  /**
   * @return {@link #status} (Indicates the current status of the immunization
   *         event.). This is the underlying object with id, value and extensions.
   *         The accessor "getStatus" gives direct access to the value
   */
  public Enumeration<ImmunizationStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<ImmunizationStatus>(new ImmunizationStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (Indicates the current status of the
   *              immunization event.). This is the underlying object with id,
   *              value and extensions. The accessor "getStatus" gives direct
   *              access to the value
   */
  public Immunization setStatusElement(Enumeration<ImmunizationStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return Indicates the current status of the immunization event.
   */
  public ImmunizationStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value Indicates the current status of the immunization event.
   */
  public Immunization setStatus(ImmunizationStatus value) {
    if (this.status == null)
      this.status = new Enumeration<ImmunizationStatus>(new ImmunizationStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #statusReason} (Indicates the reason the immunization event
   *         was not performed.)
   */
  public CodeableConcept getStatusReason() {
    if (this.statusReason == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.statusReason");
      else if (Configuration.doAutoCreate())
        this.statusReason = new CodeableConcept(); // cc
    return this.statusReason;
  }

  public boolean hasStatusReason() {
    return this.statusReason != null && !this.statusReason.isEmpty();
  }

  /**
   * @param value {@link #statusReason} (Indicates the reason the immunization
   *              event was not performed.)
   */
  public Immunization setStatusReason(CodeableConcept value) {
    this.statusReason = value;
    return this;
  }

  /**
   * @return {@link #vaccineCode} (Vaccine that was administered or was to be
   *         administered.)
   */
  public CodeableConcept getVaccineCode() {
    if (this.vaccineCode == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.vaccineCode");
      else if (Configuration.doAutoCreate())
        this.vaccineCode = new CodeableConcept(); // cc
    return this.vaccineCode;
  }

  public boolean hasVaccineCode() {
    return this.vaccineCode != null && !this.vaccineCode.isEmpty();
  }

  /**
   * @param value {@link #vaccineCode} (Vaccine that was administered or was to be
   *              administered.)
   */
  public Immunization setVaccineCode(CodeableConcept value) {
    this.vaccineCode = value;
    return this;
  }

  /**
   * @return {@link #patient} (The patient who either received or did not receive
   *         the immunization.)
   */
  public Reference getPatient() {
    if (this.patient == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.patient");
      else if (Configuration.doAutoCreate())
        this.patient = new Reference(); // cc
    return this.patient;
  }

  public boolean hasPatient() {
    return this.patient != null && !this.patient.isEmpty();
  }

  /**
   * @param value {@link #patient} (The patient who either received or did not
   *              receive the immunization.)
   */
  public Immunization setPatient(Reference value) {
    this.patient = value;
    return this;
  }

  /**
   * @return {@link #patient} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The patient who
   *         either received or did not receive the immunization.)
   */
  public Patient getPatientTarget() {
    if (this.patientTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.patient");
      else if (Configuration.doAutoCreate())
        this.patientTarget = new Patient(); // aa
    return this.patientTarget;
  }

  /**
   * @param value {@link #patient} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The patient who
   *              either received or did not receive the immunization.)
   */
  public Immunization setPatientTarget(Patient value) {
    this.patientTarget = value;
    return this;
  }

  /**
   * @return {@link #encounter} (The visit or admission or other contact between
   *         patient and health care provider the immunization was performed as
   *         part of.)
   */
  public Reference getEncounter() {
    if (this.encounter == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.encounter");
      else if (Configuration.doAutoCreate())
        this.encounter = new Reference(); // cc
    return this.encounter;
  }

  public boolean hasEncounter() {
    return this.encounter != null && !this.encounter.isEmpty();
  }

  /**
   * @param value {@link #encounter} (The visit or admission or other contact
   *              between patient and health care provider the immunization was
   *              performed as part of.)
   */
  public Immunization setEncounter(Reference value) {
    this.encounter = value;
    return this;
  }

  /**
   * @return {@link #encounter} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The visit or
   *         admission or other contact between patient and health care provider
   *         the immunization was performed as part of.)
   */
  public Encounter getEncounterTarget() {
    if (this.encounterTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.encounter");
      else if (Configuration.doAutoCreate())
        this.encounterTarget = new Encounter(); // aa
    return this.encounterTarget;
  }

  /**
   * @param value {@link #encounter} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The visit or
   *              admission or other contact between patient and health care
   *              provider the immunization was performed as part of.)
   */
  public Immunization setEncounterTarget(Encounter value) {
    this.encounterTarget = value;
    return this;
  }

  /**
   * @return {@link #occurrence} (Date vaccine administered or was to be
   *         administered.)
   */
  public Type getOccurrence() {
    return this.occurrence;
  }

  /**
   * @return {@link #occurrence} (Date vaccine administered or was to be
   *         administered.)
   */
  public DateTimeType getOccurrenceDateTimeType() throws FHIRException {
    if (this.occurrence == null)
      this.occurrence = new DateTimeType();
    if (!(this.occurrence instanceof DateTimeType))
      throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "
          + this.occurrence.getClass().getName() + " was encountered");
    return (DateTimeType) this.occurrence;
  }

  public boolean hasOccurrenceDateTimeType() {
    return this.occurrence instanceof DateTimeType;
  }

  /**
   * @return {@link #occurrence} (Date vaccine administered or was to be
   *         administered.)
   */
  public StringType getOccurrenceStringType() throws FHIRException {
    if (this.occurrence == null)
      this.occurrence = new StringType();
    if (!(this.occurrence instanceof StringType))
      throw new FHIRException("Type mismatch: the type StringType was expected, but "
          + this.occurrence.getClass().getName() + " was encountered");
    return (StringType) this.occurrence;
  }

  public boolean hasOccurrenceStringType() {
    return this.occurrence instanceof StringType;
  }

  public boolean hasOccurrence() {
    return this.occurrence != null && !this.occurrence.isEmpty();
  }

  /**
   * @param value {@link #occurrence} (Date vaccine administered or was to be
   *              administered.)
   */
  public Immunization setOccurrence(Type value) {
    if (value != null && !(value instanceof DateTimeType || value instanceof StringType))
      throw new Error("Not the right type for Immunization.occurrence[x]: " + value.fhirType());
    this.occurrence = value;
    return this;
  }

  /**
   * @return {@link #recorded} (The date the occurrence of the immunization was
   *         first captured in the record - potentially significantly after the
   *         occurrence of the event.). This is the underlying object with id,
   *         value and extensions. The accessor "getRecorded" gives direct access
   *         to the value
   */
  public DateTimeType getRecordedElement() {
    if (this.recorded == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.recorded");
      else if (Configuration.doAutoCreate())
        this.recorded = new DateTimeType(); // bb
    return this.recorded;
  }

  public boolean hasRecordedElement() {
    return this.recorded != null && !this.recorded.isEmpty();
  }

  public boolean hasRecorded() {
    return this.recorded != null && !this.recorded.isEmpty();
  }

  /**
   * @param value {@link #recorded} (The date the occurrence of the immunization
   *              was first captured in the record - potentially significantly
   *              after the occurrence of the event.). This is the underlying
   *              object with id, value and extensions. The accessor "getRecorded"
   *              gives direct access to the value
   */
  public Immunization setRecordedElement(DateTimeType value) {
    this.recorded = value;
    return this;
  }

  /**
   * @return The date the occurrence of the immunization was first captured in the
   *         record - potentially significantly after the occurrence of the event.
   */
  public Date getRecorded() {
    return this.recorded == null ? null : this.recorded.getValue();
  }

  /**
   * @param value The date the occurrence of the immunization was first captured
   *              in the record - potentially significantly after the occurrence
   *              of the event.
   */
  public Immunization setRecorded(Date value) {
    if (value == null)
      this.recorded = null;
    else {
      if (this.recorded == null)
        this.recorded = new DateTimeType();
      this.recorded.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #primarySource} (An indication that the content of the record
   *         is based on information from the person who administered the vaccine.
   *         This reflects the context under which the data was originally
   *         recorded.). This is the underlying object with id, value and
   *         extensions. The accessor "getPrimarySource" gives direct access to
   *         the value
   */
  public BooleanType getPrimarySourceElement() {
    if (this.primarySource == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.primarySource");
      else if (Configuration.doAutoCreate())
        this.primarySource = new BooleanType(); // bb
    return this.primarySource;
  }

  public boolean hasPrimarySourceElement() {
    return this.primarySource != null && !this.primarySource.isEmpty();
  }

  public boolean hasPrimarySource() {
    return this.primarySource != null && !this.primarySource.isEmpty();
  }

  /**
   * @param value {@link #primarySource} (An indication that the content of the
   *              record is based on information from the person who administered
   *              the vaccine. This reflects the context under which the data was
   *              originally recorded.). This is the underlying object with id,
   *              value and extensions. The accessor "getPrimarySource" gives
   *              direct access to the value
   */
  public Immunization setPrimarySourceElement(BooleanType value) {
    this.primarySource = value;
    return this;
  }

  /**
   * @return An indication that the content of the record is based on information
   *         from the person who administered the vaccine. This reflects the
   *         context under which the data was originally recorded.
   */
  public boolean getPrimarySource() {
    return this.primarySource == null || this.primarySource.isEmpty() ? false : this.primarySource.getValue();
  }

  /**
   * @param value An indication that the content of the record is based on
   *              information from the person who administered the vaccine. This
   *              reflects the context under which the data was originally
   *              recorded.
   */
  public Immunization setPrimarySource(boolean value) {
    if (this.primarySource == null)
      this.primarySource = new BooleanType();
    this.primarySource.setValue(value);
    return this;
  }

  /**
   * @return {@link #reportOrigin} (The source of the data when the report of the
   *         immunization event is not based on information from the person who
   *         administered the vaccine.)
   */
  public CodeableConcept getReportOrigin() {
    if (this.reportOrigin == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.reportOrigin");
      else if (Configuration.doAutoCreate())
        this.reportOrigin = new CodeableConcept(); // cc
    return this.reportOrigin;
  }

  public boolean hasReportOrigin() {
    return this.reportOrigin != null && !this.reportOrigin.isEmpty();
  }

  /**
   * @param value {@link #reportOrigin} (The source of the data when the report of
   *              the immunization event is not based on information from the
   *              person who administered the vaccine.)
   */
  public Immunization setReportOrigin(CodeableConcept value) {
    this.reportOrigin = value;
    return this;
  }

  /**
   * @return {@link #location} (The service delivery location where the vaccine
   *         administration occurred.)
   */
  public Reference getLocation() {
    if (this.location == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.location");
      else if (Configuration.doAutoCreate())
        this.location = new Reference(); // cc
    return this.location;
  }

  public boolean hasLocation() {
    return this.location != null && !this.location.isEmpty();
  }

  /**
   * @param value {@link #location} (The service delivery location where the
   *              vaccine administration occurred.)
   */
  public Immunization setLocation(Reference value) {
    this.location = value;
    return this;
  }

  /**
   * @return {@link #location} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The service delivery
   *         location where the vaccine administration occurred.)
   */
  public Location getLocationTarget() {
    if (this.locationTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.location");
      else if (Configuration.doAutoCreate())
        this.locationTarget = new Location(); // aa
    return this.locationTarget;
  }

  /**
   * @param value {@link #location} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The service
   *              delivery location where the vaccine administration occurred.)
   */
  public Immunization setLocationTarget(Location value) {
    this.locationTarget = value;
    return this;
  }

  /**
   * @return {@link #manufacturer} (Name of vaccine manufacturer.)
   */
  public Reference getManufacturer() {
    if (this.manufacturer == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.manufacturer");
      else if (Configuration.doAutoCreate())
        this.manufacturer = new Reference(); // cc
    return this.manufacturer;
  }

  public boolean hasManufacturer() {
    return this.manufacturer != null && !this.manufacturer.isEmpty();
  }

  /**
   * @param value {@link #manufacturer} (Name of vaccine manufacturer.)
   */
  public Immunization setManufacturer(Reference value) {
    this.manufacturer = value;
    return this;
  }

  /**
   * @return {@link #manufacturer} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (Name of vaccine
   *         manufacturer.)
   */
  public Organization getManufacturerTarget() {
    if (this.manufacturerTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.manufacturer");
      else if (Configuration.doAutoCreate())
        this.manufacturerTarget = new Organization(); // aa
    return this.manufacturerTarget;
  }

  /**
   * @param value {@link #manufacturer} The actual object that is the target of
   *              the reference. The reference library doesn't use these, but you
   *              can use it to hold the resource if you resolve it. (Name of
   *              vaccine manufacturer.)
   */
  public Immunization setManufacturerTarget(Organization value) {
    this.manufacturerTarget = value;
    return this;
  }

  /**
   * @return {@link #lotNumber} (Lot number of the vaccine product.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getLotNumber" gives direct access to the value
   */
  public StringType getLotNumberElement() {
    if (this.lotNumber == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.lotNumber");
      else if (Configuration.doAutoCreate())
        this.lotNumber = new StringType(); // bb
    return this.lotNumber;
  }

  public boolean hasLotNumberElement() {
    return this.lotNumber != null && !this.lotNumber.isEmpty();
  }

  public boolean hasLotNumber() {
    return this.lotNumber != null && !this.lotNumber.isEmpty();
  }

  /**
   * @param value {@link #lotNumber} (Lot number of the vaccine product.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getLotNumber" gives direct access to the value
   */
  public Immunization setLotNumberElement(StringType value) {
    this.lotNumber = value;
    return this;
  }

  /**
   * @return Lot number of the vaccine product.
   */
  public String getLotNumber() {
    return this.lotNumber == null ? null : this.lotNumber.getValue();
  }

  /**
   * @param value Lot number of the vaccine product.
   */
  public Immunization setLotNumber(String value) {
    if (Utilities.noString(value))
      this.lotNumber = null;
    else {
      if (this.lotNumber == null)
        this.lotNumber = new StringType();
      this.lotNumber.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #expirationDate} (Date vaccine batch expires.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getExpirationDate" gives direct access to the value
   */
  public DateType getExpirationDateElement() {
    if (this.expirationDate == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.expirationDate");
      else if (Configuration.doAutoCreate())
        this.expirationDate = new DateType(); // bb
    return this.expirationDate;
  }

  public boolean hasExpirationDateElement() {
    return this.expirationDate != null && !this.expirationDate.isEmpty();
  }

  public boolean hasExpirationDate() {
    return this.expirationDate != null && !this.expirationDate.isEmpty();
  }

  /**
   * @param value {@link #expirationDate} (Date vaccine batch expires.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getExpirationDate" gives direct access to the value
   */
  public Immunization setExpirationDateElement(DateType value) {
    this.expirationDate = value;
    return this;
  }

  /**
   * @return Date vaccine batch expires.
   */
  public Date getExpirationDate() {
    return this.expirationDate == null ? null : this.expirationDate.getValue();
  }

  /**
   * @param value Date vaccine batch expires.
   */
  public Immunization setExpirationDate(Date value) {
    if (value == null)
      this.expirationDate = null;
    else {
      if (this.expirationDate == null)
        this.expirationDate = new DateType();
      this.expirationDate.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #site} (Body site where vaccine was administered.)
   */
  public CodeableConcept getSite() {
    if (this.site == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.site");
      else if (Configuration.doAutoCreate())
        this.site = new CodeableConcept(); // cc
    return this.site;
  }

  public boolean hasSite() {
    return this.site != null && !this.site.isEmpty();
  }

  /**
   * @param value {@link #site} (Body site where vaccine was administered.)
   */
  public Immunization setSite(CodeableConcept value) {
    this.site = value;
    return this;
  }

  /**
   * @return {@link #route} (The path by which the vaccine product is taken into
   *         the body.)
   */
  public CodeableConcept getRoute() {
    if (this.route == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.route");
      else if (Configuration.doAutoCreate())
        this.route = new CodeableConcept(); // cc
    return this.route;
  }

  public boolean hasRoute() {
    return this.route != null && !this.route.isEmpty();
  }

  /**
   * @param value {@link #route} (The path by which the vaccine product is taken
   *              into the body.)
   */
  public Immunization setRoute(CodeableConcept value) {
    this.route = value;
    return this;
  }

  /**
   * @return {@link #doseQuantity} (The quantity of vaccine product that was
   *         administered.)
   */
  public Quantity getDoseQuantity() {
    if (this.doseQuantity == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.doseQuantity");
      else if (Configuration.doAutoCreate())
        this.doseQuantity = new Quantity(); // cc
    return this.doseQuantity;
  }

  public boolean hasDoseQuantity() {
    return this.doseQuantity != null && !this.doseQuantity.isEmpty();
  }

  /**
   * @param value {@link #doseQuantity} (The quantity of vaccine product that was
   *              administered.)
   */
  public Immunization setDoseQuantity(Quantity value) {
    this.doseQuantity = value;
    return this;
  }

  /**
   * @return {@link #performer} (Indicates who performed the immunization event.)
   */
  public List<ImmunizationPerformerComponent> getPerformer() {
    if (this.performer == null)
      this.performer = new ArrayList<ImmunizationPerformerComponent>();
    return this.performer;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setPerformer(List<ImmunizationPerformerComponent> thePerformer) {
    this.performer = thePerformer;
    return this;
  }

  public boolean hasPerformer() {
    if (this.performer == null)
      return false;
    for (ImmunizationPerformerComponent item : this.performer)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImmunizationPerformerComponent addPerformer() { // 3
    ImmunizationPerformerComponent t = new ImmunizationPerformerComponent();
    if (this.performer == null)
      this.performer = new ArrayList<ImmunizationPerformerComponent>();
    this.performer.add(t);
    return t;
  }

  public Immunization addPerformer(ImmunizationPerformerComponent t) { // 3
    if (t == null)
      return this;
    if (this.performer == null)
      this.performer = new ArrayList<ImmunizationPerformerComponent>();
    this.performer.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #performer}, creating
   *         it if it does not already exist
   */
  public ImmunizationPerformerComponent getPerformerFirstRep() {
    if (getPerformer().isEmpty()) {
      addPerformer();
    }
    return getPerformer().get(0);
  }

  /**
   * @return {@link #note} (Extra information about the immunization that is not
   *         conveyed by the other attributes.)
   */
  public List<Annotation> getNote() {
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    return this.note;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setNote(List<Annotation> theNote) {
    this.note = theNote;
    return this;
  }

  public boolean hasNote() {
    if (this.note == null)
      return false;
    for (Annotation item : this.note)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Annotation addNote() { // 3
    Annotation t = new Annotation();
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    this.note.add(t);
    return t;
  }

  public Immunization addNote(Annotation t) { // 3
    if (t == null)
      return this;
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    this.note.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #note}, creating it if
   *         it does not already exist
   */
  public Annotation getNoteFirstRep() {
    if (getNote().isEmpty()) {
      addNote();
    }
    return getNote().get(0);
  }

  /**
   * @return {@link #reasonCode} (Reasons why the vaccine was administered.)
   */
  public List<CodeableConcept> getReasonCode() {
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    return this.reasonCode;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setReasonCode(List<CodeableConcept> theReasonCode) {
    this.reasonCode = theReasonCode;
    return this;
  }

  public boolean hasReasonCode() {
    if (this.reasonCode == null)
      return false;
    for (CodeableConcept item : this.reasonCode)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addReasonCode() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    this.reasonCode.add(t);
    return t;
  }

  public Immunization addReasonCode(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    this.reasonCode.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reasonCode}, creating
   *         it if it does not already exist
   */
  public CodeableConcept getReasonCodeFirstRep() {
    if (getReasonCode().isEmpty()) {
      addReasonCode();
    }
    return getReasonCode().get(0);
  }

  /**
   * @return {@link #reasonReference} (Condition, Observation or DiagnosticReport
   *         that supports why the immunization was administered.)
   */
  public List<Reference> getReasonReference() {
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    return this.reasonReference;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setReasonReference(List<Reference> theReasonReference) {
    this.reasonReference = theReasonReference;
    return this;
  }

  public boolean hasReasonReference() {
    if (this.reasonReference == null)
      return false;
    for (Reference item : this.reasonReference)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addReasonReference() { // 3
    Reference t = new Reference();
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    this.reasonReference.add(t);
    return t;
  }

  public Immunization addReasonReference(Reference t) { // 3
    if (t == null)
      return this;
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    this.reasonReference.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reasonReference},
   *         creating it if it does not already exist
   */
  public Reference getReasonReferenceFirstRep() {
    if (getReasonReference().isEmpty()) {
      addReasonReference();
    }
    return getReasonReference().get(0);
  }

  /**
   * @return {@link #isSubpotent} (Indication if a dose is considered to be
   *         subpotent. By default, a dose should be considered to be potent.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getIsSubpotent" gives direct access to the value
   */
  public BooleanType getIsSubpotentElement() {
    if (this.isSubpotent == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.isSubpotent");
      else if (Configuration.doAutoCreate())
        this.isSubpotent = new BooleanType(); // bb
    return this.isSubpotent;
  }

  public boolean hasIsSubpotentElement() {
    return this.isSubpotent != null && !this.isSubpotent.isEmpty();
  }

  public boolean hasIsSubpotent() {
    return this.isSubpotent != null && !this.isSubpotent.isEmpty();
  }

  /**
   * @param value {@link #isSubpotent} (Indication if a dose is considered to be
   *              subpotent. By default, a dose should be considered to be
   *              potent.). This is the underlying object with id, value and
   *              extensions. The accessor "getIsSubpotent" gives direct access to
   *              the value
   */
  public Immunization setIsSubpotentElement(BooleanType value) {
    this.isSubpotent = value;
    return this;
  }

  /**
   * @return Indication if a dose is considered to be subpotent. By default, a
   *         dose should be considered to be potent.
   */
  public boolean getIsSubpotent() {
    return this.isSubpotent == null || this.isSubpotent.isEmpty() ? false : this.isSubpotent.getValue();
  }

  /**
   * @param value Indication if a dose is considered to be subpotent. By default,
   *              a dose should be considered to be potent.
   */
  public Immunization setIsSubpotent(boolean value) {
    if (this.isSubpotent == null)
      this.isSubpotent = new BooleanType();
    this.isSubpotent.setValue(value);
    return this;
  }

  /**
   * @return {@link #subpotentReason} (Reason why a dose is considered to be
   *         subpotent.)
   */
  public List<CodeableConcept> getSubpotentReason() {
    if (this.subpotentReason == null)
      this.subpotentReason = new ArrayList<CodeableConcept>();
    return this.subpotentReason;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setSubpotentReason(List<CodeableConcept> theSubpotentReason) {
    this.subpotentReason = theSubpotentReason;
    return this;
  }

  public boolean hasSubpotentReason() {
    if (this.subpotentReason == null)
      return false;
    for (CodeableConcept item : this.subpotentReason)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addSubpotentReason() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.subpotentReason == null)
      this.subpotentReason = new ArrayList<CodeableConcept>();
    this.subpotentReason.add(t);
    return t;
  }

  public Immunization addSubpotentReason(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.subpotentReason == null)
      this.subpotentReason = new ArrayList<CodeableConcept>();
    this.subpotentReason.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #subpotentReason},
   *         creating it if it does not already exist
   */
  public CodeableConcept getSubpotentReasonFirstRep() {
    if (getSubpotentReason().isEmpty()) {
      addSubpotentReason();
    }
    return getSubpotentReason().get(0);
  }

  /**
   * @return {@link #education} (Educational material presented to the patient (or
   *         guardian) at the time of vaccine administration.)
   */
  public List<ImmunizationEducationComponent> getEducation() {
    if (this.education == null)
      this.education = new ArrayList<ImmunizationEducationComponent>();
    return this.education;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setEducation(List<ImmunizationEducationComponent> theEducation) {
    this.education = theEducation;
    return this;
  }

  public boolean hasEducation() {
    if (this.education == null)
      return false;
    for (ImmunizationEducationComponent item : this.education)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImmunizationEducationComponent addEducation() { // 3
    ImmunizationEducationComponent t = new ImmunizationEducationComponent();
    if (this.education == null)
      this.education = new ArrayList<ImmunizationEducationComponent>();
    this.education.add(t);
    return t;
  }

  public Immunization addEducation(ImmunizationEducationComponent t) { // 3
    if (t == null)
      return this;
    if (this.education == null)
      this.education = new ArrayList<ImmunizationEducationComponent>();
    this.education.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #education}, creating
   *         it if it does not already exist
   */
  public ImmunizationEducationComponent getEducationFirstRep() {
    if (getEducation().isEmpty()) {
      addEducation();
    }
    return getEducation().get(0);
  }

  /**
   * @return {@link #programEligibility} (Indicates a patient's eligibility for a
   *         funding program.)
   */
  public List<CodeableConcept> getProgramEligibility() {
    if (this.programEligibility == null)
      this.programEligibility = new ArrayList<CodeableConcept>();
    return this.programEligibility;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setProgramEligibility(List<CodeableConcept> theProgramEligibility) {
    this.programEligibility = theProgramEligibility;
    return this;
  }

  public boolean hasProgramEligibility() {
    if (this.programEligibility == null)
      return false;
    for (CodeableConcept item : this.programEligibility)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addProgramEligibility() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.programEligibility == null)
      this.programEligibility = new ArrayList<CodeableConcept>();
    this.programEligibility.add(t);
    return t;
  }

  public Immunization addProgramEligibility(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.programEligibility == null)
      this.programEligibility = new ArrayList<CodeableConcept>();
    this.programEligibility.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #programEligibility},
   *         creating it if it does not already exist
   */
  public CodeableConcept getProgramEligibilityFirstRep() {
    if (getProgramEligibility().isEmpty()) {
      addProgramEligibility();
    }
    return getProgramEligibility().get(0);
  }

  /**
   * @return {@link #fundingSource} (Indicates the source of the vaccine actually
   *         administered. This may be different than the patient eligibility
   *         (e.g. the patient may be eligible for a publically purchased vaccine
   *         but due to inventory issues, vaccine purchased with private funds was
   *         actually administered).)
   */
  public CodeableConcept getFundingSource() {
    if (this.fundingSource == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Immunization.fundingSource");
      else if (Configuration.doAutoCreate())
        this.fundingSource = new CodeableConcept(); // cc
    return this.fundingSource;
  }

  public boolean hasFundingSource() {
    return this.fundingSource != null && !this.fundingSource.isEmpty();
  }

  /**
   * @param value {@link #fundingSource} (Indicates the source of the vaccine
   *              actually administered. This may be different than the patient
   *              eligibility (e.g. the patient may be eligible for a publically
   *              purchased vaccine but due to inventory issues, vaccine purchased
   *              with private funds was actually administered).)
   */
  public Immunization setFundingSource(CodeableConcept value) {
    this.fundingSource = value;
    return this;
  }

  /**
   * @return {@link #reaction} (Categorical data indicating that an adverse event
   *         is associated in time to an immunization.)
   */
  public List<ImmunizationReactionComponent> getReaction() {
    if (this.reaction == null)
      this.reaction = new ArrayList<ImmunizationReactionComponent>();
    return this.reaction;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setReaction(List<ImmunizationReactionComponent> theReaction) {
    this.reaction = theReaction;
    return this;
  }

  public boolean hasReaction() {
    if (this.reaction == null)
      return false;
    for (ImmunizationReactionComponent item : this.reaction)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImmunizationReactionComponent addReaction() { // 3
    ImmunizationReactionComponent t = new ImmunizationReactionComponent();
    if (this.reaction == null)
      this.reaction = new ArrayList<ImmunizationReactionComponent>();
    this.reaction.add(t);
    return t;
  }

  public Immunization addReaction(ImmunizationReactionComponent t) { // 3
    if (t == null)
      return this;
    if (this.reaction == null)
      this.reaction = new ArrayList<ImmunizationReactionComponent>();
    this.reaction.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reaction}, creating
   *         it if it does not already exist
   */
  public ImmunizationReactionComponent getReactionFirstRep() {
    if (getReaction().isEmpty()) {
      addReaction();
    }
    return getReaction().get(0);
  }

  /**
   * @return {@link #protocolApplied} (The protocol (set of recommendations) being
   *         followed by the provider who administered the dose.)
   */
  public List<ImmunizationProtocolAppliedComponent> getProtocolApplied() {
    if (this.protocolApplied == null)
      this.protocolApplied = new ArrayList<ImmunizationProtocolAppliedComponent>();
    return this.protocolApplied;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Immunization setProtocolApplied(List<ImmunizationProtocolAppliedComponent> theProtocolApplied) {
    this.protocolApplied = theProtocolApplied;
    return this;
  }

  public boolean hasProtocolApplied() {
    if (this.protocolApplied == null)
      return false;
    for (ImmunizationProtocolAppliedComponent item : this.protocolApplied)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImmunizationProtocolAppliedComponent addProtocolApplied() { // 3
    ImmunizationProtocolAppliedComponent t = new ImmunizationProtocolAppliedComponent();
    if (this.protocolApplied == null)
      this.protocolApplied = new ArrayList<ImmunizationProtocolAppliedComponent>();
    this.protocolApplied.add(t);
    return t;
  }

  public Immunization addProtocolApplied(ImmunizationProtocolAppliedComponent t) { // 3
    if (t == null)
      return this;
    if (this.protocolApplied == null)
      this.protocolApplied = new ArrayList<ImmunizationProtocolAppliedComponent>();
    this.protocolApplied.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #protocolApplied},
   *         creating it if it does not already exist
   */
  public ImmunizationProtocolAppliedComponent getProtocolAppliedFirstRep() {
    if (getProtocolApplied().isEmpty()) {
      addProtocolApplied();
    }
    return getProtocolApplied().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier", "A unique identifier assigned to this immunization record.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children
        .add(new Property("status", "code", "Indicates the current status of the immunization event.", 0, 1, status));
    children.add(new Property("statusReason", "CodeableConcept",
        "Indicates the reason the immunization event was not performed.", 0, 1, statusReason));
    children.add(new Property("vaccineCode", "CodeableConcept",
        "Vaccine that was administered or was to be administered.", 0, 1, vaccineCode));
    children.add(new Property("patient", "Reference(Patient)",
        "The patient who either received or did not receive the immunization.", 0, 1, patient));
    children.add(new Property("encounter", "Reference(Encounter)",
        "The visit or admission or other contact between patient and health care provider the immunization was performed as part of.",
        0, 1, encounter));
    children.add(new Property("occurrence[x]", "dateTime|string",
        "Date vaccine administered or was to be administered.", 0, 1, occurrence));
    children.add(new Property("recorded", "dateTime",
        "The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.",
        0, 1, recorded));
    children.add(new Property("primarySource", "boolean",
        "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.",
        0, 1, primarySource));
    children.add(new Property("reportOrigin", "CodeableConcept",
        "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.",
        0, 1, reportOrigin));
    children.add(new Property("location", "Reference(Location)",
        "The service delivery location where the vaccine administration occurred.", 0, 1, location));
    children.add(
        new Property("manufacturer", "Reference(Organization)", "Name of vaccine manufacturer.", 0, 1, manufacturer));
    children.add(new Property("lotNumber", "string", "Lot number of the  vaccine product.", 0, 1, lotNumber));
    children.add(new Property("expirationDate", "date", "Date vaccine batch expires.", 0, 1, expirationDate));
    children.add(new Property("site", "CodeableConcept", "Body site where vaccine was administered.", 0, 1, site));
    children.add(new Property("route", "CodeableConcept",
        "The path by which the vaccine product is taken into the body.", 0, 1, route));
    children.add(new Property("doseQuantity", "SimpleQuantity",
        "The quantity of vaccine product that was administered.", 0, 1, doseQuantity));
    children.add(new Property("performer", "", "Indicates who performed the immunization event.", 0,
        java.lang.Integer.MAX_VALUE, performer));
    children.add(new Property("note", "Annotation",
        "Extra information about the immunization that is not conveyed by the other attributes.", 0,
        java.lang.Integer.MAX_VALUE, note));
    children.add(new Property("reasonCode", "CodeableConcept", "Reasons why the vaccine was administered.", 0,
        java.lang.Integer.MAX_VALUE, reasonCode));
    children.add(new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport)",
        "Condition, Observation or DiagnosticReport that supports why the immunization was administered.", 0,
        java.lang.Integer.MAX_VALUE, reasonReference));
    children.add(new Property("isSubpotent", "boolean",
        "Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.", 0,
        1, isSubpotent));
    children.add(new Property("subpotentReason", "CodeableConcept", "Reason why a dose is considered to be subpotent.",
        0, java.lang.Integer.MAX_VALUE, subpotentReason));
    children.add(new Property("education", "",
        "Educational material presented to the patient (or guardian) at the time of vaccine administration.", 0,
        java.lang.Integer.MAX_VALUE, education));
    children.add(new Property("programEligibility", "CodeableConcept",
        "Indicates a patient's eligibility for a funding program.", 0, java.lang.Integer.MAX_VALUE,
        programEligibility));
    children.add(new Property("fundingSource", "CodeableConcept",
        "Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).",
        0, 1, fundingSource));
    children.add(new Property("reaction", "",
        "Categorical data indicating that an adverse event is associated in time to an immunization.", 0,
        java.lang.Integer.MAX_VALUE, reaction));
    children.add(new Property("protocolApplied", "",
        "The protocol (set of recommendations) being followed by the provider who administered the dose.", 0,
        java.lang.Integer.MAX_VALUE, protocolApplied));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "A unique identifier assigned to this immunization record.", 0, java.lang.Integer.MAX_VALUE, identifier);
    case -892481550:
      /* status */ return new Property("status", "code", "Indicates the current status of the immunization event.", 0,
          1, status);
    case 2051346646:
      /* statusReason */ return new Property("statusReason", "CodeableConcept",
          "Indicates the reason the immunization event was not performed.", 0, 1, statusReason);
    case 664556354:
      /* vaccineCode */ return new Property("vaccineCode", "CodeableConcept",
          "Vaccine that was administered or was to be administered.", 0, 1, vaccineCode);
    case -791418107:
      /* patient */ return new Property("patient", "Reference(Patient)",
          "The patient who either received or did not receive the immunization.", 0, 1, patient);
    case 1524132147:
      /* encounter */ return new Property("encounter", "Reference(Encounter)",
          "The visit or admission or other contact between patient and health care provider the immunization was performed as part of.",
          0, 1, encounter);
    case -2022646513:
      /* occurrence[x] */ return new Property("occurrence[x]", "dateTime|string",
          "Date vaccine administered or was to be administered.", 0, 1, occurrence);
    case 1687874001:
      /* occurrence */ return new Property("occurrence[x]", "dateTime|string",
          "Date vaccine administered or was to be administered.", 0, 1, occurrence);
    case -298443636:
      /* occurrenceDateTime */ return new Property("occurrence[x]", "dateTime|string",
          "Date vaccine administered or was to be administered.", 0, 1, occurrence);
    case 1496896834:
      /* occurrenceString */ return new Property("occurrence[x]", "dateTime|string",
          "Date vaccine administered or was to be administered.", 0, 1, occurrence);
    case -799233872:
      /* recorded */ return new Property("recorded", "dateTime",
          "The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.",
          0, 1, recorded);
    case -528721731:
      /* primarySource */ return new Property("primarySource", "boolean",
          "An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.",
          0, 1, primarySource);
    case 486750586:
      /* reportOrigin */ return new Property("reportOrigin", "CodeableConcept",
          "The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.",
          0, 1, reportOrigin);
    case 1901043637:
      /* location */ return new Property("location", "Reference(Location)",
          "The service delivery location where the vaccine administration occurred.", 0, 1, location);
    case -1969347631:
      /* manufacturer */ return new Property("manufacturer", "Reference(Organization)", "Name of vaccine manufacturer.",
          0, 1, manufacturer);
    case 462547450:
      /* lotNumber */ return new Property("lotNumber", "string", "Lot number of the  vaccine product.", 0, 1,
          lotNumber);
    case -668811523:
      /* expirationDate */ return new Property("expirationDate", "date", "Date vaccine batch expires.", 0, 1,
          expirationDate);
    case 3530567:
      /* site */ return new Property("site", "CodeableConcept", "Body site where vaccine was administered.", 0, 1,
          site);
    case 108704329:
      /* route */ return new Property("route", "CodeableConcept",
          "The path by which the vaccine product is taken into the body.", 0, 1, route);
    case -2083618872:
      /* doseQuantity */ return new Property("doseQuantity", "SimpleQuantity",
          "The quantity of vaccine product that was administered.", 0, 1, doseQuantity);
    case 481140686:
      /* performer */ return new Property("performer", "", "Indicates who performed the immunization event.", 0,
          java.lang.Integer.MAX_VALUE, performer);
    case 3387378:
      /* note */ return new Property("note", "Annotation",
          "Extra information about the immunization that is not conveyed by the other attributes.", 0,
          java.lang.Integer.MAX_VALUE, note);
    case 722137681:
      /* reasonCode */ return new Property("reasonCode", "CodeableConcept", "Reasons why the vaccine was administered.",
          0, java.lang.Integer.MAX_VALUE, reasonCode);
    case -1146218137:
      /* reasonReference */ return new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport)",
          "Condition, Observation or DiagnosticReport that supports why the immunization was administered.", 0,
          java.lang.Integer.MAX_VALUE, reasonReference);
    case 1618512556:
      /* isSubpotent */ return new Property("isSubpotent", "boolean",
          "Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.",
          0, 1, isSubpotent);
    case 805168794:
      /* subpotentReason */ return new Property("subpotentReason", "CodeableConcept",
          "Reason why a dose is considered to be subpotent.", 0, java.lang.Integer.MAX_VALUE, subpotentReason);
    case -290756696:
      /* education */ return new Property("education", "",
          "Educational material presented to the patient (or guardian) at the time of vaccine administration.", 0,
          java.lang.Integer.MAX_VALUE, education);
    case 1207530089:
      /* programEligibility */ return new Property("programEligibility", "CodeableConcept",
          "Indicates a patient's eligibility for a funding program.", 0, java.lang.Integer.MAX_VALUE,
          programEligibility);
    case 1120150904:
      /* fundingSource */ return new Property("fundingSource", "CodeableConcept",
          "Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).",
          0, 1, fundingSource);
    case -867509719:
      /* reaction */ return new Property("reaction", "",
          "Categorical data indicating that an adverse event is associated in time to an immunization.", 0,
          java.lang.Integer.MAX_VALUE, reaction);
    case 607985349:
      /* protocolApplied */ return new Property("protocolApplied", "",
          "The protocol (set of recommendations) being followed by the provider who administered the dose.", 0,
          java.lang.Integer.MAX_VALUE, protocolApplied);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return this.identifier == null ? new Base[0]
          : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<ImmunizationStatus>
    case 2051346646:
      /* statusReason */ return this.statusReason == null ? new Base[0] : new Base[] { this.statusReason }; // CodeableConcept
    case 664556354:
      /* vaccineCode */ return this.vaccineCode == null ? new Base[0] : new Base[] { this.vaccineCode }; // CodeableConcept
    case -791418107:
      /* patient */ return this.patient == null ? new Base[0] : new Base[] { this.patient }; // Reference
    case 1524132147:
      /* encounter */ return this.encounter == null ? new Base[0] : new Base[] { this.encounter }; // Reference
    case 1687874001:
      /* occurrence */ return this.occurrence == null ? new Base[0] : new Base[] { this.occurrence }; // Type
    case -799233872:
      /* recorded */ return this.recorded == null ? new Base[0] : new Base[] { this.recorded }; // DateTimeType
    case -528721731:
      /* primarySource */ return this.primarySource == null ? new Base[0] : new Base[] { this.primarySource }; // BooleanType
    case 486750586:
      /* reportOrigin */ return this.reportOrigin == null ? new Base[0] : new Base[] { this.reportOrigin }; // CodeableConcept
    case 1901043637:
      /* location */ return this.location == null ? new Base[0] : new Base[] { this.location }; // Reference
    case -1969347631:
      /* manufacturer */ return this.manufacturer == null ? new Base[0] : new Base[] { this.manufacturer }; // Reference
    case 462547450:
      /* lotNumber */ return this.lotNumber == null ? new Base[0] : new Base[] { this.lotNumber }; // StringType
    case -668811523:
      /* expirationDate */ return this.expirationDate == null ? new Base[0] : new Base[] { this.expirationDate }; // DateType
    case 3530567:
      /* site */ return this.site == null ? new Base[0] : new Base[] { this.site }; // CodeableConcept
    case 108704329:
      /* route */ return this.route == null ? new Base[0] : new Base[] { this.route }; // CodeableConcept
    case -2083618872:
      /* doseQuantity */ return this.doseQuantity == null ? new Base[0] : new Base[] { this.doseQuantity }; // Quantity
    case 481140686:
      /* performer */ return this.performer == null ? new Base[0]
          : this.performer.toArray(new Base[this.performer.size()]); // ImmunizationPerformerComponent
    case 3387378:
      /* note */ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
    case 722137681:
      /* reasonCode */ return this.reasonCode == null ? new Base[0]
          : this.reasonCode.toArray(new Base[this.reasonCode.size()]); // CodeableConcept
    case -1146218137:
      /* reasonReference */ return this.reasonReference == null ? new Base[0]
          : this.reasonReference.toArray(new Base[this.reasonReference.size()]); // Reference
    case 1618512556:
      /* isSubpotent */ return this.isSubpotent == null ? new Base[0] : new Base[] { this.isSubpotent }; // BooleanType
    case 805168794:
      /* subpotentReason */ return this.subpotentReason == null ? new Base[0]
          : this.subpotentReason.toArray(new Base[this.subpotentReason.size()]); // CodeableConcept
    case -290756696:
      /* education */ return this.education == null ? new Base[0]
          : this.education.toArray(new Base[this.education.size()]); // ImmunizationEducationComponent
    case 1207530089:
      /* programEligibility */ return this.programEligibility == null ? new Base[0]
          : this.programEligibility.toArray(new Base[this.programEligibility.size()]); // CodeableConcept
    case 1120150904:
      /* fundingSource */ return this.fundingSource == null ? new Base[0] : new Base[] { this.fundingSource }; // CodeableConcept
    case -867509719:
      /* reaction */ return this.reaction == null ? new Base[0] : this.reaction.toArray(new Base[this.reaction.size()]); // ImmunizationReactionComponent
    case 607985349:
      /* protocolApplied */ return this.protocolApplied == null ? new Base[0]
          : this.protocolApplied.toArray(new Base[this.protocolApplied.size()]); // ImmunizationProtocolAppliedComponent
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1618432855: // identifier
      this.getIdentifier().add(castToIdentifier(value)); // Identifier
      return value;
    case -892481550: // status
      value = new ImmunizationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<ImmunizationStatus>
      return value;
    case 2051346646: // statusReason
      this.statusReason = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 664556354: // vaccineCode
      this.vaccineCode = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -791418107: // patient
      this.patient = castToReference(value); // Reference
      return value;
    case 1524132147: // encounter
      this.encounter = castToReference(value); // Reference
      return value;
    case 1687874001: // occurrence
      this.occurrence = castToType(value); // Type
      return value;
    case -799233872: // recorded
      this.recorded = castToDateTime(value); // DateTimeType
      return value;
    case -528721731: // primarySource
      this.primarySource = castToBoolean(value); // BooleanType
      return value;
    case 486750586: // reportOrigin
      this.reportOrigin = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 1901043637: // location
      this.location = castToReference(value); // Reference
      return value;
    case -1969347631: // manufacturer
      this.manufacturer = castToReference(value); // Reference
      return value;
    case 462547450: // lotNumber
      this.lotNumber = castToString(value); // StringType
      return value;
    case -668811523: // expirationDate
      this.expirationDate = castToDate(value); // DateType
      return value;
    case 3530567: // site
      this.site = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 108704329: // route
      this.route = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -2083618872: // doseQuantity
      this.doseQuantity = castToQuantity(value); // Quantity
      return value;
    case 481140686: // performer
      this.getPerformer().add((ImmunizationPerformerComponent) value); // ImmunizationPerformerComponent
      return value;
    case 3387378: // note
      this.getNote().add(castToAnnotation(value)); // Annotation
      return value;
    case 722137681: // reasonCode
      this.getReasonCode().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1146218137: // reasonReference
      this.getReasonReference().add(castToReference(value)); // Reference
      return value;
    case 1618512556: // isSubpotent
      this.isSubpotent = castToBoolean(value); // BooleanType
      return value;
    case 805168794: // subpotentReason
      this.getSubpotentReason().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -290756696: // education
      this.getEducation().add((ImmunizationEducationComponent) value); // ImmunizationEducationComponent
      return value;
    case 1207530089: // programEligibility
      this.getProgramEligibility().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 1120150904: // fundingSource
      this.fundingSource = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -867509719: // reaction
      this.getReaction().add((ImmunizationReactionComponent) value); // ImmunizationReactionComponent
      return value;
    case 607985349: // protocolApplied
      this.getProtocolApplied().add((ImmunizationProtocolAppliedComponent) value); // ImmunizationProtocolAppliedComponent
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(castToIdentifier(value));
    } else if (name.equals("status")) {
      value = new ImmunizationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<ImmunizationStatus>
    } else if (name.equals("statusReason")) {
      this.statusReason = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("vaccineCode")) {
      this.vaccineCode = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("patient")) {
      this.patient = castToReference(value); // Reference
    } else if (name.equals("encounter")) {
      this.encounter = castToReference(value); // Reference
    } else if (name.equals("occurrence[x]")) {
      this.occurrence = castToType(value); // Type
    } else if (name.equals("recorded")) {
      this.recorded = castToDateTime(value); // DateTimeType
    } else if (name.equals("primarySource")) {
      this.primarySource = castToBoolean(value); // BooleanType
    } else if (name.equals("reportOrigin")) {
      this.reportOrigin = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("location")) {
      this.location = castToReference(value); // Reference
    } else if (name.equals("manufacturer")) {
      this.manufacturer = castToReference(value); // Reference
    } else if (name.equals("lotNumber")) {
      this.lotNumber = castToString(value); // StringType
    } else if (name.equals("expirationDate")) {
      this.expirationDate = castToDate(value); // DateType
    } else if (name.equals("site")) {
      this.site = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("route")) {
      this.route = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("doseQuantity")) {
      this.doseQuantity = castToQuantity(value); // Quantity
    } else if (name.equals("performer")) {
      this.getPerformer().add((ImmunizationPerformerComponent) value);
    } else if (name.equals("note")) {
      this.getNote().add(castToAnnotation(value));
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().add(castToCodeableConcept(value));
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().add(castToReference(value));
    } else if (name.equals("isSubpotent")) {
      this.isSubpotent = castToBoolean(value); // BooleanType
    } else if (name.equals("subpotentReason")) {
      this.getSubpotentReason().add(castToCodeableConcept(value));
    } else if (name.equals("education")) {
      this.getEducation().add((ImmunizationEducationComponent) value);
    } else if (name.equals("programEligibility")) {
      this.getProgramEligibility().add(castToCodeableConcept(value));
    } else if (name.equals("fundingSource")) {
      this.fundingSource = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("reaction")) {
      this.getReaction().add((ImmunizationReactionComponent) value);
    } else if (name.equals("protocolApplied")) {
      this.getProtocolApplied().add((ImmunizationProtocolAppliedComponent) value);
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().remove(castToIdentifier(value));
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("statusReason")) {
      this.statusReason = null;
    } else if (name.equals("vaccineCode")) {
      this.vaccineCode = null;
    } else if (name.equals("patient")) {
      this.patient = null;
    } else if (name.equals("encounter")) {
      this.encounter = null;
    } else if (name.equals("occurrence[x]")) {
      this.occurrence = null;
    } else if (name.equals("recorded")) {
      this.recorded = null;
    } else if (name.equals("primarySource")) {
      this.primarySource = null;
    } else if (name.equals("reportOrigin")) {
      this.reportOrigin = null;
    } else if (name.equals("location")) {
      this.location = null;
    } else if (name.equals("manufacturer")) {
      this.manufacturer = null;
    } else if (name.equals("lotNumber")) {
      this.lotNumber = null;
    } else if (name.equals("expirationDate")) {
      this.expirationDate = null;
    } else if (name.equals("site")) {
      this.site = null;
    } else if (name.equals("route")) {
      this.route = null;
    } else if (name.equals("doseQuantity")) {
      this.doseQuantity = null;
    } else if (name.equals("performer")) {
      this.getPerformer().remove((ImmunizationPerformerComponent) value);
    } else if (name.equals("note")) {
      this.getNote().remove(castToAnnotation(value));
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().remove(castToCodeableConcept(value));
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().remove(castToReference(value));
    } else if (name.equals("isSubpotent")) {
      this.isSubpotent = null;
    } else if (name.equals("subpotentReason")) {
      this.getSubpotentReason().remove(castToCodeableConcept(value));
    } else if (name.equals("education")) {
      this.getEducation().remove((ImmunizationEducationComponent) value);
    } else if (name.equals("programEligibility")) {
      this.getProgramEligibility().remove(castToCodeableConcept(value));
    } else if (name.equals("fundingSource")) {
      this.fundingSource = null;
    } else if (name.equals("reaction")) {
      this.getReaction().remove((ImmunizationReactionComponent) value);
    } else if (name.equals("protocolApplied")) {
      this.getProtocolApplied().remove((ImmunizationProtocolAppliedComponent) value);
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case -892481550:
      return getStatusElement();
    case 2051346646:
      return getStatusReason();
    case 664556354:
      return getVaccineCode();
    case -791418107:
      return getPatient();
    case 1524132147:
      return getEncounter();
    case -2022646513:
      return getOccurrence();
    case 1687874001:
      return getOccurrence();
    case -799233872:
      return getRecordedElement();
    case -528721731:
      return getPrimarySourceElement();
    case 486750586:
      return getReportOrigin();
    case 1901043637:
      return getLocation();
    case -1969347631:
      return getManufacturer();
    case 462547450:
      return getLotNumberElement();
    case -668811523:
      return getExpirationDateElement();
    case 3530567:
      return getSite();
    case 108704329:
      return getRoute();
    case -2083618872:
      return getDoseQuantity();
    case 481140686:
      return addPerformer();
    case 3387378:
      return addNote();
    case 722137681:
      return addReasonCode();
    case -1146218137:
      return addReasonReference();
    case 1618512556:
      return getIsSubpotentElement();
    case 805168794:
      return addSubpotentReason();
    case -290756696:
      return addEducation();
    case 1207530089:
      return addProgramEligibility();
    case 1120150904:
      return getFundingSource();
    case -867509719:
      return addReaction();
    case 607985349:
      return addProtocolApplied();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case 2051346646:
      /* statusReason */ return new String[] { "CodeableConcept" };
    case 664556354:
      /* vaccineCode */ return new String[] { "CodeableConcept" };
    case -791418107:
      /* patient */ return new String[] { "Reference" };
    case 1524132147:
      /* encounter */ return new String[] { "Reference" };
    case 1687874001:
      /* occurrence */ return new String[] { "dateTime", "string" };
    case -799233872:
      /* recorded */ return new String[] { "dateTime" };
    case -528721731:
      /* primarySource */ return new String[] { "boolean" };
    case 486750586:
      /* reportOrigin */ return new String[] { "CodeableConcept" };
    case 1901043637:
      /* location */ return new String[] { "Reference" };
    case -1969347631:
      /* manufacturer */ return new String[] { "Reference" };
    case 462547450:
      /* lotNumber */ return new String[] { "string" };
    case -668811523:
      /* expirationDate */ return new String[] { "date" };
    case 3530567:
      /* site */ return new String[] { "CodeableConcept" };
    case 108704329:
      /* route */ return new String[] { "CodeableConcept" };
    case -2083618872:
      /* doseQuantity */ return new String[] { "SimpleQuantity" };
    case 481140686:
      /* performer */ return new String[] {};
    case 3387378:
      /* note */ return new String[] { "Annotation" };
    case 722137681:
      /* reasonCode */ return new String[] { "CodeableConcept" };
    case -1146218137:
      /* reasonReference */ return new String[] { "Reference" };
    case 1618512556:
      /* isSubpotent */ return new String[] { "boolean" };
    case 805168794:
      /* subpotentReason */ return new String[] { "CodeableConcept" };
    case -290756696:
      /* education */ return new String[] {};
    case 1207530089:
      /* programEligibility */ return new String[] { "CodeableConcept" };
    case 1120150904:
      /* fundingSource */ return new String[] { "CodeableConcept" };
    case -867509719:
      /* reaction */ return new String[] {};
    case 607985349:
      /* protocolApplied */ return new String[] {};
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.status");
    } else if (name.equals("statusReason")) {
      this.statusReason = new CodeableConcept();
      return this.statusReason;
    } else if (name.equals("vaccineCode")) {
      this.vaccineCode = new CodeableConcept();
      return this.vaccineCode;
    } else if (name.equals("patient")) {
      this.patient = new Reference();
      return this.patient;
    } else if (name.equals("encounter")) {
      this.encounter = new Reference();
      return this.encounter;
    } else if (name.equals("occurrenceDateTime")) {
      this.occurrence = new DateTimeType();
      return this.occurrence;
    } else if (name.equals("occurrenceString")) {
      this.occurrence = new StringType();
      return this.occurrence;
    } else if (name.equals("recorded")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.recorded");
    } else if (name.equals("primarySource")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.primarySource");
    } else if (name.equals("reportOrigin")) {
      this.reportOrigin = new CodeableConcept();
      return this.reportOrigin;
    } else if (name.equals("location")) {
      this.location = new Reference();
      return this.location;
    } else if (name.equals("manufacturer")) {
      this.manufacturer = new Reference();
      return this.manufacturer;
    } else if (name.equals("lotNumber")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.lotNumber");
    } else if (name.equals("expirationDate")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.expirationDate");
    } else if (name.equals("site")) {
      this.site = new CodeableConcept();
      return this.site;
    } else if (name.equals("route")) {
      this.route = new CodeableConcept();
      return this.route;
    } else if (name.equals("doseQuantity")) {
      this.doseQuantity = new Quantity();
      return this.doseQuantity;
    } else if (name.equals("performer")) {
      return addPerformer();
    } else if (name.equals("note")) {
      return addNote();
    } else if (name.equals("reasonCode")) {
      return addReasonCode();
    } else if (name.equals("reasonReference")) {
      return addReasonReference();
    } else if (name.equals("isSubpotent")) {
      throw new FHIRException("Cannot call addChild on a singleton property Immunization.isSubpotent");
    } else if (name.equals("subpotentReason")) {
      return addSubpotentReason();
    } else if (name.equals("education")) {
      return addEducation();
    } else if (name.equals("programEligibility")) {
      return addProgramEligibility();
    } else if (name.equals("fundingSource")) {
      this.fundingSource = new CodeableConcept();
      return this.fundingSource;
    } else if (name.equals("reaction")) {
      return addReaction();
    } else if (name.equals("protocolApplied")) {
      return addProtocolApplied();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Immunization";

  }

  public Immunization copy() {
    Immunization dst = new Immunization();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Immunization dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    dst.statusReason = statusReason == null ? null : statusReason.copy();
    dst.vaccineCode = vaccineCode == null ? null : vaccineCode.copy();
    dst.patient = patient == null ? null : patient.copy();
    dst.encounter = encounter == null ? null : encounter.copy();
    dst.occurrence = occurrence == null ? null : occurrence.copy();
    dst.recorded = recorded == null ? null : recorded.copy();
    dst.primarySource = primarySource == null ? null : primarySource.copy();
    dst.reportOrigin = reportOrigin == null ? null : reportOrigin.copy();
    dst.location = location == null ? null : location.copy();
    dst.manufacturer = manufacturer == null ? null : manufacturer.copy();
    dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
    dst.expirationDate = expirationDate == null ? null : expirationDate.copy();
    dst.site = site == null ? null : site.copy();
    dst.route = route == null ? null : route.copy();
    dst.doseQuantity = doseQuantity == null ? null : doseQuantity.copy();
    if (performer != null) {
      dst.performer = new ArrayList<ImmunizationPerformerComponent>();
      for (ImmunizationPerformerComponent i : performer)
        dst.performer.add(i.copy());
    }
    ;
    if (note != null) {
      dst.note = new ArrayList<Annotation>();
      for (Annotation i : note)
        dst.note.add(i.copy());
    }
    ;
    if (reasonCode != null) {
      dst.reasonCode = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : reasonCode)
        dst.reasonCode.add(i.copy());
    }
    ;
    if (reasonReference != null) {
      dst.reasonReference = new ArrayList<Reference>();
      for (Reference i : reasonReference)
        dst.reasonReference.add(i.copy());
    }
    ;
    dst.isSubpotent = isSubpotent == null ? null : isSubpotent.copy();
    if (subpotentReason != null) {
      dst.subpotentReason = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : subpotentReason)
        dst.subpotentReason.add(i.copy());
    }
    ;
    if (education != null) {
      dst.education = new ArrayList<ImmunizationEducationComponent>();
      for (ImmunizationEducationComponent i : education)
        dst.education.add(i.copy());
    }
    ;
    if (programEligibility != null) {
      dst.programEligibility = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : programEligibility)
        dst.programEligibility.add(i.copy());
    }
    ;
    dst.fundingSource = fundingSource == null ? null : fundingSource.copy();
    if (reaction != null) {
      dst.reaction = new ArrayList<ImmunizationReactionComponent>();
      for (ImmunizationReactionComponent i : reaction)
        dst.reaction.add(i.copy());
    }
    ;
    if (protocolApplied != null) {
      dst.protocolApplied = new ArrayList<ImmunizationProtocolAppliedComponent>();
      for (ImmunizationProtocolAppliedComponent i : protocolApplied)
        dst.protocolApplied.add(i.copy());
    }
    ;
  }

  protected Immunization typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Immunization))
      return false;
    Immunization o = (Immunization) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true)
        && compareDeep(statusReason, o.statusReason, true) && compareDeep(vaccineCode, o.vaccineCode, true)
        && compareDeep(patient, o.patient, true) && compareDeep(encounter, o.encounter, true)
        && compareDeep(occurrence, o.occurrence, true) && compareDeep(recorded, o.recorded, true)
        && compareDeep(primarySource, o.primarySource, true) && compareDeep(reportOrigin, o.reportOrigin, true)
        && compareDeep(location, o.location, true) && compareDeep(manufacturer, o.manufacturer, true)
        && compareDeep(lotNumber, o.lotNumber, true) && compareDeep(expirationDate, o.expirationDate, true)
        && compareDeep(site, o.site, true) && compareDeep(route, o.route, true)
        && compareDeep(doseQuantity, o.doseQuantity, true) && compareDeep(performer, o.performer, true)
        && compareDeep(note, o.note, true) && compareDeep(reasonCode, o.reasonCode, true)
        && compareDeep(reasonReference, o.reasonReference, true) && compareDeep(isSubpotent, o.isSubpotent, true)
        && compareDeep(subpotentReason, o.subpotentReason, true) && compareDeep(education, o.education, true)
        && compareDeep(programEligibility, o.programEligibility, true)
        && compareDeep(fundingSource, o.fundingSource, true) && compareDeep(reaction, o.reaction, true)
        && compareDeep(protocolApplied, o.protocolApplied, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Immunization))
      return false;
    Immunization o = (Immunization) other_;
    return compareValues(status, o.status, true) && compareValues(recorded, o.recorded, true)
        && compareValues(primarySource, o.primarySource, true) && compareValues(lotNumber, o.lotNumber, true)
        && compareValues(expirationDate, o.expirationDate, true) && compareValues(isSubpotent, o.isSubpotent, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, statusReason, vaccineCode,
        patient, encounter, occurrence, recorded, primarySource, reportOrigin, location, manufacturer, lotNumber,
        expirationDate, site, route, doseQuantity, performer, note, reasonCode, reasonReference, isSubpotent,
        subpotentReason, education, programEligibility, fundingSource, reaction, protocolApplied);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Immunization;
  }

  /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Vaccination (non)-Administration Date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Immunization.occurrence[x]</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "date", path = "Immunization.occurrence", description = "Vaccination  (non)-Administration Date", type = "date")
  public static final String SP_DATE = "date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Vaccination (non)-Administration Date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Immunization.occurrence[x]</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_DATE);

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "Immunization.identifier", description = "Business identifier", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>performer</b>
   * <p>
   * Description: <b>The practitioner or organization who played a role in the
   * vaccination</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.performer.actor</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "performer", path = "Immunization.performer.actor", description = "The practitioner or organization who played a role in the vaccination", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Practitioner") }, target = { Organization.class,
          Practitioner.class, PractitionerRole.class })
  public static final String SP_PERFORMER = "performer";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>performer</b>
   * <p>
   * Description: <b>The practitioner or organization who played a role in the
   * vaccination</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.performer.actor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PERFORMER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PERFORMER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:performer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PERFORMER = new ca.uhn.fhir.model.api.Include(
      "Immunization:performer").toLocked();

  /**
   * Search parameter: <b>reaction</b>
   * <p>
   * Description: <b>Additional information on reaction</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.reaction.detail</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reaction", path = "Immunization.reaction.detail", description = "Additional information on reaction", type = "reference", target = {
      Observation.class })
  public static final String SP_REACTION = "reaction";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reaction</b>
   * <p>
   * Description: <b>Additional information on reaction</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.reaction.detail</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REACTION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_REACTION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:reaction</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REACTION = new ca.uhn.fhir.model.api.Include(
      "Immunization:reaction").toLocked();

  /**
   * Search parameter: <b>lot-number</b>
   * <p>
   * Description: <b>Vaccine Lot Number</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Immunization.lotNumber</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "lot-number", path = "Immunization.lotNumber", description = "Vaccine Lot Number", type = "string")
  public static final String SP_LOT_NUMBER = "lot-number";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>lot-number</b>
   * <p>
   * Description: <b>Vaccine Lot Number</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Immunization.lotNumber</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam LOT_NUMBER = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_LOT_NUMBER);

  /**
   * Search parameter: <b>status-reason</b>
   * <p>
   * Description: <b>Reason why the vaccine was not administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.statusReason</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status-reason", path = "Immunization.statusReason", description = "Reason why the vaccine was not administered", type = "token")
  public static final String SP_STATUS_REASON = "status-reason";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status-reason</b>
   * <p>
   * Description: <b>Reason why the vaccine was not administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.statusReason</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS_REASON = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS_REASON);

  /**
   * Search parameter: <b>reason-code</b>
   * <p>
   * Description: <b>Reason why the vaccine was administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.reasonCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reason-code", path = "Immunization.reasonCode", description = "Reason why the vaccine was administered", type = "token")
  public static final String SP_REASON_CODE = "reason-code";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reason-code</b>
   * <p>
   * Description: <b>Reason why the vaccine was administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.reasonCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REASON_CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_REASON_CODE);

  /**
   * Search parameter: <b>manufacturer</b>
   * <p>
   * Description: <b>Vaccine Manufacturer</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.manufacturer</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "manufacturer", path = "Immunization.manufacturer", description = "Vaccine Manufacturer", type = "reference", target = {
      Organization.class })
  public static final String SP_MANUFACTURER = "manufacturer";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>manufacturer</b>
   * <p>
   * Description: <b>Vaccine Manufacturer</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.manufacturer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MANUFACTURER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_MANUFACTURER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:manufacturer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MANUFACTURER = new ca.uhn.fhir.model.api.Include(
      "Immunization:manufacturer").toLocked();

  /**
   * Search parameter: <b>target-disease</b>
   * <p>
   * Description: <b>The target disease the dose is being administered
   * against</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.protocolApplied.targetDisease</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "target-disease", path = "Immunization.protocolApplied.targetDisease", description = "The target disease the dose is being administered against", type = "token")
  public static final String SP_TARGET_DISEASE = "target-disease";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>target-disease</b>
   * <p>
   * Description: <b>The target disease the dose is being administered
   * against</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.protocolApplied.targetDisease</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TARGET_DISEASE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_TARGET_DISEASE);

  /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>The patient for the vaccination record</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "patient", path = "Immunization.patient", description = "The patient for the vaccination record", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient") }, target = { Patient.class })
  public static final String SP_PATIENT = "patient";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>The patient for the vaccination record</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PATIENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include(
      "Immunization:patient").toLocked();

  /**
   * Search parameter: <b>series</b>
   * <p>
   * Description: <b>The series being followed by the provider</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Immunization.protocolApplied.series</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "series", path = "Immunization.protocolApplied.series", description = "The series being followed by the provider", type = "string")
  public static final String SP_SERIES = "series";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>series</b>
   * <p>
   * Description: <b>The series being followed by the provider</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Immunization.protocolApplied.series</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam SERIES = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_SERIES);

  /**
   * Search parameter: <b>vaccine-code</b>
   * <p>
   * Description: <b>Vaccine Product Administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.vaccineCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "vaccine-code", path = "Immunization.vaccineCode", description = "Vaccine Product Administered", type = "token")
  public static final String SP_VACCINE_CODE = "vaccine-code";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>vaccine-code</b>
   * <p>
   * Description: <b>Vaccine Product Administered</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.vaccineCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VACCINE_CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_VACCINE_CODE);

  /**
   * Search parameter: <b>reason-reference</b>
   * <p>
   * Description: <b>Why immunization occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.reasonReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reason-reference", path = "Immunization.reasonReference", description = "Why immunization occurred", type = "reference", target = {
      Condition.class, DiagnosticReport.class, Observation.class })
  public static final String SP_REASON_REFERENCE = "reason-reference";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reason-reference</b>
   * <p>
   * Description: <b>Why immunization occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.reasonReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REASON_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_REASON_REFERENCE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:reason-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REASON_REFERENCE = new ca.uhn.fhir.model.api.Include(
      "Immunization:reason-reference").toLocked();

  /**
   * Search parameter: <b>location</b>
   * <p>
   * Description: <b>The service delivery location or facility in which the
   * vaccine was / was to be administered</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.location</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "location", path = "Immunization.location", description = "The service delivery location or facility in which the vaccine was / was to be administered", type = "reference", target = {
      Location.class })
  public static final String SP_LOCATION = "location";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>location</b>
   * <p>
   * Description: <b>The service delivery location or facility in which the
   * vaccine was / was to be administered</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Immunization.location</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam LOCATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_LOCATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Immunization:location</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_LOCATION = new ca.uhn.fhir.model.api.Include(
      "Immunization:location").toLocked();

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Immunization event status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "Immunization.status", description = "Immunization event status", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Immunization event status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Immunization.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

  /**
   * Search parameter: <b>reaction-date</b>
   * <p>
   * Description: <b>When reaction started</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Immunization.reaction.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "reaction-date", path = "Immunization.reaction.date", description = "When reaction started", type = "date")
  public static final String SP_REACTION_DATE = "reaction-date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>reaction-date</b>
   * <p>
   * Description: <b>When reaction started</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Immunization.reaction.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam REACTION_DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_REACTION_DATE);

}
