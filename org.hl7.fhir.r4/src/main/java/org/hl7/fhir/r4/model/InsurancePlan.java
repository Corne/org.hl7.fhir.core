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
import org.hl7.fhir.r4.model.Enumerations.PublicationStatus;
import org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * Details of a Health Insurance product/plan provided by an organization.
 */
@ResourceDef(name = "InsurancePlan", profile = "http://hl7.org/fhir/StructureDefinition/InsurancePlan")
public class InsurancePlan extends DomainResource {

  @Block()
  public static class InsurancePlanContactComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Indicates a purpose for which the contact can be reached.
     */
    @Child(name = "purpose", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The type of contact", formalDefinition = "Indicates a purpose for which the contact can be reached.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contactentity-type")
    protected CodeableConcept purpose;

    /**
     * A name associated with the contact.
     */
    @Child(name = "name", type = { HumanName.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "A name associated with the contact", formalDefinition = "A name associated with the contact.")
    protected HumanName name;

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the
     * party may be contacted.
     */
    @Child(name = "telecom", type = {
        ContactPoint.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Contact details (telephone, email, etc.)  for a contact", formalDefinition = "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.")
    protected List<ContactPoint> telecom;

    /**
     * Visiting or postal addresses for the contact.
     */
    @Child(name = "address", type = { Address.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Visiting or postal addresses for the contact", formalDefinition = "Visiting or postal addresses for the contact.")
    protected Address address;

    private static final long serialVersionUID = 1831121305L;

    /**
     * Constructor
     */
    public InsurancePlanContactComponent() {
      super();
    }

    /**
     * @return {@link #purpose} (Indicates a purpose for which the contact can be
     *         reached.)
     */
    public CodeableConcept getPurpose() {
      if (this.purpose == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanContactComponent.purpose");
        else if (Configuration.doAutoCreate())
          this.purpose = new CodeableConcept(); // cc
      return this.purpose;
    }

    public boolean hasPurpose() {
      return this.purpose != null && !this.purpose.isEmpty();
    }

    /**
     * @param value {@link #purpose} (Indicates a purpose for which the contact can
     *              be reached.)
     */
    public InsurancePlanContactComponent setPurpose(CodeableConcept value) {
      this.purpose = value;
      return this;
    }

    /**
     * @return {@link #name} (A name associated with the contact.)
     */
    public HumanName getName() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanContactComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new HumanName(); // cc
      return this.name;
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A name associated with the contact.)
     */
    public InsurancePlanContactComponent setName(HumanName value) {
      this.name = value;
      return this;
    }

    /**
     * @return {@link #telecom} (A contact detail (e.g. a telephone number or an
     *         email address) by which the party may be contacted.)
     */
    public List<ContactPoint> getTelecom() {
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      return this.telecom;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanContactComponent setTelecom(List<ContactPoint> theTelecom) {
      this.telecom = theTelecom;
      return this;
    }

    public boolean hasTelecom() {
      if (this.telecom == null)
        return false;
      for (ContactPoint item : this.telecom)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactPoint addTelecom() { // 3
      ContactPoint t = new ContactPoint();
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return t;
    }

    public InsurancePlanContactComponent addTelecom(ContactPoint t) { // 3
      if (t == null)
        return this;
      if (this.telecom == null)
        this.telecom = new ArrayList<ContactPoint>();
      this.telecom.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #telecom}, creating it
     *         if it does not already exist
     */
    public ContactPoint getTelecomFirstRep() {
      if (getTelecom().isEmpty()) {
        addTelecom();
      }
      return getTelecom().get(0);
    }

    /**
     * @return {@link #address} (Visiting or postal addresses for the contact.)
     */
    public Address getAddress() {
      if (this.address == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanContactComponent.address");
        else if (Configuration.doAutoCreate())
          this.address = new Address(); // cc
      return this.address;
    }

    public boolean hasAddress() {
      return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (Visiting or postal addresses for the contact.)
     */
    public InsurancePlanContactComponent setAddress(Address value) {
      this.address = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("purpose", "CodeableConcept",
          "Indicates a purpose for which the contact can be reached.", 0, 1, purpose));
      children.add(new Property("name", "HumanName", "A name associated with the contact.", 0, 1, name));
      children.add(new Property("telecom", "ContactPoint",
          "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.", 0,
          java.lang.Integer.MAX_VALUE, telecom));
      children.add(new Property("address", "Address", "Visiting or postal addresses for the contact.", 0, 1, address));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -220463842:
        /* purpose */ return new Property("purpose", "CodeableConcept",
            "Indicates a purpose for which the contact can be reached.", 0, 1, purpose);
      case 3373707:
        /* name */ return new Property("name", "HumanName", "A name associated with the contact.", 0, 1, name);
      case -1429363305:
        /* telecom */ return new Property("telecom", "ContactPoint",
            "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.", 0,
            java.lang.Integer.MAX_VALUE, telecom);
      case -1147692044:
        /* address */ return new Property("address", "Address", "Visiting or postal addresses for the contact.", 0, 1,
            address);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -220463842:
        /* purpose */ return this.purpose == null ? new Base[0] : new Base[] { this.purpose }; // CodeableConcept
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // HumanName
      case -1429363305:
        /* telecom */ return this.telecom == null ? new Base[0] : this.telecom.toArray(new Base[this.telecom.size()]); // ContactPoint
      case -1147692044:
        /* address */ return this.address == null ? new Base[0] : new Base[] { this.address }; // Address
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -220463842: // purpose
        this.purpose = castToCodeableConcept(value); // CodeableConcept
        return value;
      case 3373707: // name
        this.name = castToHumanName(value); // HumanName
        return value;
      case -1429363305: // telecom
        this.getTelecom().add(castToContactPoint(value)); // ContactPoint
        return value;
      case -1147692044: // address
        this.address = castToAddress(value); // Address
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("purpose")) {
        this.purpose = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("name")) {
        this.name = castToHumanName(value); // HumanName
      } else if (name.equals("telecom")) {
        this.getTelecom().add(castToContactPoint(value));
      } else if (name.equals("address")) {
        this.address = castToAddress(value); // Address
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("purpose")) {
        this.purpose = null;
      } else if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("telecom")) {
        this.getTelecom().remove(castToContactPoint(value));
      } else if (name.equals("address")) {
        this.address = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -220463842:
        return getPurpose();
      case 3373707:
        return getName();
      case -1429363305:
        return addTelecom();
      case -1147692044:
        return getAddress();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -220463842:
        /* purpose */ return new String[] { "CodeableConcept" };
      case 3373707:
        /* name */ return new String[] { "HumanName" };
      case -1429363305:
        /* telecom */ return new String[] { "ContactPoint" };
      case -1147692044:
        /* address */ return new String[] { "Address" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("purpose")) {
        this.purpose = new CodeableConcept();
        return this.purpose;
      } else if (name.equals("name")) {
        this.name = new HumanName();
        return this.name;
      } else if (name.equals("telecom")) {
        return addTelecom();
      } else if (name.equals("address")) {
        this.address = new Address();
        return this.address;
      } else
        return super.addChild(name);
    }

    public InsurancePlanContactComponent copy() {
      InsurancePlanContactComponent dst = new InsurancePlanContactComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(InsurancePlanContactComponent dst) {
      super.copyValues(dst);
      dst.purpose = purpose == null ? null : purpose.copy();
      dst.name = name == null ? null : name.copy();
      if (telecom != null) {
        dst.telecom = new ArrayList<ContactPoint>();
        for (ContactPoint i : telecom)
          dst.telecom.add(i.copy());
      }
      ;
      dst.address = address == null ? null : address.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof InsurancePlanContactComponent))
        return false;
      InsurancePlanContactComponent o = (InsurancePlanContactComponent) other_;
      return compareDeep(purpose, o.purpose, true) && compareDeep(name, o.name, true)
          && compareDeep(telecom, o.telecom, true) && compareDeep(address, o.address, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof InsurancePlanContactComponent))
        return false;
      InsurancePlanContactComponent o = (InsurancePlanContactComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(purpose, name, telecom, address);
    }

    public String fhirType() {
      return "InsurancePlan.contact";

    }

  }

  @Block()
  public static class InsurancePlanCoverageComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Type of coverage (Medical; Dental; Mental Health; Substance Abuse; Vision;
     * Drug; Short Term; Long Term Care; Hospice; Home Health).
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of coverage", formalDefinition = "Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).")
    protected CodeableConcept type;

    /**
     * Reference to the network that providing the type of coverage.
     */
    @Child(name = "network", type = {
        Organization.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "What networks provide coverage", formalDefinition = "Reference to the network that providing the type of coverage.")
    protected List<Reference> network;
    /**
     * The actual objects that are the target of the reference (Reference to the
     * network that providing the type of coverage.)
     */
    protected List<Organization> networkTarget;

    /**
     * Specific benefits under this type of coverage.
     */
    @Child(name = "benefit", type = {}, order = 3, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "List of benefits", formalDefinition = "Specific benefits under this type of coverage.")
    protected List<CoverageBenefitComponent> benefit;

    private static final long serialVersionUID = -1186191877L;

    /**
     * Constructor
     */
    public InsurancePlanCoverageComponent() {
      super();
    }

    /**
     * Constructor
     */
    public InsurancePlanCoverageComponent(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (Type of coverage (Medical; Dental; Mental Health;
     *         Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice;
     *         Home Health).)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanCoverageComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of coverage (Medical; Dental; Mental Health;
     *              Substance Abuse; Vision; Drug; Short Term; Long Term Care;
     *              Hospice; Home Health).)
     */
    public InsurancePlanCoverageComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #network} (Reference to the network that providing the type of
     *         coverage.)
     */
    public List<Reference> getNetwork() {
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      return this.network;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanCoverageComponent setNetwork(List<Reference> theNetwork) {
      this.network = theNetwork;
      return this;
    }

    public boolean hasNetwork() {
      if (this.network == null)
        return false;
      for (Reference item : this.network)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addNetwork() { // 3
      Reference t = new Reference();
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return t;
    }

    public InsurancePlanCoverageComponent addNetwork(Reference t) { // 3
      if (t == null)
        return this;
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #network}, creating it
     *         if it does not already exist
     */
    public Reference getNetworkFirstRep() {
      if (getNetwork().isEmpty()) {
        addNetwork();
      }
      return getNetwork().get(0);
    }

    /**
     * @return {@link #benefit} (Specific benefits under this type of coverage.)
     */
    public List<CoverageBenefitComponent> getBenefit() {
      if (this.benefit == null)
        this.benefit = new ArrayList<CoverageBenefitComponent>();
      return this.benefit;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanCoverageComponent setBenefit(List<CoverageBenefitComponent> theBenefit) {
      this.benefit = theBenefit;
      return this;
    }

    public boolean hasBenefit() {
      if (this.benefit == null)
        return false;
      for (CoverageBenefitComponent item : this.benefit)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CoverageBenefitComponent addBenefit() { // 3
      CoverageBenefitComponent t = new CoverageBenefitComponent();
      if (this.benefit == null)
        this.benefit = new ArrayList<CoverageBenefitComponent>();
      this.benefit.add(t);
      return t;
    }

    public InsurancePlanCoverageComponent addBenefit(CoverageBenefitComponent t) { // 3
      if (t == null)
        return this;
      if (this.benefit == null)
        this.benefit = new ArrayList<CoverageBenefitComponent>();
      this.benefit.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #benefit}, creating it
     *         if it does not already exist
     */
    public CoverageBenefitComponent getBenefitFirstRep() {
      if (getBenefit().isEmpty()) {
        addBenefit();
      }
      return getBenefit().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).",
          0, 1, type));
      children.add(new Property("network", "Reference(Organization)",
          "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network));
      children.add(new Property("benefit", "", "Specific benefits under this type of coverage.", 0,
          java.lang.Integer.MAX_VALUE, benefit));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).",
            0, 1, type);
      case 1843485230:
        /* network */ return new Property("network", "Reference(Organization)",
            "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network);
      case -222710633:
        /* benefit */ return new Property("benefit", "", "Specific benefits under this type of coverage.", 0,
            java.lang.Integer.MAX_VALUE, benefit);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case 1843485230:
        /* network */ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
      case -222710633:
        /* benefit */ return this.benefit == null ? new Base[0] : this.benefit.toArray(new Base[this.benefit.size()]); // CoverageBenefitComponent
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
      case 1843485230: // network
        this.getNetwork().add(castToReference(value)); // Reference
        return value;
      case -222710633: // benefit
        this.getBenefit().add((CoverageBenefitComponent) value); // CoverageBenefitComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("network")) {
        this.getNetwork().add(castToReference(value));
      } else if (name.equals("benefit")) {
        this.getBenefit().add((CoverageBenefitComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("network")) {
        this.getNetwork().remove(castToReference(value));
      } else if (name.equals("benefit")) {
        this.getBenefit().remove((CoverageBenefitComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case 1843485230:
        return addNetwork();
      case -222710633:
        return addBenefit();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case 1843485230:
        /* network */ return new String[] { "Reference" };
      case -222710633:
        /* benefit */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("network")) {
        return addNetwork();
      } else if (name.equals("benefit")) {
        return addBenefit();
      } else
        return super.addChild(name);
    }

    public InsurancePlanCoverageComponent copy() {
      InsurancePlanCoverageComponent dst = new InsurancePlanCoverageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(InsurancePlanCoverageComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      if (network != null) {
        dst.network = new ArrayList<Reference>();
        for (Reference i : network)
          dst.network.add(i.copy());
      }
      ;
      if (benefit != null) {
        dst.benefit = new ArrayList<CoverageBenefitComponent>();
        for (CoverageBenefitComponent i : benefit)
          dst.benefit.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof InsurancePlanCoverageComponent))
        return false;
      InsurancePlanCoverageComponent o = (InsurancePlanCoverageComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(network, o.network, true)
          && compareDeep(benefit, o.benefit, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof InsurancePlanCoverageComponent))
        return false;
      InsurancePlanCoverageComponent o = (InsurancePlanCoverageComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, network, benefit);
    }

    public String fhirType() {
      return "InsurancePlan.coverage";

    }

  }

  @Block()
  public static class CoverageBenefitComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Type of benefit (primary care; speciality care; inpatient; outpatient).
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of benefit", formalDefinition = "Type of benefit (primary care; speciality care; inpatient; outpatient).")
    protected CodeableConcept type;

    /**
     * The referral requirements to have access/coverage for this benefit.
     */
    @Child(name = "requirement", type = {
        StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Referral requirements", formalDefinition = "The referral requirements to have access/coverage for this benefit.")
    protected StringType requirement;

    /**
     * The specific limits on the benefit.
     */
    @Child(name = "limit", type = {}, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Benefit limits", formalDefinition = "The specific limits on the benefit.")
    protected List<CoverageBenefitLimitComponent> limit;

    private static final long serialVersionUID = -113658449L;

    /**
     * Constructor
     */
    public CoverageBenefitComponent() {
      super();
    }

    /**
     * Constructor
     */
    public CoverageBenefitComponent(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (Type of benefit (primary care; speciality care;
     *         inpatient; outpatient).)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageBenefitComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of benefit (primary care; speciality care;
     *              inpatient; outpatient).)
     */
    public CoverageBenefitComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #requirement} (The referral requirements to have
     *         access/coverage for this benefit.). This is the underlying object
     *         with id, value and extensions. The accessor "getRequirement" gives
     *         direct access to the value
     */
    public StringType getRequirementElement() {
      if (this.requirement == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageBenefitComponent.requirement");
        else if (Configuration.doAutoCreate())
          this.requirement = new StringType(); // bb
      return this.requirement;
    }

    public boolean hasRequirementElement() {
      return this.requirement != null && !this.requirement.isEmpty();
    }

    public boolean hasRequirement() {
      return this.requirement != null && !this.requirement.isEmpty();
    }

    /**
     * @param value {@link #requirement} (The referral requirements to have
     *              access/coverage for this benefit.). This is the underlying
     *              object with id, value and extensions. The accessor
     *              "getRequirement" gives direct access to the value
     */
    public CoverageBenefitComponent setRequirementElement(StringType value) {
      this.requirement = value;
      return this;
    }

    /**
     * @return The referral requirements to have access/coverage for this benefit.
     */
    public String getRequirement() {
      return this.requirement == null ? null : this.requirement.getValue();
    }

    /**
     * @param value The referral requirements to have access/coverage for this
     *              benefit.
     */
    public CoverageBenefitComponent setRequirement(String value) {
      if (Utilities.noString(value))
        this.requirement = null;
      else {
        if (this.requirement == null)
          this.requirement = new StringType();
        this.requirement.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #limit} (The specific limits on the benefit.)
     */
    public List<CoverageBenefitLimitComponent> getLimit() {
      if (this.limit == null)
        this.limit = new ArrayList<CoverageBenefitLimitComponent>();
      return this.limit;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageBenefitComponent setLimit(List<CoverageBenefitLimitComponent> theLimit) {
      this.limit = theLimit;
      return this;
    }

    public boolean hasLimit() {
      if (this.limit == null)
        return false;
      for (CoverageBenefitLimitComponent item : this.limit)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CoverageBenefitLimitComponent addLimit() { // 3
      CoverageBenefitLimitComponent t = new CoverageBenefitLimitComponent();
      if (this.limit == null)
        this.limit = new ArrayList<CoverageBenefitLimitComponent>();
      this.limit.add(t);
      return t;
    }

    public CoverageBenefitComponent addLimit(CoverageBenefitLimitComponent t) { // 3
      if (t == null)
        return this;
      if (this.limit == null)
        this.limit = new ArrayList<CoverageBenefitLimitComponent>();
      this.limit.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #limit}, creating it
     *         if it does not already exist
     */
    public CoverageBenefitLimitComponent getLimitFirstRep() {
      if (getLimit().isEmpty()) {
        addLimit();
      }
      return getLimit().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "Type of benefit (primary care; speciality care; inpatient; outpatient).", 0, 1, type));
      children.add(new Property("requirement", "string",
          "The referral requirements to have access/coverage for this benefit.", 0, 1, requirement));
      children
          .add(new Property("limit", "", "The specific limits on the benefit.", 0, java.lang.Integer.MAX_VALUE, limit));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "Type of benefit (primary care; speciality care; inpatient; outpatient).", 0, 1, type);
      case 363387971:
        /* requirement */ return new Property("requirement", "string",
            "The referral requirements to have access/coverage for this benefit.", 0, 1, requirement);
      case 102976443:
        /* limit */ return new Property("limit", "", "The specific limits on the benefit.", 0,
            java.lang.Integer.MAX_VALUE, limit);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case 363387971:
        /* requirement */ return this.requirement == null ? new Base[0] : new Base[] { this.requirement }; // StringType
      case 102976443:
        /* limit */ return this.limit == null ? new Base[0] : this.limit.toArray(new Base[this.limit.size()]); // CoverageBenefitLimitComponent
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
      case 363387971: // requirement
        this.requirement = castToString(value); // StringType
        return value;
      case 102976443: // limit
        this.getLimit().add((CoverageBenefitLimitComponent) value); // CoverageBenefitLimitComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("requirement")) {
        this.requirement = castToString(value); // StringType
      } else if (name.equals("limit")) {
        this.getLimit().add((CoverageBenefitLimitComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("requirement")) {
        this.requirement = null;
      } else if (name.equals("limit")) {
        this.getLimit().remove((CoverageBenefitLimitComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case 363387971:
        return getRequirementElement();
      case 102976443:
        return addLimit();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case 363387971:
        /* requirement */ return new String[] { "string" };
      case 102976443:
        /* limit */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("requirement")) {
        throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.requirement");
      } else if (name.equals("limit")) {
        return addLimit();
      } else
        return super.addChild(name);
    }

    public CoverageBenefitComponent copy() {
      CoverageBenefitComponent dst = new CoverageBenefitComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(CoverageBenefitComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.requirement = requirement == null ? null : requirement.copy();
      if (limit != null) {
        dst.limit = new ArrayList<CoverageBenefitLimitComponent>();
        for (CoverageBenefitLimitComponent i : limit)
          dst.limit.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof CoverageBenefitComponent))
        return false;
      CoverageBenefitComponent o = (CoverageBenefitComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(requirement, o.requirement, true)
          && compareDeep(limit, o.limit, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof CoverageBenefitComponent))
        return false;
      CoverageBenefitComponent o = (CoverageBenefitComponent) other_;
      return compareValues(requirement, o.requirement, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, requirement, limit);
    }

    public String fhirType() {
      return "InsurancePlan.coverage.benefit";

    }

  }

  @Block()
  public static class CoverageBenefitLimitComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The maximum amount of a service item a plan will pay for a covered benefit.
     * For examples. wellness visits, or eyeglasses.
     */
    @Child(name = "value", type = { Quantity.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Maximum value allowed", formalDefinition = "The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.")
    protected Quantity value;

    /**
     * The specific limit on the benefit.
     */
    @Child(name = "code", type = {
        CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Benefit limit details", formalDefinition = "The specific limit on the benefit.")
    protected CodeableConcept code;

    private static final long serialVersionUID = -304318128L;

    /**
     * Constructor
     */
    public CoverageBenefitLimitComponent() {
      super();
    }

    /**
     * @return {@link #value} (The maximum amount of a service item a plan will pay
     *         for a covered benefit. For examples. wellness visits, or eyeglasses.)
     */
    public Quantity getValue() {
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageBenefitLimitComponent.value");
        else if (Configuration.doAutoCreate())
          this.value = new Quantity(); // cc
      return this.value;
    }

    public boolean hasValue() {
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The maximum amount of a service item a plan will
     *              pay for a covered benefit. For examples. wellness visits, or
     *              eyeglasses.)
     */
    public CoverageBenefitLimitComponent setValue(Quantity value) {
      this.value = value;
      return this;
    }

    /**
     * @return {@link #code} (The specific limit on the benefit.)
     */
    public CodeableConcept getCode() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageBenefitLimitComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeableConcept(); // cc
      return this.code;
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (The specific limit on the benefit.)
     */
    public CoverageBenefitLimitComponent setCode(CodeableConcept value) {
      this.code = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("value", "Quantity",
          "The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.",
          0, 1, value));
      children.add(new Property("code", "CodeableConcept", "The specific limit on the benefit.", 0, 1, code));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 111972721:
        /* value */ return new Property("value", "Quantity",
            "The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.",
            0, 1, value);
      case 3059181:
        /* code */ return new Property("code", "CodeableConcept", "The specific limit on the benefit.", 0, 1, code);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // Quantity
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeableConcept
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 111972721: // value
        this.value = castToQuantity(value); // Quantity
        return value;
      case 3059181: // code
        this.code = castToCodeableConcept(value); // CodeableConcept
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("value")) {
        this.value = castToQuantity(value); // Quantity
      } else if (name.equals("code")) {
        this.code = castToCodeableConcept(value); // CodeableConcept
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("value")) {
        this.value = null;
      } else if (name.equals("code")) {
        this.code = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 111972721:
        return getValue();
      case 3059181:
        return getCode();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 111972721:
        /* value */ return new String[] { "Quantity" };
      case 3059181:
        /* code */ return new String[] { "CodeableConcept" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("value")) {
        this.value = new Quantity();
        return this.value;
      } else if (name.equals("code")) {
        this.code = new CodeableConcept();
        return this.code;
      } else
        return super.addChild(name);
    }

    public CoverageBenefitLimitComponent copy() {
      CoverageBenefitLimitComponent dst = new CoverageBenefitLimitComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(CoverageBenefitLimitComponent dst) {
      super.copyValues(dst);
      dst.value = value == null ? null : value.copy();
      dst.code = code == null ? null : code.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof CoverageBenefitLimitComponent))
        return false;
      CoverageBenefitLimitComponent o = (CoverageBenefitLimitComponent) other_;
      return compareDeep(value, o.value, true) && compareDeep(code, o.code, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof CoverageBenefitLimitComponent))
        return false;
      CoverageBenefitLimitComponent o = (CoverageBenefitLimitComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(value, code);
    }

    public String fhirType() {
      return "InsurancePlan.coverage.benefit.limit";

    }

  }

  @Block()
  public static class InsurancePlanPlanComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Business identifiers assigned to this health insurance plan which remain
     * constant as the resource is updated and propagates from server to server.
     */
    @Child(name = "identifier", type = {
        Identifier.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Business Identifier for Product", formalDefinition = "Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.")
    protected List<Identifier> identifier;

    /**
     * Type of plan. For example, "Platinum" or "High Deductable".
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of plan", formalDefinition = "Type of plan. For example, \"Platinum\" or \"High Deductable\".")
    protected CodeableConcept type;

    /**
     * The geographic region in which a health insurance plan's benefits apply.
     */
    @Child(name = "coverageArea", type = {
        Location.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Where product applies", formalDefinition = "The geographic region in which a health insurance plan's benefits apply.")
    protected List<Reference> coverageArea;
    /**
     * The actual objects that are the target of the reference (The geographic
     * region in which a health insurance plan's benefits apply.)
     */
    protected List<Location> coverageAreaTarget;

    /**
     * Reference to the network that providing the type of coverage.
     */
    @Child(name = "network", type = {
        Organization.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "What networks provide coverage", formalDefinition = "Reference to the network that providing the type of coverage.")
    protected List<Reference> network;
    /**
     * The actual objects that are the target of the reference (Reference to the
     * network that providing the type of coverage.)
     */
    protected List<Organization> networkTarget;

    /**
     * Overall costs associated with the plan.
     */
    @Child(name = "generalCost", type = {}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Overall costs", formalDefinition = "Overall costs associated with the plan.")
    protected List<InsurancePlanPlanGeneralCostComponent> generalCost;

    /**
     * Costs associated with the coverage provided by the product.
     */
    @Child(name = "specificCost", type = {}, order = 6, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Specific costs", formalDefinition = "Costs associated with the coverage provided by the product.")
    protected List<InsurancePlanPlanSpecificCostComponent> specificCost;

    private static final long serialVersionUID = -2063324071L;

    /**
     * Constructor
     */
    public InsurancePlanPlanComponent() {
      super();
    }

    /**
     * @return {@link #identifier} (Business identifiers assigned to this health
     *         insurance plan which remain constant as the resource is updated and
     *         propagates from server to server.)
     */
    public List<Identifier> getIdentifier() {
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanComponent setIdentifier(List<Identifier> theIdentifier) {
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

    public InsurancePlanPlanComponent addIdentifier(Identifier t) { // 3
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
     * @return {@link #type} (Type of plan. For example, "Platinum" or "High
     *         Deductable".)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of plan. For example, "Platinum" or "High
     *              Deductable".)
     */
    public InsurancePlanPlanComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #coverageArea} (The geographic region in which a health
     *         insurance plan's benefits apply.)
     */
    public List<Reference> getCoverageArea() {
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      return this.coverageArea;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanComponent setCoverageArea(List<Reference> theCoverageArea) {
      this.coverageArea = theCoverageArea;
      return this;
    }

    public boolean hasCoverageArea() {
      if (this.coverageArea == null)
        return false;
      for (Reference item : this.coverageArea)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addCoverageArea() { // 3
      Reference t = new Reference();
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      this.coverageArea.add(t);
      return t;
    }

    public InsurancePlanPlanComponent addCoverageArea(Reference t) { // 3
      if (t == null)
        return this;
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      this.coverageArea.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #coverageArea},
     *         creating it if it does not already exist
     */
    public Reference getCoverageAreaFirstRep() {
      if (getCoverageArea().isEmpty()) {
        addCoverageArea();
      }
      return getCoverageArea().get(0);
    }

    /**
     * @return {@link #network} (Reference to the network that providing the type of
     *         coverage.)
     */
    public List<Reference> getNetwork() {
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      return this.network;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanComponent setNetwork(List<Reference> theNetwork) {
      this.network = theNetwork;
      return this;
    }

    public boolean hasNetwork() {
      if (this.network == null)
        return false;
      for (Reference item : this.network)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addNetwork() { // 3
      Reference t = new Reference();
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return t;
    }

    public InsurancePlanPlanComponent addNetwork(Reference t) { // 3
      if (t == null)
        return this;
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #network}, creating it
     *         if it does not already exist
     */
    public Reference getNetworkFirstRep() {
      if (getNetwork().isEmpty()) {
        addNetwork();
      }
      return getNetwork().get(0);
    }

    /**
     * @return {@link #generalCost} (Overall costs associated with the plan.)
     */
    public List<InsurancePlanPlanGeneralCostComponent> getGeneralCost() {
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanPlanGeneralCostComponent>();
      return this.generalCost;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanComponent setGeneralCost(List<InsurancePlanPlanGeneralCostComponent> theGeneralCost) {
      this.generalCost = theGeneralCost;
      return this;
    }

    public boolean hasGeneralCost() {
      if (this.generalCost == null)
        return false;
      for (InsurancePlanPlanGeneralCostComponent item : this.generalCost)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsurancePlanPlanGeneralCostComponent addGeneralCost() { // 3
      InsurancePlanPlanGeneralCostComponent t = new InsurancePlanPlanGeneralCostComponent();
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanPlanGeneralCostComponent>();
      this.generalCost.add(t);
      return t;
    }

    public InsurancePlanPlanComponent addGeneralCost(InsurancePlanPlanGeneralCostComponent t) { // 3
      if (t == null)
        return this;
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanPlanGeneralCostComponent>();
      this.generalCost.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #generalCost},
     *         creating it if it does not already exist
     */
    public InsurancePlanPlanGeneralCostComponent getGeneralCostFirstRep() {
      if (getGeneralCost().isEmpty()) {
        addGeneralCost();
      }
      return getGeneralCost().get(0);
    }

    /**
     * @return {@link #specificCost} (Costs associated with the coverage provided by
     *         the product.)
     */
    public List<InsurancePlanPlanSpecificCostComponent> getSpecificCost() {
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanPlanSpecificCostComponent>();
      return this.specificCost;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanComponent setSpecificCost(List<InsurancePlanPlanSpecificCostComponent> theSpecificCost) {
      this.specificCost = theSpecificCost;
      return this;
    }

    public boolean hasSpecificCost() {
      if (this.specificCost == null)
        return false;
      for (InsurancePlanPlanSpecificCostComponent item : this.specificCost)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsurancePlanPlanSpecificCostComponent addSpecificCost() { // 3
      InsurancePlanPlanSpecificCostComponent t = new InsurancePlanPlanSpecificCostComponent();
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanPlanSpecificCostComponent>();
      this.specificCost.add(t);
      return t;
    }

    public InsurancePlanPlanComponent addSpecificCost(InsurancePlanPlanSpecificCostComponent t) { // 3
      if (t == null)
        return this;
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanPlanSpecificCostComponent>();
      this.specificCost.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #specificCost},
     *         creating it if it does not already exist
     */
    public InsurancePlanPlanSpecificCostComponent getSpecificCostFirstRep() {
      if (getSpecificCost().isEmpty()) {
        addSpecificCost();
      }
      return getSpecificCost().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("identifier", "Identifier",
          "Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.",
          0, java.lang.Integer.MAX_VALUE, identifier));
      children.add(new Property("type", "CodeableConcept",
          "Type of plan. For example, \"Platinum\" or \"High Deductable\".", 0, 1, type));
      children.add(new Property("coverageArea", "Reference(Location)",
          "The geographic region in which a health insurance plan's benefits apply.", 0, java.lang.Integer.MAX_VALUE,
          coverageArea));
      children.add(new Property("network", "Reference(Organization)",
          "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network));
      children.add(new Property("generalCost", "", "Overall costs associated with the plan.", 0,
          java.lang.Integer.MAX_VALUE, generalCost));
      children.add(new Property("specificCost", "", "Costs associated with the coverage provided by the product.", 0,
          java.lang.Integer.MAX_VALUE, specificCost));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -1618432855:
        /* identifier */ return new Property("identifier", "Identifier",
            "Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.",
            0, java.lang.Integer.MAX_VALUE, identifier);
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "Type of plan. For example, \"Platinum\" or \"High Deductable\".", 0, 1, type);
      case -1532328299:
        /* coverageArea */ return new Property("coverageArea", "Reference(Location)",
            "The geographic region in which a health insurance plan's benefits apply.", 0, java.lang.Integer.MAX_VALUE,
            coverageArea);
      case 1843485230:
        /* network */ return new Property("network", "Reference(Organization)",
            "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network);
      case 878344405:
        /* generalCost */ return new Property("generalCost", "", "Overall costs associated with the plan.", 0,
            java.lang.Integer.MAX_VALUE, generalCost);
      case -1205656545:
        /* specificCost */ return new Property("specificCost", "",
            "Costs associated with the coverage provided by the product.", 0, java.lang.Integer.MAX_VALUE,
            specificCost);
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
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case -1532328299:
        /* coverageArea */ return this.coverageArea == null ? new Base[0]
            : this.coverageArea.toArray(new Base[this.coverageArea.size()]); // Reference
      case 1843485230:
        /* network */ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
      case 878344405:
        /* generalCost */ return this.generalCost == null ? new Base[0]
            : this.generalCost.toArray(new Base[this.generalCost.size()]); // InsurancePlanPlanGeneralCostComponent
      case -1205656545:
        /* specificCost */ return this.specificCost == null ? new Base[0]
            : this.specificCost.toArray(new Base[this.specificCost.size()]); // InsurancePlanPlanSpecificCostComponent
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
      case 3575610: // type
        this.type = castToCodeableConcept(value); // CodeableConcept
        return value;
      case -1532328299: // coverageArea
        this.getCoverageArea().add(castToReference(value)); // Reference
        return value;
      case 1843485230: // network
        this.getNetwork().add(castToReference(value)); // Reference
        return value;
      case 878344405: // generalCost
        this.getGeneralCost().add((InsurancePlanPlanGeneralCostComponent) value); // InsurancePlanPlanGeneralCostComponent
        return value;
      case -1205656545: // specificCost
        this.getSpecificCost().add((InsurancePlanPlanSpecificCostComponent) value); // InsurancePlanPlanSpecificCostComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("identifier")) {
        this.getIdentifier().add(castToIdentifier(value));
      } else if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("coverageArea")) {
        this.getCoverageArea().add(castToReference(value));
      } else if (name.equals("network")) {
        this.getNetwork().add(castToReference(value));
      } else if (name.equals("generalCost")) {
        this.getGeneralCost().add((InsurancePlanPlanGeneralCostComponent) value);
      } else if (name.equals("specificCost")) {
        this.getSpecificCost().add((InsurancePlanPlanSpecificCostComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("identifier")) {
        this.getIdentifier().remove(castToIdentifier(value));
      } else if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("coverageArea")) {
        this.getCoverageArea().remove(castToReference(value));
      } else if (name.equals("network")) {
        this.getNetwork().remove(castToReference(value));
      } else if (name.equals("generalCost")) {
        this.getGeneralCost().remove((InsurancePlanPlanGeneralCostComponent) value);
      } else if (name.equals("specificCost")) {
        this.getSpecificCost().remove((InsurancePlanPlanSpecificCostComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1618432855:
        return addIdentifier();
      case 3575610:
        return getType();
      case -1532328299:
        return addCoverageArea();
      case 1843485230:
        return addNetwork();
      case 878344405:
        return addGeneralCost();
      case -1205656545:
        return addSpecificCost();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1618432855:
        /* identifier */ return new String[] { "Identifier" };
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case -1532328299:
        /* coverageArea */ return new String[] { "Reference" };
      case 1843485230:
        /* network */ return new String[] { "Reference" };
      case 878344405:
        /* generalCost */ return new String[] {};
      case -1205656545:
        /* specificCost */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("identifier")) {
        return addIdentifier();
      } else if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("coverageArea")) {
        return addCoverageArea();
      } else if (name.equals("network")) {
        return addNetwork();
      } else if (name.equals("generalCost")) {
        return addGeneralCost();
      } else if (name.equals("specificCost")) {
        return addSpecificCost();
      } else
        return super.addChild(name);
    }

    public InsurancePlanPlanComponent copy() {
      InsurancePlanPlanComponent dst = new InsurancePlanPlanComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(InsurancePlanPlanComponent dst) {
      super.copyValues(dst);
      if (identifier != null) {
        dst.identifier = new ArrayList<Identifier>();
        for (Identifier i : identifier)
          dst.identifier.add(i.copy());
      }
      ;
      dst.type = type == null ? null : type.copy();
      if (coverageArea != null) {
        dst.coverageArea = new ArrayList<Reference>();
        for (Reference i : coverageArea)
          dst.coverageArea.add(i.copy());
      }
      ;
      if (network != null) {
        dst.network = new ArrayList<Reference>();
        for (Reference i : network)
          dst.network.add(i.copy());
      }
      ;
      if (generalCost != null) {
        dst.generalCost = new ArrayList<InsurancePlanPlanGeneralCostComponent>();
        for (InsurancePlanPlanGeneralCostComponent i : generalCost)
          dst.generalCost.add(i.copy());
      }
      ;
      if (specificCost != null) {
        dst.specificCost = new ArrayList<InsurancePlanPlanSpecificCostComponent>();
        for (InsurancePlanPlanSpecificCostComponent i : specificCost)
          dst.specificCost.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanComponent))
        return false;
      InsurancePlanPlanComponent o = (InsurancePlanPlanComponent) other_;
      return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true)
          && compareDeep(coverageArea, o.coverageArea, true) && compareDeep(network, o.network, true)
          && compareDeep(generalCost, o.generalCost, true) && compareDeep(specificCost, o.specificCost, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanComponent))
        return false;
      InsurancePlanPlanComponent o = (InsurancePlanPlanComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, coverageArea, network, generalCost, specificCost);
    }

    public String fhirType() {
      return "InsurancePlan.plan";

    }

  }

  @Block()
  public static class InsurancePlanPlanGeneralCostComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Type of cost.
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of cost", formalDefinition = "Type of cost.")
    protected CodeableConcept type;

    /**
     * Number of participants enrolled in the plan.
     */
    @Child(name = "groupSize", type = {
        PositiveIntType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Number of enrollees", formalDefinition = "Number of participants enrolled in the plan.")
    protected PositiveIntType groupSize;

    /**
     * Value of the cost.
     */
    @Child(name = "cost", type = { Money.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Cost value", formalDefinition = "Value of the cost.")
    protected Money cost;

    /**
     * Additional information about the general costs associated with this plan.
     */
    @Child(name = "comment", type = {
        StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Additional cost information", formalDefinition = "Additional information about the general costs associated with this plan.")
    protected StringType comment;

    private static final long serialVersionUID = 1563949866L;

    /**
     * Constructor
     */
    public InsurancePlanPlanGeneralCostComponent() {
      super();
    }

    /**
     * @return {@link #type} (Type of cost.)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanGeneralCostComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of cost.)
     */
    public InsurancePlanPlanGeneralCostComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #groupSize} (Number of participants enrolled in the plan.).
     *         This is the underlying object with id, value and extensions. The
     *         accessor "getGroupSize" gives direct access to the value
     */
    public PositiveIntType getGroupSizeElement() {
      if (this.groupSize == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanGeneralCostComponent.groupSize");
        else if (Configuration.doAutoCreate())
          this.groupSize = new PositiveIntType(); // bb
      return this.groupSize;
    }

    public boolean hasGroupSizeElement() {
      return this.groupSize != null && !this.groupSize.isEmpty();
    }

    public boolean hasGroupSize() {
      return this.groupSize != null && !this.groupSize.isEmpty();
    }

    /**
     * @param value {@link #groupSize} (Number of participants enrolled in the
     *              plan.). This is the underlying object with id, value and
     *              extensions. The accessor "getGroupSize" gives direct access to
     *              the value
     */
    public InsurancePlanPlanGeneralCostComponent setGroupSizeElement(PositiveIntType value) {
      this.groupSize = value;
      return this;
    }

    /**
     * @return Number of participants enrolled in the plan.
     */
    public int getGroupSize() {
      return this.groupSize == null || this.groupSize.isEmpty() ? 0 : this.groupSize.getValue();
    }

    /**
     * @param value Number of participants enrolled in the plan.
     */
    public InsurancePlanPlanGeneralCostComponent setGroupSize(int value) {
      if (this.groupSize == null)
        this.groupSize = new PositiveIntType();
      this.groupSize.setValue(value);
      return this;
    }

    /**
     * @return {@link #cost} (Value of the cost.)
     */
    public Money getCost() {
      if (this.cost == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanGeneralCostComponent.cost");
        else if (Configuration.doAutoCreate())
          this.cost = new Money(); // cc
      return this.cost;
    }

    public boolean hasCost() {
      return this.cost != null && !this.cost.isEmpty();
    }

    /**
     * @param value {@link #cost} (Value of the cost.)
     */
    public InsurancePlanPlanGeneralCostComponent setCost(Money value) {
      this.cost = value;
      return this;
    }

    /**
     * @return {@link #comment} (Additional information about the general costs
     *         associated with this plan.). This is the underlying object with id,
     *         value and extensions. The accessor "getComment" gives direct access
     *         to the value
     */
    public StringType getCommentElement() {
      if (this.comment == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanGeneralCostComponent.comment");
        else if (Configuration.doAutoCreate())
          this.comment = new StringType(); // bb
      return this.comment;
    }

    public boolean hasCommentElement() {
      return this.comment != null && !this.comment.isEmpty();
    }

    public boolean hasComment() {
      return this.comment != null && !this.comment.isEmpty();
    }

    /**
     * @param value {@link #comment} (Additional information about the general costs
     *              associated with this plan.). This is the underlying object with
     *              id, value and extensions. The accessor "getComment" gives direct
     *              access to the value
     */
    public InsurancePlanPlanGeneralCostComponent setCommentElement(StringType value) {
      this.comment = value;
      return this;
    }

    /**
     * @return Additional information about the general costs associated with this
     *         plan.
     */
    public String getComment() {
      return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Additional information about the general costs associated with
     *              this plan.
     */
    public InsurancePlanPlanGeneralCostComponent setComment(String value) {
      if (Utilities.noString(value))
        this.comment = null;
      else {
        if (this.comment == null)
          this.comment = new StringType();
        this.comment.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept", "Type of cost.", 0, 1, type));
      children.add(
          new Property("groupSize", "positiveInt", "Number of participants enrolled in the plan.", 0, 1, groupSize));
      children.add(new Property("cost", "Money", "Value of the cost.", 0, 1, cost));
      children.add(new Property("comment", "string",
          "Additional information about the general costs associated with this plan.", 0, 1, comment));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept", "Type of cost.", 0, 1, type);
      case -1483017440:
        /* groupSize */ return new Property("groupSize", "positiveInt", "Number of participants enrolled in the plan.",
            0, 1, groupSize);
      case 3059661:
        /* cost */ return new Property("cost", "Money", "Value of the cost.", 0, 1, cost);
      case 950398559:
        /* comment */ return new Property("comment", "string",
            "Additional information about the general costs associated with this plan.", 0, 1, comment);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case -1483017440:
        /* groupSize */ return this.groupSize == null ? new Base[0] : new Base[] { this.groupSize }; // PositiveIntType
      case 3059661:
        /* cost */ return this.cost == null ? new Base[0] : new Base[] { this.cost }; // Money
      case 950398559:
        /* comment */ return this.comment == null ? new Base[0] : new Base[] { this.comment }; // StringType
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
      case -1483017440: // groupSize
        this.groupSize = castToPositiveInt(value); // PositiveIntType
        return value;
      case 3059661: // cost
        this.cost = castToMoney(value); // Money
        return value;
      case 950398559: // comment
        this.comment = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("groupSize")) {
        this.groupSize = castToPositiveInt(value); // PositiveIntType
      } else if (name.equals("cost")) {
        this.cost = castToMoney(value); // Money
      } else if (name.equals("comment")) {
        this.comment = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("groupSize")) {
        this.groupSize = null;
      } else if (name.equals("cost")) {
        this.cost = null;
      } else if (name.equals("comment")) {
        this.comment = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case -1483017440:
        return getGroupSizeElement();
      case 3059661:
        return getCost();
      case 950398559:
        return getCommentElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case -1483017440:
        /* groupSize */ return new String[] { "positiveInt" };
      case 3059661:
        /* cost */ return new String[] { "Money" };
      case 950398559:
        /* comment */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("groupSize")) {
        throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.groupSize");
      } else if (name.equals("cost")) {
        this.cost = new Money();
        return this.cost;
      } else if (name.equals("comment")) {
        throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.comment");
      } else
        return super.addChild(name);
    }

    public InsurancePlanPlanGeneralCostComponent copy() {
      InsurancePlanPlanGeneralCostComponent dst = new InsurancePlanPlanGeneralCostComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(InsurancePlanPlanGeneralCostComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.groupSize = groupSize == null ? null : groupSize.copy();
      dst.cost = cost == null ? null : cost.copy();
      dst.comment = comment == null ? null : comment.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanGeneralCostComponent))
        return false;
      InsurancePlanPlanGeneralCostComponent o = (InsurancePlanPlanGeneralCostComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(groupSize, o.groupSize, true)
          && compareDeep(cost, o.cost, true) && compareDeep(comment, o.comment, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanGeneralCostComponent))
        return false;
      InsurancePlanPlanGeneralCostComponent o = (InsurancePlanPlanGeneralCostComponent) other_;
      return compareValues(groupSize, o.groupSize, true) && compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, groupSize, cost, comment);
    }

    public String fhirType() {
      return "InsurancePlan.plan.generalCost";

    }

  }

  @Block()
  public static class InsurancePlanPlanSpecificCostComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * General category of benefit (Medical; Dental; Vision; Drug; Mental Health;
     * Substance Abuse; Hospice, Home Health).
     */
    @Child(name = "category", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "General category of benefit", formalDefinition = "General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).")
    protected CodeableConcept category;

    /**
     * List of the specific benefits under this category of benefit.
     */
    @Child(name = "benefit", type = {}, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Benefits list", formalDefinition = "List of the specific benefits under this category of benefit.")
    protected List<PlanBenefitComponent> benefit;

    private static final long serialVersionUID = 922585525L;

    /**
     * Constructor
     */
    public InsurancePlanPlanSpecificCostComponent() {
      super();
    }

    /**
     * Constructor
     */
    public InsurancePlanPlanSpecificCostComponent(CodeableConcept category) {
      super();
      this.category = category;
    }

    /**
     * @return {@link #category} (General category of benefit (Medical; Dental;
     *         Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).)
     */
    public CodeableConcept getCategory() {
      if (this.category == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlanPlanSpecificCostComponent.category");
        else if (Configuration.doAutoCreate())
          this.category = new CodeableConcept(); // cc
      return this.category;
    }

    public boolean hasCategory() {
      return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (General category of benefit (Medical; Dental;
     *              Vision; Drug; Mental Health; Substance Abuse; Hospice, Home
     *              Health).)
     */
    public InsurancePlanPlanSpecificCostComponent setCategory(CodeableConcept value) {
      this.category = value;
      return this;
    }

    /**
     * @return {@link #benefit} (List of the specific benefits under this category
     *         of benefit.)
     */
    public List<PlanBenefitComponent> getBenefit() {
      if (this.benefit == null)
        this.benefit = new ArrayList<PlanBenefitComponent>();
      return this.benefit;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlanPlanSpecificCostComponent setBenefit(List<PlanBenefitComponent> theBenefit) {
      this.benefit = theBenefit;
      return this;
    }

    public boolean hasBenefit() {
      if (this.benefit == null)
        return false;
      for (PlanBenefitComponent item : this.benefit)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public PlanBenefitComponent addBenefit() { // 3
      PlanBenefitComponent t = new PlanBenefitComponent();
      if (this.benefit == null)
        this.benefit = new ArrayList<PlanBenefitComponent>();
      this.benefit.add(t);
      return t;
    }

    public InsurancePlanPlanSpecificCostComponent addBenefit(PlanBenefitComponent t) { // 3
      if (t == null)
        return this;
      if (this.benefit == null)
        this.benefit = new ArrayList<PlanBenefitComponent>();
      this.benefit.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #benefit}, creating it
     *         if it does not already exist
     */
    public PlanBenefitComponent getBenefitFirstRep() {
      if (getBenefit().isEmpty()) {
        addBenefit();
      }
      return getBenefit().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("category", "CodeableConcept",
          "General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).",
          0, 1, category));
      children.add(new Property("benefit", "", "List of the specific benefits under this category of benefit.", 0,
          java.lang.Integer.MAX_VALUE, benefit));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 50511102:
        /* category */ return new Property("category", "CodeableConcept",
            "General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).",
            0, 1, category);
      case -222710633:
        /* benefit */ return new Property("benefit", "",
            "List of the specific benefits under this category of benefit.", 0, java.lang.Integer.MAX_VALUE, benefit);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 50511102:
        /* category */ return this.category == null ? new Base[0] : new Base[] { this.category }; // CodeableConcept
      case -222710633:
        /* benefit */ return this.benefit == null ? new Base[0] : this.benefit.toArray(new Base[this.benefit.size()]); // PlanBenefitComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 50511102: // category
        this.category = castToCodeableConcept(value); // CodeableConcept
        return value;
      case -222710633: // benefit
        this.getBenefit().add((PlanBenefitComponent) value); // PlanBenefitComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("category")) {
        this.category = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("benefit")) {
        this.getBenefit().add((PlanBenefitComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("category")) {
        this.category = null;
      } else if (name.equals("benefit")) {
        this.getBenefit().remove((PlanBenefitComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 50511102:
        return getCategory();
      case -222710633:
        return addBenefit();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 50511102:
        /* category */ return new String[] { "CodeableConcept" };
      case -222710633:
        /* benefit */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("category")) {
        this.category = new CodeableConcept();
        return this.category;
      } else if (name.equals("benefit")) {
        return addBenefit();
      } else
        return super.addChild(name);
    }

    public InsurancePlanPlanSpecificCostComponent copy() {
      InsurancePlanPlanSpecificCostComponent dst = new InsurancePlanPlanSpecificCostComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(InsurancePlanPlanSpecificCostComponent dst) {
      super.copyValues(dst);
      dst.category = category == null ? null : category.copy();
      if (benefit != null) {
        dst.benefit = new ArrayList<PlanBenefitComponent>();
        for (PlanBenefitComponent i : benefit)
          dst.benefit.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanSpecificCostComponent))
        return false;
      InsurancePlanPlanSpecificCostComponent o = (InsurancePlanPlanSpecificCostComponent) other_;
      return compareDeep(category, o.category, true) && compareDeep(benefit, o.benefit, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof InsurancePlanPlanSpecificCostComponent))
        return false;
      InsurancePlanPlanSpecificCostComponent o = (InsurancePlanPlanSpecificCostComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, benefit);
    }

    public String fhirType() {
      return "InsurancePlan.plan.specificCost";

    }

  }

  @Block()
  public static class PlanBenefitComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Type of specific benefit (preventative; primary care office visit; speciality
     * office visit; hospitalization; emergency room; urgent care).
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of specific benefit", formalDefinition = "Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).")
    protected CodeableConcept type;

    /**
     * List of the costs associated with a specific benefit.
     */
    @Child(name = "cost", type = {}, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "List of the costs", formalDefinition = "List of the costs associated with a specific benefit.")
    protected List<PlanBenefitCostComponent> cost;

    private static final long serialVersionUID = 792296200L;

    /**
     * Constructor
     */
    public PlanBenefitComponent() {
      super();
    }

    /**
     * Constructor
     */
    public PlanBenefitComponent(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (Type of specific benefit (preventative; primary care
     *         office visit; speciality office visit; hospitalization; emergency
     *         room; urgent care).)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PlanBenefitComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of specific benefit (preventative; primary
     *              care office visit; speciality office visit; hospitalization;
     *              emergency room; urgent care).)
     */
    public PlanBenefitComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #cost} (List of the costs associated with a specific benefit.)
     */
    public List<PlanBenefitCostComponent> getCost() {
      if (this.cost == null)
        this.cost = new ArrayList<PlanBenefitCostComponent>();
      return this.cost;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public PlanBenefitComponent setCost(List<PlanBenefitCostComponent> theCost) {
      this.cost = theCost;
      return this;
    }

    public boolean hasCost() {
      if (this.cost == null)
        return false;
      for (PlanBenefitCostComponent item : this.cost)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public PlanBenefitCostComponent addCost() { // 3
      PlanBenefitCostComponent t = new PlanBenefitCostComponent();
      if (this.cost == null)
        this.cost = new ArrayList<PlanBenefitCostComponent>();
      this.cost.add(t);
      return t;
    }

    public PlanBenefitComponent addCost(PlanBenefitCostComponent t) { // 3
      if (t == null)
        return this;
      if (this.cost == null)
        this.cost = new ArrayList<PlanBenefitCostComponent>();
      this.cost.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #cost}, creating it if
     *         it does not already exist
     */
    public PlanBenefitCostComponent getCostFirstRep() {
      if (getCost().isEmpty()) {
        addCost();
      }
      return getCost().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).",
          0, 1, type));
      children.add(new Property("cost", "", "List of the costs associated with a specific benefit.", 0,
          java.lang.Integer.MAX_VALUE, cost));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).",
            0, 1, type);
      case 3059661:
        /* cost */ return new Property("cost", "", "List of the costs associated with a specific benefit.", 0,
            java.lang.Integer.MAX_VALUE, cost);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case 3059661:
        /* cost */ return this.cost == null ? new Base[0] : this.cost.toArray(new Base[this.cost.size()]); // PlanBenefitCostComponent
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
      case 3059661: // cost
        this.getCost().add((PlanBenefitCostComponent) value); // PlanBenefitCostComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("cost")) {
        this.getCost().add((PlanBenefitCostComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("cost")) {
        this.getCost().remove((PlanBenefitCostComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case 3059661:
        return addCost();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case 3059661:
        /* cost */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("cost")) {
        return addCost();
      } else
        return super.addChild(name);
    }

    public PlanBenefitComponent copy() {
      PlanBenefitComponent dst = new PlanBenefitComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(PlanBenefitComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      if (cost != null) {
        dst.cost = new ArrayList<PlanBenefitCostComponent>();
        for (PlanBenefitCostComponent i : cost)
          dst.cost.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof PlanBenefitComponent))
        return false;
      PlanBenefitComponent o = (PlanBenefitComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(cost, o.cost, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof PlanBenefitComponent))
        return false;
      PlanBenefitComponent o = (PlanBenefitComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, cost);
    }

    public String fhirType() {
      return "InsurancePlan.plan.specificCost.benefit";

    }

  }

  @Block()
  public static class PlanBenefitCostComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Type of cost (copay; individual cap; family cap; coinsurance; deductible).
     */
    @Child(name = "type", type = {
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of cost", formalDefinition = "Type of cost (copay; individual cap; family cap; coinsurance; deductible).")
    protected CodeableConcept type;

    /**
     * Whether the cost applies to in-network or out-of-network providers
     * (in-network; out-of-network; other).
     */
    @Child(name = "applicability", type = {
        CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "in-network | out-of-network | other", formalDefinition = "Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/insuranceplan-applicability")
    protected CodeableConcept applicability;

    /**
     * Additional information about the cost, such as information about funding
     * sources (e.g. HSA, HRA, FSA, RRA).
     */
    @Child(name = "qualifiers", type = {
        CodeableConcept.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Additional information about the cost", formalDefinition = "Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).")
    protected List<CodeableConcept> qualifiers;

    /**
     * The actual cost value. (some of the costs may be represented as percentages
     * rather than currency, e.g. 10% coinsurance).
     */
    @Child(name = "value", type = { Quantity.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The actual cost value", formalDefinition = "The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).")
    protected Quantity value;

    private static final long serialVersionUID = -340688733L;

    /**
     * Constructor
     */
    public PlanBenefitCostComponent() {
      super();
    }

    /**
     * Constructor
     */
    public PlanBenefitCostComponent(CodeableConcept type) {
      super();
      this.type = type;
    }

    /**
     * @return {@link #type} (Type of cost (copay; individual cap; family cap;
     *         coinsurance; deductible).)
     */
    public CodeableConcept getType() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PlanBenefitCostComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of cost (copay; individual cap; family cap;
     *              coinsurance; deductible).)
     */
    public PlanBenefitCostComponent setType(CodeableConcept value) {
      this.type = value;
      return this;
    }

    /**
     * @return {@link #applicability} (Whether the cost applies to in-network or
     *         out-of-network providers (in-network; out-of-network; other).)
     */
    public CodeableConcept getApplicability() {
      if (this.applicability == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PlanBenefitCostComponent.applicability");
        else if (Configuration.doAutoCreate())
          this.applicability = new CodeableConcept(); // cc
      return this.applicability;
    }

    public boolean hasApplicability() {
      return this.applicability != null && !this.applicability.isEmpty();
    }

    /**
     * @param value {@link #applicability} (Whether the cost applies to in-network
     *              or out-of-network providers (in-network; out-of-network;
     *              other).)
     */
    public PlanBenefitCostComponent setApplicability(CodeableConcept value) {
      this.applicability = value;
      return this;
    }

    /**
     * @return {@link #qualifiers} (Additional information about the cost, such as
     *         information about funding sources (e.g. HSA, HRA, FSA, RRA).)
     */
    public List<CodeableConcept> getQualifiers() {
      if (this.qualifiers == null)
        this.qualifiers = new ArrayList<CodeableConcept>();
      return this.qualifiers;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public PlanBenefitCostComponent setQualifiers(List<CodeableConcept> theQualifiers) {
      this.qualifiers = theQualifiers;
      return this;
    }

    public boolean hasQualifiers() {
      if (this.qualifiers == null)
        return false;
      for (CodeableConcept item : this.qualifiers)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addQualifiers() { // 3
      CodeableConcept t = new CodeableConcept();
      if (this.qualifiers == null)
        this.qualifiers = new ArrayList<CodeableConcept>();
      this.qualifiers.add(t);
      return t;
    }

    public PlanBenefitCostComponent addQualifiers(CodeableConcept t) { // 3
      if (t == null)
        return this;
      if (this.qualifiers == null)
        this.qualifiers = new ArrayList<CodeableConcept>();
      this.qualifiers.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #qualifiers}, creating
     *         it if it does not already exist
     */
    public CodeableConcept getQualifiersFirstRep() {
      if (getQualifiers().isEmpty()) {
        addQualifiers();
      }
      return getQualifiers().get(0);
    }

    /**
     * @return {@link #value} (The actual cost value. (some of the costs may be
     *         represented as percentages rather than currency, e.g. 10%
     *         coinsurance).)
     */
    public Quantity getValue() {
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create PlanBenefitCostComponent.value");
        else if (Configuration.doAutoCreate())
          this.value = new Quantity(); // cc
      return this.value;
    }

    public boolean hasValue() {
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The actual cost value. (some of the costs may be
     *              represented as percentages rather than currency, e.g. 10%
     *              coinsurance).)
     */
    public PlanBenefitCostComponent setValue(Quantity value) {
      this.value = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "CodeableConcept",
          "Type of cost (copay; individual cap; family cap; coinsurance; deductible).", 0, 1, type));
      children.add(new Property("applicability", "CodeableConcept",
          "Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).", 0,
          1, applicability));
      children.add(new Property("qualifiers", "CodeableConcept",
          "Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).",
          0, java.lang.Integer.MAX_VALUE, qualifiers));
      children.add(new Property("value", "Quantity",
          "The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).",
          0, 1, value));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "CodeableConcept",
            "Type of cost (copay; individual cap; family cap; coinsurance; deductible).", 0, 1, type);
      case -1526770491:
        /* applicability */ return new Property("applicability", "CodeableConcept",
            "Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).",
            0, 1, applicability);
      case -31447799:
        /* qualifiers */ return new Property("qualifiers", "CodeableConcept",
            "Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).",
            0, java.lang.Integer.MAX_VALUE, qualifiers);
      case 111972721:
        /* value */ return new Property("value", "Quantity",
            "The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).",
            0, 1, value);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
      case -1526770491:
        /* applicability */ return this.applicability == null ? new Base[0] : new Base[] { this.applicability }; // CodeableConcept
      case -31447799:
        /* qualifiers */ return this.qualifiers == null ? new Base[0]
            : this.qualifiers.toArray(new Base[this.qualifiers.size()]); // CodeableConcept
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // Quantity
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
      case -1526770491: // applicability
        this.applicability = castToCodeableConcept(value); // CodeableConcept
        return value;
      case -31447799: // qualifiers
        this.getQualifiers().add(castToCodeableConcept(value)); // CodeableConcept
        return value;
      case 111972721: // value
        this.value = castToQuantity(value); // Quantity
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("applicability")) {
        this.applicability = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("qualifiers")) {
        this.getQualifiers().add(castToCodeableConcept(value));
      } else if (name.equals("value")) {
        this.value = castToQuantity(value); // Quantity
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("applicability")) {
        this.applicability = null;
      } else if (name.equals("qualifiers")) {
        this.getQualifiers().remove(castToCodeableConcept(value));
      } else if (name.equals("value")) {
        this.value = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getType();
      case -1526770491:
        return getApplicability();
      case -31447799:
        return addQualifiers();
      case 111972721:
        return getValue();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "CodeableConcept" };
      case -1526770491:
        /* applicability */ return new String[] { "CodeableConcept" };
      case -31447799:
        /* qualifiers */ return new String[] { "CodeableConcept" };
      case 111972721:
        /* value */ return new String[] { "Quantity" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        this.type = new CodeableConcept();
        return this.type;
      } else if (name.equals("applicability")) {
        this.applicability = new CodeableConcept();
        return this.applicability;
      } else if (name.equals("qualifiers")) {
        return addQualifiers();
      } else if (name.equals("value")) {
        this.value = new Quantity();
        return this.value;
      } else
        return super.addChild(name);
    }

    public PlanBenefitCostComponent copy() {
      PlanBenefitCostComponent dst = new PlanBenefitCostComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(PlanBenefitCostComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.applicability = applicability == null ? null : applicability.copy();
      if (qualifiers != null) {
        dst.qualifiers = new ArrayList<CodeableConcept>();
        for (CodeableConcept i : qualifiers)
          dst.qualifiers.add(i.copy());
      }
      ;
      dst.value = value == null ? null : value.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof PlanBenefitCostComponent))
        return false;
      PlanBenefitCostComponent o = (PlanBenefitCostComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(applicability, o.applicability, true)
          && compareDeep(qualifiers, o.qualifiers, true) && compareDeep(value, o.value, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof PlanBenefitCostComponent))
        return false;
      PlanBenefitCostComponent o = (PlanBenefitCostComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, applicability, qualifiers, value);
    }

    public String fhirType() {
      return "InsurancePlan.plan.specificCost.benefit.cost";

    }

  }

  /**
   * Business identifiers assigned to this health insurance product which remain
   * constant as the resource is updated and propagates from server to server.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Business Identifier for Product", formalDefinition = "Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.")
  protected List<Identifier> identifier;

  /**
   * The current state of the health insurance product.
   */
  @Child(name = "status", type = { CodeType.class }, order = 1, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "draft | active | retired | unknown", formalDefinition = "The current state of the health insurance product.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/publication-status")
  protected Enumeration<PublicationStatus> status;

  /**
   * The kind of health insurance product.
   */
  @Child(name = "type", type = {
      CodeableConcept.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Kind of product", formalDefinition = "The kind of health insurance product.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/insuranceplan-type")
  protected List<CodeableConcept> type;

  /**
   * Official name of the health insurance product as designated by the owner.
   */
  @Child(name = "name", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Official name", formalDefinition = "Official name of the health insurance product as designated by the owner.")
  protected StringType name;

  /**
   * A list of alternate names that the product is known as, or was known as in
   * the past.
   */
  @Child(name = "alias", type = {
      StringType.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Alternate names", formalDefinition = "A list of alternate names that the product is known as, or was known as in the past.")
  protected List<StringType> alias;

  /**
   * The period of time that the health insurance product is available.
   */
  @Child(name = "period", type = { Period.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "When the product is available", formalDefinition = "The period of time that the health insurance product is available.")
  protected Period period;

  /**
   * The entity that is providing the health insurance product and underwriting
   * the risk. This is typically an insurance carriers, other third-party payers,
   * or health plan sponsors comonly referred to as 'payers'.
   */
  @Child(name = "ownedBy", type = { Organization.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Plan issuer", formalDefinition = "The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.")
  protected Reference ownedBy;

  /**
   * The actual object that is the target of the reference (The entity that is
   * providing the health insurance product and underwriting the risk. This is
   * typically an insurance carriers, other third-party payers, or health plan
   * sponsors comonly referred to as 'payers'.)
   */
  protected Organization ownedByTarget;

  /**
   * An organization which administer other services such as underwriting,
   * customer service and/or claims processing on behalf of the health insurance
   * product owner.
   */
  @Child(name = "administeredBy", type = {
      Organization.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Product administrator", formalDefinition = "An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.")
  protected Reference administeredBy;

  /**
   * The actual object that is the target of the reference (An organization which
   * administer other services such as underwriting, customer service and/or
   * claims processing on behalf of the health insurance product owner.)
   */
  protected Organization administeredByTarget;

  /**
   * The geographic region in which a health insurance product's benefits apply.
   */
  @Child(name = "coverageArea", type = {
      Location.class }, order = 8, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Where product applies", formalDefinition = "The geographic region in which a health insurance product's benefits apply.")
  protected List<Reference> coverageArea;
  /**
   * The actual objects that are the target of the reference (The geographic
   * region in which a health insurance product's benefits apply.)
   */
  protected List<Location> coverageAreaTarget;

  /**
   * The contact for the health insurance product for a certain purpose.
   */
  @Child(name = "contact", type = {}, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Contact for the product", formalDefinition = "The contact for the health insurance product for a certain purpose.")
  protected List<InsurancePlanContactComponent> contact;

  /**
   * The technical endpoints providing access to services operated for the health
   * insurance product.
   */
  @Child(name = "endpoint", type = {
      Endpoint.class }, order = 10, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Technical endpoint", formalDefinition = "The technical endpoints providing access to services operated for the health insurance product.")
  protected List<Reference> endpoint;
  /**
   * The actual objects that are the target of the reference (The technical
   * endpoints providing access to services operated for the health insurance
   * product.)
   */
  protected List<Endpoint> endpointTarget;

  /**
   * Reference to the network included in the health insurance product.
   */
  @Child(name = "network", type = {
      Organization.class }, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "What networks are Included", formalDefinition = "Reference to the network included in the health insurance product.")
  protected List<Reference> network;
  /**
   * The actual objects that are the target of the reference (Reference to the
   * network included in the health insurance product.)
   */
  protected List<Organization> networkTarget;

  /**
   * Details about the coverage offered by the insurance product.
   */
  @Child(name = "coverage", type = {}, order = 12, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Coverage details", formalDefinition = "Details about the coverage offered by the insurance product.")
  protected List<InsurancePlanCoverageComponent> coverage;

  /**
   * Details about an insurance plan.
   */
  @Child(name = "plan", type = {}, order = 13, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Plan details", formalDefinition = "Details about an insurance plan.")
  protected List<InsurancePlanPlanComponent> plan;

  private static final long serialVersionUID = -1910594688L;

  /**
   * Constructor
   */
  public InsurancePlan() {
    super();
  }

  /**
   * @return {@link #identifier} (Business identifiers assigned to this health
   *         insurance product which remain constant as the resource is updated
   *         and propagates from server to server.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setIdentifier(List<Identifier> theIdentifier) {
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

  public InsurancePlan addIdentifier(Identifier t) { // 3
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
   * @return {@link #status} (The current state of the health insurance product.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getStatus" gives direct access to the value
   */
  public Enumeration<PublicationStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The current state of the health insurance
   *              product.). This is the underlying object with id, value and
   *              extensions. The accessor "getStatus" gives direct access to the
   *              value
   */
  public InsurancePlan setStatusElement(Enumeration<PublicationStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return The current state of the health insurance product.
   */
  public PublicationStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The current state of the health insurance product.
   */
  public InsurancePlan setStatus(PublicationStatus value) {
    if (value == null)
      this.status = null;
    else {
      if (this.status == null)
        this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
      this.status.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #type} (The kind of health insurance product.)
   */
  public List<CodeableConcept> getType() {
    if (this.type == null)
      this.type = new ArrayList<CodeableConcept>();
    return this.type;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setType(List<CodeableConcept> theType) {
    this.type = theType;
    return this;
  }

  public boolean hasType() {
    if (this.type == null)
      return false;
    for (CodeableConcept item : this.type)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addType() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.type == null)
      this.type = new ArrayList<CodeableConcept>();
    this.type.add(t);
    return t;
  }

  public InsurancePlan addType(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.type == null)
      this.type = new ArrayList<CodeableConcept>();
    this.type.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #type}, creating it if
   *         it does not already exist
   */
  public CodeableConcept getTypeFirstRep() {
    if (getType().isEmpty()) {
      addType();
    }
    return getType().get(0);
  }

  /**
   * @return {@link #name} (Official name of the health insurance product as
   *         designated by the owner.). This is the underlying object with id,
   *         value and extensions. The accessor "getName" gives direct access to
   *         the value
   */
  public StringType getNameElement() {
    if (this.name == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.name");
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
   * @param value {@link #name} (Official name of the health insurance product as
   *              designated by the owner.). This is the underlying object with
   *              id, value and extensions. The accessor "getName" gives direct
   *              access to the value
   */
  public InsurancePlan setNameElement(StringType value) {
    this.name = value;
    return this;
  }

  /**
   * @return Official name of the health insurance product as designated by the
   *         owner.
   */
  public String getName() {
    return this.name == null ? null : this.name.getValue();
  }

  /**
   * @param value Official name of the health insurance product as designated by
   *              the owner.
   */
  public InsurancePlan setName(String value) {
    if (Utilities.noString(value))
      this.name = null;
    else {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #alias} (A list of alternate names that the product is known
   *         as, or was known as in the past.)
   */
  public List<StringType> getAlias() {
    if (this.alias == null)
      this.alias = new ArrayList<StringType>();
    return this.alias;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setAlias(List<StringType> theAlias) {
    this.alias = theAlias;
    return this;
  }

  public boolean hasAlias() {
    if (this.alias == null)
      return false;
    for (StringType item : this.alias)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #alias} (A list of alternate names that the product is known
   *         as, or was known as in the past.)
   */
  public StringType addAliasElement() {// 2
    StringType t = new StringType();
    if (this.alias == null)
      this.alias = new ArrayList<StringType>();
    this.alias.add(t);
    return t;
  }

  /**
   * @param value {@link #alias} (A list of alternate names that the product is
   *              known as, or was known as in the past.)
   */
  public InsurancePlan addAlias(String value) { // 1
    StringType t = new StringType();
    t.setValue(value);
    if (this.alias == null)
      this.alias = new ArrayList<StringType>();
    this.alias.add(t);
    return this;
  }

  /**
   * @param value {@link #alias} (A list of alternate names that the product is
   *              known as, or was known as in the past.)
   */
  public boolean hasAlias(String value) {
    if (this.alias == null)
      return false;
    for (StringType v : this.alias)
      if (v.getValue().equals(value)) // string
        return true;
    return false;
  }

  /**
   * @return {@link #period} (The period of time that the health insurance product
   *         is available.)
   */
  public Period getPeriod() {
    if (this.period == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.period");
      else if (Configuration.doAutoCreate())
        this.period = new Period(); // cc
    return this.period;
  }

  public boolean hasPeriod() {
    return this.period != null && !this.period.isEmpty();
  }

  /**
   * @param value {@link #period} (The period of time that the health insurance
   *              product is available.)
   */
  public InsurancePlan setPeriod(Period value) {
    this.period = value;
    return this;
  }

  /**
   * @return {@link #ownedBy} (The entity that is providing the health insurance
   *         product and underwriting the risk. This is typically an insurance
   *         carriers, other third-party payers, or health plan sponsors comonly
   *         referred to as 'payers'.)
   */
  public Reference getOwnedBy() {
    if (this.ownedBy == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.ownedBy");
      else if (Configuration.doAutoCreate())
        this.ownedBy = new Reference(); // cc
    return this.ownedBy;
  }

  public boolean hasOwnedBy() {
    return this.ownedBy != null && !this.ownedBy.isEmpty();
  }

  /**
   * @param value {@link #ownedBy} (The entity that is providing the health
   *              insurance product and underwriting the risk. This is typically
   *              an insurance carriers, other third-party payers, or health plan
   *              sponsors comonly referred to as 'payers'.)
   */
  public InsurancePlan setOwnedBy(Reference value) {
    this.ownedBy = value;
    return this;
  }

  /**
   * @return {@link #ownedBy} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The entity that is
   *         providing the health insurance product and underwriting the risk.
   *         This is typically an insurance carriers, other third-party payers, or
   *         health plan sponsors comonly referred to as 'payers'.)
   */
  public Organization getOwnedByTarget() {
    if (this.ownedByTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.ownedBy");
      else if (Configuration.doAutoCreate())
        this.ownedByTarget = new Organization(); // aa
    return this.ownedByTarget;
  }

  /**
   * @param value {@link #ownedBy} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The entity that
   *              is providing the health insurance product and underwriting the
   *              risk. This is typically an insurance carriers, other third-party
   *              payers, or health plan sponsors comonly referred to as
   *              'payers'.)
   */
  public InsurancePlan setOwnedByTarget(Organization value) {
    this.ownedByTarget = value;
    return this;
  }

  /**
   * @return {@link #administeredBy} (An organization which administer other
   *         services such as underwriting, customer service and/or claims
   *         processing on behalf of the health insurance product owner.)
   */
  public Reference getAdministeredBy() {
    if (this.administeredBy == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.administeredBy");
      else if (Configuration.doAutoCreate())
        this.administeredBy = new Reference(); // cc
    return this.administeredBy;
  }

  public boolean hasAdministeredBy() {
    return this.administeredBy != null && !this.administeredBy.isEmpty();
  }

  /**
   * @param value {@link #administeredBy} (An organization which administer other
   *              services such as underwriting, customer service and/or claims
   *              processing on behalf of the health insurance product owner.)
   */
  public InsurancePlan setAdministeredBy(Reference value) {
    this.administeredBy = value;
    return this;
  }

  /**
   * @return {@link #administeredBy} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (An organization which
   *         administer other services such as underwriting, customer service
   *         and/or claims processing on behalf of the health insurance product
   *         owner.)
   */
  public Organization getAdministeredByTarget() {
    if (this.administeredByTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create InsurancePlan.administeredBy");
      else if (Configuration.doAutoCreate())
        this.administeredByTarget = new Organization(); // aa
    return this.administeredByTarget;
  }

  /**
   * @param value {@link #administeredBy} The actual object that is the target of
   *              the reference. The reference library doesn't use these, but you
   *              can use it to hold the resource if you resolve it. (An
   *              organization which administer other services such as
   *              underwriting, customer service and/or claims processing on
   *              behalf of the health insurance product owner.)
   */
  public InsurancePlan setAdministeredByTarget(Organization value) {
    this.administeredByTarget = value;
    return this;
  }

  /**
   * @return {@link #coverageArea} (The geographic region in which a health
   *         insurance product's benefits apply.)
   */
  public List<Reference> getCoverageArea() {
    if (this.coverageArea == null)
      this.coverageArea = new ArrayList<Reference>();
    return this.coverageArea;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setCoverageArea(List<Reference> theCoverageArea) {
    this.coverageArea = theCoverageArea;
    return this;
  }

  public boolean hasCoverageArea() {
    if (this.coverageArea == null)
      return false;
    for (Reference item : this.coverageArea)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addCoverageArea() { // 3
    Reference t = new Reference();
    if (this.coverageArea == null)
      this.coverageArea = new ArrayList<Reference>();
    this.coverageArea.add(t);
    return t;
  }

  public InsurancePlan addCoverageArea(Reference t) { // 3
    if (t == null)
      return this;
    if (this.coverageArea == null)
      this.coverageArea = new ArrayList<Reference>();
    this.coverageArea.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #coverageArea},
   *         creating it if it does not already exist
   */
  public Reference getCoverageAreaFirstRep() {
    if (getCoverageArea().isEmpty()) {
      addCoverageArea();
    }
    return getCoverageArea().get(0);
  }

  /**
   * @return {@link #contact} (The contact for the health insurance product for a
   *         certain purpose.)
   */
  public List<InsurancePlanContactComponent> getContact() {
    if (this.contact == null)
      this.contact = new ArrayList<InsurancePlanContactComponent>();
    return this.contact;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setContact(List<InsurancePlanContactComponent> theContact) {
    this.contact = theContact;
    return this;
  }

  public boolean hasContact() {
    if (this.contact == null)
      return false;
    for (InsurancePlanContactComponent item : this.contact)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public InsurancePlanContactComponent addContact() { // 3
    InsurancePlanContactComponent t = new InsurancePlanContactComponent();
    if (this.contact == null)
      this.contact = new ArrayList<InsurancePlanContactComponent>();
    this.contact.add(t);
    return t;
  }

  public InsurancePlan addContact(InsurancePlanContactComponent t) { // 3
    if (t == null)
      return this;
    if (this.contact == null)
      this.contact = new ArrayList<InsurancePlanContactComponent>();
    this.contact.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #contact}, creating it
   *         if it does not already exist
   */
  public InsurancePlanContactComponent getContactFirstRep() {
    if (getContact().isEmpty()) {
      addContact();
    }
    return getContact().get(0);
  }

  /**
   * @return {@link #endpoint} (The technical endpoints providing access to
   *         services operated for the health insurance product.)
   */
  public List<Reference> getEndpoint() {
    if (this.endpoint == null)
      this.endpoint = new ArrayList<Reference>();
    return this.endpoint;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setEndpoint(List<Reference> theEndpoint) {
    this.endpoint = theEndpoint;
    return this;
  }

  public boolean hasEndpoint() {
    if (this.endpoint == null)
      return false;
    for (Reference item : this.endpoint)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addEndpoint() { // 3
    Reference t = new Reference();
    if (this.endpoint == null)
      this.endpoint = new ArrayList<Reference>();
    this.endpoint.add(t);
    return t;
  }

  public InsurancePlan addEndpoint(Reference t) { // 3
    if (t == null)
      return this;
    if (this.endpoint == null)
      this.endpoint = new ArrayList<Reference>();
    this.endpoint.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #endpoint}, creating
   *         it if it does not already exist
   */
  public Reference getEndpointFirstRep() {
    if (getEndpoint().isEmpty()) {
      addEndpoint();
    }
    return getEndpoint().get(0);
  }

  /**
   * @return {@link #network} (Reference to the network included in the health
   *         insurance product.)
   */
  public List<Reference> getNetwork() {
    if (this.network == null)
      this.network = new ArrayList<Reference>();
    return this.network;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setNetwork(List<Reference> theNetwork) {
    this.network = theNetwork;
    return this;
  }

  public boolean hasNetwork() {
    if (this.network == null)
      return false;
    for (Reference item : this.network)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addNetwork() { // 3
    Reference t = new Reference();
    if (this.network == null)
      this.network = new ArrayList<Reference>();
    this.network.add(t);
    return t;
  }

  public InsurancePlan addNetwork(Reference t) { // 3
    if (t == null)
      return this;
    if (this.network == null)
      this.network = new ArrayList<Reference>();
    this.network.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #network}, creating it
   *         if it does not already exist
   */
  public Reference getNetworkFirstRep() {
    if (getNetwork().isEmpty()) {
      addNetwork();
    }
    return getNetwork().get(0);
  }

  /**
   * @return {@link #coverage} (Details about the coverage offered by the
   *         insurance product.)
   */
  public List<InsurancePlanCoverageComponent> getCoverage() {
    if (this.coverage == null)
      this.coverage = new ArrayList<InsurancePlanCoverageComponent>();
    return this.coverage;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setCoverage(List<InsurancePlanCoverageComponent> theCoverage) {
    this.coverage = theCoverage;
    return this;
  }

  public boolean hasCoverage() {
    if (this.coverage == null)
      return false;
    for (InsurancePlanCoverageComponent item : this.coverage)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public InsurancePlanCoverageComponent addCoverage() { // 3
    InsurancePlanCoverageComponent t = new InsurancePlanCoverageComponent();
    if (this.coverage == null)
      this.coverage = new ArrayList<InsurancePlanCoverageComponent>();
    this.coverage.add(t);
    return t;
  }

  public InsurancePlan addCoverage(InsurancePlanCoverageComponent t) { // 3
    if (t == null)
      return this;
    if (this.coverage == null)
      this.coverage = new ArrayList<InsurancePlanCoverageComponent>();
    this.coverage.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #coverage}, creating
   *         it if it does not already exist
   */
  public InsurancePlanCoverageComponent getCoverageFirstRep() {
    if (getCoverage().isEmpty()) {
      addCoverage();
    }
    return getCoverage().get(0);
  }

  /**
   * @return {@link #plan} (Details about an insurance plan.)
   */
  public List<InsurancePlanPlanComponent> getPlan() {
    if (this.plan == null)
      this.plan = new ArrayList<InsurancePlanPlanComponent>();
    return this.plan;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public InsurancePlan setPlan(List<InsurancePlanPlanComponent> thePlan) {
    this.plan = thePlan;
    return this;
  }

  public boolean hasPlan() {
    if (this.plan == null)
      return false;
    for (InsurancePlanPlanComponent item : this.plan)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public InsurancePlanPlanComponent addPlan() { // 3
    InsurancePlanPlanComponent t = new InsurancePlanPlanComponent();
    if (this.plan == null)
      this.plan = new ArrayList<InsurancePlanPlanComponent>();
    this.plan.add(t);
    return t;
  }

  public InsurancePlan addPlan(InsurancePlanPlanComponent t) { // 3
    if (t == null)
      return this;
    if (this.plan == null)
      this.plan = new ArrayList<InsurancePlanPlanComponent>();
    this.plan.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #plan}, creating it if
   *         it does not already exist
   */
  public InsurancePlanPlanComponent getPlanFirstRep() {
    if (getPlan().isEmpty()) {
      addPlan();
    }
    return getPlan().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier",
        "Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("status", "code", "The current state of the health insurance product.", 0, 1, status));
    children.add(new Property("type", "CodeableConcept", "The kind of health insurance product.", 0,
        java.lang.Integer.MAX_VALUE, type));
    children.add(new Property("name", "string",
        "Official name of the health insurance product as designated by the owner.", 0, 1, name));
    children.add(new Property("alias", "string",
        "A list of alternate names that the product is known as, or was known as in the past.", 0,
        java.lang.Integer.MAX_VALUE, alias));
    children.add(new Property("period", "Period", "The period of time that the health insurance product is available.",
        0, 1, period));
    children.add(new Property("ownedBy", "Reference(Organization)",
        "The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.",
        0, 1, ownedBy));
    children.add(new Property("administeredBy", "Reference(Organization)",
        "An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.",
        0, 1, administeredBy));
    children.add(new Property("coverageArea", "Reference(Location)",
        "The geographic region in which a health insurance product's benefits apply.", 0, java.lang.Integer.MAX_VALUE,
        coverageArea));
    children.add(new Property("contact", "", "The contact for the health insurance product for a certain purpose.", 0,
        java.lang.Integer.MAX_VALUE, contact));
    children.add(new Property("endpoint", "Reference(Endpoint)",
        "The technical endpoints providing access to services operated for the health insurance product.", 0,
        java.lang.Integer.MAX_VALUE, endpoint));
    children.add(new Property("network", "Reference(Organization)",
        "Reference to the network included in the health insurance product.", 0, java.lang.Integer.MAX_VALUE, network));
    children.add(new Property("coverage", "", "Details about the coverage offered by the insurance product.", 0,
        java.lang.Integer.MAX_VALUE, coverage));
    children.add(new Property("plan", "", "Details about an insurance plan.", 0, java.lang.Integer.MAX_VALUE, plan));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case -892481550:
      /* status */ return new Property("status", "code", "The current state of the health insurance product.", 0, 1,
          status);
    case 3575610:
      /* type */ return new Property("type", "CodeableConcept", "The kind of health insurance product.", 0,
          java.lang.Integer.MAX_VALUE, type);
    case 3373707:
      /* name */ return new Property("name", "string",
          "Official name of the health insurance product as designated by the owner.", 0, 1, name);
    case 92902992:
      /* alias */ return new Property("alias", "string",
          "A list of alternate names that the product is known as, or was known as in the past.", 0,
          java.lang.Integer.MAX_VALUE, alias);
    case -991726143:
      /* period */ return new Property("period", "Period",
          "The period of time that the health insurance product is available.", 0, 1, period);
    case -1054743076:
      /* ownedBy */ return new Property("ownedBy", "Reference(Organization)",
          "The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.",
          0, 1, ownedBy);
    case 898770462:
      /* administeredBy */ return new Property("administeredBy", "Reference(Organization)",
          "An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.",
          0, 1, administeredBy);
    case -1532328299:
      /* coverageArea */ return new Property("coverageArea", "Reference(Location)",
          "The geographic region in which a health insurance product's benefits apply.", 0, java.lang.Integer.MAX_VALUE,
          coverageArea);
    case 951526432:
      /* contact */ return new Property("contact", "",
          "The contact for the health insurance product for a certain purpose.", 0, java.lang.Integer.MAX_VALUE,
          contact);
    case 1741102485:
      /* endpoint */ return new Property("endpoint", "Reference(Endpoint)",
          "The technical endpoints providing access to services operated for the health insurance product.", 0,
          java.lang.Integer.MAX_VALUE, endpoint);
    case 1843485230:
      /* network */ return new Property("network", "Reference(Organization)",
          "Reference to the network included in the health insurance product.", 0, java.lang.Integer.MAX_VALUE,
          network);
    case -351767064:
      /* coverage */ return new Property("coverage", "", "Details about the coverage offered by the insurance product.",
          0, java.lang.Integer.MAX_VALUE, coverage);
    case 3443497:
      /* plan */ return new Property("plan", "", "Details about an insurance plan.", 0, java.lang.Integer.MAX_VALUE,
          plan);
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
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<PublicationStatus>
    case 3575610:
      /* type */ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
    case 3373707:
      /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
    case 92902992:
      /* alias */ return this.alias == null ? new Base[0] : this.alias.toArray(new Base[this.alias.size()]); // StringType
    case -991726143:
      /* period */ return this.period == null ? new Base[0] : new Base[] { this.period }; // Period
    case -1054743076:
      /* ownedBy */ return this.ownedBy == null ? new Base[0] : new Base[] { this.ownedBy }; // Reference
    case 898770462:
      /* administeredBy */ return this.administeredBy == null ? new Base[0] : new Base[] { this.administeredBy }; // Reference
    case -1532328299:
      /* coverageArea */ return this.coverageArea == null ? new Base[0]
          : this.coverageArea.toArray(new Base[this.coverageArea.size()]); // Reference
    case 951526432:
      /* contact */ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // InsurancePlanContactComponent
    case 1741102485:
      /* endpoint */ return this.endpoint == null ? new Base[0] : this.endpoint.toArray(new Base[this.endpoint.size()]); // Reference
    case 1843485230:
      /* network */ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
    case -351767064:
      /* coverage */ return this.coverage == null ? new Base[0] : this.coverage.toArray(new Base[this.coverage.size()]); // InsurancePlanCoverageComponent
    case 3443497:
      /* plan */ return this.plan == null ? new Base[0] : this.plan.toArray(new Base[this.plan.size()]); // InsurancePlanPlanComponent
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
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
      return value;
    case 3575610: // type
      this.getType().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 3373707: // name
      this.name = castToString(value); // StringType
      return value;
    case 92902992: // alias
      this.getAlias().add(castToString(value)); // StringType
      return value;
    case -991726143: // period
      this.period = castToPeriod(value); // Period
      return value;
    case -1054743076: // ownedBy
      this.ownedBy = castToReference(value); // Reference
      return value;
    case 898770462: // administeredBy
      this.administeredBy = castToReference(value); // Reference
      return value;
    case -1532328299: // coverageArea
      this.getCoverageArea().add(castToReference(value)); // Reference
      return value;
    case 951526432: // contact
      this.getContact().add((InsurancePlanContactComponent) value); // InsurancePlanContactComponent
      return value;
    case 1741102485: // endpoint
      this.getEndpoint().add(castToReference(value)); // Reference
      return value;
    case 1843485230: // network
      this.getNetwork().add(castToReference(value)); // Reference
      return value;
    case -351767064: // coverage
      this.getCoverage().add((InsurancePlanCoverageComponent) value); // InsurancePlanCoverageComponent
      return value;
    case 3443497: // plan
      this.getPlan().add((InsurancePlanPlanComponent) value); // InsurancePlanPlanComponent
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
      value = new PublicationStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<PublicationStatus>
    } else if (name.equals("type")) {
      this.getType().add(castToCodeableConcept(value));
    } else if (name.equals("name")) {
      this.name = castToString(value); // StringType
    } else if (name.equals("alias")) {
      this.getAlias().add(castToString(value));
    } else if (name.equals("period")) {
      this.period = castToPeriod(value); // Period
    } else if (name.equals("ownedBy")) {
      this.ownedBy = castToReference(value); // Reference
    } else if (name.equals("administeredBy")) {
      this.administeredBy = castToReference(value); // Reference
    } else if (name.equals("coverageArea")) {
      this.getCoverageArea().add(castToReference(value));
    } else if (name.equals("contact")) {
      this.getContact().add((InsurancePlanContactComponent) value);
    } else if (name.equals("endpoint")) {
      this.getEndpoint().add(castToReference(value));
    } else if (name.equals("network")) {
      this.getNetwork().add(castToReference(value));
    } else if (name.equals("coverage")) {
      this.getCoverage().add((InsurancePlanCoverageComponent) value);
    } else if (name.equals("plan")) {
      this.getPlan().add((InsurancePlanPlanComponent) value);
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
      this.getType().remove(castToCodeableConcept(value));
    } else if (name.equals("name")) {
      this.name = null;
    } else if (name.equals("alias")) {
      this.getAlias().remove(castToString(value));
    } else if (name.equals("period")) {
      this.period = null;
    } else if (name.equals("ownedBy")) {
      this.ownedBy = null;
    } else if (name.equals("administeredBy")) {
      this.administeredBy = null;
    } else if (name.equals("coverageArea")) {
      this.getCoverageArea().remove(castToReference(value));
    } else if (name.equals("contact")) {
      this.getContact().remove((InsurancePlanContactComponent) value);
    } else if (name.equals("endpoint")) {
      this.getEndpoint().remove(castToReference(value));
    } else if (name.equals("network")) {
      this.getNetwork().remove(castToReference(value));
    } else if (name.equals("coverage")) {
      this.getCoverage().remove((InsurancePlanCoverageComponent) value);
    } else if (name.equals("plan")) {
      this.getPlan().remove((InsurancePlanPlanComponent) value);
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
      return addType();
    case 3373707:
      return getNameElement();
    case 92902992:
      return addAliasElement();
    case -991726143:
      return getPeriod();
    case -1054743076:
      return getOwnedBy();
    case 898770462:
      return getAdministeredBy();
    case -1532328299:
      return addCoverageArea();
    case 951526432:
      return addContact();
    case 1741102485:
      return addEndpoint();
    case 1843485230:
      return addNetwork();
    case -351767064:
      return addCoverage();
    case 3443497:
      return addPlan();
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
    case 3373707:
      /* name */ return new String[] { "string" };
    case 92902992:
      /* alias */ return new String[] { "string" };
    case -991726143:
      /* period */ return new String[] { "Period" };
    case -1054743076:
      /* ownedBy */ return new String[] { "Reference" };
    case 898770462:
      /* administeredBy */ return new String[] { "Reference" };
    case -1532328299:
      /* coverageArea */ return new String[] { "Reference" };
    case 951526432:
      /* contact */ return new String[] {};
    case 1741102485:
      /* endpoint */ return new String[] { "Reference" };
    case 1843485230:
      /* network */ return new String[] { "Reference" };
    case -351767064:
      /* coverage */ return new String[] {};
    case 3443497:
      /* plan */ return new String[] {};
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.status");
    } else if (name.equals("type")) {
      return addType();
    } else if (name.equals("name")) {
      throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.name");
    } else if (name.equals("alias")) {
      throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.alias");
    } else if (name.equals("period")) {
      this.period = new Period();
      return this.period;
    } else if (name.equals("ownedBy")) {
      this.ownedBy = new Reference();
      return this.ownedBy;
    } else if (name.equals("administeredBy")) {
      this.administeredBy = new Reference();
      return this.administeredBy;
    } else if (name.equals("coverageArea")) {
      return addCoverageArea();
    } else if (name.equals("contact")) {
      return addContact();
    } else if (name.equals("endpoint")) {
      return addEndpoint();
    } else if (name.equals("network")) {
      return addNetwork();
    } else if (name.equals("coverage")) {
      return addCoverage();
    } else if (name.equals("plan")) {
      return addPlan();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "InsurancePlan";

  }

  public InsurancePlan copy() {
    InsurancePlan dst = new InsurancePlan();
    copyValues(dst);
    return dst;
  }

  public void copyValues(InsurancePlan dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    if (type != null) {
      dst.type = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : type)
        dst.type.add(i.copy());
    }
    ;
    dst.name = name == null ? null : name.copy();
    if (alias != null) {
      dst.alias = new ArrayList<StringType>();
      for (StringType i : alias)
        dst.alias.add(i.copy());
    }
    ;
    dst.period = period == null ? null : period.copy();
    dst.ownedBy = ownedBy == null ? null : ownedBy.copy();
    dst.administeredBy = administeredBy == null ? null : administeredBy.copy();
    if (coverageArea != null) {
      dst.coverageArea = new ArrayList<Reference>();
      for (Reference i : coverageArea)
        dst.coverageArea.add(i.copy());
    }
    ;
    if (contact != null) {
      dst.contact = new ArrayList<InsurancePlanContactComponent>();
      for (InsurancePlanContactComponent i : contact)
        dst.contact.add(i.copy());
    }
    ;
    if (endpoint != null) {
      dst.endpoint = new ArrayList<Reference>();
      for (Reference i : endpoint)
        dst.endpoint.add(i.copy());
    }
    ;
    if (network != null) {
      dst.network = new ArrayList<Reference>();
      for (Reference i : network)
        dst.network.add(i.copy());
    }
    ;
    if (coverage != null) {
      dst.coverage = new ArrayList<InsurancePlanCoverageComponent>();
      for (InsurancePlanCoverageComponent i : coverage)
        dst.coverage.add(i.copy());
    }
    ;
    if (plan != null) {
      dst.plan = new ArrayList<InsurancePlanPlanComponent>();
      for (InsurancePlanPlanComponent i : plan)
        dst.plan.add(i.copy());
    }
    ;
  }

  protected InsurancePlan typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof InsurancePlan))
      return false;
    InsurancePlan o = (InsurancePlan) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true)
        && compareDeep(type, o.type, true) && compareDeep(name, o.name, true) && compareDeep(alias, o.alias, true)
        && compareDeep(period, o.period, true) && compareDeep(ownedBy, o.ownedBy, true)
        && compareDeep(administeredBy, o.administeredBy, true) && compareDeep(coverageArea, o.coverageArea, true)
        && compareDeep(contact, o.contact, true) && compareDeep(endpoint, o.endpoint, true)
        && compareDeep(network, o.network, true) && compareDeep(coverage, o.coverage, true)
        && compareDeep(plan, o.plan, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof InsurancePlan))
      return false;
    InsurancePlan o = (InsurancePlan) other_;
    return compareValues(status, o.status, true) && compareValues(name, o.name, true)
        && compareValues(alias, o.alias, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, type, name, alias, period,
        ownedBy, administeredBy, coverageArea, contact, endpoint, network, coverage, plan);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.InsurancePlan;
  }

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Any identifier for the organization (not the accreditation
   * issuer's identifier)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "InsurancePlan.identifier", description = "Any identifier for the organization (not the accreditation issuer's identifier)", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Any identifier for the organization (not the accreditation
   * issuer's identifier)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string
   * fields in the Address, including line, city, district, state, country,
   * postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address", path = "InsurancePlan.contact.address", description = "A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text", type = "string")
  public static final String SP_ADDRESS = "address";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string
   * fields in the Address, including line, city, district, state, country,
   * postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_ADDRESS);

  /**
   * Search parameter: <b>address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.state</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address-state", path = "InsurancePlan.contact.address.state", description = "A state specified in an address", type = "string")
  public static final String SP_ADDRESS_STATE = "address-state";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.state</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_STATE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_ADDRESS_STATE);

  /**
   * Search parameter: <b>owned-by</b>
   * <p>
   * Description: <b>An organization of which this organization forms a
   * part</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.ownedBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "owned-by", path = "InsurancePlan.ownedBy", description = "An organization of which this organization forms a part", type = "reference", target = {
      Organization.class })
  public static final String SP_OWNED_BY = "owned-by";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>owned-by</b>
   * <p>
   * Description: <b>An organization of which this organization forms a
   * part</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.ownedBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam OWNED_BY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_OWNED_BY);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:owned-by</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_OWNED_BY = new ca.uhn.fhir.model.api.Include(
      "InsurancePlan:owned-by").toLocked();

  /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>A code for the type of organization</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "type", path = "InsurancePlan.type", description = "A code for the type of organization", type = "token")
  public static final String SP_TYPE = "type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>A code for the type of organization</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_TYPE);

  /**
   * Search parameter: <b>address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.postalCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address-postalcode", path = "InsurancePlan.contact.address.postalCode", description = "A postal code specified in an address", type = "string")
  public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.postalCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_POSTALCODE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_ADDRESS_POSTALCODE);

  /**
   * Search parameter: <b>administered-by</b>
   * <p>
   * Description: <b>Product administrator</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.administeredBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "administered-by", path = "InsurancePlan.administeredBy", description = "Product administrator", type = "reference", target = {
      Organization.class })
  public static final String SP_ADMINISTERED_BY = "administered-by";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>administered-by</b>
   * <p>
   * Description: <b>Product administrator</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.administeredBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ADMINISTERED_BY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ADMINISTERED_BY);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:administered-by</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ADMINISTERED_BY = new ca.uhn.fhir.model.api.Include(
      "InsurancePlan:administered-by").toLocked();

  /**
   * Search parameter: <b>address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.country</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address-country", path = "InsurancePlan.contact.address.country", description = "A country specified in an address", type = "string")
  public static final String SP_ADDRESS_COUNTRY = "address-country";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.country</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_COUNTRY = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_ADDRESS_COUNTRY);

  /**
   * Search parameter: <b>endpoint</b>
   * <p>
   * Description: <b>Technical endpoint</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.endpoint</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "endpoint", path = "InsurancePlan.endpoint", description = "Technical endpoint", type = "reference", target = {
      Endpoint.class })
  public static final String SP_ENDPOINT = "endpoint";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>endpoint</b>
   * <p>
   * Description: <b>Technical endpoint</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.endpoint</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENDPOINT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ENDPOINT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:endpoint</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENDPOINT = new ca.uhn.fhir.model.api.Include(
      "InsurancePlan:endpoint").toLocked();

  /**
   * Search parameter: <b>phonetic</b>
   * <p>
   * Description: <b>A portion of the organization's name using some kind of
   * phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "phonetic", path = "InsurancePlan.name", description = "A portion of the organization's name using some kind of phonetic matching algorithm", type = "string")
  public static final String SP_PHONETIC = "phonetic";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
   * <p>
   * Description: <b>A portion of the organization's name using some kind of
   * phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PHONETIC = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_PHONETIC);

  /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>A portion of the organization's name or alias</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.name, InsurancePlan.alias</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "name", path = "name | alias", description = "A portion of the organization's name or alias", type = "string")
  public static final String SP_NAME = "name";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>A portion of the organization's name or alias</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.name, InsurancePlan.alias</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_NAME);

  /**
   * Search parameter: <b>address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.contact.address.use</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address-use", path = "InsurancePlan.contact.address.use", description = "A use code specified in an address", type = "token")
  public static final String SP_ADDRESS_USE = "address-use";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.contact.address.use</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ADDRESS_USE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_ADDRESS_USE);

  /**
   * Search parameter: <b>address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.city</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "address-city", path = "InsurancePlan.contact.address.city", description = "A city specified in an address", type = "string")
  public static final String SP_ADDRESS_CITY = "address-city";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsurancePlan.contact.address.city</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam ADDRESS_CITY = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_ADDRESS_CITY);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Is the Organization record active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "InsurancePlan.status", description = "Is the Organization record active", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Is the Organization record active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}