package org.hl7.fhir.r4.model;

import java.math.BigDecimal;

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
 * The resource ChargeItem describes the provision of healthcare provider
 * products for a certain patient, therefore referring not only to the product,
 * but containing in addition details of the provision, like date, time, amounts
 * and participating organizations and persons. Main Usage of the ChargeItem is
 * to enable the billing process and internal cost allocation.
 */
@ResourceDef(name = "ChargeItem", profile = "http://hl7.org/fhir/StructureDefinition/ChargeItem")
public class ChargeItem extends DomainResource {

  public enum ChargeItemStatus {
    /**
     * The charge item has been entered, but the charged service is not yet
     * complete, so it shall not be billed yet but might be used in the context of
     * pre-authorization.
     */
    PLANNED,
    /**
     * The charge item is ready for billing.
     */
    BILLABLE,
    /**
     * The charge item has been determined to be not billable (e.g. due to rules
     * associated with the billing code).
     */
    NOTBILLABLE,
    /**
     * The processing of the charge was aborted.
     */
    ABORTED,
    /**
     * The charge item has been billed (e.g. a billing engine has generated
     * financial transactions by applying the associated ruled for the charge item
     * to the context of the Encounter, and placed them into Claims/Invoices.
     */
    BILLED,
    /**
     * The charge item has been entered in error and should not be processed for
     * billing.
     */
    ENTEREDINERROR,
    /**
     * The authoring system does not know which of the status values currently
     * applies for this charge item Note: This concept is not to be used for "other"
     * - one of the listed statuses is presumed to apply, it's just not known which
     * one.
     */
    UNKNOWN,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static ChargeItemStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("planned".equals(codeString))
        return PLANNED;
      if ("billable".equals(codeString))
        return BILLABLE;
      if ("not-billable".equals(codeString))
        return NOTBILLABLE;
      if ("aborted".equals(codeString))
        return ABORTED;
      if ("billed".equals(codeString))
        return BILLED;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown ChargeItemStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case PLANNED:
        return "planned";
      case BILLABLE:
        return "billable";
      case NOTBILLABLE:
        return "not-billable";
      case ABORTED:
        return "aborted";
      case BILLED:
        return "billed";
      case ENTEREDINERROR:
        return "entered-in-error";
      case UNKNOWN:
        return "unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case PLANNED:
        return "http://hl7.org/fhir/chargeitem-status";
      case BILLABLE:
        return "http://hl7.org/fhir/chargeitem-status";
      case NOTBILLABLE:
        return "http://hl7.org/fhir/chargeitem-status";
      case ABORTED:
        return "http://hl7.org/fhir/chargeitem-status";
      case BILLED:
        return "http://hl7.org/fhir/chargeitem-status";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/chargeitem-status";
      case UNKNOWN:
        return "http://hl7.org/fhir/chargeitem-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case PLANNED:
        return "The charge item has been entered, but the charged service is not  yet complete, so it shall not be billed yet but might be used in the context of pre-authorization.";
      case BILLABLE:
        return "The charge item is ready for billing.";
      case NOTBILLABLE:
        return "The charge item has been determined to be not billable (e.g. due to rules associated with the billing code).";
      case ABORTED:
        return "The processing of the charge was aborted.";
      case BILLED:
        return "The charge item has been billed (e.g. a billing engine has generated financial transactions by applying the associated ruled for the charge item to the context of the Encounter, and placed them into Claims/Invoices.";
      case ENTEREDINERROR:
        return "The charge item has been entered in error and should not be processed for billing.";
      case UNKNOWN:
        return "The authoring system does not know which of the status values currently applies for this charge item  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case PLANNED:
        return "Planned";
      case BILLABLE:
        return "Billable";
      case NOTBILLABLE:
        return "Not billable";
      case ABORTED:
        return "Aborted";
      case BILLED:
        return "Billed";
      case ENTEREDINERROR:
        return "Entered in Error";
      case UNKNOWN:
        return "Unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ChargeItemStatusEnumFactory implements EnumFactory<ChargeItemStatus> {
    public ChargeItemStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("planned".equals(codeString))
        return ChargeItemStatus.PLANNED;
      if ("billable".equals(codeString))
        return ChargeItemStatus.BILLABLE;
      if ("not-billable".equals(codeString))
        return ChargeItemStatus.NOTBILLABLE;
      if ("aborted".equals(codeString))
        return ChargeItemStatus.ABORTED;
      if ("billed".equals(codeString))
        return ChargeItemStatus.BILLED;
      if ("entered-in-error".equals(codeString))
        return ChargeItemStatus.ENTEREDINERROR;
      if ("unknown".equals(codeString))
        return ChargeItemStatus.UNKNOWN;
      throw new IllegalArgumentException("Unknown ChargeItemStatus code '" + codeString + "'");
    }

    public Enumeration<ChargeItemStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.NULL, code);
      if ("planned".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.PLANNED, code);
      if ("billable".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.BILLABLE, code);
      if ("not-billable".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.NOTBILLABLE, code);
      if ("aborted".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.ABORTED, code);
      if ("billed".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.BILLED, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.ENTEREDINERROR, code);
      if ("unknown".equals(codeString))
        return new Enumeration<ChargeItemStatus>(this, ChargeItemStatus.UNKNOWN, code);
      throw new FHIRException("Unknown ChargeItemStatus code '" + codeString + "'");
    }

    public String toCode(ChargeItemStatus code) {
       if (code == ChargeItemStatus.NULL)
           return null;
       if (code == ChargeItemStatus.PLANNED)
        return "planned";
      if (code == ChargeItemStatus.BILLABLE)
        return "billable";
      if (code == ChargeItemStatus.NOTBILLABLE)
        return "not-billable";
      if (code == ChargeItemStatus.ABORTED)
        return "aborted";
      if (code == ChargeItemStatus.BILLED)
        return "billed";
      if (code == ChargeItemStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == ChargeItemStatus.UNKNOWN)
        return "unknown";
      return "?";
   }

    public String toSystem(ChargeItemStatus code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class ChargeItemPerformerComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Describes the type of performance or participation(e.g. primary surgeon,
     * anesthesiologiest, etc.).
     */
    @Child(name = "function", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "What type of performance was done", formalDefinition = "Describes the type of performance or participation(e.g. primary surgeon, anesthesiologiest, etc.).")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/performer-role")
    protected CodeableConcept function;

    /**
     * The device, practitioner, etc. who performed or participated in the service.
     */
    @Child(name = "actor", type = { Practitioner.class, PractitionerRole.class, Organization.class, CareTeam.class,
        Patient.class, Device.class,
        RelatedPerson.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Individual who was performing", formalDefinition = "The device, practitioner, etc. who performed or participated in the service.")
    protected Reference actor;

    /**
     * The actual object that is the target of the reference (The device,
     * practitioner, etc. who performed or participated in the service.)
     */
    protected Resource actorTarget;

    private static final long serialVersionUID = 1424001049L;

    /**
     * Constructor
     */
    public ChargeItemPerformerComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ChargeItemPerformerComponent(Reference actor) {
      super();
      this.actor = actor;
    }

    /**
     * @return {@link #function} (Describes the type of performance or
     *         participation(e.g. primary surgeon, anesthesiologiest, etc.).)
     */
    public CodeableConcept getFunction() {
      if (this.function == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ChargeItemPerformerComponent.function");
        else if (Configuration.doAutoCreate())
          this.function = new CodeableConcept(); // cc
      return this.function;
    }

    public boolean hasFunction() {
      return this.function != null && !this.function.isEmpty();
    }

    /**
     * @param value {@link #function} (Describes the type of performance or
     *              participation(e.g. primary surgeon, anesthesiologiest, etc.).)
     */
    public ChargeItemPerformerComponent setFunction(CodeableConcept value) {
      this.function = value;
      return this;
    }

    /**
     * @return {@link #actor} (The device, practitioner, etc. who performed or
     *         participated in the service.)
     */
    public Reference getActor() {
      if (this.actor == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ChargeItemPerformerComponent.actor");
        else if (Configuration.doAutoCreate())
          this.actor = new Reference(); // cc
      return this.actor;
    }

    public boolean hasActor() {
      return this.actor != null && !this.actor.isEmpty();
    }

    /**
     * @param value {@link #actor} (The device, practitioner, etc. who performed or
     *              participated in the service.)
     */
    public ChargeItemPerformerComponent setActor(Reference value) {
      this.actor = value;
      return this;
    }

    /**
     * @return {@link #actor} The actual object that is the target of the reference.
     *         The reference library doesn't populate this, but you can use it to
     *         hold the resource if you resolve it. (The device, practitioner, etc.
     *         who performed or participated in the service.)
     */
    public Resource getActorTarget() {
      return this.actorTarget;
    }

    /**
     * @param value {@link #actor} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (The device,
     *              practitioner, etc. who performed or participated in the
     *              service.)
     */
    public ChargeItemPerformerComponent setActorTarget(Resource value) {
      this.actorTarget = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("function", "CodeableConcept",
          "Describes the type of performance or participation(e.g. primary surgeon, anesthesiologiest, etc.).", 0, 1,
          function));
      children.add(new Property("actor",
          "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|Device|RelatedPerson)",
          "The device, practitioner, etc. who performed or participated in the service.", 0, 1, actor));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1380938712:
        /* function */ return new Property("function", "CodeableConcept",
            "Describes the type of performance or participation(e.g. primary surgeon, anesthesiologiest, etc.).", 0, 1,
            function);
      case 92645877:
        /* actor */ return new Property("actor",
            "Reference(Practitioner|PractitionerRole|Organization|CareTeam|Patient|Device|RelatedPerson)",
            "The device, practitioner, etc. who performed or participated in the service.", 0, 1, actor);
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

    public ChargeItemPerformerComponent copy() {
      ChargeItemPerformerComponent dst = new ChargeItemPerformerComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ChargeItemPerformerComponent dst) {
      super.copyValues(dst);
      dst.function = function == null ? null : function.copy();
      dst.actor = actor == null ? null : actor.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ChargeItemPerformerComponent))
        return false;
      ChargeItemPerformerComponent o = (ChargeItemPerformerComponent) other_;
      return compareDeep(function, o.function, true) && compareDeep(actor, o.actor, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ChargeItemPerformerComponent))
        return false;
      ChargeItemPerformerComponent o = (ChargeItemPerformerComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(function, actor);
    }

    public String fhirType() {
      return "ChargeItem.performer";

    }

  }

  /**
   * Identifiers assigned to this event performer or other systems.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Business Identifier for item", formalDefinition = "Identifiers assigned to this event performer or other systems.")
  protected List<Identifier> identifier;

  /**
   * References the (external) source of pricing information, rules of application
   * for the code this ChargeItem uses.
   */
  @Child(name = "definitionUri", type = {
      UriType.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Defining information about the code of this charge item", formalDefinition = "References the (external) source of pricing information, rules of application for the code this ChargeItem uses.")
  protected List<UriType> definitionUri;

  /**
   * References the source of pricing information, rules of application for the
   * code this ChargeItem uses.
   */
  @Child(name = "definitionCanonical", type = {
      CanonicalType.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Resource defining the code of this ChargeItem", formalDefinition = "References the source of pricing information, rules of application for the code this ChargeItem uses.")
  protected List<CanonicalType> definitionCanonical;

  /**
   * The current state of the ChargeItem.
   */
  @Child(name = "status", type = { CodeType.class }, order = 3, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "planned | billable | not-billable | aborted | billed | entered-in-error | unknown", formalDefinition = "The current state of the ChargeItem.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/chargeitem-status")
  protected Enumeration<ChargeItemStatus> status;

  /**
   * ChargeItems can be grouped to larger ChargeItems covering the whole set.
   */
  @Child(name = "partOf", type = {
      ChargeItem.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Part of referenced ChargeItem", formalDefinition = "ChargeItems can be grouped to larger ChargeItems covering the whole set.")
  protected List<Reference> partOf;
  /**
   * The actual objects that are the target of the reference (ChargeItems can be
   * grouped to larger ChargeItems covering the whole set.)
   */
  protected List<ChargeItem> partOfTarget;

  /**
   * A code that identifies the charge, like a billing code.
   */
  @Child(name = "code", type = { CodeableConcept.class }, order = 5, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "A code that identifies the charge, like a billing code", formalDefinition = "A code that identifies the charge, like a billing code.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/chargeitem-billingcodes")
  protected CodeableConcept code;

  /**
   * The individual or set of individuals the action is being or was performed on.
   */
  @Child(name = "subject", type = { Patient.class,
      Group.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Individual service was done for/to", formalDefinition = "The individual or set of individuals the action is being or was performed on.")
  protected Reference subject;

  /**
   * The actual object that is the target of the reference (The individual or set
   * of individuals the action is being or was performed on.)
   */
  protected Resource subjectTarget;

  /**
   * The encounter or episode of care that establishes the context for this event.
   */
  @Child(name = "context", type = { Encounter.class,
      EpisodeOfCare.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Encounter / Episode associated with event", formalDefinition = "The encounter or episode of care that establishes the context for this event.")
  protected Reference context;

  /**
   * The actual object that is the target of the reference (The encounter or
   * episode of care that establishes the context for this event.)
   */
  protected Resource contextTarget;

  /**
   * Date/time(s) or duration when the charged service was applied.
   */
  @Child(name = "occurrence", type = { DateTimeType.class, Period.class,
      Timing.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When the charged service was applied", formalDefinition = "Date/time(s) or duration when the charged service was applied.")
  protected Type occurrence;

  /**
   * Indicates who or what performed or participated in the charged service.
   */
  @Child(name = "performer", type = {}, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Who performed charged service", formalDefinition = "Indicates who or what performed or participated in the charged service.")
  protected List<ChargeItemPerformerComponent> performer;

  /**
   * The organization requesting the service.
   */
  @Child(name = "performingOrganization", type = {
      Organization.class }, order = 10, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Organization providing the charged service", formalDefinition = "The organization requesting the service.")
  protected Reference performingOrganization;

  /**
   * The actual object that is the target of the reference (The organization
   * requesting the service.)
   */
  protected Organization performingOrganizationTarget;

  /**
   * The organization performing the service.
   */
  @Child(name = "requestingOrganization", type = {
      Organization.class }, order = 11, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Organization requesting the charged service", formalDefinition = "The organization performing the service.")
  protected Reference requestingOrganization;

  /**
   * The actual object that is the target of the reference (The organization
   * performing the service.)
   */
  protected Organization requestingOrganizationTarget;

  /**
   * The financial cost center permits the tracking of charge attribution.
   */
  @Child(name = "costCenter", type = {
      Organization.class }, order = 12, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Organization that has ownership of the (potential, future) revenue", formalDefinition = "The financial cost center permits the tracking of charge attribution.")
  protected Reference costCenter;

  /**
   * The actual object that is the target of the reference (The financial cost
   * center permits the tracking of charge attribution.)
   */
  protected Organization costCenterTarget;

  /**
   * Quantity of which the charge item has been serviced.
   */
  @Child(name = "quantity", type = { Quantity.class }, order = 13, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Quantity of which the charge item has been serviced", formalDefinition = "Quantity of which the charge item has been serviced.")
  protected Quantity quantity;

  /**
   * The anatomical location where the related service has been applied.
   */
  @Child(name = "bodysite", type = {
      CodeableConcept.class }, order = 14, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Anatomical location, if relevant", formalDefinition = "The anatomical location where the related service has been applied.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
  protected List<CodeableConcept> bodysite;

  /**
   * Factor overriding the factor determined by the rules associated with the
   * code.
   */
  @Child(name = "factorOverride", type = {
      DecimalType.class }, order = 15, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Factor overriding the associated rules", formalDefinition = "Factor overriding the factor determined by the rules associated with the code.")
  protected DecimalType factorOverride;

  /**
   * Total price of the charge overriding the list price associated with the code.
   */
  @Child(name = "priceOverride", type = {
      Money.class }, order = 16, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Price overriding the associated rules", formalDefinition = "Total price of the charge overriding the list price associated with the code.")
  protected Money priceOverride;

  /**
   * If the list price or the rule-based factor associated with the code is
   * overridden, this attribute can capture a text to indicate the reason for this
   * action.
   */
  @Child(name = "overrideReason", type = {
      StringType.class }, order = 17, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Reason for overriding the list price/factor", formalDefinition = "If the list price or the rule-based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.")
  protected StringType overrideReason;

  /**
   * The device, practitioner, etc. who entered the charge item.
   */
  @Child(name = "enterer", type = { Practitioner.class, PractitionerRole.class, Organization.class, Patient.class,
      Device.class, RelatedPerson.class }, order = 18, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Individual who was entering", formalDefinition = "The device, practitioner, etc. who entered the charge item.")
  protected Reference enterer;

  /**
   * The actual object that is the target of the reference (The device,
   * practitioner, etc. who entered the charge item.)
   */
  protected Resource entererTarget;

  /**
   * Date the charge item was entered.
   */
  @Child(name = "enteredDate", type = {
      DateTimeType.class }, order = 19, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Date the charge item was entered", formalDefinition = "Date the charge item was entered.")
  protected DateTimeType enteredDate;

  /**
   * Describes why the event occurred in coded or textual form.
   */
  @Child(name = "reason", type = {
      CodeableConcept.class }, order = 20, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Why was the charged  service rendered?", formalDefinition = "Describes why the event occurred in coded or textual form.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/icd-10")
  protected List<CodeableConcept> reason;

  /**
   * Indicated the rendered service that caused this charge.
   */
  @Child(name = "service", type = { DiagnosticReport.class, ImagingStudy.class, Immunization.class,
      MedicationAdministration.class, MedicationDispense.class, Observation.class, Procedure.class,
      SupplyDelivery.class }, order = 21, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Which rendered service is being charged?", formalDefinition = "Indicated the rendered service that caused this charge.")
  protected List<Reference> service;
  /**
   * The actual objects that are the target of the reference (Indicated the
   * rendered service that caused this charge.)
   */
  protected List<Resource> serviceTarget;

  /**
   * Identifies the device, food, drug or other product being charged either by
   * type code or reference to an instance.
   */
  @Child(name = "product", type = { Device.class, Medication.class, Substance.class,
      CodeableConcept.class }, order = 22, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Product charged", formalDefinition = "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-kind")
  protected Type product;

  /**
   * Account into which this ChargeItems belongs.
   */
  @Child(name = "account", type = {
      Account.class }, order = 23, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Account to place this charge", formalDefinition = "Account into which this ChargeItems belongs.")
  protected List<Reference> account;
  /**
   * The actual objects that are the target of the reference (Account into which
   * this ChargeItems belongs.)
   */
  protected List<Account> accountTarget;

  /**
   * Comments made about the event by the performer, subject or other
   * participants.
   */
  @Child(name = "note", type = {
      Annotation.class }, order = 24, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Comments made about the ChargeItem", formalDefinition = "Comments made about the event by the performer, subject or other participants.")
  protected List<Annotation> note;

  /**
   * Further information supporting this charge.
   */
  @Child(name = "supportingInformation", type = {
      Reference.class }, order = 25, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Further information supporting this charge", formalDefinition = "Further information supporting this charge.")
  protected List<Reference> supportingInformation;
  /**
   * The actual objects that are the target of the reference (Further information
   * supporting this charge.)
   */
  protected List<Resource> supportingInformationTarget;

  private static final long serialVersionUID = 1748644267L;

  /**
   * Constructor
   */
  public ChargeItem() {
    super();
  }

  /**
   * Constructor
   */
  public ChargeItem(Enumeration<ChargeItemStatus> status, CodeableConcept code, Reference subject) {
    super();
    this.status = status;
    this.code = code;
    this.subject = subject;
  }

  /**
   * @return {@link #identifier} (Identifiers assigned to this event performer or
   *         other systems.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setIdentifier(List<Identifier> theIdentifier) {
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

  public ChargeItem addIdentifier(Identifier t) { // 3
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
   * @return {@link #definitionUri} (References the (external) source of pricing
   *         information, rules of application for the code this ChargeItem uses.)
   */
  public List<UriType> getDefinitionUri() {
    if (this.definitionUri == null)
      this.definitionUri = new ArrayList<UriType>();
    return this.definitionUri;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setDefinitionUri(List<UriType> theDefinitionUri) {
    this.definitionUri = theDefinitionUri;
    return this;
  }

  public boolean hasDefinitionUri() {
    if (this.definitionUri == null)
      return false;
    for (UriType item : this.definitionUri)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #definitionUri} (References the (external) source of pricing
   *         information, rules of application for the code this ChargeItem uses.)
   */
  public UriType addDefinitionUriElement() {// 2
    UriType t = new UriType();
    if (this.definitionUri == null)
      this.definitionUri = new ArrayList<UriType>();
    this.definitionUri.add(t);
    return t;
  }

  /**
   * @param value {@link #definitionUri} (References the (external) source of
   *              pricing information, rules of application for the code this
   *              ChargeItem uses.)
   */
  public ChargeItem addDefinitionUri(String value) { // 1
    UriType t = new UriType();
    t.setValue(value);
    if (this.definitionUri == null)
      this.definitionUri = new ArrayList<UriType>();
    this.definitionUri.add(t);
    return this;
  }

  /**
   * @param value {@link #definitionUri} (References the (external) source of
   *              pricing information, rules of application for the code this
   *              ChargeItem uses.)
   */
  public boolean hasDefinitionUri(String value) {
    if (this.definitionUri == null)
      return false;
    for (UriType v : this.definitionUri)
      if (v.getValue().equals(value)) // uri
        return true;
    return false;
  }

  /**
   * @return {@link #definitionCanonical} (References the source of pricing
   *         information, rules of application for the code this ChargeItem uses.)
   */
  public List<CanonicalType> getDefinitionCanonical() {
    if (this.definitionCanonical == null)
      this.definitionCanonical = new ArrayList<CanonicalType>();
    return this.definitionCanonical;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setDefinitionCanonical(List<CanonicalType> theDefinitionCanonical) {
    this.definitionCanonical = theDefinitionCanonical;
    return this;
  }

  public boolean hasDefinitionCanonical() {
    if (this.definitionCanonical == null)
      return false;
    for (CanonicalType item : this.definitionCanonical)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #definitionCanonical} (References the source of pricing
   *         information, rules of application for the code this ChargeItem uses.)
   */
  public CanonicalType addDefinitionCanonicalElement() {// 2
    CanonicalType t = new CanonicalType();
    if (this.definitionCanonical == null)
      this.definitionCanonical = new ArrayList<CanonicalType>();
    this.definitionCanonical.add(t);
    return t;
  }

  /**
   * @param value {@link #definitionCanonical} (References the source of pricing
   *              information, rules of application for the code this ChargeItem
   *              uses.)
   */
  public ChargeItem addDefinitionCanonical(String value) { // 1
    CanonicalType t = new CanonicalType();
    t.setValue(value);
    if (this.definitionCanonical == null)
      this.definitionCanonical = new ArrayList<CanonicalType>();
    this.definitionCanonical.add(t);
    return this;
  }

  /**
   * @param value {@link #definitionCanonical} (References the source of pricing
   *              information, rules of application for the code this ChargeItem
   *              uses.)
   */
  public boolean hasDefinitionCanonical(String value) {
    if (this.definitionCanonical == null)
      return false;
    for (CanonicalType v : this.definitionCanonical)
      if (v.getValue().equals(value)) // canonical(ChargeItemDefinition)
        return true;
    return false;
  }

  /**
   * @return {@link #status} (The current state of the ChargeItem.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getStatus" gives direct access to the value
   */
  public Enumeration<ChargeItemStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<ChargeItemStatus>(new ChargeItemStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The current state of the ChargeItem.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getStatus" gives direct access to the value
   */
  public ChargeItem setStatusElement(Enumeration<ChargeItemStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return The current state of the ChargeItem.
   */
  public ChargeItemStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The current state of the ChargeItem.
   */
  public ChargeItem setStatus(ChargeItemStatus value) {
    if (this.status == null)
      this.status = new Enumeration<ChargeItemStatus>(new ChargeItemStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #partOf} (ChargeItems can be grouped to larger ChargeItems
   *         covering the whole set.)
   */
  public List<Reference> getPartOf() {
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    return this.partOf;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setPartOf(List<Reference> thePartOf) {
    this.partOf = thePartOf;
    return this;
  }

  public boolean hasPartOf() {
    if (this.partOf == null)
      return false;
    for (Reference item : this.partOf)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addPartOf() { // 3
    Reference t = new Reference();
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    this.partOf.add(t);
    return t;
  }

  public ChargeItem addPartOf(Reference t) { // 3
    if (t == null)
      return this;
    if (this.partOf == null)
      this.partOf = new ArrayList<Reference>();
    this.partOf.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #partOf}, creating it
   *         if it does not already exist
   */
  public Reference getPartOfFirstRep() {
    if (getPartOf().isEmpty()) {
      addPartOf();
    }
    return getPartOf().get(0);
  }

  /**
   * @return {@link #code} (A code that identifies the charge, like a billing
   *         code.)
   */
  public CodeableConcept getCode() {
    if (this.code == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.code");
      else if (Configuration.doAutoCreate())
        this.code = new CodeableConcept(); // cc
    return this.code;
  }

  public boolean hasCode() {
    return this.code != null && !this.code.isEmpty();
  }

  /**
   * @param value {@link #code} (A code that identifies the charge, like a billing
   *              code.)
   */
  public ChargeItem setCode(CodeableConcept value) {
    this.code = value;
    return this;
  }

  /**
   * @return {@link #subject} (The individual or set of individuals the action is
   *         being or was performed on.)
   */
  public Reference getSubject() {
    if (this.subject == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.subject");
      else if (Configuration.doAutoCreate())
        this.subject = new Reference(); // cc
    return this.subject;
  }

  public boolean hasSubject() {
    return this.subject != null && !this.subject.isEmpty();
  }

  /**
   * @param value {@link #subject} (The individual or set of individuals the
   *              action is being or was performed on.)
   */
  public ChargeItem setSubject(Reference value) {
    this.subject = value;
    return this;
  }

  /**
   * @return {@link #subject} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The individual or set
   *         of individuals the action is being or was performed on.)
   */
  public Resource getSubjectTarget() {
    return this.subjectTarget;
  }

  /**
   * @param value {@link #subject} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The individual
   *              or set of individuals the action is being or was performed on.)
   */
  public ChargeItem setSubjectTarget(Resource value) {
    this.subjectTarget = value;
    return this;
  }

  /**
   * @return {@link #context} (The encounter or episode of care that establishes
   *         the context for this event.)
   */
  public Reference getContext() {
    if (this.context == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.context");
      else if (Configuration.doAutoCreate())
        this.context = new Reference(); // cc
    return this.context;
  }

  public boolean hasContext() {
    return this.context != null && !this.context.isEmpty();
  }

  /**
   * @param value {@link #context} (The encounter or episode of care that
   *              establishes the context for this event.)
   */
  public ChargeItem setContext(Reference value) {
    this.context = value;
    return this;
  }

  /**
   * @return {@link #context} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The encounter or
   *         episode of care that establishes the context for this event.)
   */
  public Resource getContextTarget() {
    return this.contextTarget;
  }

  /**
   * @param value {@link #context} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The encounter or
   *              episode of care that establishes the context for this event.)
   */
  public ChargeItem setContextTarget(Resource value) {
    this.contextTarget = value;
    return this;
  }

  /**
   * @return {@link #occurrence} (Date/time(s) or duration when the charged
   *         service was applied.)
   */
  public Type getOccurrence() {
    return this.occurrence;
  }

  /**
   * @return {@link #occurrence} (Date/time(s) or duration when the charged
   *         service was applied.)
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
   * @return {@link #occurrence} (Date/time(s) or duration when the charged
   *         service was applied.)
   */
  public Period getOccurrencePeriod() throws FHIRException {
    if (this.occurrence == null)
      this.occurrence = new Period();
    if (!(this.occurrence instanceof Period))
      throw new FHIRException("Type mismatch: the type Period was expected, but " + this.occurrence.getClass().getName()
          + " was encountered");
    return (Period) this.occurrence;
  }

  public boolean hasOccurrencePeriod() {
      return this.occurrence instanceof Period;
  }

  /**
   * @return {@link #occurrence} (Date/time(s) or duration when the charged
   *         service was applied.)
   */
  public Timing getOccurrenceTiming() throws FHIRException {
    if (this.occurrence == null)
      this.occurrence = new Timing();
    if (!(this.occurrence instanceof Timing))
      throw new FHIRException("Type mismatch: the type Timing was expected, but " + this.occurrence.getClass().getName()
          + " was encountered");
    return (Timing) this.occurrence;
  }

  public boolean hasOccurrenceTiming() {
      return this.occurrence instanceof Timing;
  }

  public boolean hasOccurrence() {
    return this.occurrence != null && !this.occurrence.isEmpty();
  }

  /**
   * @param value {@link #occurrence} (Date/time(s) or duration when the charged
   *              service was applied.)
   */
  public ChargeItem setOccurrence(Type value) {
    if (value != null && !(value instanceof DateTimeType || value instanceof Period || value instanceof Timing))
      throw new Error("Not the right type for ChargeItem.occurrence[x]: " + value.fhirType());
    this.occurrence = value;
    return this;
  }

  /**
   * @return {@link #performer} (Indicates who or what performed or participated
   *         in the charged service.)
   */
  public List<ChargeItemPerformerComponent> getPerformer() {
    if (this.performer == null)
      this.performer = new ArrayList<ChargeItemPerformerComponent>();
    return this.performer;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setPerformer(List<ChargeItemPerformerComponent> thePerformer) {
    this.performer = thePerformer;
    return this;
  }

  public boolean hasPerformer() {
    if (this.performer == null)
      return false;
    for (ChargeItemPerformerComponent item : this.performer)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ChargeItemPerformerComponent addPerformer() { // 3
    ChargeItemPerformerComponent t = new ChargeItemPerformerComponent();
    if (this.performer == null)
      this.performer = new ArrayList<ChargeItemPerformerComponent>();
    this.performer.add(t);
    return t;
  }

  public ChargeItem addPerformer(ChargeItemPerformerComponent t) { // 3
    if (t == null)
      return this;
    if (this.performer == null)
      this.performer = new ArrayList<ChargeItemPerformerComponent>();
    this.performer.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #performer}, creating
   *         it if it does not already exist
   */
  public ChargeItemPerformerComponent getPerformerFirstRep() {
    if (getPerformer().isEmpty()) {
      addPerformer();
    }
    return getPerformer().get(0);
  }

  /**
   * @return {@link #performingOrganization} (The organization requesting the
   *         service.)
   */
  public Reference getPerformingOrganization() {
    if (this.performingOrganization == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.performingOrganization");
      else if (Configuration.doAutoCreate())
        this.performingOrganization = new Reference(); // cc
    return this.performingOrganization;
  }

  public boolean hasPerformingOrganization() {
    return this.performingOrganization != null && !this.performingOrganization.isEmpty();
  }

  /**
   * @param value {@link #performingOrganization} (The organization requesting the
   *              service.)
   */
  public ChargeItem setPerformingOrganization(Reference value) {
    this.performingOrganization = value;
    return this;
  }

  /**
   * @return {@link #performingOrganization} The actual object that is the target
   *         of the reference. The reference library doesn't populate this, but
   *         you can use it to hold the resource if you resolve it. (The
   *         organization requesting the service.)
   */
  public Organization getPerformingOrganizationTarget() {
    if (this.performingOrganizationTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.performingOrganization");
      else if (Configuration.doAutoCreate())
        this.performingOrganizationTarget = new Organization(); // aa
    return this.performingOrganizationTarget;
  }

  /**
   * @param value {@link #performingOrganization} The actual object that is the
   *              target of the reference. The reference library doesn't use
   *              these, but you can use it to hold the resource if you resolve
   *              it. (The organization requesting the service.)
   */
  public ChargeItem setPerformingOrganizationTarget(Organization value) {
    this.performingOrganizationTarget = value;
    return this;
  }

  /**
   * @return {@link #requestingOrganization} (The organization performing the
   *         service.)
   */
  public Reference getRequestingOrganization() {
    if (this.requestingOrganization == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.requestingOrganization");
      else if (Configuration.doAutoCreate())
        this.requestingOrganization = new Reference(); // cc
    return this.requestingOrganization;
  }

  public boolean hasRequestingOrganization() {
    return this.requestingOrganization != null && !this.requestingOrganization.isEmpty();
  }

  /**
   * @param value {@link #requestingOrganization} (The organization performing the
   *              service.)
   */
  public ChargeItem setRequestingOrganization(Reference value) {
    this.requestingOrganization = value;
    return this;
  }

  /**
   * @return {@link #requestingOrganization} The actual object that is the target
   *         of the reference. The reference library doesn't populate this, but
   *         you can use it to hold the resource if you resolve it. (The
   *         organization performing the service.)
   */
  public Organization getRequestingOrganizationTarget() {
    if (this.requestingOrganizationTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.requestingOrganization");
      else if (Configuration.doAutoCreate())
        this.requestingOrganizationTarget = new Organization(); // aa
    return this.requestingOrganizationTarget;
  }

  /**
   * @param value {@link #requestingOrganization} The actual object that is the
   *              target of the reference. The reference library doesn't use
   *              these, but you can use it to hold the resource if you resolve
   *              it. (The organization performing the service.)
   */
  public ChargeItem setRequestingOrganizationTarget(Organization value) {
    this.requestingOrganizationTarget = value;
    return this;
  }

  /**
   * @return {@link #costCenter} (The financial cost center permits the tracking
   *         of charge attribution.)
   */
  public Reference getCostCenter() {
    if (this.costCenter == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.costCenter");
      else if (Configuration.doAutoCreate())
        this.costCenter = new Reference(); // cc
    return this.costCenter;
  }

  public boolean hasCostCenter() {
    return this.costCenter != null && !this.costCenter.isEmpty();
  }

  /**
   * @param value {@link #costCenter} (The financial cost center permits the
   *              tracking of charge attribution.)
   */
  public ChargeItem setCostCenter(Reference value) {
    this.costCenter = value;
    return this;
  }

  /**
   * @return {@link #costCenter} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The financial cost
   *         center permits the tracking of charge attribution.)
   */
  public Organization getCostCenterTarget() {
    if (this.costCenterTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.costCenter");
      else if (Configuration.doAutoCreate())
        this.costCenterTarget = new Organization(); // aa
    return this.costCenterTarget;
  }

  /**
   * @param value {@link #costCenter} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The financial
   *              cost center permits the tracking of charge attribution.)
   */
  public ChargeItem setCostCenterTarget(Organization value) {
    this.costCenterTarget = value;
    return this;
  }

  /**
   * @return {@link #quantity} (Quantity of which the charge item has been
   *         serviced.)
   */
  public Quantity getQuantity() {
    if (this.quantity == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.quantity");
      else if (Configuration.doAutoCreate())
        this.quantity = new Quantity(); // cc
    return this.quantity;
  }

  public boolean hasQuantity() {
    return this.quantity != null && !this.quantity.isEmpty();
  }

  /**
   * @param value {@link #quantity} (Quantity of which the charge item has been
   *              serviced.)
   */
  public ChargeItem setQuantity(Quantity value) {
    this.quantity = value;
    return this;
  }

  /**
   * @return {@link #bodysite} (The anatomical location where the related service
   *         has been applied.)
   */
  public List<CodeableConcept> getBodysite() {
    if (this.bodysite == null)
      this.bodysite = new ArrayList<CodeableConcept>();
    return this.bodysite;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setBodysite(List<CodeableConcept> theBodysite) {
    this.bodysite = theBodysite;
    return this;
  }

  public boolean hasBodysite() {
    if (this.bodysite == null)
      return false;
    for (CodeableConcept item : this.bodysite)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addBodysite() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.bodysite == null)
      this.bodysite = new ArrayList<CodeableConcept>();
    this.bodysite.add(t);
    return t;
  }

  public ChargeItem addBodysite(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.bodysite == null)
      this.bodysite = new ArrayList<CodeableConcept>();
    this.bodysite.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #bodysite}, creating
   *         it if it does not already exist
   */
  public CodeableConcept getBodysiteFirstRep() {
    if (getBodysite().isEmpty()) {
      addBodysite();
    }
    return getBodysite().get(0);
  }

  /**
   * @return {@link #factorOverride} (Factor overriding the factor determined by
   *         the rules associated with the code.). This is the underlying object
   *         with id, value and extensions. The accessor "getFactorOverride" gives
   *         direct access to the value
   */
  public DecimalType getFactorOverrideElement() {
    if (this.factorOverride == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.factorOverride");
      else if (Configuration.doAutoCreate())
        this.factorOverride = new DecimalType(); // bb
    return this.factorOverride;
  }

  public boolean hasFactorOverrideElement() {
    return this.factorOverride != null && !this.factorOverride.isEmpty();
  }

  public boolean hasFactorOverride() {
    return this.factorOverride != null && !this.factorOverride.isEmpty();
  }

  /**
   * @param value {@link #factorOverride} (Factor overriding the factor determined
   *              by the rules associated with the code.). This is the underlying
   *              object with id, value and extensions. The accessor
   *              "getFactorOverride" gives direct access to the value
   */
  public ChargeItem setFactorOverrideElement(DecimalType value) {
    this.factorOverride = value;
    return this;
  }

  /**
   * @return Factor overriding the factor determined by the rules associated with
   *         the code.
   */
  public BigDecimal getFactorOverride() {
    return this.factorOverride == null ? null : this.factorOverride.getValue();
  }

  /**
   * @param value Factor overriding the factor determined by the rules associated
   *              with the code.
   */
  public ChargeItem setFactorOverride(BigDecimal value) {
    if (value == null)
      this.factorOverride = null;
    else {
      if (this.factorOverride == null)
        this.factorOverride = new DecimalType();
      this.factorOverride.setValue(value);
    }
    return this;
  }

  /**
   * @param value Factor overriding the factor determined by the rules associated
   *              with the code.
   */
  public ChargeItem setFactorOverride(long value) {
    this.factorOverride = new DecimalType();
    this.factorOverride.setValue(value);
    return this;
  }

  /**
   * @param value Factor overriding the factor determined by the rules associated
   *              with the code.
   */
  public ChargeItem setFactorOverride(double value) {
    this.factorOverride = new DecimalType();
    this.factorOverride.setValue(value);
    return this;
  }

  /**
   * @return {@link #priceOverride} (Total price of the charge overriding the list
   *         price associated with the code.)
   */
  public Money getPriceOverride() {
    if (this.priceOverride == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.priceOverride");
      else if (Configuration.doAutoCreate())
        this.priceOverride = new Money(); // cc
    return this.priceOverride;
  }

  public boolean hasPriceOverride() {
    return this.priceOverride != null && !this.priceOverride.isEmpty();
  }

  /**
   * @param value {@link #priceOverride} (Total price of the charge overriding the
   *              list price associated with the code.)
   */
  public ChargeItem setPriceOverride(Money value) {
    this.priceOverride = value;
    return this;
  }

  /**
   * @return {@link #overrideReason} (If the list price or the rule-based factor
   *         associated with the code is overridden, this attribute can capture a
   *         text to indicate the reason for this action.). This is the underlying
   *         object with id, value and extensions. The accessor
   *         "getOverrideReason" gives direct access to the value
   */
  public StringType getOverrideReasonElement() {
    if (this.overrideReason == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.overrideReason");
      else if (Configuration.doAutoCreate())
        this.overrideReason = new StringType(); // bb
    return this.overrideReason;
  }

  public boolean hasOverrideReasonElement() {
    return this.overrideReason != null && !this.overrideReason.isEmpty();
  }

  public boolean hasOverrideReason() {
    return this.overrideReason != null && !this.overrideReason.isEmpty();
  }

  /**
   * @param value {@link #overrideReason} (If the list price or the rule-based
   *              factor associated with the code is overridden, this attribute
   *              can capture a text to indicate the reason for this action.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getOverrideReason" gives direct access to the value
   */
  public ChargeItem setOverrideReasonElement(StringType value) {
    this.overrideReason = value;
    return this;
  }

  /**
   * @return If the list price or the rule-based factor associated with the code
   *         is overridden, this attribute can capture a text to indicate the
   *         reason for this action.
   */
  public String getOverrideReason() {
    return this.overrideReason == null ? null : this.overrideReason.getValue();
  }

  /**
   * @param value If the list price or the rule-based factor associated with the
   *              code is overridden, this attribute can capture a text to
   *              indicate the reason for this action.
   */
  public ChargeItem setOverrideReason(String value) {
    if (Utilities.noString(value))
      this.overrideReason = null;
    else {
      if (this.overrideReason == null)
        this.overrideReason = new StringType();
      this.overrideReason.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #enterer} (The device, practitioner, etc. who entered the
   *         charge item.)
   */
  public Reference getEnterer() {
    if (this.enterer == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.enterer");
      else if (Configuration.doAutoCreate())
        this.enterer = new Reference(); // cc
    return this.enterer;
  }

  public boolean hasEnterer() {
    return this.enterer != null && !this.enterer.isEmpty();
  }

  /**
   * @param value {@link #enterer} (The device, practitioner, etc. who entered the
   *              charge item.)
   */
  public ChargeItem setEnterer(Reference value) {
    this.enterer = value;
    return this;
  }

  /**
   * @return {@link #enterer} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The device,
   *         practitioner, etc. who entered the charge item.)
   */
  public Resource getEntererTarget() {
    return this.entererTarget;
  }

  /**
   * @param value {@link #enterer} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The device,
   *              practitioner, etc. who entered the charge item.)
   */
  public ChargeItem setEntererTarget(Resource value) {
    this.entererTarget = value;
    return this;
  }

  /**
   * @return {@link #enteredDate} (Date the charge item was entered.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getEnteredDate" gives direct access to the value
   */
  public DateTimeType getEnteredDateElement() {
    if (this.enteredDate == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ChargeItem.enteredDate");
      else if (Configuration.doAutoCreate())
        this.enteredDate = new DateTimeType(); // bb
    return this.enteredDate;
  }

  public boolean hasEnteredDateElement() {
    return this.enteredDate != null && !this.enteredDate.isEmpty();
  }

  public boolean hasEnteredDate() {
    return this.enteredDate != null && !this.enteredDate.isEmpty();
  }

  /**
   * @param value {@link #enteredDate} (Date the charge item was entered.). This
   *              is the underlying object with id, value and extensions. The
   *              accessor "getEnteredDate" gives direct access to the value
   */
  public ChargeItem setEnteredDateElement(DateTimeType value) {
    this.enteredDate = value;
    return this;
  }

  /**
   * @return Date the charge item was entered.
   */
  public Date getEnteredDate() {
    return this.enteredDate == null ? null : this.enteredDate.getValue();
  }

  /**
   * @param value Date the charge item was entered.
   */
  public ChargeItem setEnteredDate(Date value) {
    if (value == null)
      this.enteredDate = null;
    else {
      if (this.enteredDate == null)
        this.enteredDate = new DateTimeType();
      this.enteredDate.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #reason} (Describes why the event occurred in coded or textual
   *         form.)
   */
  public List<CodeableConcept> getReason() {
    if (this.reason == null)
      this.reason = new ArrayList<CodeableConcept>();
    return this.reason;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setReason(List<CodeableConcept> theReason) {
    this.reason = theReason;
    return this;
  }

  public boolean hasReason() {
    if (this.reason == null)
      return false;
    for (CodeableConcept item : this.reason)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addReason() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.reason == null)
      this.reason = new ArrayList<CodeableConcept>();
    this.reason.add(t);
    return t;
  }

  public ChargeItem addReason(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.reason == null)
      this.reason = new ArrayList<CodeableConcept>();
    this.reason.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #reason}, creating it
   *         if it does not already exist
   */
  public CodeableConcept getReasonFirstRep() {
    if (getReason().isEmpty()) {
      addReason();
    }
    return getReason().get(0);
  }

  /**
   * @return {@link #service} (Indicated the rendered service that caused this
   *         charge.)
   */
  public List<Reference> getService() {
    if (this.service == null)
      this.service = new ArrayList<Reference>();
    return this.service;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setService(List<Reference> theService) {
    this.service = theService;
    return this;
  }

  public boolean hasService() {
    if (this.service == null)
      return false;
    for (Reference item : this.service)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addService() { // 3
    Reference t = new Reference();
    if (this.service == null)
      this.service = new ArrayList<Reference>();
    this.service.add(t);
    return t;
  }

  public ChargeItem addService(Reference t) { // 3
    if (t == null)
      return this;
    if (this.service == null)
      this.service = new ArrayList<Reference>();
    this.service.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #service}, creating it
   *         if it does not already exist
   */
  public Reference getServiceFirstRep() {
    if (getService().isEmpty()) {
      addService();
    }
    return getService().get(0);
  }

  /**
   * @return {@link #product} (Identifies the device, food, drug or other product
   *         being charged either by type code or reference to an instance.)
   */
  public Type getProduct() {
    return this.product;
  }

  /**
   * @return {@link #product} (Identifies the device, food, drug or other product
   *         being charged either by type code or reference to an instance.)
   */
  public Reference getProductReference() throws FHIRException {
    if (this.product == null)
      this.product = new Reference();
    if (!(this.product instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.product.getClass().getName()
          + " was encountered");
    return (Reference) this.product;
  }

  public boolean hasProductReference() {
      return this.product instanceof Reference;
  }

  /**
   * @return {@link #product} (Identifies the device, food, drug or other product
   *         being charged either by type code or reference to an instance.)
   */
  public CodeableConcept getProductCodeableConcept() throws FHIRException {
    if (this.product == null)
      this.product = new CodeableConcept();
    if (!(this.product instanceof CodeableConcept))
      throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
          + this.product.getClass().getName() + " was encountered");
    return (CodeableConcept) this.product;
  }

  public boolean hasProductCodeableConcept() {
      return this.product instanceof CodeableConcept;
  }

  public boolean hasProduct() {
    return this.product != null && !this.product.isEmpty();
  }

  /**
   * @param value {@link #product} (Identifies the device, food, drug or other
   *              product being charged either by type code or reference to an
   *              instance.)
   */
  public ChargeItem setProduct(Type value) {
    if (value != null && !(value instanceof Reference || value instanceof CodeableConcept))
      throw new Error("Not the right type for ChargeItem.product[x]: " + value.fhirType());
    this.product = value;
    return this;
  }

  /**
   * @return {@link #account} (Account into which this ChargeItems belongs.)
   */
  public List<Reference> getAccount() {
    if (this.account == null)
      this.account = new ArrayList<Reference>();
    return this.account;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setAccount(List<Reference> theAccount) {
    this.account = theAccount;
    return this;
  }

  public boolean hasAccount() {
    if (this.account == null)
      return false;
    for (Reference item : this.account)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addAccount() { // 3
    Reference t = new Reference();
    if (this.account == null)
      this.account = new ArrayList<Reference>();
    this.account.add(t);
    return t;
  }

  public ChargeItem addAccount(Reference t) { // 3
    if (t == null)
      return this;
    if (this.account == null)
      this.account = new ArrayList<Reference>();
    this.account.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #account}, creating it
   *         if it does not already exist
   */
  public Reference getAccountFirstRep() {
    if (getAccount().isEmpty()) {
      addAccount();
    }
    return getAccount().get(0);
  }

  /**
   * @return {@link #note} (Comments made about the event by the performer,
   *         subject or other participants.)
   */
  public List<Annotation> getNote() {
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    return this.note;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setNote(List<Annotation> theNote) {
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

  public ChargeItem addNote(Annotation t) { // 3
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
   * @return {@link #supportingInformation} (Further information supporting this
   *         charge.)
   */
  public List<Reference> getSupportingInformation() {
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    return this.supportingInformation;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ChargeItem setSupportingInformation(List<Reference> theSupportingInformation) {
    this.supportingInformation = theSupportingInformation;
    return this;
  }

  public boolean hasSupportingInformation() {
    if (this.supportingInformation == null)
      return false;
    for (Reference item : this.supportingInformation)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addSupportingInformation() { // 3
    Reference t = new Reference();
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    this.supportingInformation.add(t);
    return t;
  }

  public ChargeItem addSupportingInformation(Reference t) { // 3
    if (t == null)
      return this;
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    this.supportingInformation.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field
   *         {@link #supportingInformation}, creating it if it does not already
   *         exist
   */
  public Reference getSupportingInformationFirstRep() {
    if (getSupportingInformation().isEmpty()) {
      addSupportingInformation();
    }
    return getSupportingInformation().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier",
        "Identifiers assigned to this event performer or other systems.", 0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("definitionUri", "uri",
        "References the (external) source of pricing information, rules of application for the code this ChargeItem uses.",
        0, java.lang.Integer.MAX_VALUE, definitionUri));
    children.add(new Property("definitionCanonical", "canonical(ChargeItemDefinition)",
        "References the source of pricing information, rules of application for the code this ChargeItem uses.", 0,
        java.lang.Integer.MAX_VALUE, definitionCanonical));
    children.add(new Property("status", "code", "The current state of the ChargeItem.", 0, 1, status));
    children.add(new Property("partOf", "Reference(ChargeItem)",
        "ChargeItems can be grouped to larger ChargeItems covering the whole set.", 0, java.lang.Integer.MAX_VALUE,
        partOf));
    children.add(
        new Property("code", "CodeableConcept", "A code that identifies the charge, like a billing code.", 0, 1, code));
    children.add(new Property("subject", "Reference(Patient|Group)",
        "The individual or set of individuals the action is being or was performed on.", 0, 1, subject));
    children.add(new Property("context", "Reference(Encounter|EpisodeOfCare)",
        "The encounter or episode of care that establishes the context for this event.", 0, 1, context));
    children.add(new Property("occurrence[x]", "dateTime|Period|Timing",
        "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence));
    children
        .add(new Property("performer", "", "Indicates who or what performed or participated in the charged service.", 0,
            java.lang.Integer.MAX_VALUE, performer));
    children.add(new Property("performingOrganization", "Reference(Organization)",
        "The organization requesting the service.", 0, 1, performingOrganization));
    children.add(new Property("requestingOrganization", "Reference(Organization)",
        "The organization performing the service.", 0, 1, requestingOrganization));
    children.add(new Property("costCenter", "Reference(Organization)",
        "The financial cost center permits the tracking of charge attribution.", 0, 1, costCenter));
    children.add(
        new Property("quantity", "Quantity", "Quantity of which the charge item has been serviced.", 0, 1, quantity));
    children.add(new Property("bodysite", "CodeableConcept",
        "The anatomical location where the related service has been applied.", 0, java.lang.Integer.MAX_VALUE,
        bodysite));
    children.add(new Property("factorOverride", "decimal",
        "Factor overriding the factor determined by the rules associated with the code.", 0, 1, factorOverride));
    children.add(new Property("priceOverride", "Money",
        "Total price of the charge overriding the list price associated with the code.", 0, 1, priceOverride));
    children.add(new Property("overrideReason", "string",
        "If the list price or the rule-based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.",
        0, 1, overrideReason));
    children.add(
        new Property("enterer", "Reference(Practitioner|PractitionerRole|Organization|Patient|Device|RelatedPerson)",
            "The device, practitioner, etc. who entered the charge item.", 0, 1, enterer));
    children.add(new Property("enteredDate", "dateTime", "Date the charge item was entered.", 0, 1, enteredDate));
    children.add(new Property("reason", "CodeableConcept", "Describes why the event occurred in coded or textual form.",
        0, java.lang.Integer.MAX_VALUE, reason));
    children.add(new Property("service",
        "Reference(DiagnosticReport|ImagingStudy|Immunization|MedicationAdministration|MedicationDispense|Observation|Procedure|SupplyDelivery)",
        "Indicated the rendered service that caused this charge.", 0, java.lang.Integer.MAX_VALUE, service));
    children.add(new Property("product[x]", "Reference(Device|Medication|Substance)|CodeableConcept",
        "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.",
        0, 1, product));
    children.add(new Property("account", "Reference(Account)", "Account into which this ChargeItems belongs.", 0,
        java.lang.Integer.MAX_VALUE, account));
    children.add(new Property("note", "Annotation",
        "Comments made about the event by the performer, subject or other participants.", 0,
        java.lang.Integer.MAX_VALUE, note));
    children.add(new Property("supportingInformation", "Reference(Any)", "Further information supporting this charge.",
        0, java.lang.Integer.MAX_VALUE, supportingInformation));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "Identifiers assigned to this event performer or other systems.", 0, java.lang.Integer.MAX_VALUE, identifier);
    case -1139428583:
      /* definitionUri */ return new Property("definitionUri", "uri",
          "References the (external) source of pricing information, rules of application for the code this ChargeItem uses.",
          0, java.lang.Integer.MAX_VALUE, definitionUri);
    case 933485793:
      /* definitionCanonical */ return new Property("definitionCanonical", "canonical(ChargeItemDefinition)",
          "References the source of pricing information, rules of application for the code this ChargeItem uses.", 0,
          java.lang.Integer.MAX_VALUE, definitionCanonical);
    case -892481550:
      /* status */ return new Property("status", "code", "The current state of the ChargeItem.", 0, 1, status);
    case -995410646:
      /* partOf */ return new Property("partOf", "Reference(ChargeItem)",
          "ChargeItems can be grouped to larger ChargeItems covering the whole set.", 0, java.lang.Integer.MAX_VALUE,
          partOf);
    case 3059181:
      /* code */ return new Property("code", "CodeableConcept",
          "A code that identifies the charge, like a billing code.", 0, 1, code);
    case -1867885268:
      /* subject */ return new Property("subject", "Reference(Patient|Group)",
          "The individual or set of individuals the action is being or was performed on.", 0, 1, subject);
    case 951530927:
      /* context */ return new Property("context", "Reference(Encounter|EpisodeOfCare)",
          "The encounter or episode of care that establishes the context for this event.", 0, 1, context);
    case -2022646513:
      /* occurrence[x] */ return new Property("occurrence[x]", "dateTime|Period|Timing",
          "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence);
    case 1687874001:
      /* occurrence */ return new Property("occurrence[x]", "dateTime|Period|Timing",
          "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence);
    case -298443636:
      /* occurrenceDateTime */ return new Property("occurrence[x]", "dateTime|Period|Timing",
          "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence);
    case 1397156594:
      /* occurrencePeriod */ return new Property("occurrence[x]", "dateTime|Period|Timing",
          "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence);
    case 1515218299:
      /* occurrenceTiming */ return new Property("occurrence[x]", "dateTime|Period|Timing",
          "Date/time(s) or duration when the charged service was applied.", 0, 1, occurrence);
    case 481140686:
      /* performer */ return new Property("performer", "",
          "Indicates who or what performed or participated in the charged service.", 0, java.lang.Integer.MAX_VALUE,
          performer);
    case 1273192628:
      /* performingOrganization */ return new Property("performingOrganization", "Reference(Organization)",
          "The organization requesting the service.", 0, 1, performingOrganization);
    case 1279054790:
      /* requestingOrganization */ return new Property("requestingOrganization", "Reference(Organization)",
          "The organization performing the service.", 0, 1, requestingOrganization);
    case -593192318:
      /* costCenter */ return new Property("costCenter", "Reference(Organization)",
          "The financial cost center permits the tracking of charge attribution.", 0, 1, costCenter);
    case -1285004149:
      /* quantity */ return new Property("quantity", "Quantity", "Quantity of which the charge item has been serviced.",
          0, 1, quantity);
    case 1703573481:
      /* bodysite */ return new Property("bodysite", "CodeableConcept",
          "The anatomical location where the related service has been applied.", 0, java.lang.Integer.MAX_VALUE,
          bodysite);
    case -451233221:
      /* factorOverride */ return new Property("factorOverride", "decimal",
          "Factor overriding the factor determined by the rules associated with the code.", 0, 1, factorOverride);
    case -216803275:
      /* priceOverride */ return new Property("priceOverride", "Money",
          "Total price of the charge overriding the list price associated with the code.", 0, 1, priceOverride);
    case -742878928:
      /* overrideReason */ return new Property("overrideReason", "string",
          "If the list price or the rule-based factor associated with the code is overridden, this attribute can capture a text to indicate the  reason for this action.",
          0, 1, overrideReason);
    case -1591951995:
      /* enterer */ return new Property("enterer",
          "Reference(Practitioner|PractitionerRole|Organization|Patient|Device|RelatedPerson)",
          "The device, practitioner, etc. who entered the charge item.", 0, 1, enterer);
    case 555978181:
      /* enteredDate */ return new Property("enteredDate", "dateTime", "Date the charge item was entered.", 0, 1,
          enteredDate);
    case -934964668:
      /* reason */ return new Property("reason", "CodeableConcept",
          "Describes why the event occurred in coded or textual form.", 0, java.lang.Integer.MAX_VALUE, reason);
    case 1984153269:
      /* service */ return new Property("service",
          "Reference(DiagnosticReport|ImagingStudy|Immunization|MedicationAdministration|MedicationDispense|Observation|Procedure|SupplyDelivery)",
          "Indicated the rendered service that caused this charge.", 0, java.lang.Integer.MAX_VALUE, service);
    case 1753005361:
      /* product[x] */ return new Property("product[x]", "Reference(Device|Medication|Substance)|CodeableConcept",
          "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.",
          0, 1, product);
    case -309474065:
      /* product */ return new Property("product[x]", "Reference(Device|Medication|Substance)|CodeableConcept",
          "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.",
          0, 1, product);
    case -669667556:
      /* productReference */ return new Property("product[x]", "Reference(Device|Medication|Substance)|CodeableConcept",
          "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.",
          0, 1, product);
    case 906854066:
      /* productCodeableConcept */ return new Property("product[x]",
          "Reference(Device|Medication|Substance)|CodeableConcept",
          "Identifies the device, food, drug or other product being charged either by type code or reference to an instance.",
          0, 1, product);
    case -1177318867:
      /* account */ return new Property("account", "Reference(Account)", "Account into which this ChargeItems belongs.",
          0, java.lang.Integer.MAX_VALUE, account);
    case 3387378:
      /* note */ return new Property("note", "Annotation",
          "Comments made about the event by the performer, subject or other participants.", 0,
          java.lang.Integer.MAX_VALUE, note);
    case -1248768647:
      /* supportingInformation */ return new Property("supportingInformation", "Reference(Any)",
          "Further information supporting this charge.", 0, java.lang.Integer.MAX_VALUE, supportingInformation);
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
    case -1139428583:
      /* definitionUri */ return this.definitionUri == null ? new Base[0]
          : this.definitionUri.toArray(new Base[this.definitionUri.size()]); // UriType
    case 933485793:
      /* definitionCanonical */ return this.definitionCanonical == null ? new Base[0]
          : this.definitionCanonical.toArray(new Base[this.definitionCanonical.size()]); // CanonicalType
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<ChargeItemStatus>
    case -995410646:
      /* partOf */ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
    case 3059181:
      /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeableConcept
    case -1867885268:
      /* subject */ return this.subject == null ? new Base[0] : new Base[] { this.subject }; // Reference
    case 951530927:
      /* context */ return this.context == null ? new Base[0] : new Base[] { this.context }; // Reference
    case 1687874001:
      /* occurrence */ return this.occurrence == null ? new Base[0] : new Base[] { this.occurrence }; // Type
    case 481140686:
      /* performer */ return this.performer == null ? new Base[0]
          : this.performer.toArray(new Base[this.performer.size()]); // ChargeItemPerformerComponent
    case 1273192628:
      /* performingOrganization */ return this.performingOrganization == null ? new Base[0]
          : new Base[] { this.performingOrganization }; // Reference
    case 1279054790:
      /* requestingOrganization */ return this.requestingOrganization == null ? new Base[0]
          : new Base[] { this.requestingOrganization }; // Reference
    case -593192318:
      /* costCenter */ return this.costCenter == null ? new Base[0] : new Base[] { this.costCenter }; // Reference
    case -1285004149:
      /* quantity */ return this.quantity == null ? new Base[0] : new Base[] { this.quantity }; // Quantity
    case 1703573481:
      /* bodysite */ return this.bodysite == null ? new Base[0] : this.bodysite.toArray(new Base[this.bodysite.size()]); // CodeableConcept
    case -451233221:
      /* factorOverride */ return this.factorOverride == null ? new Base[0] : new Base[] { this.factorOverride }; // DecimalType
    case -216803275:
      /* priceOverride */ return this.priceOverride == null ? new Base[0] : new Base[] { this.priceOverride }; // Money
    case -742878928:
      /* overrideReason */ return this.overrideReason == null ? new Base[0] : new Base[] { this.overrideReason }; // StringType
    case -1591951995:
      /* enterer */ return this.enterer == null ? new Base[0] : new Base[] { this.enterer }; // Reference
    case 555978181:
      /* enteredDate */ return this.enteredDate == null ? new Base[0] : new Base[] { this.enteredDate }; // DateTimeType
    case -934964668:
      /* reason */ return this.reason == null ? new Base[0] : this.reason.toArray(new Base[this.reason.size()]); // CodeableConcept
    case 1984153269:
      /* service */ return this.service == null ? new Base[0] : this.service.toArray(new Base[this.service.size()]); // Reference
    case -309474065:
      /* product */ return this.product == null ? new Base[0] : new Base[] { this.product }; // Type
    case -1177318867:
      /* account */ return this.account == null ? new Base[0] : this.account.toArray(new Base[this.account.size()]); // Reference
    case 3387378:
      /* note */ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
    case -1248768647:
      /* supportingInformation */ return this.supportingInformation == null ? new Base[0]
          : this.supportingInformation.toArray(new Base[this.supportingInformation.size()]); // Reference
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
    case -1139428583: // definitionUri
      this.getDefinitionUri().add(castToUri(value)); // UriType
      return value;
    case 933485793: // definitionCanonical
      this.getDefinitionCanonical().add(castToCanonical(value)); // CanonicalType
      return value;
    case -892481550: // status
      value = new ChargeItemStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<ChargeItemStatus>
      return value;
    case -995410646: // partOf
      this.getPartOf().add(castToReference(value)); // Reference
      return value;
    case 3059181: // code
      this.code = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -1867885268: // subject
      this.subject = castToReference(value); // Reference
      return value;
    case 951530927: // context
      this.context = castToReference(value); // Reference
      return value;
    case 1687874001: // occurrence
      this.occurrence = castToType(value); // Type
      return value;
    case 481140686: // performer
      this.getPerformer().add((ChargeItemPerformerComponent) value); // ChargeItemPerformerComponent
      return value;
    case 1273192628: // performingOrganization
      this.performingOrganization = castToReference(value); // Reference
      return value;
    case 1279054790: // requestingOrganization
      this.requestingOrganization = castToReference(value); // Reference
      return value;
    case -593192318: // costCenter
      this.costCenter = castToReference(value); // Reference
      return value;
    case -1285004149: // quantity
      this.quantity = castToQuantity(value); // Quantity
      return value;
    case 1703573481: // bodysite
      this.getBodysite().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -451233221: // factorOverride
      this.factorOverride = castToDecimal(value); // DecimalType
      return value;
    case -216803275: // priceOverride
      this.priceOverride = castToMoney(value); // Money
      return value;
    case -742878928: // overrideReason
      this.overrideReason = castToString(value); // StringType
      return value;
    case -1591951995: // enterer
      this.enterer = castToReference(value); // Reference
      return value;
    case 555978181: // enteredDate
      this.enteredDate = castToDateTime(value); // DateTimeType
      return value;
    case -934964668: // reason
      this.getReason().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 1984153269: // service
      this.getService().add(castToReference(value)); // Reference
      return value;
    case -309474065: // product
      this.product = castToType(value); // Type
      return value;
    case -1177318867: // account
      this.getAccount().add(castToReference(value)); // Reference
      return value;
    case 3387378: // note
      this.getNote().add(castToAnnotation(value)); // Annotation
      return value;
    case -1248768647: // supportingInformation
      this.getSupportingInformation().add(castToReference(value)); // Reference
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(castToIdentifier(value));
    } else if (name.equals("definitionUri")) {
      this.getDefinitionUri().add(castToUri(value));
    } else if (name.equals("definitionCanonical")) {
      this.getDefinitionCanonical().add(castToCanonical(value));
    } else if (name.equals("status")) {
      value = new ChargeItemStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<ChargeItemStatus>
    } else if (name.equals("partOf")) {
      this.getPartOf().add(castToReference(value));
    } else if (name.equals("code")) {
      this.code = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("subject")) {
      this.subject = castToReference(value); // Reference
    } else if (name.equals("context")) {
      this.context = castToReference(value); // Reference
    } else if (name.equals("occurrence[x]")) {
      this.occurrence = castToType(value); // Type
    } else if (name.equals("performer")) {
      this.getPerformer().add((ChargeItemPerformerComponent) value);
    } else if (name.equals("performingOrganization")) {
      this.performingOrganization = castToReference(value); // Reference
    } else if (name.equals("requestingOrganization")) {
      this.requestingOrganization = castToReference(value); // Reference
    } else if (name.equals("costCenter")) {
      this.costCenter = castToReference(value); // Reference
    } else if (name.equals("quantity")) {
      this.quantity = castToQuantity(value); // Quantity
    } else if (name.equals("bodysite")) {
      this.getBodysite().add(castToCodeableConcept(value));
    } else if (name.equals("factorOverride")) {
      this.factorOverride = castToDecimal(value); // DecimalType
    } else if (name.equals("priceOverride")) {
      this.priceOverride = castToMoney(value); // Money
    } else if (name.equals("overrideReason")) {
      this.overrideReason = castToString(value); // StringType
    } else if (name.equals("enterer")) {
      this.enterer = castToReference(value); // Reference
    } else if (name.equals("enteredDate")) {
      this.enteredDate = castToDateTime(value); // DateTimeType
    } else if (name.equals("reason")) {
      this.getReason().add(castToCodeableConcept(value));
    } else if (name.equals("service")) {
      this.getService().add(castToReference(value));
    } else if (name.equals("product[x]")) {
      this.product = castToType(value); // Type
    } else if (name.equals("account")) {
      this.getAccount().add(castToReference(value));
    } else if (name.equals("note")) {
      this.getNote().add(castToAnnotation(value));
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().add(castToReference(value));
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().remove(castToIdentifier(value));
    } else if (name.equals("definitionUri")) {
      this.getDefinitionUri().remove(castToUri(value));
    } else if (name.equals("definitionCanonical")) {
      this.getDefinitionCanonical().remove(castToCanonical(value));
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("partOf")) {
      this.getPartOf().remove(castToReference(value));
    } else if (name.equals("code")) {
      this.code = null;
    } else if (name.equals("subject")) {
      this.subject = null;
    } else if (name.equals("context")) {
      this.context = null;
    } else if (name.equals("occurrence[x]")) {
      this.occurrence = null;
    } else if (name.equals("performer")) {
      this.getPerformer().remove((ChargeItemPerformerComponent) value);
    } else if (name.equals("performingOrganization")) {
      this.performingOrganization = null;
    } else if (name.equals("requestingOrganization")) {
      this.requestingOrganization = null;
    } else if (name.equals("costCenter")) {
      this.costCenter = null;
    } else if (name.equals("quantity")) {
      this.quantity = null;
    } else if (name.equals("bodysite")) {
      this.getBodysite().remove(castToCodeableConcept(value));
    } else if (name.equals("factorOverride")) {
      this.factorOverride = null;
    } else if (name.equals("priceOverride")) {
      this.priceOverride = null;
    } else if (name.equals("overrideReason")) {
      this.overrideReason = null;
    } else if (name.equals("enterer")) {
      this.enterer = null;
    } else if (name.equals("enteredDate")) {
      this.enteredDate = null;
    } else if (name.equals("reason")) {
      this.getReason().remove(castToCodeableConcept(value));
    } else if (name.equals("service")) {
      this.getService().remove(castToReference(value));
    } else if (name.equals("product[x]")) {
      this.product = null;
    } else if (name.equals("account")) {
      this.getAccount().remove(castToReference(value));
    } else if (name.equals("note")) {
      this.getNote().remove(castToAnnotation(value));
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().remove(castToReference(value));
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case -1139428583:
      return addDefinitionUriElement();
    case 933485793:
      return addDefinitionCanonicalElement();
    case -892481550:
      return getStatusElement();
    case -995410646:
      return addPartOf();
    case 3059181:
      return getCode();
    case -1867885268:
      return getSubject();
    case 951530927:
      return getContext();
    case -2022646513:
      return getOccurrence();
    case 1687874001:
      return getOccurrence();
    case 481140686:
      return addPerformer();
    case 1273192628:
      return getPerformingOrganization();
    case 1279054790:
      return getRequestingOrganization();
    case -593192318:
      return getCostCenter();
    case -1285004149:
      return getQuantity();
    case 1703573481:
      return addBodysite();
    case -451233221:
      return getFactorOverrideElement();
    case -216803275:
      return getPriceOverride();
    case -742878928:
      return getOverrideReasonElement();
    case -1591951995:
      return getEnterer();
    case 555978181:
      return getEnteredDateElement();
    case -934964668:
      return addReason();
    case 1984153269:
      return addService();
    case 1753005361:
      return getProduct();
    case -309474065:
      return getProduct();
    case -1177318867:
      return addAccount();
    case 3387378:
      return addNote();
    case -1248768647:
      return addSupportingInformation();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case -1139428583:
      /* definitionUri */ return new String[] { "uri" };
    case 933485793:
      /* definitionCanonical */ return new String[] { "canonical" };
    case -892481550:
      /* status */ return new String[] { "code" };
    case -995410646:
      /* partOf */ return new String[] { "Reference" };
    case 3059181:
      /* code */ return new String[] { "CodeableConcept" };
    case -1867885268:
      /* subject */ return new String[] { "Reference" };
    case 951530927:
      /* context */ return new String[] { "Reference" };
    case 1687874001:
      /* occurrence */ return new String[] { "dateTime", "Period", "Timing" };
    case 481140686:
      /* performer */ return new String[] {};
    case 1273192628:
      /* performingOrganization */ return new String[] { "Reference" };
    case 1279054790:
      /* requestingOrganization */ return new String[] { "Reference" };
    case -593192318:
      /* costCenter */ return new String[] { "Reference" };
    case -1285004149:
      /* quantity */ return new String[] { "Quantity" };
    case 1703573481:
      /* bodysite */ return new String[] { "CodeableConcept" };
    case -451233221:
      /* factorOverride */ return new String[] { "decimal" };
    case -216803275:
      /* priceOverride */ return new String[] { "Money" };
    case -742878928:
      /* overrideReason */ return new String[] { "string" };
    case -1591951995:
      /* enterer */ return new String[] { "Reference" };
    case 555978181:
      /* enteredDate */ return new String[] { "dateTime" };
    case -934964668:
      /* reason */ return new String[] { "CodeableConcept" };
    case 1984153269:
      /* service */ return new String[] { "Reference" };
    case -309474065:
      /* product */ return new String[] { "Reference", "CodeableConcept" };
    case -1177318867:
      /* account */ return new String[] { "Reference" };
    case 3387378:
      /* note */ return new String[] { "Annotation" };
    case -1248768647:
      /* supportingInformation */ return new String[] { "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("definitionUri")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.definitionUri");
    } else if (name.equals("definitionCanonical")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.definitionCanonical");
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.status");
    } else if (name.equals("partOf")) {
      return addPartOf();
    } else if (name.equals("code")) {
      this.code = new CodeableConcept();
      return this.code;
    } else if (name.equals("subject")) {
      this.subject = new Reference();
      return this.subject;
    } else if (name.equals("context")) {
      this.context = new Reference();
      return this.context;
    } else if (name.equals("occurrenceDateTime")) {
      this.occurrence = new DateTimeType();
      return this.occurrence;
    } else if (name.equals("occurrencePeriod")) {
      this.occurrence = new Period();
      return this.occurrence;
    } else if (name.equals("occurrenceTiming")) {
      this.occurrence = new Timing();
      return this.occurrence;
    } else if (name.equals("performer")) {
      return addPerformer();
    } else if (name.equals("performingOrganization")) {
      this.performingOrganization = new Reference();
      return this.performingOrganization;
    } else if (name.equals("requestingOrganization")) {
      this.requestingOrganization = new Reference();
      return this.requestingOrganization;
    } else if (name.equals("costCenter")) {
      this.costCenter = new Reference();
      return this.costCenter;
    } else if (name.equals("quantity")) {
      this.quantity = new Quantity();
      return this.quantity;
    } else if (name.equals("bodysite")) {
      return addBodysite();
    } else if (name.equals("factorOverride")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.factorOverride");
    } else if (name.equals("priceOverride")) {
      this.priceOverride = new Money();
      return this.priceOverride;
    } else if (name.equals("overrideReason")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.overrideReason");
    } else if (name.equals("enterer")) {
      this.enterer = new Reference();
      return this.enterer;
    } else if (name.equals("enteredDate")) {
      throw new FHIRException("Cannot call addChild on a singleton property ChargeItem.enteredDate");
    } else if (name.equals("reason")) {
      return addReason();
    } else if (name.equals("service")) {
      return addService();
    } else if (name.equals("productReference")) {
      this.product = new Reference();
      return this.product;
    } else if (name.equals("productCodeableConcept")) {
      this.product = new CodeableConcept();
      return this.product;
    } else if (name.equals("account")) {
      return addAccount();
    } else if (name.equals("note")) {
      return addNote();
    } else if (name.equals("supportingInformation")) {
      return addSupportingInformation();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "ChargeItem";

  }

  public ChargeItem copy() {
    ChargeItem dst = new ChargeItem();
    copyValues(dst);
    return dst;
  }

  public void copyValues(ChargeItem dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    if (definitionUri != null) {
      dst.definitionUri = new ArrayList<UriType>();
      for (UriType i : definitionUri)
        dst.definitionUri.add(i.copy());
    }
    ;
    if (definitionCanonical != null) {
      dst.definitionCanonical = new ArrayList<CanonicalType>();
      for (CanonicalType i : definitionCanonical)
        dst.definitionCanonical.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    if (partOf != null) {
      dst.partOf = new ArrayList<Reference>();
      for (Reference i : partOf)
        dst.partOf.add(i.copy());
    }
    ;
    dst.code = code == null ? null : code.copy();
    dst.subject = subject == null ? null : subject.copy();
    dst.context = context == null ? null : context.copy();
    dst.occurrence = occurrence == null ? null : occurrence.copy();
    if (performer != null) {
      dst.performer = new ArrayList<ChargeItemPerformerComponent>();
      for (ChargeItemPerformerComponent i : performer)
        dst.performer.add(i.copy());
    }
    ;
    dst.performingOrganization = performingOrganization == null ? null : performingOrganization.copy();
    dst.requestingOrganization = requestingOrganization == null ? null : requestingOrganization.copy();
    dst.costCenter = costCenter == null ? null : costCenter.copy();
    dst.quantity = quantity == null ? null : quantity.copy();
    if (bodysite != null) {
      dst.bodysite = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : bodysite)
        dst.bodysite.add(i.copy());
    }
    ;
    dst.factorOverride = factorOverride == null ? null : factorOverride.copy();
    dst.priceOverride = priceOverride == null ? null : priceOverride.copy();
    dst.overrideReason = overrideReason == null ? null : overrideReason.copy();
    dst.enterer = enterer == null ? null : enterer.copy();
    dst.enteredDate = enteredDate == null ? null : enteredDate.copy();
    if (reason != null) {
      dst.reason = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : reason)
        dst.reason.add(i.copy());
    }
    ;
    if (service != null) {
      dst.service = new ArrayList<Reference>();
      for (Reference i : service)
        dst.service.add(i.copy());
    }
    ;
    dst.product = product == null ? null : product.copy();
    if (account != null) {
      dst.account = new ArrayList<Reference>();
      for (Reference i : account)
        dst.account.add(i.copy());
    }
    ;
    if (note != null) {
      dst.note = new ArrayList<Annotation>();
      for (Annotation i : note)
        dst.note.add(i.copy());
    }
    ;
    if (supportingInformation != null) {
      dst.supportingInformation = new ArrayList<Reference>();
      for (Reference i : supportingInformation)
        dst.supportingInformation.add(i.copy());
    }
    ;
  }

  protected ChargeItem typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof ChargeItem))
      return false;
    ChargeItem o = (ChargeItem) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(definitionUri, o.definitionUri, true)
        && compareDeep(definitionCanonical, o.definitionCanonical, true) && compareDeep(status, o.status, true)
        && compareDeep(partOf, o.partOf, true) && compareDeep(code, o.code, true)
        && compareDeep(subject, o.subject, true) && compareDeep(context, o.context, true)
        && compareDeep(occurrence, o.occurrence, true) && compareDeep(performer, o.performer, true)
        && compareDeep(performingOrganization, o.performingOrganization, true)
        && compareDeep(requestingOrganization, o.requestingOrganization, true)
        && compareDeep(costCenter, o.costCenter, true) && compareDeep(quantity, o.quantity, true)
        && compareDeep(bodysite, o.bodysite, true) && compareDeep(factorOverride, o.factorOverride, true)
        && compareDeep(priceOverride, o.priceOverride, true) && compareDeep(overrideReason, o.overrideReason, true)
        && compareDeep(enterer, o.enterer, true) && compareDeep(enteredDate, o.enteredDate, true)
        && compareDeep(reason, o.reason, true) && compareDeep(service, o.service, true)
        && compareDeep(product, o.product, true) && compareDeep(account, o.account, true)
        && compareDeep(note, o.note, true) && compareDeep(supportingInformation, o.supportingInformation, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof ChargeItem))
      return false;
    ChargeItem o = (ChargeItem) other_;
    return compareValues(definitionUri, o.definitionUri, true) && compareValues(status, o.status, true)
        && compareValues(factorOverride, o.factorOverride, true)
        && compareValues(overrideReason, o.overrideReason, true) && compareValues(enteredDate, o.enteredDate, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, definitionUri, definitionCanonical,
        status, partOf, code, subject, context, occurrence, performer, performingOrganization, requestingOrganization,
        costCenter, quantity, bodysite, factorOverride, priceOverride, overrideReason, enterer, enteredDate, reason,
        service, product, account, note, supportingInformation);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ChargeItem;
  }

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Business Identifier for item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "ChargeItem.identifier", description = "Business Identifier for item", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Business Identifier for item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>performing-organization</b>
   * <p>
   * Description: <b>Organization providing the charged service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.performingOrganization</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "performing-organization", path = "ChargeItem.performingOrganization", description = "Organization providing the charged service", type = "reference", target = {
      Organization.class })
  public static final String SP_PERFORMING_ORGANIZATION = "performing-organization";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>performing-organization</b>
   * <p>
   * Description: <b>Organization providing the charged service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.performingOrganization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PERFORMING_ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PERFORMING_ORGANIZATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:performing-organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PERFORMING_ORGANIZATION = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:performing-organization").toLocked();

  /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>A code that identifies the charge, like a billing
   * code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "code", path = "ChargeItem.code", description = "A code that identifies the charge, like a billing code", type = "token")
  public static final String SP_CODE = "code";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>A code that identifies the charge, like a billing
   * code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CODE);

  /**
   * Search parameter: <b>quantity</b>
   * <p>
   * Description: <b>Quantity of which the charge item has been serviced</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ChargeItem.quantity</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "quantity", path = "ChargeItem.quantity", description = "Quantity of which the charge item has been serviced", type = "quantity")
  public static final String SP_QUANTITY = "quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>quantity</b>
   * <p>
   * Description: <b>Quantity of which the charge item has been serviced</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ChargeItem.quantity</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(
      SP_QUANTITY);

  /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Individual service was done for/to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "subject", path = "ChargeItem.subject", description = "Individual service was done for/to", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient") }, target = { Group.class, Patient.class })
  public static final String SP_SUBJECT = "subject";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Individual service was done for/to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SUBJECT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:subject").toLocked();

  /**
   * Search parameter: <b>occurrence</b>
   * <p>
   * Description: <b>When the charged service was applied</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ChargeItem.occurrence[x]</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "occurrence", path = "ChargeItem.occurrence", description = "When the charged service was applied", type = "date")
  public static final String SP_OCCURRENCE = "occurrence";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>occurrence</b>
   * <p>
   * Description: <b>When the charged service was applied</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ChargeItem.occurrence[x]</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam OCCURRENCE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_OCCURRENCE);

  /**
   * Search parameter: <b>entered-date</b>
   * <p>
   * Description: <b>Date the charge item was entered</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ChargeItem.enteredDate</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "entered-date", path = "ChargeItem.enteredDate", description = "Date the charge item was entered", type = "date")
  public static final String SP_ENTERED_DATE = "entered-date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>entered-date</b>
   * <p>
   * Description: <b>Date the charge item was entered</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ChargeItem.enteredDate</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam ENTERED_DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_ENTERED_DATE);

  /**
   * Search parameter: <b>performer-function</b>
   * <p>
   * Description: <b>What type of performance was done</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.performer.function</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "performer-function", path = "ChargeItem.performer.function", description = "What type of performance was done", type = "token")
  public static final String SP_PERFORMER_FUNCTION = "performer-function";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>performer-function</b>
   * <p>
   * Description: <b>What type of performance was done</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ChargeItem.performer.function</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PERFORMER_FUNCTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_PERFORMER_FUNCTION);

  /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Individual service was done for/to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "patient", path = "ChargeItem.subject.where(resolve() is Patient)", description = "Individual service was done for/to", type = "reference", target = {
      Patient.class })
  public static final String SP_PATIENT = "patient";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Individual service was done for/to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PATIENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:patient").toLocked();

  /**
   * Search parameter: <b>factor-override</b>
   * <p>
   * Description: <b>Factor overriding the associated rules</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ChargeItem.factorOverride</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "factor-override", path = "ChargeItem.factorOverride", description = "Factor overriding the associated rules", type = "number")
  public static final String SP_FACTOR_OVERRIDE = "factor-override";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>factor-override</b>
   * <p>
   * Description: <b>Factor overriding the associated rules</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ChargeItem.factorOverride</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam FACTOR_OVERRIDE = new ca.uhn.fhir.rest.gclient.NumberClientParam(
      SP_FACTOR_OVERRIDE);

  /**
   * Search parameter: <b>service</b>
   * <p>
   * Description: <b>Which rendered service is being charged?</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.service</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "service", path = "ChargeItem.service", description = "Which rendered service is being charged?", type = "reference", target = {
      DiagnosticReport.class, ImagingStudy.class, Immunization.class, MedicationAdministration.class,
      MedicationDispense.class, Observation.class, Procedure.class, SupplyDelivery.class })
  public static final String SP_SERVICE = "service";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>service</b>
   * <p>
   * Description: <b>Which rendered service is being charged?</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.service</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SERVICE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SERVICE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:service</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SERVICE = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:service").toLocked();

  /**
   * Search parameter: <b>price-override</b>
   * <p>
   * Description: <b>Price overriding the associated rules</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ChargeItem.priceOverride</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "price-override", path = "ChargeItem.priceOverride", description = "Price overriding the associated rules", type = "quantity")
  public static final String SP_PRICE_OVERRIDE = "price-override";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>price-override</b>
   * <p>
   * Description: <b>Price overriding the associated rules</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ChargeItem.priceOverride</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam PRICE_OVERRIDE = new ca.uhn.fhir.rest.gclient.QuantityClientParam(
      SP_PRICE_OVERRIDE);

  /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>Encounter / Episode associated with event</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.context</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context", path = "ChargeItem.context", description = "Encounter / Episode associated with event", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Encounter") }, target = { Encounter.class,
          EpisodeOfCare.class })
  public static final String SP_CONTEXT = "context";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>Encounter / Episode associated with event</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.context</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_CONTEXT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:context</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_CONTEXT = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:context").toLocked();

  /**
   * Search parameter: <b>enterer</b>
   * <p>
   * Description: <b>Individual who was entering</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.enterer</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "enterer", path = "ChargeItem.enterer", description = "Individual who was entering", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Device"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Practitioner"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "RelatedPerson") }, target = { Device.class,
          Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class })
  public static final String SP_ENTERER = "enterer";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>enterer</b>
   * <p>
   * Description: <b>Individual who was entering</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.enterer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENTERER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ENTERER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:enterer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENTERER = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:enterer").toLocked();

  /**
   * Search parameter: <b>performer-actor</b>
   * <p>
   * Description: <b>Individual who was performing</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.performer.actor</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "performer-actor", path = "ChargeItem.performer.actor", description = "Individual who was performing", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Device"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Practitioner"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "RelatedPerson") }, target = { CareTeam.class, Device.class,
          Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class })
  public static final String SP_PERFORMER_ACTOR = "performer-actor";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>performer-actor</b>
   * <p>
   * Description: <b>Individual who was performing</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.performer.actor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PERFORMER_ACTOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PERFORMER_ACTOR);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:performer-actor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PERFORMER_ACTOR = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:performer-actor").toLocked();

  /**
   * Search parameter: <b>account</b>
   * <p>
   * Description: <b>Account to place this charge</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.account</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "account", path = "ChargeItem.account", description = "Account to place this charge", type = "reference", target = {
      Account.class })
  public static final String SP_ACCOUNT = "account";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>account</b>
   * <p>
   * Description: <b>Account to place this charge</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.account</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ACCOUNT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ACCOUNT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:account</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ACCOUNT = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:account").toLocked();

  /**
   * Search parameter: <b>requesting-organization</b>
   * <p>
   * Description: <b>Organization requesting the charged service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.requestingOrganization</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "requesting-organization", path = "ChargeItem.requestingOrganization", description = "Organization requesting the charged service", type = "reference", target = {
      Organization.class })
  public static final String SP_REQUESTING_ORGANIZATION = "requesting-organization";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>requesting-organization</b>
   * <p>
   * Description: <b>Organization requesting the charged service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ChargeItem.requestingOrganization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUESTING_ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_REQUESTING_ORGANIZATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ChargeItem:requesting-organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUESTING_ORGANIZATION = new ca.uhn.fhir.model.api.Include(
      "ChargeItem:requesting-organization").toLocked();

}
