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
 * Financial instrument which may be used to reimburse or pay for health care
 * products and services. Includes both insurance and self-payment.
 */
@ResourceDef(name = "Coverage", profile = "http://hl7.org/fhir/StructureDefinition/Coverage")
public class Coverage extends DomainResource {

  public enum CoverageStatus {
    /**
     * The instance is currently in-force.
     */
    ACTIVE,
    /**
     * The instance is withdrawn, rescinded or reversed.
     */
    CANCELLED,
    /**
     * A new instance the contents of which is not complete.
     */
    DRAFT,
    /**
     * The instance was entered in error.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static CoverageStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("active".equals(codeString))
        return ACTIVE;
      if ("cancelled".equals(codeString))
        return CANCELLED;
      if ("draft".equals(codeString))
        return DRAFT;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown CoverageStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ACTIVE:
        return "active";
      case CANCELLED:
        return "cancelled";
      case DRAFT:
        return "draft";
      case ENTEREDINERROR:
        return "entered-in-error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ACTIVE:
        return "http://hl7.org/fhir/fm-status";
      case CANCELLED:
        return "http://hl7.org/fhir/fm-status";
      case DRAFT:
        return "http://hl7.org/fhir/fm-status";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/fm-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ACTIVE:
        return "The instance is currently in-force.";
      case CANCELLED:
        return "The instance is withdrawn, rescinded or reversed.";
      case DRAFT:
        return "A new instance the contents of which is not complete.";
      case ENTEREDINERROR:
        return "The instance was entered in error.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ACTIVE:
        return "Active";
      case CANCELLED:
        return "Cancelled";
      case DRAFT:
        return "Draft";
      case ENTEREDINERROR:
        return "Entered in Error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class CoverageStatusEnumFactory implements EnumFactory<CoverageStatus> {
    public CoverageStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("active".equals(codeString))
        return CoverageStatus.ACTIVE;
      if ("cancelled".equals(codeString))
        return CoverageStatus.CANCELLED;
      if ("draft".equals(codeString))
        return CoverageStatus.DRAFT;
      if ("entered-in-error".equals(codeString))
        return CoverageStatus.ENTEREDINERROR;
      throw new IllegalArgumentException("Unknown CoverageStatus code '" + codeString + "'");
    }

    public Enumeration<CoverageStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<CoverageStatus>(this, CoverageStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<CoverageStatus>(this, CoverageStatus.NULL, code);
      if ("active".equals(codeString))
        return new Enumeration<CoverageStatus>(this, CoverageStatus.ACTIVE, code);
      if ("cancelled".equals(codeString))
        return new Enumeration<CoverageStatus>(this, CoverageStatus.CANCELLED, code);
      if ("draft".equals(codeString))
        return new Enumeration<CoverageStatus>(this, CoverageStatus.DRAFT, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<CoverageStatus>(this, CoverageStatus.ENTEREDINERROR, code);
      throw new FHIRException("Unknown CoverageStatus code '" + codeString + "'");
    }

    public String toCode(CoverageStatus code) {
       if (code == CoverageStatus.NULL)
           return null;
       if (code == CoverageStatus.ACTIVE)
        return "active";
      if (code == CoverageStatus.CANCELLED)
        return "cancelled";
      if (code == CoverageStatus.DRAFT)
        return "draft";
      if (code == CoverageStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
   }

    public String toSystem(CoverageStatus code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class ClassComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The type of classification for which an insurer-specific class label or
     * number and optional name is provided, for example may be used to identify a
     * class of coverage or employer group, Policy, Plan.
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Type of class such as 'group' or 'plan'", formalDefinition = "The type of classification for which an insurer-specific class label or number and optional name is provided, for example may be used to identify a class of coverage or employer group, Policy, Plan.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/coverage-class")
    protected CodeableConcept type;

    /**
     * The alphanumeric string value associated with the insurer issued label.
     */
    @Child(name = "value", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Value associated with the type", formalDefinition = "The alphanumeric string value associated with the insurer issued label.")
    protected StringType value;

    /**
     * A short description for the class.
     */
    @Child(name = "name", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Human readable description of the type and value", formalDefinition = "A short description for the class.")
    protected StringType name;

    private static final long serialVersionUID = -1501519769L;

    /**
     * Constructor
     */
    public ClassComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ClassComponent(CodeableConcept type, StringType value) {
      super();
      this.type = type;
      this.value = value;
    }

    /**
     * @return {@link #type} (The type of classification for which an
     *         insurer-specific class label or number and optional name is provided,
     *         for example may be used to identify a class of coverage or employer
     *         group, Policy, Plan.)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClassComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of classification for which an
     *              insurer-specific class label or number and optional name is
     *              provided, for example may be used to identify a class of
     *              coverage or employer group, Policy, Plan.)
     */
    public ClassComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #value} (The alphanumeric string value associated with the
     *         insurer issued label.). This is the underlying object with id, value
     *         and extensions. The accessor "getValue" gives direct access to the
     *         value
     */
    public StringType getValueElement() {
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClassComponent.value");
        else if (Configuration.doAutoCreate())
          this.value = new StringType(); // bb
      return this.value;
    }

    public boolean hasValueElement() {
      return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() {
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The alphanumeric string value associated with
     *              the insurer issued label.). This is the underlying object with
     *              id, value and extensions. The accessor "getValue" gives direct
     *              access to the value
     */
    public ClassComponent setValueElement(StringType value) {
      this.value = value;
      return this;
    }

    /**
     * @return The alphanumeric string value associated with the insurer issued
     *         label.
     */
    public String getValue() {
      return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The alphanumeric string value associated with the insurer issued
     *              label.
     */
    public ClassComponent setValue(String value) {
      if (this.value == null)
        this.value = new StringType();
      this.value.setValue(value);
      return this;
    }

    /**
     * @return {@link #name} (A short description for the class.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getName" gives direct access to the value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClassComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A short description for the class.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getName" gives direct access to the value
     */
    public ClassComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return A short description for the class.
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A short description for the class.
     */
    public ClassComponent setName(String value) {
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "The type of classification for which an insurer-specific class label or number and optional name is provided, for example may be used to identify a class of coverage or employer group, Policy, Plan.",
          0, 1, type));
      children.add(new Property("value", "string",
          "The alphanumeric string value associated with the insurer issued label.", 0, 1, value));
      children.add(new Property("name", "string", "A short description for the class.", 0, 1, name));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "The type of classification for which an insurer-specific class label or number and optional name is provided, for example may be used to identify a class of coverage or employer group, Policy, Plan.",
            0, 1, type);
      case 111972721:
        /* value */ return new Property("value", "string",
            "The alphanumeric string value associated with the insurer issued label.", 0, 1, value);
      case 3373707:
        /* name */ return new Property("name", "string", "A short description for the class.", 0, 1, name);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // StringType
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToCodeableConcept(value); // CodeableConcept
        return value;
      case 111972721: // value
        this.value = castToString(value); // StringType
        return value;
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("value")) {
        this.value = castToString(value); // StringType
      } else if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("value")) {
        this.value = null;
      } else if (name.equals("name")) {
        this.name = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case 111972721:
        return getValueElement();
      case 3373707:
        return getNameElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case 111972721:
        /* value */ return new String[] { "string" };
      case 3373707:
        /* name */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("value")) {
        throw new FHIRException("Cannot call addChild on a singleton property Coverage.value");
      } else if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property Coverage.name");
      } else
        return super.addChild(name);
    }

    public ClassComponent copy() {
      ClassComponent dst = new ClassComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ClassComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.value = value == null ? null : value.copy();
      dst.name = name == null ? null : name.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ClassComponent))
        return false;
      ClassComponent o = (ClassComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(value, o.value, true) && compareDeep(name, o.name, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ClassComponent))
        return false;
      ClassComponent o = (ClassComponent) other_;
      return compareValues(value, o.value, true) && compareValues(name, o.name, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value, name);
    }

    public String fhirType() {
      return "Coverage.class";

    }

  }

  @Block()
  public static class CostToBeneficiaryComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The category of patient centric costs associated with treatment.
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Cost category", formalDefinition = "The category of patient centric costs associated with treatment.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/coverage-copay-type")
    protected CodeableConcept type;

    /**
     * The amount due from the patient for the cost category.
     */
    @Child(name = "value", type = { Quantity.class,
        Money.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "The amount or percentage due from the beneficiary", formalDefinition = "The amount due from the patient for the cost category.")
    protected Type value;

    /**
     * A suite of codes indicating exceptions or reductions to patient costs and
     * their effective periods.
     */
    @Child(name = "exception", type = {}, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Exceptions for patient payments", formalDefinition = "A suite of codes indicating exceptions or reductions to patient costs and their effective periods.")
    protected List<ExemptionComponent> exception;

    private static final long serialVersionUID = -1302829059L;

    /**
     * Constructor
     */
    public CostToBeneficiaryComponent() {
      super();
    }

    /**
     * Constructor
     */
    public CostToBeneficiaryComponent(Type value) {
      super();
      this.value = value;
    }

    /**
     * @return {@link #type} (The category of patient centric costs associated with
     *         treatment.)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CostToBeneficiaryComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The category of patient centric costs associated
     *              with treatment.)
     */
    public CostToBeneficiaryComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #value} (The amount due from the patient for the cost
     *         category.)
     */
    public Type getValue() {
      return this.value;
    }

    /**
     * @return {@link #value} (The amount due from the patient for the cost
     *         category.)
     */
    public Quantity getValueQuantity() throws FHIRException {
      if (this.value == null)
        this.value = new Quantity();
      if (!(this.value instanceof Quantity))
        throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.value.getClass().getName()
            + " was encountered");
      return (Quantity) this.value;
    }

    public boolean hasValueQuantity() {
        return this.value instanceof Quantity;
    }

    /**
     * @return {@link #value} (The amount due from the patient for the cost
     *         category.)
     */
    public Money getValueMoney() throws FHIRException {
      if (this.value == null)
        this.value = new Money();
      if (!(this.value instanceof Money))
        throw new FHIRException(
            "Type mismatch: the type Money was expected, but " + this.value.getClass().getName() + " was encountered");
      return (Money) this.value;
    }

    public boolean hasValueMoney() {
        return this.value instanceof Money;
    }

    public boolean hasValue() {
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The amount due from the patient for the cost
     *              category.)
     */
    public CostToBeneficiaryComponent setValue(Type value) {
      if (value != null && !(value instanceof Quantity || value instanceof Money))
        throw new Error("Not the right type for Coverage.costToBeneficiary.value[x]: " + value.fhirType());
      this.value = value;
      return this;
    }

    /**
     * @return {@link #exception} (A suite of codes indicating exceptions or
     *         reductions to patient costs and their effective periods.)
     */
    public List<ExemptionComponent> getException() {
      if (this.exception == null)
        this.exception = new ArrayList<ExemptionComponent>();
      return this.exception;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CostToBeneficiaryComponent setException(List<ExemptionComponent> theException) {
      this.exception = theException;
      return this;
    }

    public boolean hasException() {
      if (this.exception == null)
        return false;
      for (ExemptionComponent item : this.exception)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ExemptionComponent addException() { // 3
      ExemptionComponent t = new ExemptionComponent();
      if (this.exception == null)
        this.exception = new ArrayList<ExemptionComponent>();
      this.exception.add(t);
      return t;
    }

    public CostToBeneficiaryComponent addException(ExemptionComponent t) { // 3
      if (t == null)
        return this;
      if (this.exception == null)
        this.exception = new ArrayList<ExemptionComponent>();
      this.exception.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #exception}, creating
     *         it if it does not already exist
     */
    public ExemptionComponent getExceptionFirstRep() {
      if (getException().isEmpty()) {
        addException();
      }
      return getException().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "The category of patient centric costs associated with treatment.", 0, 1, type));
      children.add(new Property("value[x]", "SimpleQuantity|Money",
          "The amount due from the patient for the cost category.", 0, 1, value));
      children.add(new Property("exception", "",
          "A suite of codes indicating exceptions or reductions to patient costs and their effective periods.", 0,
          java.lang.Integer.MAX_VALUE, exception));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "The category of patient centric costs associated with treatment.", 0, 1, type);
      case -1410166417:
        /* value[x] */ return new Property("value[x]", "SimpleQuantity|Money",
            "The amount due from the patient for the cost category.", 0, 1, value);
      case 111972721:
        /* value */ return new Property("value[x]", "SimpleQuantity|Money",
            "The amount due from the patient for the cost category.", 0, 1, value);
      case -2029823716:
        /* valueQuantity */ return new Property("value[x]", "SimpleQuantity|Money",
            "The amount due from the patient for the cost category.", 0, 1, value);
      case 2026560975:
        /* valueMoney */ return new Property("value[x]", "SimpleQuantity|Money",
            "The amount due from the patient for the cost category.", 0, 1, value);
      case 1481625679:
        /* exception */ return new Property("exception", "",
            "A suite of codes indicating exceptions or reductions to patient costs and their effective periods.", 0,
            java.lang.Integer.MAX_VALUE, exception);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // Type
      case 1481625679:
        /* exception */ return this.exception == null ? new Base[0]
            : this.exception.toArray(new Base[this.exception.size()]); // ExemptionComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToCodeableConcept(value); // CodeableConcept
        return value;
      case 111972721: // value
        this.value = castToType(value); // Type
        return value;
      case 1481625679: // exception
        this.getException().add((ExemptionComponent) value); // ExemptionComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("value[x]")) {
        this.value = castToType(value); // Type
      } else if (name.equals("exception")) {
        this.getException().add((ExemptionComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("value[x]")) {
        this.value = null;
      } else if (name.equals("exception")) {
        this.getException().remove((ExemptionComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case -1410166417:
        return getValue();
      case 111972721:
        return getValue();
      case 1481625679:
        return addException();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case 111972721:
        /* value */ return new String[] { "SimpleQuantity", "Money" };
      case 1481625679:
        /* exception */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("valueQuantity")) {
        this.value = new Quantity();
        return this.value;
      } else if (name.equals("valueMoney")) {
        this.value = new Money();
        return this.value;
      } else if (name.equals("exception")) {
        return addException();
      } else
        return super.addChild(name);
    }

    public CostToBeneficiaryComponent copy() {
      CostToBeneficiaryComponent dst = new CostToBeneficiaryComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(CostToBeneficiaryComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.value = value == null ? null : value.copy();
      if (exception != null) {
        dst.exception = new ArrayList<ExemptionComponent>();
        for (ExemptionComponent i : exception)
          dst.exception.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof CostToBeneficiaryComponent))
        return false;
      CostToBeneficiaryComponent o = (CostToBeneficiaryComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(value, o.value, true)
          && compareDeep(exception, o.exception, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof CostToBeneficiaryComponent))
        return false;
      CostToBeneficiaryComponent o = (CostToBeneficiaryComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value, exception);
    }

    public String fhirType() {
      return "Coverage.costToBeneficiary";

    }

  }

  @Block()
  public static class ExemptionComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The code for the specific exception.
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Exception category", formalDefinition = "The code for the specific exception.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/coverage-financial-exception")
    protected CodeableConcept type;

    /**
     * The timeframe during when the exception is in force.
     */
    @Child(name = "period", type = { Period.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "The effective period of the exception", formalDefinition = "The timeframe during when the exception is in force.")
    protected Period period;

    private static final long serialVersionUID = 523191991L;

    /**
     * Constructor
     */
    public ExemptionComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ExemptionComponent(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (The code for the specific exception.)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ExemptionComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The code for the specific exception.)
     */
    public ExemptionComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #period} (The timeframe during when the exception is in
     *         force.)
     */
    public Period getPeriod() {
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ExemptionComponent.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() {
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The timeframe during when the exception is in
     *              force.)
     */
    public ExemptionComponent setPeriod(Period value) {
      this.period = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept", "The code for the specific exception.", 0, 1, type));
      children
          .add(new Property("period", "Period", "The timeframe during when the exception is in force.", 0, 1, period));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept", "The code for the specific exception.", 0, 1, type);
      case -991726143:
        /* period */ return new Property("period", "Period", "The timeframe during when the exception is in force.", 0,
            1, period);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case -991726143:
        /* period */ return this.period == null ? new Base[0] : new Base[] { this.period }; // Period
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToCodeableConcept(value); // CodeableConcept
        return value;
      case -991726143: // period
        this.period = castToPeriod(value); // Period
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("period")) {
        this.period = castToPeriod(value); // Period
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("period")) {
        this.period = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case -991726143:
        return getPeriod();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case -991726143:
        /* period */ return new String[] { "Period" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("period")) {
        this.period = new Period();
        return this.period;
      } else
        return super.addChild(name);
    }

    public ExemptionComponent copy() {
      ExemptionComponent dst = new ExemptionComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ExemptionComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.period = period == null ? null : period.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ExemptionComponent))
        return false;
      ExemptionComponent o = (ExemptionComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(period, o.period, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ExemptionComponent))
        return false;
      ExemptionComponent o = (ExemptionComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, period);
    }

    public String fhirType() {
      return "Coverage.costToBeneficiary.exception";

    }

  }

  /**
   * A unique identifier assigned to this coverage.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Business Identifier for the coverage", formalDefinition = "A unique identifier assigned to this coverage.")
  protected List<Identifier> identifier;

  /**
   * The status of the resource instance.
   */
  @Child(name = "status", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "active | cancelled | draft | entered-in-error", formalDefinition = "The status of the resource instance.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/fm-status")
  protected Enumeration<CoverageStatus> status;

  /**
   * The type of coverage: social program, medical plan, accident coverage
   * (workers compensation, auto), group health or payment by an individual or
   * organization.
   */
  @Child(name = "type", type = { CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Coverage category such as medical or accident", formalDefinition = "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/coverage-type")
  protected CodeableConcept type;

  /**
   * The party who 'owns' the insurance policy.
   */
  @Child(name = "policyHolder", type = { Patient.class, RelatedPerson.class,
      Organization.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Owner of the policy", formalDefinition = "The party who 'owns' the insurance policy.")
  protected Reference policyHolder;

  /**
   * The actual object that is the target of the reference (The party who 'owns'
   * the insurance policy.)
   */
  protected Resource policyHolderTarget;

  /**
   * The party who has signed-up for or 'owns' the contractual relationship to the
   * policy or to whom the benefit of the policy for services rendered to them or
   * their family is due.
   */
  @Child(name = "subscriber", type = { Patient.class,
      RelatedPerson.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Subscriber to the policy", formalDefinition = "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.")
  protected Reference subscriber;

  /**
   * The actual object that is the target of the reference (The party who has
   * signed-up for or 'owns' the contractual relationship to the policy or to whom
   * the benefit of the policy for services rendered to them or their family is
   * due.)
   */
  protected Resource subscriberTarget;

  /**
   * The insurer assigned ID for the Subscriber.
   */
  @Child(name = "subscriberId", type = {
      StringType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "ID assigned to the subscriber", formalDefinition = "The insurer assigned ID for the Subscriber.")
  protected StringType subscriberId;

  /**
   * The party who benefits from the insurance coverage; the patient when products
   * and/or services are provided.
   */
  @Child(name = "beneficiary", type = { Patient.class }, order = 6, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Plan beneficiary", formalDefinition = "The party who benefits from the insurance coverage; the patient when products and/or services are provided.")
  protected Reference beneficiary;

  /**
   * The actual object that is the target of the reference (The party who benefits
   * from the insurance coverage; the patient when products and/or services are
   * provided.)
   */
  protected Patient beneficiaryTarget;

  /**
   * A unique identifier for a dependent under the coverage.
   */
  @Child(name = "dependent", type = { StringType.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Dependent number", formalDefinition = "A unique identifier for a dependent under the coverage.")
  protected StringType dependent;

  /**
   * The relationship of beneficiary (patient) to the subscriber.
   */
  @Child(name = "relationship", type = {
      CodeableConcept.class }, order = 8, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Beneficiary relationship to the subscriber", formalDefinition = "The relationship of beneficiary (patient) to the subscriber.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/subscriber-relationship")
  protected CodeableConcept relationship;

  /**
   * Time period during which the coverage is in force. A missing start date
   * indicates the start date isn't known, a missing end date means the coverage
   * is continuing to be in force.
   */
  @Child(name = "period", type = { Period.class }, order = 9, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Coverage start and end dates", formalDefinition = "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.")
  protected Period period;

  /**
   * The program or plan underwriter or payor including both insurance and
   * non-insurance agreements, such as patient-pay agreements.
   */
  @Child(name = "payor", type = { Organization.class, Patient.class,
      RelatedPerson.class }, order = 10, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Issuer of the policy", formalDefinition = "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.")
  protected List<Reference> payor;
  /**
   * The actual objects that are the target of the reference (The program or plan
   * underwriter or payor including both insurance and non-insurance agreements,
   * such as patient-pay agreements.)
   */
  protected List<Resource> payorTarget;

  /**
   * A suite of underwriter specific classifiers.
   */
  @Child(name = "class", type = {}, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Additional coverage classifications", formalDefinition = "A suite of underwriter specific classifiers.")
  protected List<ClassComponent> class_;

  /**
   * The order of applicability of this coverage relative to other coverages which
   * are currently in force. Note, there may be gaps in the numbering and this
   * does not imply primary, secondary etc. as the specific positioning of
   * coverages depends upon the episode of care.
   */
  @Child(name = "order", type = {
      PositiveIntType.class }, order = 12, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Relative order of the coverage", formalDefinition = "The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care.")
  protected PositiveIntType order;

  /**
   * The insurer-specific identifier for the insurer-defined network of providers
   * to which the beneficiary may seek treatment which will be covered at the
   * 'in-network' rate, otherwise 'out of network' terms and conditions apply.
   */
  @Child(name = "network", type = { StringType.class }, order = 13, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Insurer network", formalDefinition = "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.")
  protected StringType network;

  /**
   * A suite of codes indicating the cost category and associated amount which
   * have been detailed in the policy and may have been included on the health
   * card.
   */
  @Child(name = "costToBeneficiary", type = {}, order = 14, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Patient payments for services/products", formalDefinition = "A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.")
  protected List<CostToBeneficiaryComponent> costToBeneficiary;

  /**
   * When 'subrogation=true' this insurance instance has been included not for
   * adjudication but to provide insurers with the details to recover costs.
   */
  @Child(name = "subrogation", type = {
      BooleanType.class }, order = 15, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Reimbursement to insurer", formalDefinition = "When 'subrogation=true' this insurance instance has been included not for adjudication but to provide insurers with the details to recover costs.")
  protected BooleanType subrogation;

  /**
   * The policy(s) which constitute this insurance coverage.
   */
  @Child(name = "contract", type = {
      Contract.class }, order = 16, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Contract details", formalDefinition = "The policy(s) which constitute this insurance coverage.")
  protected List<Reference> contract;
  /**
   * The actual objects that are the target of the reference (The policy(s) which
   * constitute this insurance coverage.)
   */
  protected List<Contract> contractTarget;

  private static final long serialVersionUID = 212315315L;

  /**
   * Constructor
   */
  public Coverage() {
    super();
  }

  /**
   * Constructor
   */
  public Coverage(Enumeration<CoverageStatus> status, Reference beneficiary) {
    super();
    this.status = status;
    this.beneficiary = beneficiary;
  }

  /**
   * @return {@link #identifier} (A unique identifier assigned to this coverage.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Coverage setIdentifier(List<Identifier> theIdentifier) {
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

  public Coverage addIdentifier(Identifier t) { // 3
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
   * @return {@link #status} (The status of the resource instance.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getStatus" gives direct access to the value
   */
  public Enumeration<CoverageStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<CoverageStatus>(new CoverageStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The status of the resource instance.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getStatus" gives direct access to the value
   */
  public Coverage setStatusElement(Enumeration<CoverageStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return The status of the resource instance.
   */
  public CoverageStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The status of the resource instance.
   */
  public Coverage setStatus(CoverageStatus value) {
    if (this.status == null)
      this.status = new Enumeration<CoverageStatus>(new CoverageStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #type} (The type of coverage: social program, medical plan,
   *         accident coverage (workers compensation, auto), group health or
   *         payment by an individual or organization.)
   */
  public CodeableConcept getType() {
    if (this.type == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.type");
      else if (Configuration.doAutoCreate())
        this.type = new CodeableConcept(); // cc
    return this.type;
  }

  public boolean hasType() {
    return this.type != null && !this.type.isEmpty();
  }

  /**
   * @param value {@link #type} (The type of coverage: social program, medical
   *              plan, accident coverage (workers compensation, auto), group
   *              health or payment by an individual or organization.)
   */
  public Coverage setType(CodeableConcept value) {
    this.type = value;
    return this;
  }

  /**
   * @return {@link #policyHolder} (The party who 'owns' the insurance policy.)
   */
  public Reference getPolicyHolder() {
    if (this.policyHolder == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.policyHolder");
      else if (Configuration.doAutoCreate())
        this.policyHolder = new Reference(); // cc
    return this.policyHolder;
  }

  public boolean hasPolicyHolder() {
    return this.policyHolder != null && !this.policyHolder.isEmpty();
  }

  /**
   * @param value {@link #policyHolder} (The party who 'owns' the insurance
   *              policy.)
   */
  public Coverage setPolicyHolder(Reference value) {
    this.policyHolder = value;
    return this;
  }

  /**
   * @return {@link #policyHolder} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The party who 'owns'
   *         the insurance policy.)
   */
  public Resource getPolicyHolderTarget() {
    return this.policyHolderTarget;
  }

  /**
   * @param value {@link #policyHolder} The actual object that is the target of
   *              the reference. The reference library doesn't use these, but you
   *              can use it to hold the resource if you resolve it. (The party
   *              who 'owns' the insurance policy.)
   */
  public Coverage setPolicyHolderTarget(Resource value) {
    this.policyHolderTarget = value;
    return this;
  }

  /**
   * @return {@link #subscriber} (The party who has signed-up for or 'owns' the
   *         contractual relationship to the policy or to whom the benefit of the
   *         policy for services rendered to them or their family is due.)
   */
  public Reference getSubscriber() {
    if (this.subscriber == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.subscriber");
      else if (Configuration.doAutoCreate())
        this.subscriber = new Reference(); // cc
    return this.subscriber;
  }

  public boolean hasSubscriber() {
    return this.subscriber != null && !this.subscriber.isEmpty();
  }

  /**
   * @param value {@link #subscriber} (The party who has signed-up for or 'owns'
   *              the contractual relationship to the policy or to whom the
   *              benefit of the policy for services rendered to them or their
   *              family is due.)
   */
  public Coverage setSubscriber(Reference value) {
    this.subscriber = value;
    return this;
  }

  /**
   * @return {@link #subscriber} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The party who has
   *         signed-up for or 'owns' the contractual relationship to the policy or
   *         to whom the benefit of the policy for services rendered to them or
   *         their family is due.)
   */
  public Resource getSubscriberTarget() {
    return this.subscriberTarget;
  }

  /**
   * @param value {@link #subscriber} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The party who
   *              has signed-up for or 'owns' the contractual relationship to the
   *              policy or to whom the benefit of the policy for services
   *              rendered to them or their family is due.)
   */
  public Coverage setSubscriberTarget(Resource value) {
    this.subscriberTarget = value;
    return this;
  }

  /**
   * @return {@link #subscriberId} (The insurer assigned ID for the Subscriber.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getSubscriberId" gives direct access to the value
   */
  public StringType getSubscriberIdElement() {
    if (this.subscriberId == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.subscriberId");
      else if (Configuration.doAutoCreate())
        this.subscriberId = new StringType(); // bb
    return this.subscriberId;
  }

  public boolean hasSubscriberIdElement() {
    return this.subscriberId != null && !this.subscriberId.isEmpty();
  }

  public boolean hasSubscriberId() {
    return this.subscriberId != null && !this.subscriberId.isEmpty();
  }

  /**
   * @param value {@link #subscriberId} (The insurer assigned ID for the
   *              Subscriber.). This is the underlying object with id, value and
   *              extensions. The accessor "getSubscriberId" gives direct access
   *              to the value
   */
  public Coverage setSubscriberIdElement(StringType value) {
    this.subscriberId = value;
    return this;
  }

  /**
   * @return The insurer assigned ID for the Subscriber.
   */
  public String getSubscriberId() {
    return this.subscriberId == null ? null : this.subscriberId.getValue();
  }

  /**
   * @param value The insurer assigned ID for the Subscriber.
   */
  public Coverage setSubscriberId(String value) {
    if (Utilities.noString(value))
      this.subscriberId = null;
    else {
      if (this.subscriberId == null)
        this.subscriberId = new StringType();
      this.subscriberId.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #beneficiary} (The party who benefits from the insurance
   *         coverage; the patient when products and/or services are provided.)
   */
  public Reference getBeneficiary() {
    if (this.beneficiary == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.beneficiary");
      else if (Configuration.doAutoCreate())
        this.beneficiary = new Reference(); // cc
    return this.beneficiary;
  }

  public boolean hasBeneficiary() {
    return this.beneficiary != null && !this.beneficiary.isEmpty();
  }

  /**
   * @param value {@link #beneficiary} (The party who benefits from the insurance
   *              coverage; the patient when products and/or services are
   *              provided.)
   */
  public Coverage setBeneficiary(Reference value) {
    this.beneficiary = value;
    return this;
  }

  /**
   * @return {@link #beneficiary} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The party who
   *         benefits from the insurance coverage; the patient when products
   *         and/or services are provided.)
   */
  public Patient getBeneficiaryTarget() {
    if (this.beneficiaryTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.beneficiary");
      else if (Configuration.doAutoCreate())
        this.beneficiaryTarget = new Patient(); // aa
    return this.beneficiaryTarget;
  }

  /**
   * @param value {@link #beneficiary} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The party who
   *              benefits from the insurance coverage; the patient when products
   *              and/or services are provided.)
   */
  public Coverage setBeneficiaryTarget(Patient value) {
    this.beneficiaryTarget = value;
    return this;
  }

  /**
   * @return {@link #dependent} (A unique identifier for a dependent under the
   *         coverage.). This is the underlying object with id, value and
   *         extensions. The accessor "getDependent" gives direct access to the
   *         value
   */
  public StringType getDependentElement() {
    if (this.dependent == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.dependent");
      else if (Configuration.doAutoCreate())
        this.dependent = new StringType(); // bb
    return this.dependent;
  }

  public boolean hasDependentElement() {
    return this.dependent != null && !this.dependent.isEmpty();
  }

  public boolean hasDependent() {
    return this.dependent != null && !this.dependent.isEmpty();
  }

  /**
   * @param value {@link #dependent} (A unique identifier for a dependent under
   *              the coverage.). This is the underlying object with id, value and
   *              extensions. The accessor "getDependent" gives direct access to
   *              the value
   */
  public Coverage setDependentElement(StringType value) {
    this.dependent = value;
    return this;
  }

  /**
   * @return A unique identifier for a dependent under the coverage.
   */
  public String getDependent() {
    return this.dependent == null ? null : this.dependent.getValue();
  }

  /**
   * @param value A unique identifier for a dependent under the coverage.
   */
  public Coverage setDependent(String value) {
    if (Utilities.noString(value))
      this.dependent = null;
    else {
      if (this.dependent == null)
        this.dependent = new StringType();
      this.dependent.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #relationship} (The relationship of beneficiary (patient) to
   *         the subscriber.)
   */
  public CodeableConcept getRelationship() {
    if (this.relationship == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.relationship");
      else if (Configuration.doAutoCreate())
        this.relationship = new CodeableConcept(); // cc
    return this.relationship;
  }

  public boolean hasRelationship() {
    return this.relationship != null && !this.relationship.isEmpty();
  }

  /**
   * @param value {@link #relationship} (The relationship of beneficiary (patient)
   *              to the subscriber.)
   */
  public Coverage setRelationship(CodeableConcept value) {
    this.relationship = value;
    return this;
  }

  /**
   * @return {@link #period} (Time period during which the coverage is in force. A
   *         missing start date indicates the start date isn't known, a missing
   *         end date means the coverage is continuing to be in force.)
   */
  public Period getPeriod() {
    if (this.period == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.period");
      else if (Configuration.doAutoCreate())
        this.period = new Period(); // cc
    return this.period;
  }

  public boolean hasPeriod() {
    return this.period != null && !this.period.isEmpty();
  }

  /**
   * @param value {@link #period} (Time period during which the coverage is in
   *              force. A missing start date indicates the start date isn't
   *              known, a missing end date means the coverage is continuing to be
   *              in force.)
   */
  public Coverage setPeriod(Period value) {
    this.period = value;
    return this;
  }

  /**
   * @return {@link #payor} (The program or plan underwriter or payor including
   *         both insurance and non-insurance agreements, such as patient-pay
   *         agreements.)
   */
  public List<Reference> getPayor() {
    if (this.payor == null)
      this.payor = new ArrayList<Reference>();
    return this.payor;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Coverage setPayor(List<Reference> thePayor) {
    this.payor = thePayor;
    return this;
  }

  public boolean hasPayor() {
    if (this.payor == null)
      return false;
    for (Reference item : this.payor)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addPayor() { // 3
    Reference t = new Reference();
    if (this.payor == null)
      this.payor = new ArrayList<Reference>();
    this.payor.add(t);
    return t;
  }

  public Coverage addPayor(Reference t) { // 3
    if (t == null)
      return this;
    if (this.payor == null)
      this.payor = new ArrayList<Reference>();
    this.payor.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #payor}, creating it
   *         if it does not already exist
   */
  public Reference getPayorFirstRep() {
    if (getPayor().isEmpty()) {
      addPayor();
    }
    return getPayor().get(0);
  }

  /**
   * @return {@link #class_} (A suite of underwriter specific classifiers.)
   */
  public List<ClassComponent> getClass_() {
    if (this.class_ == null)
      this.class_ = new ArrayList<ClassComponent>();
    return this.class_;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Coverage setClass_(List<ClassComponent> theClass_) {
    this.class_ = theClass_;
    return this;
  }

  public boolean hasClass_() {
    if (this.class_ == null)
      return false;
    for (ClassComponent item : this.class_)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ClassComponent addClass_() { // 3
    ClassComponent t = new ClassComponent();
    if (this.class_ == null)
      this.class_ = new ArrayList<ClassComponent>();
    this.class_.add(t);
    return t;
  }

  public Coverage addClass_(ClassComponent t) { // 3
    if (t == null)
      return this;
    if (this.class_ == null)
      this.class_ = new ArrayList<ClassComponent>();
    this.class_.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #class_}, creating it
   *         if it does not already exist
   */
  public ClassComponent getClass_FirstRep() {
    if (getClass_().isEmpty()) {
      addClass_();
    }
    return getClass_().get(0);
  }

  /**
   * @return {@link #order} (The order of applicability of this coverage relative
   *         to other coverages which are currently in force. Note, there may be
   *         gaps in the numbering and this does not imply primary, secondary etc.
   *         as the specific positioning of coverages depends upon the episode of
   *         care.). This is the underlying object with id, value and extensions.
   *         The accessor "getOrder" gives direct access to the value
   */
  public PositiveIntType getOrderElement() {
    if (this.order == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.order");
      else if (Configuration.doAutoCreate())
        this.order = new PositiveIntType(); // bb
    return this.order;
  }

  public boolean hasOrderElement() {
    return this.order != null && !this.order.isEmpty();
  }

  public boolean hasOrder() {
    return this.order != null && !this.order.isEmpty();
  }

  /**
   * @param value {@link #order} (The order of applicability of this coverage
   *              relative to other coverages which are currently in force. Note,
   *              there may be gaps in the numbering and this does not imply
   *              primary, secondary etc. as the specific positioning of coverages
   *              depends upon the episode of care.). This is the underlying
   *              object with id, value and extensions. The accessor "getOrder"
   *              gives direct access to the value
   */
  public Coverage setOrderElement(PositiveIntType value) {
    this.order = value;
    return this;
  }

  /**
   * @return The order of applicability of this coverage relative to other
   *         coverages which are currently in force. Note, there may be gaps in
   *         the numbering and this does not imply primary, secondary etc. as the
   *         specific positioning of coverages depends upon the episode of care.
   */
  public int getOrder() {
    return this.order == null || this.order.isEmpty() ? 0 : this.order.getValue();
  }

  /**
   * @param value The order of applicability of this coverage relative to other
   *              coverages which are currently in force. Note, there may be gaps
   *              in the numbering and this does not imply primary, secondary etc.
   *              as the specific positioning of coverages depends upon the
   *              episode of care.
   */
  public Coverage setOrder(int value) {
    if (this.order == null)
      this.order = new PositiveIntType();
    this.order.setValue(value);
    return this;
  }

  /**
   * @return {@link #network} (The insurer-specific identifier for the
   *         insurer-defined network of providers to which the beneficiary may
   *         seek treatment which will be covered at the 'in-network' rate,
   *         otherwise 'out of network' terms and conditions apply.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getNetwork" gives direct access to the value
   */
  public StringType getNetworkElement() {
    if (this.network == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.network");
      else if (Configuration.doAutoCreate())
        this.network = new StringType(); // bb
    return this.network;
  }

  public boolean hasNetworkElement() {
    return this.network != null && !this.network.isEmpty();
  }

  public boolean hasNetwork() {
    return this.network != null && !this.network.isEmpty();
  }

  /**
   * @param value {@link #network} (The insurer-specific identifier for the
   *              insurer-defined network of providers to which the beneficiary
   *              may seek treatment which will be covered at the 'in-network'
   *              rate, otherwise 'out of network' terms and conditions apply.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getNetwork" gives direct access to the value
   */
  public Coverage setNetworkElement(StringType value) {
    this.network = value;
    return this;
  }

  /**
   * @return The insurer-specific identifier for the insurer-defined network of
   *         providers to which the beneficiary may seek treatment which will be
   *         covered at the 'in-network' rate, otherwise 'out of network' terms
   *         and conditions apply.
   */
  public String getNetwork() {
    return this.network == null ? null : this.network.getValue();
  }

  /**
   * @param value The insurer-specific identifier for the insurer-defined network
   *              of providers to which the beneficiary may seek treatment which
   *              will be covered at the 'in-network' rate, otherwise 'out of
   *              network' terms and conditions apply.
   */
  public Coverage setNetwork(String value) {
    if (Utilities.noString(value))
      this.network = null;
    else {
      if (this.network == null)
        this.network = new StringType();
      this.network.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #costToBeneficiary} (A suite of codes indicating the cost
   *         category and associated amount which have been detailed in the policy
   *         and may have been included on the health card.)
   */
  public List<CostToBeneficiaryComponent> getCostToBeneficiary() {
    if (this.costToBeneficiary == null)
      this.costToBeneficiary = new ArrayList<CostToBeneficiaryComponent>();
    return this.costToBeneficiary;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Coverage setCostToBeneficiary(List<CostToBeneficiaryComponent> theCostToBeneficiary) {
    this.costToBeneficiary = theCostToBeneficiary;
    return this;
  }

  public boolean hasCostToBeneficiary() {
    if (this.costToBeneficiary == null)
      return false;
    for (CostToBeneficiaryComponent item : this.costToBeneficiary)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CostToBeneficiaryComponent addCostToBeneficiary() { // 3
    CostToBeneficiaryComponent t = new CostToBeneficiaryComponent();
    if (this.costToBeneficiary == null)
      this.costToBeneficiary = new ArrayList<CostToBeneficiaryComponent>();
    this.costToBeneficiary.add(t);
    return t;
  }

  public Coverage addCostToBeneficiary(CostToBeneficiaryComponent t) { // 3
    if (t == null)
      return this;
    if (this.costToBeneficiary == null)
      this.costToBeneficiary = new ArrayList<CostToBeneficiaryComponent>();
    this.costToBeneficiary.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #costToBeneficiary},
   *         creating it if it does not already exist
   */
  public CostToBeneficiaryComponent getCostToBeneficiaryFirstRep() {
    if (getCostToBeneficiary().isEmpty()) {
      addCostToBeneficiary();
    }
    return getCostToBeneficiary().get(0);
  }

  /**
   * @return {@link #subrogation} (When 'subrogation=true' this insurance instance
   *         has been included not for adjudication but to provide insurers with
   *         the details to recover costs.). This is the underlying object with
   *         id, value and extensions. The accessor "getSubrogation" gives direct
   *         access to the value
   */
  public BooleanType getSubrogationElement() {
    if (this.subrogation == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create Coverage.subrogation");
      else if (Configuration.doAutoCreate())
        this.subrogation = new BooleanType(); // bb
    return this.subrogation;
  }

  public boolean hasSubrogationElement() {
    return this.subrogation != null && !this.subrogation.isEmpty();
  }

  public boolean hasSubrogation() {
    return this.subrogation != null && !this.subrogation.isEmpty();
  }

  /**
   * @param value {@link #subrogation} (When 'subrogation=true' this insurance
   *              instance has been included not for adjudication but to provide
   *              insurers with the details to recover costs.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getSubrogation" gives direct access to the value
   */
  public Coverage setSubrogationElement(BooleanType value) {
    this.subrogation = value;
    return this;
  }

  /**
   * @return When 'subrogation=true' this insurance instance has been included not
   *         for adjudication but to provide insurers with the details to recover
   *         costs.
   */
  public boolean getSubrogation() {
    return this.subrogation == null || this.subrogation.isEmpty() ? false : this.subrogation.getValue();
  }

  /**
   * @param value When 'subrogation=true' this insurance instance has been
   *              included not for adjudication but to provide insurers with the
   *              details to recover costs.
   */
  public Coverage setSubrogation(boolean value) {
    if (this.subrogation == null)
      this.subrogation = new BooleanType();
    this.subrogation.setValue(value);
    return this;
  }

  /**
   * @return {@link #contract} (The policy(s) which constitute this insurance
   *         coverage.)
   */
  public List<Reference> getContract() {
    if (this.contract == null)
      this.contract = new ArrayList<Reference>();
    return this.contract;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public Coverage setContract(List<Reference> theContract) {
    this.contract = theContract;
    return this;
  }

  public boolean hasContract() {
    if (this.contract == null)
      return false;
    for (Reference item : this.contract)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addContract() { // 3
    Reference t = new Reference();
    if (this.contract == null)
      this.contract = new ArrayList<Reference>();
    this.contract.add(t);
    return t;
  }

  public Coverage addContract(Reference t) { // 3
    if (t == null)
      return this;
    if (this.contract == null)
      this.contract = new ArrayList<Reference>();
    this.contract.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #contract}, creating
   *         it if it does not already exist
   */
  public Reference getContractFirstRep() {
    if (getContract().isEmpty()) {
      addContract();
    }
    return getContract().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier", "A unique identifier assigned to this coverage.", 0,
        java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("status", "code", "The status of the resource instance.", 0, 1, status));
    children.add(new Property("type", "CodeableConcept",
        "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.",
        0, 1, type));
    children.add(new Property("policyHolder", "Reference(Patient|RelatedPerson|Organization)",
        "The party who 'owns' the insurance policy.", 0, 1, policyHolder));
    children.add(new Property("subscriber", "Reference(Patient|RelatedPerson)",
        "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.",
        0, 1, subscriber));
    children
        .add(new Property("subscriberId", "string", "The insurer assigned ID for the Subscriber.", 0, 1, subscriberId));
    children.add(new Property("beneficiary", "Reference(Patient)",
        "The party who benefits from the insurance coverage; the patient when products and/or services are provided.",
        0, 1, beneficiary));
    children.add(new Property("dependent", "string", "A unique identifier for a dependent under the coverage.", 0, 1,
        dependent));
    children.add(new Property("relationship", "CodeableConcept",
        "The relationship of beneficiary (patient) to the subscriber.", 0, 1, relationship));
    children.add(new Property("period", "Period",
        "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.",
        0, 1, period));
    children.add(new Property("payor", "Reference(Organization|Patient|RelatedPerson)",
        "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.",
        0, java.lang.Integer.MAX_VALUE, payor));
    children.add(new Property("class", "", "A suite of underwriter specific classifiers.", 0,
        java.lang.Integer.MAX_VALUE, class_));
    children.add(new Property("order", "positiveInt",
        "The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care.",
        0, 1, order));
    children.add(new Property("network", "string",
        "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.",
        0, 1, network));
    children.add(new Property("costToBeneficiary", "",
        "A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.",
        0, java.lang.Integer.MAX_VALUE, costToBeneficiary));
    children.add(new Property("subrogation", "boolean",
        "When 'subrogation=true' this insurance instance has been included not for adjudication but to provide insurers with the details to recover costs.",
        0, 1, subrogation));
    children.add(new Property("contract", "Reference(Contract)",
        "The policy(s) which constitute this insurance coverage.", 0, java.lang.Integer.MAX_VALUE, contract));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier", "A unique identifier assigned to this coverage.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case -892481550:
      /* status */ return new Property("status", "code", "The status of the resource instance.", 0, 1, status);
    case 3575610:
      /* type */ return new Property("type", "CodeableConcept",
          "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.",
          0, 1, type);
    case 2046898558:
      /* policyHolder */ return new Property("policyHolder", "Reference(Patient|RelatedPerson|Organization)",
          "The party who 'owns' the insurance policy.", 0, 1, policyHolder);
    case -1219769240:
      /* subscriber */ return new Property("subscriber", "Reference(Patient|RelatedPerson)",
          "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.",
          0, 1, subscriber);
    case 327834531:
      /* subscriberId */ return new Property("subscriberId", "string", "The insurer assigned ID for the Subscriber.", 0,
          1, subscriberId);
    case -565102875:
      /* beneficiary */ return new Property("beneficiary", "Reference(Patient)",
          "The party who benefits from the insurance coverage; the patient when products and/or services are provided.",
          0, 1, beneficiary);
    case -1109226753:
      /* dependent */ return new Property("dependent", "string",
          "A unique identifier for a dependent under the coverage.", 0, 1, dependent);
    case -261851592:
      /* relationship */ return new Property("relationship", "CodeableConcept",
          "The relationship of beneficiary (patient) to the subscriber.", 0, 1, relationship);
    case -991726143:
      /* period */ return new Property("period", "Period",
          "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.",
          0, 1, period);
    case 106443915:
      /* payor */ return new Property("payor", "Reference(Organization|Patient|RelatedPerson)",
          "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.",
          0, java.lang.Integer.MAX_VALUE, payor);
    case 94742904:
      /* class */ return new Property("class", "", "A suite of underwriter specific classifiers.", 0,
          java.lang.Integer.MAX_VALUE, class_);
    case 106006350:
      /* order */ return new Property("order", "positiveInt",
          "The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care.",
          0, 1, order);
    case 1843485230:
      /* network */ return new Property("network", "string",
          "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.",
          0, 1, network);
    case -1866474851:
      /* costToBeneficiary */ return new Property("costToBeneficiary", "",
          "A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.",
          0, java.lang.Integer.MAX_VALUE, costToBeneficiary);
    case 837389739:
      /* subrogation */ return new Property("subrogation", "boolean",
          "When 'subrogation=true' this insurance instance has been included not for adjudication but to provide insurers with the details to recover costs.",
          0, 1, subrogation);
    case -566947566:
      /* contract */ return new Property("contract", "Reference(Contract)",
          "The policy(s) which constitute this insurance coverage.", 0, java.lang.Integer.MAX_VALUE, contract);
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
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<CoverageStatus>
    case 3575610:
      /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
    case 2046898558:
      /* policyHolder */ return this.policyHolder == null ? new Base[0] : new Base[] { this.policyHolder }; // Reference
    case -1219769240:
      /* subscriber */ return this.subscriber == null ? new Base[0] : new Base[] { this.subscriber }; // Reference
    case 327834531:
      /* subscriberId */ return this.subscriberId == null ? new Base[0] : new Base[] { this.subscriberId }; // StringType
    case -565102875:
      /* beneficiary */ return this.beneficiary == null ? new Base[0] : new Base[] { this.beneficiary }; // Reference
    case -1109226753:
      /* dependent */ return this.dependent == null ? new Base[0] : new Base[] { this.dependent }; // StringType
    case -261851592:
      /* relationship */ return this.relationship == null ? new Base[0] : new Base[] { this.relationship }; // CodeableConcept
    case -991726143:
      /* period */ return this.period == null ? new Base[0] : new Base[] { this.period }; // Period
    case 106443915:
      /* payor */ return this.payor == null ? new Base[0] : this.payor.toArray(new Base[this.payor.size()]); // Reference
    case 94742904:
      /* class */ return this.class_ == null ? new Base[0] : this.class_.toArray(new Base[this.class_.size()]); // ClassComponent
    case 106006350:
      /* order */ return this.order == null ? new Base[0] : new Base[] { this.order }; // PositiveIntType
    case 1843485230:
      /* network */ return this.network == null ? new Base[0] : new Base[] { this.network }; // StringType
    case -1866474851:
      /* costToBeneficiary */ return this.costToBeneficiary == null ? new Base[0]
          : this.costToBeneficiary.toArray(new Base[this.costToBeneficiary.size()]); // CostToBeneficiaryComponent
    case 837389739:
      /* subrogation */ return this.subrogation == null ? new Base[0] : new Base[] { this.subrogation }; // BooleanType
    case -566947566:
      /* contract */ return this.contract == null ? new Base[0] : this.contract.toArray(new Base[this.contract.size()]); // Reference
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
      value = new CoverageStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<CoverageStatus>
      return value;
    case 3575610: // type
      this.type = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 2046898558: // policyHolder
      this.policyHolder = castToReference(value); // Reference
      return value;
    case -1219769240: // subscriber
      this.subscriber = castToReference(value); // Reference
      return value;
    case 327834531: // subscriberId
      this.subscriberId = castToString(value); // StringType
      return value;
    case -565102875: // beneficiary
      this.beneficiary = castToReference(value); // Reference
      return value;
    case -1109226753: // dependent
      this.dependent = castToString(value); // StringType
      return value;
    case -261851592: // relationship
      this.relationship = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -991726143: // period
      this.period = castToPeriod(value); // Period
      return value;
    case 106443915: // payor
      this.getPayor().add(castToReference(value)); // Reference
      return value;
    case 94742904: // class
      this.getClass_().add((ClassComponent) value); // ClassComponent
      return value;
    case 106006350: // order
      this.order = castToPositiveInt(value); // PositiveIntType
      return value;
    case 1843485230: // network
      this.network = castToString(value); // StringType
      return value;
    case -1866474851: // costToBeneficiary
      this.getCostToBeneficiary().add((CostToBeneficiaryComponent) value); // CostToBeneficiaryComponent
      return value;
    case 837389739: // subrogation
      this.subrogation = castToBoolean(value); // BooleanType
      return value;
    case -566947566: // contract
      this.getContract().add(castToReference(value)); // Reference
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
      value = new CoverageStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<CoverageStatus>
    } else if (name.equals("type")) {
      this.type = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("policyHolder")) {
      this.policyHolder = castToReference(value); // Reference
    } else if (name.equals("subscriber")) {
      this.subscriber = castToReference(value); // Reference
    } else if (name.equals("subscriberId")) {
      this.subscriberId = castToString(value); // StringType
    } else if (name.equals("beneficiary")) {
      this.beneficiary = castToReference(value); // Reference
    } else if (name.equals("dependent")) {
      this.dependent = castToString(value); // StringType
    } else if (name.equals("relationship")) {
      this.relationship = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("period")) {
      this.period = castToPeriod(value); // Period
    } else if (name.equals("payor")) {
      this.getPayor().add(castToReference(value));
    } else if (name.equals("class")) {
      this.getClass_().add((ClassComponent) value);
    } else if (name.equals("order")) {
      this.order = castToPositiveInt(value); // PositiveIntType
    } else if (name.equals("network")) {
      this.network = castToString(value); // StringType
    } else if (name.equals("costToBeneficiary")) {
      this.getCostToBeneficiary().add((CostToBeneficiaryComponent) value);
    } else if (name.equals("subrogation")) {
      this.subrogation = castToBoolean(value); // BooleanType
    } else if (name.equals("contract")) {
      this.getContract().add(castToReference(value));
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
    } else if (name.equals("type")) {
      this.type = null;
    } else if (name.equals("policyHolder")) {
      this.policyHolder = null;
    } else if (name.equals("subscriber")) {
      this.subscriber = null;
    } else if (name.equals("subscriberId")) {
      this.subscriberId = null;
    } else if (name.equals("beneficiary")) {
      this.beneficiary = null;
    } else if (name.equals("dependent")) {
      this.dependent = null;
    } else if (name.equals("relationship")) {
      this.relationship = null;
    } else if (name.equals("period")) {
      this.period = null;
    } else if (name.equals("payor")) {
      this.getPayor().remove(castToReference(value));
    } else if (name.equals("class")) {
      this.getClass_().remove((ClassComponent) value);
    } else if (name.equals("order")) {
      this.order = null;
    } else if (name.equals("network")) {
      this.network = null;
    } else if (name.equals("costToBeneficiary")) {
      this.getCostToBeneficiary().remove((CostToBeneficiaryComponent) value);
    } else if (name.equals("subrogation")) {
      this.subrogation = null;
    } else if (name.equals("contract")) {
      this.getContract().remove(castToReference(value));
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
    case 3575610:
      return getType();
    case 2046898558:
      return getPolicyHolder();
    case -1219769240:
      return getSubscriber();
    case 327834531:
      return getSubscriberIdElement();
    case -565102875:
      return getBeneficiary();
    case -1109226753:
      return getDependentElement();
    case -261851592:
      return getRelationship();
    case -991726143:
      return getPeriod();
    case 106443915:
      return addPayor();
    case 94742904:
      return addClass_();
    case 106006350:
      return getOrderElement();
    case 1843485230:
      return getNetworkElement();
    case -1866474851:
      return addCostToBeneficiary();
    case 837389739:
      return getSubrogationElement();
    case -566947566:
      return addContract();
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
    case 3575610:
      /* type */ return new String[] { "CodeableConcept" };
    case 2046898558:
      /* policyHolder */ return new String[] { "Reference" };
    case -1219769240:
      /* subscriber */ return new String[] { "Reference" };
    case 327834531:
      /* subscriberId */ return new String[] { "string" };
    case -565102875:
      /* beneficiary */ return new String[] { "Reference" };
    case -1109226753:
      /* dependent */ return new String[] { "string" };
    case -261851592:
      /* relationship */ return new String[] { "CodeableConcept" };
    case -991726143:
      /* period */ return new String[] { "Period" };
    case 106443915:
      /* payor */ return new String[] { "Reference" };
    case 94742904:
      /* class */ return new String[] {};
    case 106006350:
      /* order */ return new String[] { "positiveInt" };
    case 1843485230:
      /* network */ return new String[] { "string" };
    case -1866474851:
      /* costToBeneficiary */ return new String[] {};
    case 837389739:
      /* subrogation */ return new String[] { "boolean" };
    case -566947566:
      /* contract */ return new String[] { "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.status");
    } else if (name.equals("type")) {
      this.type = new CodeableConcept();
      return this.type;
    } else if (name.equals("policyHolder")) {
      this.policyHolder = new Reference();
      return this.policyHolder;
    } else if (name.equals("subscriber")) {
      this.subscriber = new Reference();
      return this.subscriber;
    } else if (name.equals("subscriberId")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.subscriberId");
    } else if (name.equals("beneficiary")) {
      this.beneficiary = new Reference();
      return this.beneficiary;
    } else if (name.equals("dependent")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.dependent");
    } else if (name.equals("relationship")) {
      this.relationship = new CodeableConcept();
      return this.relationship;
    } else if (name.equals("period")) {
      this.period = new Period();
      return this.period;
    } else if (name.equals("payor")) {
      return addPayor();
    } else if (name.equals("class")) {
      return addClass_();
    } else if (name.equals("order")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.order");
    } else if (name.equals("network")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.network");
    } else if (name.equals("costToBeneficiary")) {
      return addCostToBeneficiary();
    } else if (name.equals("subrogation")) {
      throw new FHIRException("Cannot call addChild on a singleton property Coverage.subrogation");
    } else if (name.equals("contract")) {
      return addContract();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "Coverage";

  }

  public Coverage copy() {
    Coverage dst = new Coverage();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Coverage dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    dst.type = type == null ? null : type.copy();
    dst.policyHolder = policyHolder == null ? null : policyHolder.copy();
    dst.subscriber = subscriber == null ? null : subscriber.copy();
    dst.subscriberId = subscriberId == null ? null : subscriberId.copy();
    dst.beneficiary = beneficiary == null ? null : beneficiary.copy();
    dst.dependent = dependent == null ? null : dependent.copy();
    dst.relationship = relationship == null ? null : relationship.copy();
    dst.period = period == null ? null : period.copy();
    if (payor != null) {
      dst.payor = new ArrayList<Reference>();
      for (Reference i : payor)
        dst.payor.add(i.copy());
    }
    ;
    if (class_ != null) {
      dst.class_ = new ArrayList<ClassComponent>();
      for (ClassComponent i : class_)
        dst.class_.add(i.copy());
    }
    ;
    dst.order = order == null ? null : order.copy();
    dst.network = network == null ? null : network.copy();
    if (costToBeneficiary != null) {
      dst.costToBeneficiary = new ArrayList<CostToBeneficiaryComponent>();
      for (CostToBeneficiaryComponent i : costToBeneficiary)
        dst.costToBeneficiary.add(i.copy());
    }
    ;
    dst.subrogation = subrogation == null ? null : subrogation.copy();
    if (contract != null) {
      dst.contract = new ArrayList<Reference>();
      for (Reference i : contract)
        dst.contract.add(i.copy());
    }
    ;
  }

  protected Coverage typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Coverage))
      return false;
    Coverage o = (Coverage) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true)
        && compareDeep(type, o.type, true) && compareDeep(policyHolder, o.policyHolder, true)
        && compareDeep(subscriber, o.subscriber, true) && compareDeep(subscriberId, o.subscriberId, true)
        && compareDeep(beneficiary, o.beneficiary, true) && compareDeep(dependent, o.dependent, true)
        && compareDeep(relationship, o.relationship, true) && compareDeep(period, o.period, true)
        && compareDeep(payor, o.payor, true) && compareDeep(class_, o.class_, true) && compareDeep(order, o.order, true)
        && compareDeep(network, o.network, true) && compareDeep(costToBeneficiary, o.costToBeneficiary, true)
        && compareDeep(subrogation, o.subrogation, true) && compareDeep(contract, o.contract, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Coverage))
      return false;
    Coverage o = (Coverage) other_;
    return compareValues(status, o.status, true) && compareValues(subscriberId, o.subscriberId, true)
        && compareValues(dependent, o.dependent, true) && compareValues(order, o.order, true)
        && compareValues(network, o.network, true) && compareValues(subrogation, o.subrogation, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, type, policyHolder, subscriber,
        subscriberId, beneficiary, dependent, relationship, period, payor, class_, order, network, costToBeneficiary,
        subrogation, contract);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Coverage;
  }

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The primary identifier of the insured and the
   * coverage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "Coverage.identifier", description = "The primary identifier of the insured and the coverage", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The primary identifier of the insured and the
   * coverage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>payor</b>
   * <p>
   * Description: <b>The identity of the insurer or party paying for
   * services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.payor</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "payor", path = "Coverage.payor", description = "The identity of the insurer or party paying for services", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "RelatedPerson") }, target = { Organization.class,
          Patient.class, RelatedPerson.class })
  public static final String SP_PAYOR = "payor";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>payor</b>
   * <p>
   * Description: <b>The identity of the insurer or party paying for
   * services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.payor</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PAYOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PAYOR);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Coverage:payor</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PAYOR = new ca.uhn.fhir.model.api.Include("Coverage:payor")
      .toLocked();

  /**
   * Search parameter: <b>subscriber</b>
   * <p>
   * Description: <b>Reference to the subscriber</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.subscriber</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "subscriber", path = "Coverage.subscriber", description = "Reference to the subscriber", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "RelatedPerson") }, target = { Patient.class,
          RelatedPerson.class })
  public static final String SP_SUBSCRIBER = "subscriber";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>subscriber</b>
   * <p>
   * Description: <b>Reference to the subscriber</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.subscriber</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBSCRIBER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SUBSCRIBER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Coverage:subscriber</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBSCRIBER = new ca.uhn.fhir.model.api.Include(
      "Coverage:subscriber").toLocked();

  /**
   * Search parameter: <b>beneficiary</b>
   * <p>
   * Description: <b>Covered party</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.beneficiary</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "beneficiary", path = "Coverage.beneficiary", description = "Covered party", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient") }, target = { Patient.class })
  public static final String SP_BENEFICIARY = "beneficiary";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>beneficiary</b>
   * <p>
   * Description: <b>Covered party</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.beneficiary</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam BENEFICIARY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_BENEFICIARY);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Coverage:beneficiary</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_BENEFICIARY = new ca.uhn.fhir.model.api.Include(
      "Coverage:beneficiary").toLocked();

  /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Retrieve coverages for a patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.beneficiary</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "patient", path = "Coverage.beneficiary", description = "Retrieve coverages for a patient", type = "reference", target = {
      Patient.class })
  public static final String SP_PATIENT = "patient";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Retrieve coverages for a patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.beneficiary</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PATIENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Coverage:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include(
      "Coverage:patient").toLocked();

  /**
   * Search parameter: <b>class-value</b>
   * <p>
   * Description: <b>Value of the class (eg. Plan number, group number)</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Coverage.class.value</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "class-value", path = "Coverage.class.value", description = "Value of the class (eg. Plan number, group number)", type = "string")
  public static final String SP_CLASS_VALUE = "class-value";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>class-value</b>
   * <p>
   * Description: <b>Value of the class (eg. Plan number, group number)</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Coverage.class.value</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CLASS_VALUE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_CLASS_VALUE);

  /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>The kind of coverage (health plan, auto, Workers
   * Compensation)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "type", path = "Coverage.type", description = "The kind of coverage (health plan, auto, Workers Compensation)", type = "token")
  public static final String SP_TYPE = "type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>The kind of coverage (health plan, auto, Workers
   * Compensation)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_TYPE);

  /**
   * Search parameter: <b>dependent</b>
   * <p>
   * Description: <b>Dependent number</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Coverage.dependent</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "dependent", path = "Coverage.dependent", description = "Dependent number", type = "string")
  public static final String SP_DEPENDENT = "dependent";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>dependent</b>
   * <p>
   * Description: <b>Dependent number</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Coverage.dependent</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DEPENDENT = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_DEPENDENT);

  /**
   * Search parameter: <b>class-type</b>
   * <p>
   * Description: <b>Coverage class (eg. plan, group)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.class.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "class-type", path = "Coverage.class.type", description = "Coverage class (eg. plan, group)", type = "token")
  public static final String SP_CLASS_TYPE = "class-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>class-type</b>
   * <p>
   * Description: <b>Coverage class (eg. plan, group)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.class.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CLASS_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CLASS_TYPE);

  /**
   * Search parameter: <b>policy-holder</b>
   * <p>
   * Description: <b>Reference to the policyholder</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.policyHolder</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "policy-holder", path = "Coverage.policyHolder", description = "Reference to the policyholder", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient"),
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "RelatedPerson") }, target = { Organization.class,
          Patient.class, RelatedPerson.class })
  public static final String SP_POLICY_HOLDER = "policy-holder";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>policy-holder</b>
   * <p>
   * Description: <b>Reference to the policyholder</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Coverage.policyHolder</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam POLICY_HOLDER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_POLICY_HOLDER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Coverage:policy-holder</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_POLICY_HOLDER = new ca.uhn.fhir.model.api.Include(
      "Coverage:policy-holder").toLocked();

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the Coverage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "Coverage.status", description = "The status of the Coverage", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the Coverage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Coverage.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
