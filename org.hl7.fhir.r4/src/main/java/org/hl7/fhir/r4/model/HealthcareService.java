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
 * The details of a healthcare service available at a location.
 */
@ResourceDef(name = "HealthcareService", profile = "http://hl7.org/fhir/StructureDefinition/HealthcareService")
public class HealthcareService extends DomainResource {

  public enum DaysOfWeek {
    /**
     * Monday.
     */
    MON,
    /**
     * Tuesday.
     */
    TUE,
    /**
     * Wednesday.
     */
    WED,
    /**
     * Thursday.
     */
    THU,
    /**
     * Friday.
     */
    FRI,
    /**
     * Saturday.
     */
    SAT,
    /**
     * Sunday.
     */
    SUN,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static DaysOfWeek fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("mon".equals(codeString))
        return MON;
      if ("tue".equals(codeString))
        return TUE;
      if ("wed".equals(codeString))
        return WED;
      if ("thu".equals(codeString))
        return THU;
      if ("fri".equals(codeString))
        return FRI;
      if ("sat".equals(codeString))
        return SAT;
      if ("sun".equals(codeString))
        return SUN;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case MON:
        return "mon";
      case TUE:
        return "tue";
      case WED:
        return "wed";
      case THU:
        return "thu";
      case FRI:
        return "fri";
      case SAT:
        return "sat";
      case SUN:
        return "sun";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case MON:
        return "http://hl7.org/fhir/days-of-week";
      case TUE:
        return "http://hl7.org/fhir/days-of-week";
      case WED:
        return "http://hl7.org/fhir/days-of-week";
      case THU:
        return "http://hl7.org/fhir/days-of-week";
      case FRI:
        return "http://hl7.org/fhir/days-of-week";
      case SAT:
        return "http://hl7.org/fhir/days-of-week";
      case SUN:
        return "http://hl7.org/fhir/days-of-week";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case MON:
        return "Monday.";
      case TUE:
        return "Tuesday.";
      case WED:
        return "Wednesday.";
      case THU:
        return "Thursday.";
      case FRI:
        return "Friday.";
      case SAT:
        return "Saturday.";
      case SUN:
        return "Sunday.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case MON:
        return "Monday";
      case TUE:
        return "Tuesday";
      case WED:
        return "Wednesday";
      case THU:
        return "Thursday";
      case FRI:
        return "Friday";
      case SAT:
        return "Saturday";
      case SUN:
        return "Sunday";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class DaysOfWeekEnumFactory implements EnumFactory<DaysOfWeek> {
    public DaysOfWeek fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("mon".equals(codeString))
        return DaysOfWeek.MON;
      if ("tue".equals(codeString))
        return DaysOfWeek.TUE;
      if ("wed".equals(codeString))
        return DaysOfWeek.WED;
      if ("thu".equals(codeString))
        return DaysOfWeek.THU;
      if ("fri".equals(codeString))
        return DaysOfWeek.FRI;
      if ("sat".equals(codeString))
        return DaysOfWeek.SAT;
      if ("sun".equals(codeString))
        return DaysOfWeek.SUN;
      throw new IllegalArgumentException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public Enumeration<DaysOfWeek> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.NULL, code);
      if ("mon".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.MON, code);
      if ("tue".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.TUE, code);
      if ("wed".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.WED, code);
      if ("thu".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.THU, code);
      if ("fri".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.FRI, code);
      if ("sat".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SAT, code);
      if ("sun".equals(codeString))
        return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SUN, code);
      throw new FHIRException("Unknown DaysOfWeek code '" + codeString + "'");
    }

    public String toCode(DaysOfWeek code) {
       if (code == DaysOfWeek.NULL)
           return null;
       if (code == DaysOfWeek.MON)
        return "mon";
      if (code == DaysOfWeek.TUE)
        return "tue";
      if (code == DaysOfWeek.WED)
        return "wed";
      if (code == DaysOfWeek.THU)
        return "thu";
      if (code == DaysOfWeek.FRI)
        return "fri";
      if (code == DaysOfWeek.SAT)
        return "sat";
      if (code == DaysOfWeek.SUN)
        return "sun";
      return "?";
   }

    public String toSystem(DaysOfWeek code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class HealthcareServiceEligibilityComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Coded value for the eligibility.
     */
    @Child(name = "code", type = {
        CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Coded value for the eligibility", formalDefinition = "Coded value for the eligibility.")
    protected CodeableConcept code;

    /**
     * Describes the eligibility conditions for the service.
     */
    @Child(name = "comment", type = {
        MarkdownType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Describes the eligibility conditions for the service", formalDefinition = "Describes the eligibility conditions for the service.")
    protected MarkdownType comment;

    private static final long serialVersionUID = 1078065348L;

    /**
     * Constructor
     */
    public HealthcareServiceEligibilityComponent() {
      super();
    }

    /**
     * @return {@link #code} (Coded value for the eligibility.)
     */
    public CodeableConcept getCode() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceEligibilityComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeableConcept(); // cc
      return this.code;
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Coded value for the eligibility.)
     */
    public HealthcareServiceEligibilityComponent setCode(CodeableConcept value) {
      this.code = value;
      return this;
    }

    /**
     * @return {@link #comment} (Describes the eligibility conditions for the
     *         service.). This is the underlying object with id, value and
     *         extensions. The accessor "getComment" gives direct access to the
     *         value
     */
    public MarkdownType getCommentElement() {
      if (this.comment == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceEligibilityComponent.comment");
        else if (Configuration.doAutoCreate())
          this.comment = new MarkdownType(); // bb
      return this.comment;
    }

    public boolean hasCommentElement() {
      return this.comment != null && !this.comment.isEmpty();
    }

    public boolean hasComment() {
      return this.comment != null && !this.comment.isEmpty();
    }

    /**
     * @param value {@link #comment} (Describes the eligibility conditions for the
     *              service.). This is the underlying object with id, value and
     *              extensions. The accessor "getComment" gives direct access to the
     *              value
     */
    public HealthcareServiceEligibilityComponent setCommentElement(MarkdownType value) {
      this.comment = value;
      return this;
    }

    /**
     * @return Describes the eligibility conditions for the service.
     */
    public String getComment() {
      return this.comment == null ? null : this.comment.getValue();
    }

    /**
     * @param value Describes the eligibility conditions for the service.
     */
    public HealthcareServiceEligibilityComponent setComment(String value) {
      if (value == null)
        this.comment = null;
      else {
        if (this.comment == null)
          this.comment = new MarkdownType();
        this.comment.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("code", "CodeableConcept", "Coded value for the eligibility.", 0, 1, code));
      children.add(
          new Property("comment", "markdown", "Describes the eligibility conditions for the service.", 0, 1, comment));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3059181:
        /* code */ return new Property("code", "CodeableConcept", "Coded value for the eligibility.", 0, 1, code);
      case 950398559:
        /* comment */ return new Property("comment", "markdown",
            "Describes the eligibility conditions for the service.", 0, 1, comment);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeableConcept
      case 950398559:
        /* comment */ return this.comment == null ? new Base[0] : new Base[] { this.comment }; // MarkdownType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3059181: // code
        this.code = castToCodeableConcept(value); // CodeableConcept
        return value;
      case 950398559: // comment
        this.comment = castToMarkdown(value); // MarkdownType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = castToCodeableConcept(value); // CodeableConcept
      } else if (name.equals("comment")) {
        this.comment = castToMarkdown(value); // MarkdownType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = null;
      } else if (name.equals("comment")) {
        this.comment = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        return getCode();
      case 950398559:
        return getCommentElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return new String[] { "CodeableConcept" };
      case 950398559:
        /* comment */ return new String[] { "markdown" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("code")) {
        this.code = new CodeableConcept();
        return this.code;
      } else if (name.equals("comment")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.comment");
      } else
        return super.addChild(name);
    }

    public HealthcareServiceEligibilityComponent copy() {
      HealthcareServiceEligibilityComponent dst = new HealthcareServiceEligibilityComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(HealthcareServiceEligibilityComponent dst) {
      super.copyValues(dst);
      dst.code = code == null ? null : code.copy();
      dst.comment = comment == null ? null : comment.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceEligibilityComponent))
        return false;
      HealthcareServiceEligibilityComponent o = (HealthcareServiceEligibilityComponent) other_;
      return compareDeep(code, o.code, true) && compareDeep(comment, o.comment, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceEligibilityComponent))
        return false;
      HealthcareServiceEligibilityComponent o = (HealthcareServiceEligibilityComponent) other_;
      return compareValues(comment, o.comment, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, comment);
    }

    public String fhirType() {
      return "HealthcareService.eligibility";

    }

  }

  @Block()
  public static class HealthcareServiceAvailableTimeComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Indicates which days of the week are available between the start and end
     * Times.
     */
    @Child(name = "daysOfWeek", type = {
        CodeType.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "mon | tue | wed | thu | fri | sat | sun", formalDefinition = "Indicates which days of the week are available between the start and end Times.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/days-of-week")
    protected List<Enumeration<DaysOfWeek>> daysOfWeek;

    /**
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service.
     */
    @Child(name = "allDay", type = {
        BooleanType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Always available? e.g. 24 hour service", formalDefinition = "Is this always available? (hence times are irrelevant) e.g. 24 hour service.")
    protected BooleanType allDay;

    /**
     * The opening time of day. Note: If the AllDay flag is set, then this time is
     * ignored.
     */
    @Child(name = "availableStartTime", type = {
        TimeType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Opening time of day (ignored if allDay = true)", formalDefinition = "The opening time of day. Note: If the AllDay flag is set, then this time is ignored.")
    protected TimeType availableStartTime;

    /**
     * The closing time of day. Note: If the AllDay flag is set, then this time is
     * ignored.
     */
    @Child(name = "availableEndTime", type = {
        TimeType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Closing time of day (ignored if allDay = true)", formalDefinition = "The closing time of day. Note: If the AllDay flag is set, then this time is ignored.")
    protected TimeType availableEndTime;

    private static final long serialVersionUID = -2139510127L;

    /**
     * Constructor
     */
    public HealthcareServiceAvailableTimeComponent() {
      super();
    }

    /**
     * @return {@link #daysOfWeek} (Indicates which days of the week are available
     *         between the start and end Times.)
     */
    public List<Enumeration<DaysOfWeek>> getDaysOfWeek() {
      if (this.daysOfWeek == null)
        this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
      return this.daysOfWeek;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public HealthcareServiceAvailableTimeComponent setDaysOfWeek(List<Enumeration<DaysOfWeek>> theDaysOfWeek) {
      this.daysOfWeek = theDaysOfWeek;
      return this;
    }

    public boolean hasDaysOfWeek() {
      if (this.daysOfWeek == null)
        return false;
      for (Enumeration<DaysOfWeek> item : this.daysOfWeek)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #daysOfWeek} (Indicates which days of the week are available
     *         between the start and end Times.)
     */
    public Enumeration<DaysOfWeek> addDaysOfWeekElement() {// 2
      Enumeration<DaysOfWeek> t = new Enumeration<DaysOfWeek>(new DaysOfWeekEnumFactory());
      if (this.daysOfWeek == null)
        this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
      this.daysOfWeek.add(t);
      return t;
    }

    /**
     * @param value {@link #daysOfWeek} (Indicates which days of the week are
     *              available between the start and end Times.)
     */
    public HealthcareServiceAvailableTimeComponent addDaysOfWeek(DaysOfWeek value) { // 1
      Enumeration<DaysOfWeek> t = new Enumeration<DaysOfWeek>(new DaysOfWeekEnumFactory());
      t.setValue(value);
      if (this.daysOfWeek == null)
        this.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
      this.daysOfWeek.add(t);
      return this;
    }

    /**
     * @param value {@link #daysOfWeek} (Indicates which days of the week are
     *              available between the start and end Times.)
     */
    public boolean hasDaysOfWeek(DaysOfWeek value) {
      if (this.daysOfWeek == null)
        return false;
      for (Enumeration<DaysOfWeek> v : this.daysOfWeek)
        if (v.getValue().equals(value)) // code
          return true;
      return false;
    }

    /**
     * @return {@link #allDay} (Is this always available? (hence times are
     *         irrelevant) e.g. 24 hour service.). This is the underlying object
     *         with id, value and extensions. The accessor "getAllDay" gives direct
     *         access to the value
     */
    public BooleanType getAllDayElement() {
      if (this.allDay == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.allDay");
        else if (Configuration.doAutoCreate())
          this.allDay = new BooleanType(); // bb
      return this.allDay;
    }

    public boolean hasAllDayElement() {
      return this.allDay != null && !this.allDay.isEmpty();
    }

    public boolean hasAllDay() {
      return this.allDay != null && !this.allDay.isEmpty();
    }

    /**
     * @param value {@link #allDay} (Is this always available? (hence times are
     *              irrelevant) e.g. 24 hour service.). This is the underlying
     *              object with id, value and extensions. The accessor "getAllDay"
     *              gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAllDayElement(BooleanType value) {
      this.allDay = value;
      return this;
    }

    /**
     * @return Is this always available? (hence times are irrelevant) e.g. 24 hour
     *         service.
     */
    public boolean getAllDay() {
      return this.allDay == null || this.allDay.isEmpty() ? false : this.allDay.getValue();
    }

    /**
     * @param value Is this always available? (hence times are irrelevant) e.g. 24
     *              hour service.
     */
    public HealthcareServiceAvailableTimeComponent setAllDay(boolean value) {
      if (this.allDay == null)
        this.allDay = new BooleanType();
      this.allDay.setValue(value);
      return this;
    }

    /**
     * @return {@link #availableStartTime} (The opening time of day. Note: If the
     *         AllDay flag is set, then this time is ignored.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getAvailableStartTime" gives direct access to the value
     */
    public TimeType getAvailableStartTimeElement() {
      if (this.availableStartTime == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.availableStartTime");
        else if (Configuration.doAutoCreate())
          this.availableStartTime = new TimeType(); // bb
      return this.availableStartTime;
    }

    public boolean hasAvailableStartTimeElement() {
      return this.availableStartTime != null && !this.availableStartTime.isEmpty();
    }

    public boolean hasAvailableStartTime() {
      return this.availableStartTime != null && !this.availableStartTime.isEmpty();
    }

    /**
     * @param value {@link #availableStartTime} (The opening time of day. Note: If
     *              the AllDay flag is set, then this time is ignored.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getAvailableStartTime" gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAvailableStartTimeElement(TimeType value) {
      this.availableStartTime = value;
      return this;
    }

    /**
     * @return The opening time of day. Note: If the AllDay flag is set, then this
     *         time is ignored.
     */
    public String getAvailableStartTime() {
      return this.availableStartTime == null ? null : this.availableStartTime.getValue();
    }

    /**
     * @param value The opening time of day. Note: If the AllDay flag is set, then
     *              this time is ignored.
     */
    public HealthcareServiceAvailableTimeComponent setAvailableStartTime(String value) {
      if (value == null)
        this.availableStartTime = null;
      else {
        if (this.availableStartTime == null)
          this.availableStartTime = new TimeType();
        this.availableStartTime.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #availableEndTime} (The closing time of day. Note: If the
     *         AllDay flag is set, then this time is ignored.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getAvailableEndTime" gives direct access to the value
     */
    public TimeType getAvailableEndTimeElement() {
      if (this.availableEndTime == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceAvailableTimeComponent.availableEndTime");
        else if (Configuration.doAutoCreate())
          this.availableEndTime = new TimeType(); // bb
      return this.availableEndTime;
    }

    public boolean hasAvailableEndTimeElement() {
      return this.availableEndTime != null && !this.availableEndTime.isEmpty();
    }

    public boolean hasAvailableEndTime() {
      return this.availableEndTime != null && !this.availableEndTime.isEmpty();
    }

    /**
     * @param value {@link #availableEndTime} (The closing time of day. Note: If the
     *              AllDay flag is set, then this time is ignored.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getAvailableEndTime" gives direct access to the value
     */
    public HealthcareServiceAvailableTimeComponent setAvailableEndTimeElement(TimeType value) {
      this.availableEndTime = value;
      return this;
    }

    /**
     * @return The closing time of day. Note: If the AllDay flag is set, then this
     *         time is ignored.
     */
    public String getAvailableEndTime() {
      return this.availableEndTime == null ? null : this.availableEndTime.getValue();
    }

    /**
     * @param value The closing time of day. Note: If the AllDay flag is set, then
     *              this time is ignored.
     */
    public HealthcareServiceAvailableTimeComponent setAvailableEndTime(String value) {
      if (value == null)
        this.availableEndTime = null;
      else {
        if (this.availableEndTime == null)
          this.availableEndTime = new TimeType();
        this.availableEndTime.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("daysOfWeek", "code",
          "Indicates which days of the week are available between the start and end Times.", 0,
          java.lang.Integer.MAX_VALUE, daysOfWeek));
      children.add(new Property("allDay", "boolean",
          "Is this always available? (hence times are irrelevant) e.g. 24 hour service.", 0, 1, allDay));
      children.add(new Property("availableStartTime", "time",
          "The opening time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, 1,
          availableStartTime));
      children.add(new Property("availableEndTime", "time",
          "The closing time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, 1,
          availableEndTime));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 68050338:
        /* daysOfWeek */ return new Property("daysOfWeek", "code",
            "Indicates which days of the week are available between the start and end Times.", 0,
            java.lang.Integer.MAX_VALUE, daysOfWeek);
      case -1414913477:
        /* allDay */ return new Property("allDay", "boolean",
            "Is this always available? (hence times are irrelevant) e.g. 24 hour service.", 0, 1, allDay);
      case -1039453818:
        /* availableStartTime */ return new Property("availableStartTime", "time",
            "The opening time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, 1,
            availableStartTime);
      case 101151551:
        /* availableEndTime */ return new Property("availableEndTime", "time",
            "The closing time of day. Note: If the AllDay flag is set, then this time is ignored.", 0, 1,
            availableEndTime);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 68050338:
        /* daysOfWeek */ return this.daysOfWeek == null ? new Base[0]
            : this.daysOfWeek.toArray(new Base[this.daysOfWeek.size()]); // Enumeration<DaysOfWeek>
      case -1414913477:
        /* allDay */ return this.allDay == null ? new Base[0] : new Base[] { this.allDay }; // BooleanType
      case -1039453818:
        /* availableStartTime */ return this.availableStartTime == null ? new Base[0]
            : new Base[] { this.availableStartTime }; // TimeType
      case 101151551:
        /* availableEndTime */ return this.availableEndTime == null ? new Base[0]
            : new Base[] { this.availableEndTime }; // TimeType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 68050338: // daysOfWeek
        value = new DaysOfWeekEnumFactory().fromType(castToCode(value));
        this.getDaysOfWeek().add((Enumeration) value); // Enumeration<DaysOfWeek>
        return value;
      case -1414913477: // allDay
        this.allDay = castToBoolean(value); // BooleanType
        return value;
      case -1039453818: // availableStartTime
        this.availableStartTime = castToTime(value); // TimeType
        return value;
      case 101151551: // availableEndTime
        this.availableEndTime = castToTime(value); // TimeType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("daysOfWeek")) {
        value = new DaysOfWeekEnumFactory().fromType(castToCode(value));
        this.getDaysOfWeek().add((Enumeration) value);
      } else if (name.equals("allDay")) {
        this.allDay = castToBoolean(value); // BooleanType
      } else if (name.equals("availableStartTime")) {
        this.availableStartTime = castToTime(value); // TimeType
      } else if (name.equals("availableEndTime")) {
        this.availableEndTime = castToTime(value); // TimeType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("daysOfWeek")) {
        this.getDaysOfWeek().remove((Enumeration) value);
      } else if (name.equals("allDay")) {
        this.allDay = null;
      } else if (name.equals("availableStartTime")) {
        this.availableStartTime = null;
      } else if (name.equals("availableEndTime")) {
        this.availableEndTime = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 68050338:
        return addDaysOfWeekElement();
      case -1414913477:
        return getAllDayElement();
      case -1039453818:
        return getAvailableStartTimeElement();
      case 101151551:
        return getAvailableEndTimeElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 68050338:
        /* daysOfWeek */ return new String[] { "code" };
      case -1414913477:
        /* allDay */ return new String[] { "boolean" };
      case -1039453818:
        /* availableStartTime */ return new String[] { "time" };
      case 101151551:
        /* availableEndTime */ return new String[] { "time" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("daysOfWeek")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.daysOfWeek");
      } else if (name.equals("allDay")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.allDay");
      } else if (name.equals("availableStartTime")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.availableStartTime");
      } else if (name.equals("availableEndTime")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.availableEndTime");
      } else
        return super.addChild(name);
    }

    public HealthcareServiceAvailableTimeComponent copy() {
      HealthcareServiceAvailableTimeComponent dst = new HealthcareServiceAvailableTimeComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(HealthcareServiceAvailableTimeComponent dst) {
      super.copyValues(dst);
      if (daysOfWeek != null) {
        dst.daysOfWeek = new ArrayList<Enumeration<DaysOfWeek>>();
        for (Enumeration<DaysOfWeek> i : daysOfWeek)
          dst.daysOfWeek.add(i.copy());
      }
      ;
      dst.allDay = allDay == null ? null : allDay.copy();
      dst.availableStartTime = availableStartTime == null ? null : availableStartTime.copy();
      dst.availableEndTime = availableEndTime == null ? null : availableEndTime.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceAvailableTimeComponent))
        return false;
      HealthcareServiceAvailableTimeComponent o = (HealthcareServiceAvailableTimeComponent) other_;
      return compareDeep(daysOfWeek, o.daysOfWeek, true) && compareDeep(allDay, o.allDay, true)
          && compareDeep(availableStartTime, o.availableStartTime, true)
          && compareDeep(availableEndTime, o.availableEndTime, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceAvailableTimeComponent))
        return false;
      HealthcareServiceAvailableTimeComponent o = (HealthcareServiceAvailableTimeComponent) other_;
      return compareValues(daysOfWeek, o.daysOfWeek, true) && compareValues(allDay, o.allDay, true)
          && compareValues(availableStartTime, o.availableStartTime, true)
          && compareValues(availableEndTime, o.availableEndTime, true);
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(daysOfWeek, allDay, availableStartTime, availableEndTime);
    }

    public String fhirType() {
      return "HealthcareService.availableTime";

    }

  }

  @Block()
  public static class HealthcareServiceNotAvailableComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The reason that can be presented to the user as to why this time is not
     * available.
     */
    @Child(name = "description", type = {
        StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Reason presented to the user explaining why time not available", formalDefinition = "The reason that can be presented to the user as to why this time is not available.")
    protected StringType description;

    /**
     * Service is not available (seasonally or for a public holiday) from this date.
     */
    @Child(name = "during", type = { Period.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Service not available from this date", formalDefinition = "Service is not available (seasonally or for a public holiday) from this date.")
    protected Period during;

    private static final long serialVersionUID = 310849929L;

    /**
     * Constructor
     */
    public HealthcareServiceNotAvailableComponent() {
      super();
    }

    /**
     * Constructor
     */
    public HealthcareServiceNotAvailableComponent(StringType description) {
      super();
      this.description = description;
    }

    /**
     * @return {@link #description} (The reason that can be presented to the user as
     *         to why this time is not available.). This is the underlying object
     *         with id, value and extensions. The accessor "getDescription" gives
     *         direct access to the value
     */
    public StringType getDescriptionElement() {
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceNotAvailableComponent.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() {
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (The reason that can be presented to the
     *              user as to why this time is not available.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getDescription" gives direct access to the value
     */
    public HealthcareServiceNotAvailableComponent setDescriptionElement(StringType value) {
      this.description = value;
      return this;
    }

    /**
     * @return The reason that can be presented to the user as to why this time is
     *         not available.
     */
    public String getDescription() {
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value The reason that can be presented to the user as to why this time
     *              is not available.
     */
    public HealthcareServiceNotAvailableComponent setDescription(String value) {
      if (this.description == null)
        this.description = new StringType();
      this.description.setValue(value);
      return this;
    }

    /**
     * @return {@link #during} (Service is not available (seasonally or for a public
     *         holiday) from this date.)
     */
    public Period getDuring() {
      if (this.during == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create HealthcareServiceNotAvailableComponent.during");
        else if (Configuration.doAutoCreate())
          this.during = new Period(); // cc
      return this.during;
    }

    public boolean hasDuring() {
      return this.during != null && !this.during.isEmpty();
    }

    /**
     * @param value {@link #during} (Service is not available (seasonally or for a
     *              public holiday) from this date.)
     */
    public HealthcareServiceNotAvailableComponent setDuring(Period value) {
      this.during = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("description", "string",
          "The reason that can be presented to the user as to why this time is not available.", 0, 1, description));
      children.add(new Property("during", "Period",
          "Service is not available (seasonally or for a public holiday) from this date.", 0, 1, during));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -1724546052:
        /* description */ return new Property("description", "string",
            "The reason that can be presented to the user as to why this time is not available.", 0, 1, description);
      case -1320499647:
        /* during */ return new Property("during", "Period",
            "Service is not available (seasonally or for a public holiday) from this date.", 0, 1, during);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -1724546052:
        /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // StringType
      case -1320499647:
        /* during */ return this.during == null ? new Base[0] : new Base[] { this.during }; // Period
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -1724546052: // description
        this.description = castToString(value); // StringType
        return value;
      case -1320499647: // during
        this.during = castToPeriod(value); // Period
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("description")) {
        this.description = castToString(value); // StringType
      } else if (name.equals("during")) {
        this.during = castToPeriod(value); // Period
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("description")) {
        this.description = null;
      } else if (name.equals("during")) {
        this.during = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1724546052:
        return getDescriptionElement();
      case -1320499647:
        return getDuring();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1724546052:
        /* description */ return new String[] { "string" };
      case -1320499647:
        /* during */ return new String[] { "Period" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("description")) {
        throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.description");
      } else if (name.equals("during")) {
        this.during = new Period();
        return this.during;
      } else
        return super.addChild(name);
    }

    public HealthcareServiceNotAvailableComponent copy() {
      HealthcareServiceNotAvailableComponent dst = new HealthcareServiceNotAvailableComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(HealthcareServiceNotAvailableComponent dst) {
      super.copyValues(dst);
      dst.description = description == null ? null : description.copy();
      dst.during = during == null ? null : during.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceNotAvailableComponent))
        return false;
      HealthcareServiceNotAvailableComponent o = (HealthcareServiceNotAvailableComponent) other_;
      return compareDeep(description, o.description, true) && compareDeep(during, o.during, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof HealthcareServiceNotAvailableComponent))
        return false;
      HealthcareServiceNotAvailableComponent o = (HealthcareServiceNotAvailableComponent) other_;
      return compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, during);
    }

    public String fhirType() {
      return "HealthcareService.notAvailable";

    }

  }

  /**
   * External identifiers for this item.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "External identifiers for this item", formalDefinition = "External identifiers for this item.")
  protected List<Identifier> identifier;

  /**
   * This flag is used to mark the record to not be used. This is not used when a
   * center is closed for maintenance, or for holidays, the notAvailable period is
   * to be used for this.
   */
  @Child(name = "active", type = { BooleanType.class }, order = 1, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "Whether this HealthcareService record is in active use", formalDefinition = "This flag is used to mark the record to not be used. This is not used when a center is closed for maintenance, or for holidays, the notAvailable period is to be used for this.")
  protected BooleanType active;

  /**
   * The organization that provides this healthcare service.
   */
  @Child(name = "providedBy", type = {
      Organization.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Organization that provides this service", formalDefinition = "The organization that provides this healthcare service.")
  protected Reference providedBy;

  /**
   * The actual object that is the target of the reference (The organization that
   * provides this healthcare service.)
   */
  protected Organization providedByTarget;

  /**
   * Identifies the broad category of service being performed or delivered.
   */
  @Child(name = "category", type = {
      CodeableConcept.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Broad category of service being performed or delivered", formalDefinition = "Identifies the broad category of service being performed or delivered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-category")
  protected List<CodeableConcept> category;

  /**
   * The specific type of service that may be delivered or performed.
   */
  @Child(name = "type", type = {
      CodeableConcept.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Type of service that may be delivered or performed", formalDefinition = "The specific type of service that may be delivered or performed.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-type")
  protected List<CodeableConcept> type;

  /**
   * Collection of specialties handled by the service site. This is more of a
   * medical term.
   */
  @Child(name = "specialty", type = {
      CodeableConcept.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Specialties handled by the HealthcareService", formalDefinition = "Collection of specialties handled by the service site. This is more of a medical term.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-practice-codes")
  protected List<CodeableConcept> specialty;

  /**
   * The location(s) where this healthcare service may be provided.
   */
  @Child(name = "location", type = {
      Location.class }, order = 6, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Location(s) where service may be provided", formalDefinition = "The location(s) where this healthcare service may be provided.")
  protected List<Reference> location;
  /**
   * The actual objects that are the target of the reference (The location(s)
   * where this healthcare service may be provided.)
   */
  protected List<Location> locationTarget;

  /**
   * Further description of the service as it would be presented to a consumer
   * while searching.
   */
  @Child(name = "name", type = { StringType.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Description of service as presented to a consumer while searching", formalDefinition = "Further description of the service as it would be presented to a consumer while searching.")
  protected StringType name;

  /**
   * Any additional description of the service and/or any specific issues not
   * covered by the other attributes, which can be displayed as further detail
   * under the serviceName.
   */
  @Child(name = "comment", type = { StringType.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Additional description and/or any specific issues not covered elsewhere", formalDefinition = "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.")
  protected StringType comment;

  /**
   * Extra details about the service that can't be placed in the other fields.
   */
  @Child(name = "extraDetails", type = {
      MarkdownType.class }, order = 9, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Extra details about the service that can't be placed in the other fields", formalDefinition = "Extra details about the service that can't be placed in the other fields.")
  protected MarkdownType extraDetails;

  /**
   * If there is a photo/symbol associated with this HealthcareService, it may be
   * included here to facilitate quick identification of the service in a list.
   */
  @Child(name = "photo", type = { Attachment.class }, order = 10, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Facilitates quick identification of the service", formalDefinition = "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.")
  protected Attachment photo;

  /**
   * List of contacts related to this specific healthcare service.
   */
  @Child(name = "telecom", type = {
      ContactPoint.class }, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Contacts related to the healthcare service", formalDefinition = "List of contacts related to this specific healthcare service.")
  protected List<ContactPoint> telecom;

  /**
   * The location(s) that this service is available to (not where the service is
   * provided).
   */
  @Child(name = "coverageArea", type = {
      Location.class }, order = 12, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Location(s) service is intended for/available to", formalDefinition = "The location(s) that this service is available to (not where the service is provided).")
  protected List<Reference> coverageArea;
  /**
   * The actual objects that are the target of the reference (The location(s) that
   * this service is available to (not where the service is provided).)
   */
  protected List<Location> coverageAreaTarget;

  /**
   * The code(s) that detail the conditions under which the healthcare service is
   * available/offered.
   */
  @Child(name = "serviceProvisionCode", type = {
      CodeableConcept.class }, order = 13, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Conditions under which service is available/offered", formalDefinition = "The code(s) that detail the conditions under which the healthcare service is available/offered.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-provision-conditions")
  protected List<CodeableConcept> serviceProvisionCode;

  /**
   * Does this service have specific eligibility requirements that need to be met
   * in order to use the service?
   */
  @Child(name = "eligibility", type = {}, order = 14, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Specific eligibility requirements required to use the service", formalDefinition = "Does this service have specific eligibility requirements that need to be met in order to use the service?")
  protected List<HealthcareServiceEligibilityComponent> eligibility;

  /**
   * Programs that this service is applicable to.
   */
  @Child(name = "program", type = {
      CodeableConcept.class }, order = 15, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Programs that this service is applicable to", formalDefinition = "Programs that this service is applicable to.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/program")
  protected List<CodeableConcept> program;

  /**
   * Collection of characteristics (attributes).
   */
  @Child(name = "characteristic", type = {
      CodeableConcept.class }, order = 16, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Collection of characteristics (attributes)", formalDefinition = "Collection of characteristics (attributes).")
  protected List<CodeableConcept> characteristic;

  /**
   * Some services are specifically made available in multiple languages, this
   * property permits a directory to declare the languages this is offered in.
   * Typically this is only provided where a service operates in communities with
   * mixed languages used.
   */
  @Child(name = "communication", type = {
      CodeableConcept.class }, order = 17, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "The language that this service is offered in", formalDefinition = "Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
  protected List<CodeableConcept> communication;

  /**
   * Ways that the service accepts referrals, if this is not provided then it is
   * implied that no referral is required.
   */
  @Child(name = "referralMethod", type = {
      CodeableConcept.class }, order = 18, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Ways that the service accepts referrals", formalDefinition = "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-referral-method")
  protected List<CodeableConcept> referralMethod;

  /**
   * Indicates whether or not a prospective consumer will require an appointment
   * for a particular service at a site to be provided by the Organization.
   * Indicates if an appointment is required for access to this service.
   */
  @Child(name = "appointmentRequired", type = {
      BooleanType.class }, order = 19, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "If an appointment is required for access to this service", formalDefinition = "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.")
  protected BooleanType appointmentRequired;

  /**
   * A collection of times that the Service Site is available.
   */
  @Child(name = "availableTime", type = {}, order = 20, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Times the Service Site is available", formalDefinition = "A collection of times that the Service Site is available.")
  protected List<HealthcareServiceAvailableTimeComponent> availableTime;

  /**
   * The HealthcareService is not available during this period of time due to the
   * provided reason.
   */
  @Child(name = "notAvailable", type = {}, order = 21, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Not available during this time due to provided reason", formalDefinition = "The HealthcareService is not available during this period of time due to the provided reason.")
  protected List<HealthcareServiceNotAvailableComponent> notAvailable;

  /**
   * A description of site availability exceptions, e.g. public holiday
   * availability. Succinctly describing all possible exceptions to normal site
   * availability as details in the available Times and not available Times.
   */
  @Child(name = "availabilityExceptions", type = {
      StringType.class }, order = 22, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Description of availability exceptions", formalDefinition = "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.")
  protected StringType availabilityExceptions;

  /**
   * Technical endpoints providing access to services operated for the specific
   * healthcare services defined at this resource.
   */
  @Child(name = "endpoint", type = {
      Endpoint.class }, order = 23, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Technical endpoints providing access to electronic services operated for the healthcare service", formalDefinition = "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.")
  protected List<Reference> endpoint;
  /**
   * The actual objects that are the target of the reference (Technical endpoints
   * providing access to services operated for the specific healthcare services
   * defined at this resource.)
   */
  protected List<Endpoint> endpointTarget;

  private static final long serialVersionUID = -2002412666L;

  /**
   * Constructor
   */
  public HealthcareService() {
    super();
  }

  /**
   * @return {@link #identifier} (External identifiers for this item.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setIdentifier(List<Identifier> theIdentifier) {
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

  public HealthcareService addIdentifier(Identifier t) { // 3
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
   * @return {@link #active} (This flag is used to mark the record to not be used.
   *         This is not used when a center is closed for maintenance, or for
   *         holidays, the notAvailable period is to be used for this.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getActive" gives direct access to the value
   */
  public BooleanType getActiveElement() {
    if (this.active == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.active");
      else if (Configuration.doAutoCreate())
        this.active = new BooleanType(); // bb
    return this.active;
  }

  public boolean hasActiveElement() {
    return this.active != null && !this.active.isEmpty();
  }

  public boolean hasActive() {
    return this.active != null && !this.active.isEmpty();
  }

  /**
   * @param value {@link #active} (This flag is used to mark the record to not be
   *              used. This is not used when a center is closed for maintenance,
   *              or for holidays, the notAvailable period is to be used for
   *              this.). This is the underlying object with id, value and
   *              extensions. The accessor "getActive" gives direct access to the
   *              value
   */
  public HealthcareService setActiveElement(BooleanType value) {
    this.active = value;
    return this;
  }

  /**
   * @return This flag is used to mark the record to not be used. This is not used
   *         when a center is closed for maintenance, or for holidays, the
   *         notAvailable period is to be used for this.
   */
  public boolean getActive() {
    return this.active == null || this.active.isEmpty() ? false : this.active.getValue();
  }

  /**
   * @param value This flag is used to mark the record to not be used. This is not
   *              used when a center is closed for maintenance, or for holidays,
   *              the notAvailable period is to be used for this.
   */
  public HealthcareService setActive(boolean value) {
    if (this.active == null)
      this.active = new BooleanType();
    this.active.setValue(value);
    return this;
  }

  /**
   * @return {@link #providedBy} (The organization that provides this healthcare
   *         service.)
   */
  public Reference getProvidedBy() {
    if (this.providedBy == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.providedBy");
      else if (Configuration.doAutoCreate())
        this.providedBy = new Reference(); // cc
    return this.providedBy;
  }

  public boolean hasProvidedBy() {
    return this.providedBy != null && !this.providedBy.isEmpty();
  }

  /**
   * @param value {@link #providedBy} (The organization that provides this
   *              healthcare service.)
   */
  public HealthcareService setProvidedBy(Reference value) {
    this.providedBy = value;
    return this;
  }

  /**
   * @return {@link #providedBy} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The organization that
   *         provides this healthcare service.)
   */
  public Organization getProvidedByTarget() {
    if (this.providedByTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.providedBy");
      else if (Configuration.doAutoCreate())
        this.providedByTarget = new Organization(); // aa
    return this.providedByTarget;
  }

  /**
   * @param value {@link #providedBy} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The organization
   *              that provides this healthcare service.)
   */
  public HealthcareService setProvidedByTarget(Organization value) {
    this.providedByTarget = value;
    return this;
  }

  /**
   * @return {@link #category} (Identifies the broad category of service being
   *         performed or delivered.)
   */
  public List<CodeableConcept> getCategory() {
    if (this.category == null)
      this.category = new ArrayList<CodeableConcept>();
    return this.category;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setCategory(List<CodeableConcept> theCategory) {
    this.category = theCategory;
    return this;
  }

  public boolean hasCategory() {
    if (this.category == null)
      return false;
    for (CodeableConcept item : this.category)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addCategory() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.category == null)
      this.category = new ArrayList<CodeableConcept>();
    this.category.add(t);
    return t;
  }

  public HealthcareService addCategory(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.category == null)
      this.category = new ArrayList<CodeableConcept>();
    this.category.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #category}, creating
   *         it if it does not already exist
   */
  public CodeableConcept getCategoryFirstRep() {
    if (getCategory().isEmpty()) {
      addCategory();
    }
    return getCategory().get(0);
  }

  /**
   * @return {@link #type} (The specific type of service that may be delivered or
   *         performed.)
   */
  public List<CodeableConcept> getType() {
    if (this.type == null)
      this.type = new ArrayList<CodeableConcept>();
    return this.type;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setType(List<CodeableConcept> theType) {
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

  public HealthcareService addType(CodeableConcept t) { // 3
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
   * @return {@link #specialty} (Collection of specialties handled by the service
   *         site. This is more of a medical term.)
   */
  public List<CodeableConcept> getSpecialty() {
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    return this.specialty;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setSpecialty(List<CodeableConcept> theSpecialty) {
    this.specialty = theSpecialty;
    return this;
  }

  public boolean hasSpecialty() {
    if (this.specialty == null)
      return false;
    for (CodeableConcept item : this.specialty)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addSpecialty() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    this.specialty.add(t);
    return t;
  }

  public HealthcareService addSpecialty(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.specialty == null)
      this.specialty = new ArrayList<CodeableConcept>();
    this.specialty.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #specialty}, creating
   *         it if it does not already exist
   */
  public CodeableConcept getSpecialtyFirstRep() {
    if (getSpecialty().isEmpty()) {
      addSpecialty();
    }
    return getSpecialty().get(0);
  }

  /**
   * @return {@link #location} (The location(s) where this healthcare service may
   *         be provided.)
   */
  public List<Reference> getLocation() {
    if (this.location == null)
      this.location = new ArrayList<Reference>();
    return this.location;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setLocation(List<Reference> theLocation) {
    this.location = theLocation;
    return this;
  }

  public boolean hasLocation() {
    if (this.location == null)
      return false;
    for (Reference item : this.location)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addLocation() { // 3
    Reference t = new Reference();
    if (this.location == null)
      this.location = new ArrayList<Reference>();
    this.location.add(t);
    return t;
  }

  public HealthcareService addLocation(Reference t) { // 3
    if (t == null)
      return this;
    if (this.location == null)
      this.location = new ArrayList<Reference>();
    this.location.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #location}, creating
   *         it if it does not already exist
   */
  public Reference getLocationFirstRep() {
    if (getLocation().isEmpty()) {
      addLocation();
    }
    return getLocation().get(0);
  }

  /**
   * @return {@link #name} (Further description of the service as it would be
   *         presented to a consumer while searching.). This is the underlying
   *         object with id, value and extensions. The accessor "getName" gives
   *         direct access to the value
   */
  public StringType getNameElement() {
    if (this.name == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.name");
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
   * @param value {@link #name} (Further description of the service as it would be
   *              presented to a consumer while searching.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getName" gives direct access to the value
   */
  public HealthcareService setNameElement(StringType value) {
    this.name = value;
    return this;
  }

  /**
   * @return Further description of the service as it would be presented to a
   *         consumer while searching.
   */
  public String getName() {
    return this.name == null ? null : this.name.getValue();
  }

  /**
   * @param value Further description of the service as it would be presented to a
   *              consumer while searching.
   */
  public HealthcareService setName(String value) {
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
   * @return {@link #comment} (Any additional description of the service and/or
   *         any specific issues not covered by the other attributes, which can be
   *         displayed as further detail under the serviceName.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getComment" gives direct access to the value
   */
  public StringType getCommentElement() {
    if (this.comment == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.comment");
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
   * @param value {@link #comment} (Any additional description of the service
   *              and/or any specific issues not covered by the other attributes,
   *              which can be displayed as further detail under the
   *              serviceName.). This is the underlying object with id, value and
   *              extensions. The accessor "getComment" gives direct access to the
   *              value
   */
  public HealthcareService setCommentElement(StringType value) {
    this.comment = value;
    return this;
  }

  /**
   * @return Any additional description of the service and/or any specific issues
   *         not covered by the other attributes, which can be displayed as
   *         further detail under the serviceName.
   */
  public String getComment() {
    return this.comment == null ? null : this.comment.getValue();
  }

  /**
   * @param value Any additional description of the service and/or any specific
   *              issues not covered by the other attributes, which can be
   *              displayed as further detail under the serviceName.
   */
  public HealthcareService setComment(String value) {
    if (Utilities.noString(value))
      this.comment = null;
    else {
      if (this.comment == null)
        this.comment = new StringType();
      this.comment.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #extraDetails} (Extra details about the service that can't be
   *         placed in the other fields.). This is the underlying object with id,
   *         value and extensions. The accessor "getExtraDetails" gives direct
   *         access to the value
   */
  public MarkdownType getExtraDetailsElement() {
    if (this.extraDetails == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.extraDetails");
      else if (Configuration.doAutoCreate())
        this.extraDetails = new MarkdownType(); // bb
    return this.extraDetails;
  }

  public boolean hasExtraDetailsElement() {
    return this.extraDetails != null && !this.extraDetails.isEmpty();
  }

  public boolean hasExtraDetails() {
    return this.extraDetails != null && !this.extraDetails.isEmpty();
  }

  /**
   * @param value {@link #extraDetails} (Extra details about the service that
   *              can't be placed in the other fields.). This is the underlying
   *              object with id, value and extensions. The accessor
   *              "getExtraDetails" gives direct access to the value
   */
  public HealthcareService setExtraDetailsElement(MarkdownType value) {
    this.extraDetails = value;
    return this;
  }

  /**
   * @return Extra details about the service that can't be placed in the other
   *         fields.
   */
  public String getExtraDetails() {
    return this.extraDetails == null ? null : this.extraDetails.getValue();
  }

  /**
   * @param value Extra details about the service that can't be placed in the
   *              other fields.
   */
  public HealthcareService setExtraDetails(String value) {
    if (value == null)
      this.extraDetails = null;
    else {
      if (this.extraDetails == null)
        this.extraDetails = new MarkdownType();
      this.extraDetails.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #photo} (If there is a photo/symbol associated with this
   *         HealthcareService, it may be included here to facilitate quick
   *         identification of the service in a list.)
   */
  public Attachment getPhoto() {
    if (this.photo == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.photo");
      else if (Configuration.doAutoCreate())
        this.photo = new Attachment(); // cc
    return this.photo;
  }

  public boolean hasPhoto() {
    return this.photo != null && !this.photo.isEmpty();
  }

  /**
   * @param value {@link #photo} (If there is a photo/symbol associated with this
   *              HealthcareService, it may be included here to facilitate quick
   *              identification of the service in a list.)
   */
  public HealthcareService setPhoto(Attachment value) {
    this.photo = value;
    return this;
  }

  /**
   * @return {@link #telecom} (List of contacts related to this specific
   *         healthcare service.)
   */
  public List<ContactPoint> getTelecom() {
    if (this.telecom == null)
      this.telecom = new ArrayList<ContactPoint>();
    return this.telecom;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setTelecom(List<ContactPoint> theTelecom) {
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

  public HealthcareService addTelecom(ContactPoint t) { // 3
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
   * @return {@link #coverageArea} (The location(s) that this service is available
   *         to (not where the service is provided).)
   */
  public List<Reference> getCoverageArea() {
    if (this.coverageArea == null)
      this.coverageArea = new ArrayList<Reference>();
    return this.coverageArea;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setCoverageArea(List<Reference> theCoverageArea) {
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

  public HealthcareService addCoverageArea(Reference t) { // 3
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
   * @return {@link #serviceProvisionCode} (The code(s) that detail the conditions
   *         under which the healthcare service is available/offered.)
   */
  public List<CodeableConcept> getServiceProvisionCode() {
    if (this.serviceProvisionCode == null)
      this.serviceProvisionCode = new ArrayList<CodeableConcept>();
    return this.serviceProvisionCode;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setServiceProvisionCode(List<CodeableConcept> theServiceProvisionCode) {
    this.serviceProvisionCode = theServiceProvisionCode;
    return this;
  }

  public boolean hasServiceProvisionCode() {
    if (this.serviceProvisionCode == null)
      return false;
    for (CodeableConcept item : this.serviceProvisionCode)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addServiceProvisionCode() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.serviceProvisionCode == null)
      this.serviceProvisionCode = new ArrayList<CodeableConcept>();
    this.serviceProvisionCode.add(t);
    return t;
  }

  public HealthcareService addServiceProvisionCode(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.serviceProvisionCode == null)
      this.serviceProvisionCode = new ArrayList<CodeableConcept>();
    this.serviceProvisionCode.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field
   *         {@link #serviceProvisionCode}, creating it if it does not already
   *         exist
   */
  public CodeableConcept getServiceProvisionCodeFirstRep() {
    if (getServiceProvisionCode().isEmpty()) {
      addServiceProvisionCode();
    }
    return getServiceProvisionCode().get(0);
  }

  /**
   * @return {@link #eligibility} (Does this service have specific eligibility
   *         requirements that need to be met in order to use the service?)
   */
  public List<HealthcareServiceEligibilityComponent> getEligibility() {
    if (this.eligibility == null)
      this.eligibility = new ArrayList<HealthcareServiceEligibilityComponent>();
    return this.eligibility;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setEligibility(List<HealthcareServiceEligibilityComponent> theEligibility) {
    this.eligibility = theEligibility;
    return this;
  }

  public boolean hasEligibility() {
    if (this.eligibility == null)
      return false;
    for (HealthcareServiceEligibilityComponent item : this.eligibility)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public HealthcareServiceEligibilityComponent addEligibility() { // 3
    HealthcareServiceEligibilityComponent t = new HealthcareServiceEligibilityComponent();
    if (this.eligibility == null)
      this.eligibility = new ArrayList<HealthcareServiceEligibilityComponent>();
    this.eligibility.add(t);
    return t;
  }

  public HealthcareService addEligibility(HealthcareServiceEligibilityComponent t) { // 3
    if (t == null)
      return this;
    if (this.eligibility == null)
      this.eligibility = new ArrayList<HealthcareServiceEligibilityComponent>();
    this.eligibility.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #eligibility},
   *         creating it if it does not already exist
   */
  public HealthcareServiceEligibilityComponent getEligibilityFirstRep() {
    if (getEligibility().isEmpty()) {
      addEligibility();
    }
    return getEligibility().get(0);
  }

  /**
   * @return {@link #program} (Programs that this service is applicable to.)
   */
  public List<CodeableConcept> getProgram() {
    if (this.program == null)
      this.program = new ArrayList<CodeableConcept>();
    return this.program;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setProgram(List<CodeableConcept> theProgram) {
    this.program = theProgram;
    return this;
  }

  public boolean hasProgram() {
    if (this.program == null)
      return false;
    for (CodeableConcept item : this.program)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addProgram() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.program == null)
      this.program = new ArrayList<CodeableConcept>();
    this.program.add(t);
    return t;
  }

  public HealthcareService addProgram(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.program == null)
      this.program = new ArrayList<CodeableConcept>();
    this.program.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #program}, creating it
   *         if it does not already exist
   */
  public CodeableConcept getProgramFirstRep() {
    if (getProgram().isEmpty()) {
      addProgram();
    }
    return getProgram().get(0);
  }

  /**
   * @return {@link #characteristic} (Collection of characteristics (attributes).)
   */
  public List<CodeableConcept> getCharacteristic() {
    if (this.characteristic == null)
      this.characteristic = new ArrayList<CodeableConcept>();
    return this.characteristic;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setCharacteristic(List<CodeableConcept> theCharacteristic) {
    this.characteristic = theCharacteristic;
    return this;
  }

  public boolean hasCharacteristic() {
    if (this.characteristic == null)
      return false;
    for (CodeableConcept item : this.characteristic)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addCharacteristic() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.characteristic == null)
      this.characteristic = new ArrayList<CodeableConcept>();
    this.characteristic.add(t);
    return t;
  }

  public HealthcareService addCharacteristic(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.characteristic == null)
      this.characteristic = new ArrayList<CodeableConcept>();
    this.characteristic.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #characteristic},
   *         creating it if it does not already exist
   */
  public CodeableConcept getCharacteristicFirstRep() {
    if (getCharacteristic().isEmpty()) {
      addCharacteristic();
    }
    return getCharacteristic().get(0);
  }

  /**
   * @return {@link #communication} (Some services are specifically made available
   *         in multiple languages, this property permits a directory to declare
   *         the languages this is offered in. Typically this is only provided
   *         where a service operates in communities with mixed languages used.)
   */
  public List<CodeableConcept> getCommunication() {
    if (this.communication == null)
      this.communication = new ArrayList<CodeableConcept>();
    return this.communication;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setCommunication(List<CodeableConcept> theCommunication) {
    this.communication = theCommunication;
    return this;
  }

  public boolean hasCommunication() {
    if (this.communication == null)
      return false;
    for (CodeableConcept item : this.communication)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addCommunication() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.communication == null)
      this.communication = new ArrayList<CodeableConcept>();
    this.communication.add(t);
    return t;
  }

  public HealthcareService addCommunication(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.communication == null)
      this.communication = new ArrayList<CodeableConcept>();
    this.communication.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #communication},
   *         creating it if it does not already exist
   */
  public CodeableConcept getCommunicationFirstRep() {
    if (getCommunication().isEmpty()) {
      addCommunication();
    }
    return getCommunication().get(0);
  }

  /**
   * @return {@link #referralMethod} (Ways that the service accepts referrals, if
   *         this is not provided then it is implied that no referral is
   *         required.)
   */
  public List<CodeableConcept> getReferralMethod() {
    if (this.referralMethod == null)
      this.referralMethod = new ArrayList<CodeableConcept>();
    return this.referralMethod;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setReferralMethod(List<CodeableConcept> theReferralMethod) {
    this.referralMethod = theReferralMethod;
    return this;
  }

  public boolean hasReferralMethod() {
    if (this.referralMethod == null)
      return false;
    for (CodeableConcept item : this.referralMethod)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addReferralMethod() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.referralMethod == null)
      this.referralMethod = new ArrayList<CodeableConcept>();
    this.referralMethod.add(t);
    return t;
  }

  public HealthcareService addReferralMethod(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.referralMethod == null)
      this.referralMethod = new ArrayList<CodeableConcept>();
    this.referralMethod.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #referralMethod},
   *         creating it if it does not already exist
   */
  public CodeableConcept getReferralMethodFirstRep() {
    if (getReferralMethod().isEmpty()) {
      addReferralMethod();
    }
    return getReferralMethod().get(0);
  }

  /**
   * @return {@link #appointmentRequired} (Indicates whether or not a prospective
   *         consumer will require an appointment for a particular service at a
   *         site to be provided by the Organization. Indicates if an appointment
   *         is required for access to this service.). This is the underlying
   *         object with id, value and extensions. The accessor
   *         "getAppointmentRequired" gives direct access to the value
   */
  public BooleanType getAppointmentRequiredElement() {
    if (this.appointmentRequired == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.appointmentRequired");
      else if (Configuration.doAutoCreate())
        this.appointmentRequired = new BooleanType(); // bb
    return this.appointmentRequired;
  }

  public boolean hasAppointmentRequiredElement() {
    return this.appointmentRequired != null && !this.appointmentRequired.isEmpty();
  }

  public boolean hasAppointmentRequired() {
    return this.appointmentRequired != null && !this.appointmentRequired.isEmpty();
  }

  /**
   * @param value {@link #appointmentRequired} (Indicates whether or not a
   *              prospective consumer will require an appointment for a
   *              particular service at a site to be provided by the Organization.
   *              Indicates if an appointment is required for access to this
   *              service.). This is the underlying object with id, value and
   *              extensions. The accessor "getAppointmentRequired" gives direct
   *              access to the value
   */
  public HealthcareService setAppointmentRequiredElement(BooleanType value) {
    this.appointmentRequired = value;
    return this;
  }

  /**
   * @return Indicates whether or not a prospective consumer will require an
   *         appointment for a particular service at a site to be provided by the
   *         Organization. Indicates if an appointment is required for access to
   *         this service.
   */
  public boolean getAppointmentRequired() {
    return this.appointmentRequired == null || this.appointmentRequired.isEmpty() ? false
        : this.appointmentRequired.getValue();
  }

  /**
   * @param value Indicates whether or not a prospective consumer will require an
   *              appointment for a particular service at a site to be provided by
   *              the Organization. Indicates if an appointment is required for
   *              access to this service.
   */
  public HealthcareService setAppointmentRequired(boolean value) {
    if (this.appointmentRequired == null)
      this.appointmentRequired = new BooleanType();
    this.appointmentRequired.setValue(value);
    return this;
  }

  /**
   * @return {@link #availableTime} (A collection of times that the Service Site
   *         is available.)
   */
  public List<HealthcareServiceAvailableTimeComponent> getAvailableTime() {
    if (this.availableTime == null)
      this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
    return this.availableTime;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setAvailableTime(List<HealthcareServiceAvailableTimeComponent> theAvailableTime) {
    this.availableTime = theAvailableTime;
    return this;
  }

  public boolean hasAvailableTime() {
    if (this.availableTime == null)
      return false;
    for (HealthcareServiceAvailableTimeComponent item : this.availableTime)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public HealthcareServiceAvailableTimeComponent addAvailableTime() { // 3
    HealthcareServiceAvailableTimeComponent t = new HealthcareServiceAvailableTimeComponent();
    if (this.availableTime == null)
      this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
    this.availableTime.add(t);
    return t;
  }

  public HealthcareService addAvailableTime(HealthcareServiceAvailableTimeComponent t) { // 3
    if (t == null)
      return this;
    if (this.availableTime == null)
      this.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
    this.availableTime.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #availableTime},
   *         creating it if it does not already exist
   */
  public HealthcareServiceAvailableTimeComponent getAvailableTimeFirstRep() {
    if (getAvailableTime().isEmpty()) {
      addAvailableTime();
    }
    return getAvailableTime().get(0);
  }

  /**
   * @return {@link #notAvailable} (The HealthcareService is not available during
   *         this period of time due to the provided reason.)
   */
  public List<HealthcareServiceNotAvailableComponent> getNotAvailable() {
    if (this.notAvailable == null)
      this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
    return this.notAvailable;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setNotAvailable(List<HealthcareServiceNotAvailableComponent> theNotAvailable) {
    this.notAvailable = theNotAvailable;
    return this;
  }

  public boolean hasNotAvailable() {
    if (this.notAvailable == null)
      return false;
    for (HealthcareServiceNotAvailableComponent item : this.notAvailable)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public HealthcareServiceNotAvailableComponent addNotAvailable() { // 3
    HealthcareServiceNotAvailableComponent t = new HealthcareServiceNotAvailableComponent();
    if (this.notAvailable == null)
      this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
    this.notAvailable.add(t);
    return t;
  }

  public HealthcareService addNotAvailable(HealthcareServiceNotAvailableComponent t) { // 3
    if (t == null)
      return this;
    if (this.notAvailable == null)
      this.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
    this.notAvailable.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #notAvailable},
   *         creating it if it does not already exist
   */
  public HealthcareServiceNotAvailableComponent getNotAvailableFirstRep() {
    if (getNotAvailable().isEmpty()) {
      addNotAvailable();
    }
    return getNotAvailable().get(0);
  }

  /**
   * @return {@link #availabilityExceptions} (A description of site availability
   *         exceptions, e.g. public holiday availability. Succinctly describing
   *         all possible exceptions to normal site availability as details in the
   *         available Times and not available Times.). This is the underlying
   *         object with id, value and extensions. The accessor
   *         "getAvailabilityExceptions" gives direct access to the value
   */
  public StringType getAvailabilityExceptionsElement() {
    if (this.availabilityExceptions == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create HealthcareService.availabilityExceptions");
      else if (Configuration.doAutoCreate())
        this.availabilityExceptions = new StringType(); // bb
    return this.availabilityExceptions;
  }

  public boolean hasAvailabilityExceptionsElement() {
    return this.availabilityExceptions != null && !this.availabilityExceptions.isEmpty();
  }

  public boolean hasAvailabilityExceptions() {
    return this.availabilityExceptions != null && !this.availabilityExceptions.isEmpty();
  }

  /**
   * @param value {@link #availabilityExceptions} (A description of site
   *              availability exceptions, e.g. public holiday availability.
   *              Succinctly describing all possible exceptions to normal site
   *              availability as details in the available Times and not available
   *              Times.). This is the underlying object with id, value and
   *              extensions. The accessor "getAvailabilityExceptions" gives
   *              direct access to the value
   */
  public HealthcareService setAvailabilityExceptionsElement(StringType value) {
    this.availabilityExceptions = value;
    return this;
  }

  /**
   * @return A description of site availability exceptions, e.g. public holiday
   *         availability. Succinctly describing all possible exceptions to normal
   *         site availability as details in the available Times and not available
   *         Times.
   */
  public String getAvailabilityExceptions() {
    return this.availabilityExceptions == null ? null : this.availabilityExceptions.getValue();
  }

  /**
   * @param value A description of site availability exceptions, e.g. public
   *              holiday availability. Succinctly describing all possible
   *              exceptions to normal site availability as details in the
   *              available Times and not available Times.
   */
  public HealthcareService setAvailabilityExceptions(String value) {
    if (Utilities.noString(value))
      this.availabilityExceptions = null;
    else {
      if (this.availabilityExceptions == null)
        this.availabilityExceptions = new StringType();
      this.availabilityExceptions.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #endpoint} (Technical endpoints providing access to services
   *         operated for the specific healthcare services defined at this
   *         resource.)
   */
  public List<Reference> getEndpoint() {
    if (this.endpoint == null)
      this.endpoint = new ArrayList<Reference>();
    return this.endpoint;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public HealthcareService setEndpoint(List<Reference> theEndpoint) {
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

  public HealthcareService addEndpoint(Reference t) { // 3
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

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier", "External identifiers for this item.", 0,
        java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("active", "boolean",
        "This flag is used to mark the record to not be used. This is not used when a center is closed for maintenance, or for holidays, the notAvailable period is to be used for this.",
        0, 1, active));
    children.add(new Property("providedBy", "Reference(Organization)",
        "The organization that provides this healthcare service.", 0, 1, providedBy));
    children.add(new Property("category", "CodeableConcept",
        "Identifies the broad category of service being performed or delivered.", 0, java.lang.Integer.MAX_VALUE,
        category));
    children.add(new Property("type", "CodeableConcept",
        "The specific type of service that may be delivered or performed.", 0, java.lang.Integer.MAX_VALUE, type));
    children.add(new Property("specialty", "CodeableConcept",
        "Collection of specialties handled by the service site. This is more of a medical term.", 0,
        java.lang.Integer.MAX_VALUE, specialty));
    children.add(new Property("location", "Reference(Location)",
        "The location(s) where this healthcare service may be provided.", 0, java.lang.Integer.MAX_VALUE, location));
    children.add(new Property("name", "string",
        "Further description of the service as it would be presented to a consumer while searching.", 0, 1, name));
    children.add(new Property("comment", "string",
        "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.",
        0, 1, comment));
    children.add(new Property("extraDetails", "markdown",
        "Extra details about the service that can't be placed in the other fields.", 0, 1, extraDetails));
    children.add(new Property("photo", "Attachment",
        "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.",
        0, 1, photo));
    children.add(new Property("telecom", "ContactPoint",
        "List of contacts related to this specific healthcare service.", 0, java.lang.Integer.MAX_VALUE, telecom));
    children.add(new Property("coverageArea", "Reference(Location)",
        "The location(s) that this service is available to (not where the service is provided).", 0,
        java.lang.Integer.MAX_VALUE, coverageArea));
    children.add(new Property("serviceProvisionCode", "CodeableConcept",
        "The code(s) that detail the conditions under which the healthcare service is available/offered.", 0,
        java.lang.Integer.MAX_VALUE, serviceProvisionCode));
    children.add(new Property("eligibility", "",
        "Does this service have specific eligibility requirements that need to be met in order to use the service?", 0,
        java.lang.Integer.MAX_VALUE, eligibility));
    children.add(new Property("program", "CodeableConcept", "Programs that this service is applicable to.", 0,
        java.lang.Integer.MAX_VALUE, program));
    children.add(new Property("characteristic", "CodeableConcept", "Collection of characteristics (attributes).", 0,
        java.lang.Integer.MAX_VALUE, characteristic));
    children.add(new Property("communication", "CodeableConcept",
        "Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.",
        0, java.lang.Integer.MAX_VALUE, communication));
    children.add(new Property("referralMethod", "CodeableConcept",
        "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.",
        0, java.lang.Integer.MAX_VALUE, referralMethod));
    children.add(new Property("appointmentRequired", "boolean",
        "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.",
        0, 1, appointmentRequired));
    children.add(new Property("availableTime", "", "A collection of times that the Service Site is available.", 0,
        java.lang.Integer.MAX_VALUE, availableTime));
    children.add(new Property("notAvailable", "",
        "The HealthcareService is not available during this period of time due to the provided reason.", 0,
        java.lang.Integer.MAX_VALUE, notAvailable));
    children.add(new Property("availabilityExceptions", "string",
        "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.",
        0, 1, availabilityExceptions));
    children.add(new Property("endpoint", "Reference(Endpoint)",
        "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.",
        0, java.lang.Integer.MAX_VALUE, endpoint));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier", "External identifiers for this item.", 0,
          java.lang.Integer.MAX_VALUE, identifier);
    case -1422950650:
      /* active */ return new Property("active", "boolean",
          "This flag is used to mark the record to not be used. This is not used when a center is closed for maintenance, or for holidays, the notAvailable period is to be used for this.",
          0, 1, active);
    case 205136282:
      /* providedBy */ return new Property("providedBy", "Reference(Organization)",
          "The organization that provides this healthcare service.", 0, 1, providedBy);
    case 50511102:
      /* category */ return new Property("category", "CodeableConcept",
          "Identifies the broad category of service being performed or delivered.", 0, java.lang.Integer.MAX_VALUE,
          category);
    case 3575610:
      /* type */ return new Property("type", "CodeableConcept",
          "The specific type of service that may be delivered or performed.", 0, java.lang.Integer.MAX_VALUE, type);
    case -1694759682:
      /* specialty */ return new Property("specialty", "CodeableConcept",
          "Collection of specialties handled by the service site. This is more of a medical term.", 0,
          java.lang.Integer.MAX_VALUE, specialty);
    case 1901043637:
      /* location */ return new Property("location", "Reference(Location)",
          "The location(s) where this healthcare service may be provided.", 0, java.lang.Integer.MAX_VALUE, location);
    case 3373707:
      /* name */ return new Property("name", "string",
          "Further description of the service as it would be presented to a consumer while searching.", 0, 1, name);
    case 950398559:
      /* comment */ return new Property("comment", "string",
          "Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.",
          0, 1, comment);
    case -1469168622:
      /* extraDetails */ return new Property("extraDetails", "markdown",
          "Extra details about the service that can't be placed in the other fields.", 0, 1, extraDetails);
    case 106642994:
      /* photo */ return new Property("photo", "Attachment",
          "If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.",
          0, 1, photo);
    case -1429363305:
      /* telecom */ return new Property("telecom", "ContactPoint",
          "List of contacts related to this specific healthcare service.", 0, java.lang.Integer.MAX_VALUE, telecom);
    case -1532328299:
      /* coverageArea */ return new Property("coverageArea", "Reference(Location)",
          "The location(s) that this service is available to (not where the service is provided).", 0,
          java.lang.Integer.MAX_VALUE, coverageArea);
    case 1504575405:
      /* serviceProvisionCode */ return new Property("serviceProvisionCode", "CodeableConcept",
          "The code(s) that detail the conditions under which the healthcare service is available/offered.", 0,
          java.lang.Integer.MAX_VALUE, serviceProvisionCode);
    case -930847859:
      /* eligibility */ return new Property("eligibility", "",
          "Does this service have specific eligibility requirements that need to be met in order to use the service?",
          0, java.lang.Integer.MAX_VALUE, eligibility);
    case -309387644:
      /* program */ return new Property("program", "CodeableConcept", "Programs that this service is applicable to.", 0,
          java.lang.Integer.MAX_VALUE, program);
    case 366313883:
      /* characteristic */ return new Property("characteristic", "CodeableConcept",
          "Collection of characteristics (attributes).", 0, java.lang.Integer.MAX_VALUE, characteristic);
    case -1035284522:
      /* communication */ return new Property("communication", "CodeableConcept",
          "Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.",
          0, java.lang.Integer.MAX_VALUE, communication);
    case -2092740898:
      /* referralMethod */ return new Property("referralMethod", "CodeableConcept",
          "Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.",
          0, java.lang.Integer.MAX_VALUE, referralMethod);
    case 427220062:
      /* appointmentRequired */ return new Property("appointmentRequired", "boolean",
          "Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.",
          0, 1, appointmentRequired);
    case 1873069366:
      /* availableTime */ return new Property("availableTime", "",
          "A collection of times that the Service Site is available.", 0, java.lang.Integer.MAX_VALUE, availableTime);
    case -629572298:
      /* notAvailable */ return new Property("notAvailable", "",
          "The HealthcareService is not available during this period of time due to the provided reason.", 0,
          java.lang.Integer.MAX_VALUE, notAvailable);
    case -1149143617:
      /* availabilityExceptions */ return new Property("availabilityExceptions", "string",
          "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.",
          0, 1, availabilityExceptions);
    case 1741102485:
      /* endpoint */ return new Property("endpoint", "Reference(Endpoint)",
          "Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.",
          0, java.lang.Integer.MAX_VALUE, endpoint);
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
    case -1422950650:
      /* active */ return this.active == null ? new Base[0] : new Base[] { this.active }; // BooleanType
    case 205136282:
      /* providedBy */ return this.providedBy == null ? new Base[0] : new Base[] { this.providedBy }; // Reference
    case 50511102:
      /* category */ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
    case 3575610:
      /* type */ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
    case -1694759682:
      /* specialty */ return this.specialty == null ? new Base[0]
          : this.specialty.toArray(new Base[this.specialty.size()]); // CodeableConcept
    case 1901043637:
      /* location */ return this.location == null ? new Base[0] : this.location.toArray(new Base[this.location.size()]); // Reference
    case 3373707:
      /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
    case 950398559:
      /* comment */ return this.comment == null ? new Base[0] : new Base[] { this.comment }; // StringType
    case -1469168622:
      /* extraDetails */ return this.extraDetails == null ? new Base[0] : new Base[] { this.extraDetails }; // MarkdownType
    case 106642994:
      /* photo */ return this.photo == null ? new Base[0] : new Base[] { this.photo }; // Attachment
    case -1429363305:
      /* telecom */ return this.telecom == null ? new Base[0] : this.telecom.toArray(new Base[this.telecom.size()]); // ContactPoint
    case -1532328299:
      /* coverageArea */ return this.coverageArea == null ? new Base[0]
          : this.coverageArea.toArray(new Base[this.coverageArea.size()]); // Reference
    case 1504575405:
      /* serviceProvisionCode */ return this.serviceProvisionCode == null ? new Base[0]
          : this.serviceProvisionCode.toArray(new Base[this.serviceProvisionCode.size()]); // CodeableConcept
    case -930847859:
      /* eligibility */ return this.eligibility == null ? new Base[0]
          : this.eligibility.toArray(new Base[this.eligibility.size()]); // HealthcareServiceEligibilityComponent
    case -309387644:
      /* program */ return this.program == null ? new Base[0] : this.program.toArray(new Base[this.program.size()]); // CodeableConcept
    case 366313883:
      /* characteristic */ return this.characteristic == null ? new Base[0]
          : this.characteristic.toArray(new Base[this.characteristic.size()]); // CodeableConcept
    case -1035284522:
      /* communication */ return this.communication == null ? new Base[0]
          : this.communication.toArray(new Base[this.communication.size()]); // CodeableConcept
    case -2092740898:
      /* referralMethod */ return this.referralMethod == null ? new Base[0]
          : this.referralMethod.toArray(new Base[this.referralMethod.size()]); // CodeableConcept
    case 427220062:
      /* appointmentRequired */ return this.appointmentRequired == null ? new Base[0]
          : new Base[] { this.appointmentRequired }; // BooleanType
    case 1873069366:
      /* availableTime */ return this.availableTime == null ? new Base[0]
          : this.availableTime.toArray(new Base[this.availableTime.size()]); // HealthcareServiceAvailableTimeComponent
    case -629572298:
      /* notAvailable */ return this.notAvailable == null ? new Base[0]
          : this.notAvailable.toArray(new Base[this.notAvailable.size()]); // HealthcareServiceNotAvailableComponent
    case -1149143617:
      /* availabilityExceptions */ return this.availabilityExceptions == null ? new Base[0]
          : new Base[] { this.availabilityExceptions }; // StringType
    case 1741102485:
      /* endpoint */ return this.endpoint == null ? new Base[0] : this.endpoint.toArray(new Base[this.endpoint.size()]); // Reference
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
    case -1422950650: // active
      this.active = castToBoolean(value); // BooleanType
      return value;
    case 205136282: // providedBy
      this.providedBy = castToReference(value); // Reference
      return value;
    case 50511102: // category
      this.getCategory().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 3575610: // type
      this.getType().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1694759682: // specialty
      this.getSpecialty().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 1901043637: // location
      this.getLocation().add(castToReference(value)); // Reference
      return value;
    case 3373707: // name
      this.name = castToString(value); // StringType
      return value;
    case 950398559: // comment
      this.comment = castToString(value); // StringType
      return value;
    case -1469168622: // extraDetails
      this.extraDetails = castToMarkdown(value); // MarkdownType
      return value;
    case 106642994: // photo
      this.photo = castToAttachment(value); // Attachment
      return value;
    case -1429363305: // telecom
      this.getTelecom().add(castToContactPoint(value)); // ContactPoint
      return value;
    case -1532328299: // coverageArea
      this.getCoverageArea().add(castToReference(value)); // Reference
      return value;
    case 1504575405: // serviceProvisionCode
      this.getServiceProvisionCode().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -930847859: // eligibility
      this.getEligibility().add((HealthcareServiceEligibilityComponent) value); // HealthcareServiceEligibilityComponent
      return value;
    case -309387644: // program
      this.getProgram().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 366313883: // characteristic
      this.getCharacteristic().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1035284522: // communication
      this.getCommunication().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -2092740898: // referralMethod
      this.getReferralMethod().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 427220062: // appointmentRequired
      this.appointmentRequired = castToBoolean(value); // BooleanType
      return value;
    case 1873069366: // availableTime
      this.getAvailableTime().add((HealthcareServiceAvailableTimeComponent) value); // HealthcareServiceAvailableTimeComponent
      return value;
    case -629572298: // notAvailable
      this.getNotAvailable().add((HealthcareServiceNotAvailableComponent) value); // HealthcareServiceNotAvailableComponent
      return value;
    case -1149143617: // availabilityExceptions
      this.availabilityExceptions = castToString(value); // StringType
      return value;
    case 1741102485: // endpoint
      this.getEndpoint().add(castToReference(value)); // Reference
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(castToIdentifier(value));
    } else if (name.equals("active")) {
      this.active = castToBoolean(value); // BooleanType
    } else if (name.equals("providedBy")) {
      this.providedBy = castToReference(value); // Reference
    } else if (name.equals("category")) {
      this.getCategory().add(castToCodeableConcept(value));
    } else if (name.equals("type")) {
      this.getType().add(castToCodeableConcept(value));
    } else if (name.equals("specialty")) {
      this.getSpecialty().add(castToCodeableConcept(value));
    } else if (name.equals("location")) {
      this.getLocation().add(castToReference(value));
    } else if (name.equals("name")) {
      this.name = castToString(value); // StringType
    } else if (name.equals("comment")) {
      this.comment = castToString(value); // StringType
    } else if (name.equals("extraDetails")) {
      this.extraDetails = castToMarkdown(value); // MarkdownType
    } else if (name.equals("photo")) {
      this.photo = castToAttachment(value); // Attachment
    } else if (name.equals("telecom")) {
      this.getTelecom().add(castToContactPoint(value));
    } else if (name.equals("coverageArea")) {
      this.getCoverageArea().add(castToReference(value));
    } else if (name.equals("serviceProvisionCode")) {
      this.getServiceProvisionCode().add(castToCodeableConcept(value));
    } else if (name.equals("eligibility")) {
      this.getEligibility().add((HealthcareServiceEligibilityComponent) value);
    } else if (name.equals("program")) {
      this.getProgram().add(castToCodeableConcept(value));
    } else if (name.equals("characteristic")) {
      this.getCharacteristic().add(castToCodeableConcept(value));
    } else if (name.equals("communication")) {
      this.getCommunication().add(castToCodeableConcept(value));
    } else if (name.equals("referralMethod")) {
      this.getReferralMethod().add(castToCodeableConcept(value));
    } else if (name.equals("appointmentRequired")) {
      this.appointmentRequired = castToBoolean(value); // BooleanType
    } else if (name.equals("availableTime")) {
      this.getAvailableTime().add((HealthcareServiceAvailableTimeComponent) value);
    } else if (name.equals("notAvailable")) {
      this.getNotAvailable().add((HealthcareServiceNotAvailableComponent) value);
    } else if (name.equals("availabilityExceptions")) {
      this.availabilityExceptions = castToString(value); // StringType
    } else if (name.equals("endpoint")) {
      this.getEndpoint().add(castToReference(value));
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().remove(castToIdentifier(value));
    } else if (name.equals("active")) {
      this.active = null;
    } else if (name.equals("providedBy")) {
      this.providedBy = null;
    } else if (name.equals("category")) {
      this.getCategory().remove(castToCodeableConcept(value));
    } else if (name.equals("type")) {
      this.getType().remove(castToCodeableConcept(value));
    } else if (name.equals("specialty")) {
      this.getSpecialty().remove(castToCodeableConcept(value));
    } else if (name.equals("location")) {
      this.getLocation().remove(castToReference(value));
    } else if (name.equals("name")) {
      this.name = null;
    } else if (name.equals("comment")) {
      this.comment = null;
    } else if (name.equals("extraDetails")) {
      this.extraDetails = null;
    } else if (name.equals("photo")) {
      this.photo = null;
    } else if (name.equals("telecom")) {
      this.getTelecom().remove(castToContactPoint(value));
    } else if (name.equals("coverageArea")) {
      this.getCoverageArea().remove(castToReference(value));
    } else if (name.equals("serviceProvisionCode")) {
      this.getServiceProvisionCode().remove(castToCodeableConcept(value));
    } else if (name.equals("eligibility")) {
      this.getEligibility().remove((HealthcareServiceEligibilityComponent) value);
    } else if (name.equals("program")) {
      this.getProgram().remove(castToCodeableConcept(value));
    } else if (name.equals("characteristic")) {
      this.getCharacteristic().remove(castToCodeableConcept(value));
    } else if (name.equals("communication")) {
      this.getCommunication().remove(castToCodeableConcept(value));
    } else if (name.equals("referralMethod")) {
      this.getReferralMethod().remove(castToCodeableConcept(value));
    } else if (name.equals("appointmentRequired")) {
      this.appointmentRequired = null;
    } else if (name.equals("availableTime")) {
      this.getAvailableTime().remove((HealthcareServiceAvailableTimeComponent) value);
    } else if (name.equals("notAvailable")) {
      this.getNotAvailable().remove((HealthcareServiceNotAvailableComponent) value);
    } else if (name.equals("availabilityExceptions")) {
      this.availabilityExceptions = null;
    } else if (name.equals("endpoint")) {
      this.getEndpoint().remove(castToReference(value));
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case -1422950650:
      return getActiveElement();
    case 205136282:
      return getProvidedBy();
    case 50511102:
      return addCategory();
    case 3575610:
      return addType();
    case -1694759682:
      return addSpecialty();
    case 1901043637:
      return addLocation();
    case 3373707:
      return getNameElement();
    case 950398559:
      return getCommentElement();
    case -1469168622:
      return getExtraDetailsElement();
    case 106642994:
      return getPhoto();
    case -1429363305:
      return addTelecom();
    case -1532328299:
      return addCoverageArea();
    case 1504575405:
      return addServiceProvisionCode();
    case -930847859:
      return addEligibility();
    case -309387644:
      return addProgram();
    case 366313883:
      return addCharacteristic();
    case -1035284522:
      return addCommunication();
    case -2092740898:
      return addReferralMethod();
    case 427220062:
      return getAppointmentRequiredElement();
    case 1873069366:
      return addAvailableTime();
    case -629572298:
      return addNotAvailable();
    case -1149143617:
      return getAvailabilityExceptionsElement();
    case 1741102485:
      return addEndpoint();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case -1422950650:
      /* active */ return new String[] { "boolean" };
    case 205136282:
      /* providedBy */ return new String[] { "Reference" };
    case 50511102:
      /* category */ return new String[] { "CodeableConcept" };
    case 3575610:
      /* type */ return new String[] { "CodeableConcept" };
    case -1694759682:
      /* specialty */ return new String[] { "CodeableConcept" };
    case 1901043637:
      /* location */ return new String[] { "Reference" };
    case 3373707:
      /* name */ return new String[] { "string" };
    case 950398559:
      /* comment */ return new String[] { "string" };
    case -1469168622:
      /* extraDetails */ return new String[] { "markdown" };
    case 106642994:
      /* photo */ return new String[] { "Attachment" };
    case -1429363305:
      /* telecom */ return new String[] { "ContactPoint" };
    case -1532328299:
      /* coverageArea */ return new String[] { "Reference" };
    case 1504575405:
      /* serviceProvisionCode */ return new String[] { "CodeableConcept" };
    case -930847859:
      /* eligibility */ return new String[] {};
    case -309387644:
      /* program */ return new String[] { "CodeableConcept" };
    case 366313883:
      /* characteristic */ return new String[] { "CodeableConcept" };
    case -1035284522:
      /* communication */ return new String[] { "CodeableConcept" };
    case -2092740898:
      /* referralMethod */ return new String[] { "CodeableConcept" };
    case 427220062:
      /* appointmentRequired */ return new String[] { "boolean" };
    case 1873069366:
      /* availableTime */ return new String[] {};
    case -629572298:
      /* notAvailable */ return new String[] {};
    case -1149143617:
      /* availabilityExceptions */ return new String[] { "string" };
    case 1741102485:
      /* endpoint */ return new String[] { "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("active")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.active");
    } else if (name.equals("providedBy")) {
      this.providedBy = new Reference();
      return this.providedBy;
    } else if (name.equals("category")) {
      return addCategory();
    } else if (name.equals("type")) {
      return addType();
    } else if (name.equals("specialty")) {
      return addSpecialty();
    } else if (name.equals("location")) {
      return addLocation();
    } else if (name.equals("name")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.name");
    } else if (name.equals("comment")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.comment");
    } else if (name.equals("extraDetails")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.extraDetails");
    } else if (name.equals("photo")) {
      this.photo = new Attachment();
      return this.photo;
    } else if (name.equals("telecom")) {
      return addTelecom();
    } else if (name.equals("coverageArea")) {
      return addCoverageArea();
    } else if (name.equals("serviceProvisionCode")) {
      return addServiceProvisionCode();
    } else if (name.equals("eligibility")) {
      return addEligibility();
    } else if (name.equals("program")) {
      return addProgram();
    } else if (name.equals("characteristic")) {
      return addCharacteristic();
    } else if (name.equals("communication")) {
      return addCommunication();
    } else if (name.equals("referralMethod")) {
      return addReferralMethod();
    } else if (name.equals("appointmentRequired")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.appointmentRequired");
    } else if (name.equals("availableTime")) {
      return addAvailableTime();
    } else if (name.equals("notAvailable")) {
      return addNotAvailable();
    } else if (name.equals("availabilityExceptions")) {
      throw new FHIRException("Cannot call addChild on a singleton property HealthcareService.availabilityExceptions");
    } else if (name.equals("endpoint")) {
      return addEndpoint();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "HealthcareService";

  }

  public HealthcareService copy() {
    HealthcareService dst = new HealthcareService();
    copyValues(dst);
    return dst;
  }

  public void copyValues(HealthcareService dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.active = active == null ? null : active.copy();
    dst.providedBy = providedBy == null ? null : providedBy.copy();
    if (category != null) {
      dst.category = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : category)
        dst.category.add(i.copy());
    }
    ;
    if (type != null) {
      dst.type = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : type)
        dst.type.add(i.copy());
    }
    ;
    if (specialty != null) {
      dst.specialty = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : specialty)
        dst.specialty.add(i.copy());
    }
    ;
    if (location != null) {
      dst.location = new ArrayList<Reference>();
      for (Reference i : location)
        dst.location.add(i.copy());
    }
    ;
    dst.name = name == null ? null : name.copy();
    dst.comment = comment == null ? null : comment.copy();
    dst.extraDetails = extraDetails == null ? null : extraDetails.copy();
    dst.photo = photo == null ? null : photo.copy();
    if (telecom != null) {
      dst.telecom = new ArrayList<ContactPoint>();
      for (ContactPoint i : telecom)
        dst.telecom.add(i.copy());
    }
    ;
    if (coverageArea != null) {
      dst.coverageArea = new ArrayList<Reference>();
      for (Reference i : coverageArea)
        dst.coverageArea.add(i.copy());
    }
    ;
    if (serviceProvisionCode != null) {
      dst.serviceProvisionCode = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : serviceProvisionCode)
        dst.serviceProvisionCode.add(i.copy());
    }
    ;
    if (eligibility != null) {
      dst.eligibility = new ArrayList<HealthcareServiceEligibilityComponent>();
      for (HealthcareServiceEligibilityComponent i : eligibility)
        dst.eligibility.add(i.copy());
    }
    ;
    if (program != null) {
      dst.program = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : program)
        dst.program.add(i.copy());
    }
    ;
    if (characteristic != null) {
      dst.characteristic = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : characteristic)
        dst.characteristic.add(i.copy());
    }
    ;
    if (communication != null) {
      dst.communication = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : communication)
        dst.communication.add(i.copy());
    }
    ;
    if (referralMethod != null) {
      dst.referralMethod = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : referralMethod)
        dst.referralMethod.add(i.copy());
    }
    ;
    dst.appointmentRequired = appointmentRequired == null ? null : appointmentRequired.copy();
    if (availableTime != null) {
      dst.availableTime = new ArrayList<HealthcareServiceAvailableTimeComponent>();
      for (HealthcareServiceAvailableTimeComponent i : availableTime)
        dst.availableTime.add(i.copy());
    }
    ;
    if (notAvailable != null) {
      dst.notAvailable = new ArrayList<HealthcareServiceNotAvailableComponent>();
      for (HealthcareServiceNotAvailableComponent i : notAvailable)
        dst.notAvailable.add(i.copy());
    }
    ;
    dst.availabilityExceptions = availabilityExceptions == null ? null : availabilityExceptions.copy();
    if (endpoint != null) {
      dst.endpoint = new ArrayList<Reference>();
      for (Reference i : endpoint)
        dst.endpoint.add(i.copy());
    }
    ;
  }

  protected HealthcareService typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof HealthcareService))
      return false;
    HealthcareService o = (HealthcareService) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(active, o.active, true)
        && compareDeep(providedBy, o.providedBy, true) && compareDeep(category, o.category, true)
        && compareDeep(type, o.type, true) && compareDeep(specialty, o.specialty, true)
        && compareDeep(location, o.location, true) && compareDeep(name, o.name, true)
        && compareDeep(comment, o.comment, true) && compareDeep(extraDetails, o.extraDetails, true)
        && compareDeep(photo, o.photo, true) && compareDeep(telecom, o.telecom, true)
        && compareDeep(coverageArea, o.coverageArea, true)
        && compareDeep(serviceProvisionCode, o.serviceProvisionCode, true)
        && compareDeep(eligibility, o.eligibility, true) && compareDeep(program, o.program, true)
        && compareDeep(characteristic, o.characteristic, true) && compareDeep(communication, o.communication, true)
        && compareDeep(referralMethod, o.referralMethod, true)
        && compareDeep(appointmentRequired, o.appointmentRequired, true)
        && compareDeep(availableTime, o.availableTime, true) && compareDeep(notAvailable, o.notAvailable, true)
        && compareDeep(availabilityExceptions, o.availabilityExceptions, true)
        && compareDeep(endpoint, o.endpoint, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof HealthcareService))
      return false;
    HealthcareService o = (HealthcareService) other_;
    return compareValues(active, o.active, true) && compareValues(name, o.name, true)
        && compareValues(comment, o.comment, true) && compareValues(extraDetails, o.extraDetails, true)
        && compareValues(appointmentRequired, o.appointmentRequired, true)
        && compareValues(availabilityExceptions, o.availabilityExceptions, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, active, providedBy, category, type,
        specialty, location, name, comment, extraDetails, photo, telecom, coverageArea, serviceProvisionCode,
        eligibility, program, characteristic, communication, referralMethod, appointmentRequired, availableTime,
        notAvailable, availabilityExceptions, endpoint);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.HealthcareService;
  }

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifiers for this item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "HealthcareService.identifier", description = "External identifiers for this item", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifiers for this item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>specialty</b>
   * <p>
   * Description: <b>The specialty of the service provided by this healthcare
   * service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.specialty</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "specialty", path = "HealthcareService.specialty", description = "The specialty of the service provided by this healthcare service", type = "token")
  public static final String SP_SPECIALTY = "specialty";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>specialty</b>
   * <p>
   * Description: <b>The specialty of the service provided by this healthcare
   * service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.specialty</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SPECIALTY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SPECIALTY);

  /**
   * Search parameter: <b>endpoint</b>
   * <p>
   * Description: <b>Technical endpoints providing access to electronic services
   * operated for the healthcare service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.endpoint</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "endpoint", path = "HealthcareService.endpoint", description = "Technical endpoints providing access to electronic services operated for the healthcare service", type = "reference", target = {
      Endpoint.class })
  public static final String SP_ENDPOINT = "endpoint";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>endpoint</b>
   * <p>
   * Description: <b>Technical endpoints providing access to electronic services
   * operated for the healthcare service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.endpoint</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENDPOINT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ENDPOINT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>HealthcareService:endpoint</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENDPOINT = new ca.uhn.fhir.model.api.Include(
      "HealthcareService:endpoint").toLocked();

  /**
   * Search parameter: <b>service-category</b>
   * <p>
   * Description: <b>Service Category of the Healthcare Service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "service-category", path = "HealthcareService.category", description = "Service Category of the Healthcare Service", type = "token")
  public static final String SP_SERVICE_CATEGORY = "service-category";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>service-category</b>
   * <p>
   * Description: <b>Service Category of the Healthcare Service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SERVICE_CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SERVICE_CATEGORY);

  /**
   * Search parameter: <b>coverage-area</b>
   * <p>
   * Description: <b>Location(s) service is intended for/available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.coverageArea</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "coverage-area", path = "HealthcareService.coverageArea", description = "Location(s) service is intended for/available to", type = "reference", target = {
      Location.class })
  public static final String SP_COVERAGE_AREA = "coverage-area";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>coverage-area</b>
   * <p>
   * Description: <b>Location(s) service is intended for/available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.coverageArea</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COVERAGE_AREA = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_COVERAGE_AREA);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>HealthcareService:coverage-area</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COVERAGE_AREA = new ca.uhn.fhir.model.api.Include(
      "HealthcareService:coverage-area").toLocked();

  /**
   * Search parameter: <b>service-type</b>
   * <p>
   * Description: <b>The type of service provided by this healthcare
   * service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "service-type", path = "HealthcareService.type", description = "The type of service provided by this healthcare service", type = "token")
  public static final String SP_SERVICE_TYPE = "service-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>service-type</b>
   * <p>
   * Description: <b>The type of service provided by this healthcare
   * service</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SERVICE_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_SERVICE_TYPE);

  /**
   * Search parameter: <b>organization</b>
   * <p>
   * Description: <b>The organization that provides this Healthcare
   * Service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.providedBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "organization", path = "HealthcareService.providedBy", description = "The organization that provides this Healthcare Service", type = "reference", target = {
      Organization.class })
  public static final String SP_ORGANIZATION = "organization";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>organization</b>
   * <p>
   * Description: <b>The organization that provides this Healthcare
   * Service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.providedBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ORGANIZATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>HealthcareService:organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ORGANIZATION = new ca.uhn.fhir.model.api.Include(
      "HealthcareService:organization").toLocked();

  /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>A portion of the Healthcare service name</b><br>
   * Type: <b>string</b><br>
   * Path: <b>HealthcareService.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "name", path = "HealthcareService.name", description = "A portion of the Healthcare service name", type = "string")
  public static final String SP_NAME = "name";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>A portion of the Healthcare service name</b><br>
   * Type: <b>string</b><br>
   * Path: <b>HealthcareService.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_NAME);

  /**
   * Search parameter: <b>active</b>
   * <p>
   * Description: <b>The Healthcare Service is currently marked as active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.active</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "active", path = "HealthcareService.active", description = "The Healthcare Service is currently marked as active", type = "token")
  public static final String SP_ACTIVE = "active";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>active</b>
   * <p>
   * Description: <b>The Healthcare Service is currently marked as active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.active</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ACTIVE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_ACTIVE);

  /**
   * Search parameter: <b>location</b>
   * <p>
   * Description: <b>The location of the Healthcare Service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.location</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "location", path = "HealthcareService.location", description = "The location of the Healthcare Service", type = "reference", target = {
      Location.class })
  public static final String SP_LOCATION = "location";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>location</b>
   * <p>
   * Description: <b>The location of the Healthcare Service</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>HealthcareService.location</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam LOCATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_LOCATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>HealthcareService:location</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_LOCATION = new ca.uhn.fhir.model.api.Include(
      "HealthcareService:location").toLocked();

  /**
   * Search parameter: <b>program</b>
   * <p>
   * Description: <b>One of the Programs supported by this
   * HealthcareService</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.program</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "program", path = "HealthcareService.program", description = "One of the Programs supported by this HealthcareService", type = "token")
  public static final String SP_PROGRAM = "program";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>program</b>
   * <p>
   * Description: <b>One of the Programs supported by this
   * HealthcareService</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.program</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROGRAM = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_PROGRAM);

  /**
   * Search parameter: <b>characteristic</b>
   * <p>
   * Description: <b>One of the HealthcareService's characteristics</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.characteristic</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "characteristic", path = "HealthcareService.characteristic", description = "One of the HealthcareService's characteristics", type = "token")
  public static final String SP_CHARACTERISTIC = "characteristic";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>characteristic</b>
   * <p>
   * Description: <b>One of the HealthcareService's characteristics</b><br>
   * Type: <b>token</b><br>
   * Path: <b>HealthcareService.characteristic</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CHARACTERISTIC = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CHARACTERISTIC);

}
