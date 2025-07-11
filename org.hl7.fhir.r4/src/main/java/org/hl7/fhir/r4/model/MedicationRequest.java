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

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * An order or request for both supply of the medication and the instructions
 * for administration of the medication to a patient. The resource is called
 * "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder"
 * to generalize the use across inpatient and outpatient settings, including
 * care plans, etc., and to harmonize with workflow patterns.
 */
@ResourceDef(name = "MedicationRequest", profile = "http://hl7.org/fhir/StructureDefinition/MedicationRequest")
public class MedicationRequest extends DomainResource {

  public enum MedicationRequestStatus {
    /**
     * The prescription is 'actionable', but not all actions that are implied by it
     * have occurred yet.
     */
    ACTIVE,
    /**
     * Actions implied by the prescription are to be temporarily halted, but are
     * expected to continue later. May also be called 'suspended'.
     */
    ONHOLD,
    /**
     * The prescription has been withdrawn before any administrations have occurred
     */
    CANCELLED,
    /**
     * All actions that are implied by the prescription have occurred.
     */
    COMPLETED,
    /**
     * Some of the actions that are implied by the medication request may have
     * occurred. For example, the medication may have been dispensed and the patient
     * may have taken some of the medication. Clinical decision support systems
     * should take this status into account
     */
    ENTEREDINERROR,
    /**
     * Actions implied by the prescription are to be permanently halted, before all
     * of the administrations occurred. This should not be used if the original
     * order was entered in error
     */
    STOPPED,
    /**
     * The prescription is not yet 'actionable', e.g. it is a work in progress,
     * requires sign-off, verification or needs to be run through decision support
     * process.
     */
    DRAFT,
    /**
     * The authoring/source system does not know which of the status values
     * currently applies for this observation. Note: This concept is not to be used
     * for 'other' - one of the listed statuses is presumed to apply, but the
     * authoring/source system does not know which.
     */
    UNKNOWN,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static MedicationRequestStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("active".equals(codeString))
        return ACTIVE;
      if ("on-hold".equals(codeString))
        return ONHOLD;
      if ("cancelled".equals(codeString))
        return CANCELLED;
      if ("completed".equals(codeString))
        return COMPLETED;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      if ("stopped".equals(codeString))
        return STOPPED;
      if ("draft".equals(codeString))
        return DRAFT;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown MedicationRequestStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ACTIVE:
        return "active";
      case ONHOLD:
        return "on-hold";
      case CANCELLED:
        return "cancelled";
      case COMPLETED:
        return "completed";
      case ENTEREDINERROR:
        return "entered-in-error";
      case STOPPED:
        return "stopped";
      case DRAFT:
        return "draft";
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
      case ACTIVE:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case ONHOLD:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case CANCELLED:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case COMPLETED:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case STOPPED:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case DRAFT:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case UNKNOWN:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ACTIVE:
        return "The prescription is 'actionable', but not all actions that are implied by it have occurred yet.";
      case ONHOLD:
        return "Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called 'suspended'.";
      case CANCELLED:
        return "The prescription has been withdrawn before any administrations have occurred";
      case COMPLETED:
        return "All actions that are implied by the prescription have occurred.";
      case ENTEREDINERROR:
        return "Some of the actions that are implied by the medication request may have occurred.  For example, the medication may have been dispensed and the patient may have taken some of the medication.  Clinical decision support systems should take this status into account";
      case STOPPED:
        return "Actions implied by the prescription are to be permanently halted, before all of the administrations occurred. This should not be used if the original order was entered in error";
      case DRAFT:
        return "The prescription is not yet 'actionable', e.g. it is a work in progress, requires sign-off, verification or needs to be run through decision support process.";
      case UNKNOWN:
        return "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.";
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
      case ONHOLD:
        return "On Hold";
      case CANCELLED:
        return "Cancelled";
      case COMPLETED:
        return "Completed";
      case ENTEREDINERROR:
        return "Entered in Error";
      case STOPPED:
        return "Stopped";
      case DRAFT:
        return "Draft";
      case UNKNOWN:
        return "Unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class MedicationRequestStatusEnumFactory implements EnumFactory<MedicationRequestStatus> {
    public MedicationRequestStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("active".equals(codeString))
        return MedicationRequestStatus.ACTIVE;
      if ("on-hold".equals(codeString))
        return MedicationRequestStatus.ONHOLD;
      if ("cancelled".equals(codeString))
        return MedicationRequestStatus.CANCELLED;
      if ("completed".equals(codeString))
        return MedicationRequestStatus.COMPLETED;
      if ("entered-in-error".equals(codeString))
        return MedicationRequestStatus.ENTEREDINERROR;
      if ("stopped".equals(codeString))
        return MedicationRequestStatus.STOPPED;
      if ("draft".equals(codeString))
        return MedicationRequestStatus.DRAFT;
      if ("unknown".equals(codeString))
        return MedicationRequestStatus.UNKNOWN;
      throw new IllegalArgumentException("Unknown MedicationRequestStatus code '" + codeString + "'");
    }

    public Enumeration<MedicationRequestStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.NULL, code);
      if ("active".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.ACTIVE, code);
      if ("on-hold".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.ONHOLD, code);
      if ("cancelled".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.CANCELLED, code);
      if ("completed".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.COMPLETED, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.ENTEREDINERROR, code);
      if ("stopped".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.STOPPED, code);
      if ("draft".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.DRAFT, code);
      if ("unknown".equals(codeString))
        return new Enumeration<MedicationRequestStatus>(this, MedicationRequestStatus.UNKNOWN, code);
      throw new FHIRException("Unknown MedicationRequestStatus code '" + codeString + "'");
    }

    public String toCode(MedicationRequestStatus code) {
       if (code == MedicationRequestStatus.NULL)
           return null;
       if (code == MedicationRequestStatus.ACTIVE)
        return "active";
      if (code == MedicationRequestStatus.ONHOLD)
        return "on-hold";
      if (code == MedicationRequestStatus.CANCELLED)
        return "cancelled";
      if (code == MedicationRequestStatus.COMPLETED)
        return "completed";
      if (code == MedicationRequestStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == MedicationRequestStatus.STOPPED)
        return "stopped";
      if (code == MedicationRequestStatus.DRAFT)
        return "draft";
      if (code == MedicationRequestStatus.UNKNOWN)
        return "unknown";
      return "?";
   }

    public String toSystem(MedicationRequestStatus code) {
      return code.getSystem();
    }
  }

  public enum MedicationRequestIntent {
    /**
     * The request is a suggestion made by someone/something that doesn't have an
     * intention to ensure it occurs and without providing an authorization to act
     */
    PROPOSAL,
    /**
     * The request represents an intention to ensure something occurs without
     * providing an authorization for others to act.
     */
    PLAN,
    /**
     * The request represents a request/demand and authorization for action
     */
    ORDER,
    /**
     * The request represents the original authorization for the medication request.
     */
    ORIGINALORDER,
    /**
     * The request represents an automatically generated supplemental authorization
     * for action based on a parent authorization together with initial results of
     * the action taken against that parent authorization..
     */
    REFLEXORDER,
    /**
     * The request represents the view of an authorization instantiated by a
     * fulfilling system representing the details of the fulfiller's intention to
     * act upon a submitted order.
     */
    FILLERORDER,
    /**
     * The request represents an instance for the particular order, for example a
     * medication administration record.
     */
    INSTANCEORDER,
    /**
     * The request represents a component or option for a RequestGroup that
     * establishes timing, conditionality and/or other constraints among a set of
     * requests.
     */
    OPTION,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static MedicationRequestIntent fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("proposal".equals(codeString))
        return PROPOSAL;
      if ("plan".equals(codeString))
        return PLAN;
      if ("order".equals(codeString))
        return ORDER;
      if ("original-order".equals(codeString))
        return ORIGINALORDER;
      if ("reflex-order".equals(codeString))
        return REFLEXORDER;
      if ("filler-order".equals(codeString))
        return FILLERORDER;
      if ("instance-order".equals(codeString))
        return INSTANCEORDER;
      if ("option".equals(codeString))
        return OPTION;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown MedicationRequestIntent code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case PROPOSAL:
        return "proposal";
      case PLAN:
        return "plan";
      case ORDER:
        return "order";
      case ORIGINALORDER:
        return "original-order";
      case REFLEXORDER:
        return "reflex-order";
      case FILLERORDER:
        return "filler-order";
      case INSTANCEORDER:
        return "instance-order";
      case OPTION:
        return "option";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case PROPOSAL:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case PLAN:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case ORDER:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case ORIGINALORDER:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case REFLEXORDER:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case FILLERORDER:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case INSTANCEORDER:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case OPTION:
        return "http://hl7.org/fhir/CodeSystem/medicationrequest-intent";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case PROPOSAL:
        return "The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act";
      case PLAN:
        return "The request represents an intention to ensure something occurs without providing an authorization for others to act.";
      case ORDER:
        return "The request represents a request/demand and authorization for action";
      case ORIGINALORDER:
        return "The request represents the original authorization for the medication request.";
      case REFLEXORDER:
        return "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization..";
      case FILLERORDER:
        return "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.";
      case INSTANCEORDER:
        return "The request represents an instance for the particular order, for example a medication administration record.";
      case OPTION:
        return "The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or  other constraints among a set of requests.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case PROPOSAL:
        return "Proposal";
      case PLAN:
        return "Plan";
      case ORDER:
        return "Order";
      case ORIGINALORDER:
        return "Original Order";
      case REFLEXORDER:
        return "Reflex Order";
      case FILLERORDER:
        return "Filler Order";
      case INSTANCEORDER:
        return "Instance Order";
      case OPTION:
        return "Option";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class MedicationRequestIntentEnumFactory implements EnumFactory<MedicationRequestIntent> {
    public MedicationRequestIntent fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("proposal".equals(codeString))
        return MedicationRequestIntent.PROPOSAL;
      if ("plan".equals(codeString))
        return MedicationRequestIntent.PLAN;
      if ("order".equals(codeString))
        return MedicationRequestIntent.ORDER;
      if ("original-order".equals(codeString))
        return MedicationRequestIntent.ORIGINALORDER;
      if ("reflex-order".equals(codeString))
        return MedicationRequestIntent.REFLEXORDER;
      if ("filler-order".equals(codeString))
        return MedicationRequestIntent.FILLERORDER;
      if ("instance-order".equals(codeString))
        return MedicationRequestIntent.INSTANCEORDER;
      if ("option".equals(codeString))
        return MedicationRequestIntent.OPTION;
      throw new IllegalArgumentException("Unknown MedicationRequestIntent code '" + codeString + "'");
    }

    public Enumeration<MedicationRequestIntent> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.NULL, code);
      if ("proposal".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.PROPOSAL, code);
      if ("plan".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.PLAN, code);
      if ("order".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.ORDER, code);
      if ("original-order".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.ORIGINALORDER, code);
      if ("reflex-order".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.REFLEXORDER, code);
      if ("filler-order".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.FILLERORDER, code);
      if ("instance-order".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.INSTANCEORDER, code);
      if ("option".equals(codeString))
        return new Enumeration<MedicationRequestIntent>(this, MedicationRequestIntent.OPTION, code);
      throw new FHIRException("Unknown MedicationRequestIntent code '" + codeString + "'");
    }

    public String toCode(MedicationRequestIntent code) {
       if (code == MedicationRequestIntent.NULL)
           return null;
       if (code == MedicationRequestIntent.PROPOSAL)
        return "proposal";
      if (code == MedicationRequestIntent.PLAN)
        return "plan";
      if (code == MedicationRequestIntent.ORDER)
        return "order";
      if (code == MedicationRequestIntent.ORIGINALORDER)
        return "original-order";
      if (code == MedicationRequestIntent.REFLEXORDER)
        return "reflex-order";
      if (code == MedicationRequestIntent.FILLERORDER)
        return "filler-order";
      if (code == MedicationRequestIntent.INSTANCEORDER)
        return "instance-order";
      if (code == MedicationRequestIntent.OPTION)
        return "option";
      return "?";
   }

    public String toSystem(MedicationRequestIntent code) {
      return code.getSystem();
    }
  }

  public enum MedicationRequestPriority {
    /**
     * The request has normal priority.
     */
    ROUTINE,
    /**
     * The request should be actioned promptly - higher priority than routine.
     */
    URGENT,
    /**
     * The request should be actioned as soon as possible - higher priority than
     * urgent.
     */
    ASAP,
    /**
     * The request should be actioned immediately - highest possible priority. E.g.
     * an emergency.
     */
    STAT,
    /**
     * added to help the parsers with the generic types
     */
    NULL;

    public static MedicationRequestPriority fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("routine".equals(codeString))
        return ROUTINE;
      if ("urgent".equals(codeString))
        return URGENT;
      if ("asap".equals(codeString))
        return ASAP;
      if ("stat".equals(codeString))
        return STAT;
      if (Configuration.isAcceptInvalidEnums())
        return null;
      else
        throw new FHIRException("Unknown MedicationRequestPriority code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ROUTINE:
        return "routine";
      case URGENT:
        return "urgent";
      case ASAP:
        return "asap";
      case STAT:
        return "stat";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ROUTINE:
        return "http://hl7.org/fhir/request-priority";
      case URGENT:
        return "http://hl7.org/fhir/request-priority";
      case ASAP:
        return "http://hl7.org/fhir/request-priority";
      case STAT:
        return "http://hl7.org/fhir/request-priority";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ROUTINE:
        return "The request has normal priority.";
      case URGENT:
        return "The request should be actioned promptly - higher priority than routine.";
      case ASAP:
        return "The request should be actioned as soon as possible - higher priority than urgent.";
      case STAT:
        return "The request should be actioned immediately - highest possible priority.  E.g. an emergency.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ROUTINE:
        return "Routine";
      case URGENT:
        return "Urgent";
      case ASAP:
        return "ASAP";
      case STAT:
        return "STAT";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class MedicationRequestPriorityEnumFactory implements EnumFactory<MedicationRequestPriority> {
    public MedicationRequestPriority fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("routine".equals(codeString))
        return MedicationRequestPriority.ROUTINE;
      if ("urgent".equals(codeString))
        return MedicationRequestPriority.URGENT;
      if ("asap".equals(codeString))
        return MedicationRequestPriority.ASAP;
      if ("stat".equals(codeString))
        return MedicationRequestPriority.STAT;
      throw new IllegalArgumentException("Unknown MedicationRequestPriority code '" + codeString + "'");
    }

    public Enumeration<MedicationRequestPriority> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.NULL, code);
      if ("routine".equals(codeString))
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.ROUTINE, code);
      if ("urgent".equals(codeString))
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.URGENT, code);
      if ("asap".equals(codeString))
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.ASAP, code);
      if ("stat".equals(codeString))
        return new Enumeration<MedicationRequestPriority>(this, MedicationRequestPriority.STAT, code);
      throw new FHIRException("Unknown MedicationRequestPriority code '" + codeString + "'");
    }

    public String toCode(MedicationRequestPriority code) {
       if (code == MedicationRequestPriority.NULL)
           return null;
       if (code == MedicationRequestPriority.ROUTINE)
        return "routine";
      if (code == MedicationRequestPriority.URGENT)
        return "urgent";
      if (code == MedicationRequestPriority.ASAP)
        return "asap";
      if (code == MedicationRequestPriority.STAT)
        return "stat";
      return "?";
   }

    public String toSystem(MedicationRequestPriority code) {
      return code.getSystem();
    }
  }

  @Block()
  public static class MedicationRequestDispenseRequestComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Indicates the quantity or duration for the first dispense of the medication.
     */
    @Child(name = "initialFill", type = {}, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "First fill details", formalDefinition = "Indicates the quantity or duration for the first dispense of the medication.")
    protected MedicationRequestDispenseRequestInitialFillComponent initialFill;

    /**
     * The minimum period of time that must occur between dispenses of the
     * medication.
     */
    @Child(name = "dispenseInterval", type = {
        Duration.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Minimum period of time between dispenses", formalDefinition = "The minimum period of time that must occur between dispenses of the medication.")
    protected Duration dispenseInterval;

    /**
     * This indicates the validity period of a prescription (stale dating the
     * Prescription).
     */
    @Child(name = "validityPeriod", type = {
        Period.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Time period supply is authorized for", formalDefinition = "This indicates the validity period of a prescription (stale dating the Prescription).")
    protected Period validityPeriod;

    /**
     * An integer indicating the number of times, in addition to the original
     * dispense, (aka refills or repeats) that the patient can receive the
     * prescribed medication. Usage Notes: This integer does not include the
     * original order dispense. This means that if an order indicates dispense 30
     * tablets plus "3 repeats", then the order can be dispensed a total of 4 times
     * and the patient can receive a total of 120 tablets. A prescriber may
     * explicitly say that zero refills are permitted after the initial dispense.
     */
    @Child(name = "numberOfRepeatsAllowed", type = {
        UnsignedIntType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Number of refills authorized", formalDefinition = "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.  A prescriber may explicitly say that zero refills are permitted after the initial dispense.")
    protected UnsignedIntType numberOfRepeatsAllowed;

    /**
     * The amount that is to be dispensed for one fill.
     */
    @Child(name = "quantity", type = { Quantity.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Amount of medication to supply per dispense", formalDefinition = "The amount that is to be dispensed for one fill.")
    protected Quantity quantity;

    /**
     * Identifies the period time over which the supplied product is expected to be
     * used, or the length of time the dispense is expected to last.
     */
    @Child(name = "expectedSupplyDuration", type = {
        Duration.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Number of days supply per dispense", formalDefinition = "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.")
    protected Duration expectedSupplyDuration;

    /**
     * Indicates the intended dispensing Organization specified by the prescriber.
     */
    @Child(name = "performer", type = {
        Organization.class }, order = 7, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Intended dispenser", formalDefinition = "Indicates the intended dispensing Organization specified by the prescriber.")
    protected Reference performer;

    /**
     * The actual object that is the target of the reference (Indicates the intended
     * dispensing Organization specified by the prescriber.)
     */
    protected Organization performerTarget;

    private static final long serialVersionUID = -1680129929L;

    /**
     * Constructor
     */
    public MedicationRequestDispenseRequestComponent() {
      super();
    }

    /**
     * @return {@link #initialFill} (Indicates the quantity or duration for the
     *         first dispense of the medication.)
     */
    public MedicationRequestDispenseRequestInitialFillComponent getInitialFill() {
      if (this.initialFill == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.initialFill");
        else if (Configuration.doAutoCreate())
          this.initialFill = new MedicationRequestDispenseRequestInitialFillComponent(); // cc
      return this.initialFill;
    }

    public boolean hasInitialFill() {
      return this.initialFill != null && !this.initialFill.isEmpty();
    }

    /**
     * @param value {@link #initialFill} (Indicates the quantity or duration for the
     *              first dispense of the medication.)
     */
    public MedicationRequestDispenseRequestComponent setInitialFill(
        MedicationRequestDispenseRequestInitialFillComponent value) {
      this.initialFill = value;
      return this;
    }

    /**
     * @return {@link #dispenseInterval} (The minimum period of time that must occur
     *         between dispenses of the medication.)
     */
    public Duration getDispenseInterval() {
      if (this.dispenseInterval == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.dispenseInterval");
        else if (Configuration.doAutoCreate())
          this.dispenseInterval = new Duration(); // cc
      return this.dispenseInterval;
    }

    public boolean hasDispenseInterval() {
      return this.dispenseInterval != null && !this.dispenseInterval.isEmpty();
    }

    /**
     * @param value {@link #dispenseInterval} (The minimum period of time that must
     *              occur between dispenses of the medication.)
     */
    public MedicationRequestDispenseRequestComponent setDispenseInterval(Duration value) {
      this.dispenseInterval = value;
      return this;
    }

    /**
     * @return {@link #validityPeriod} (This indicates the validity period of a
     *         prescription (stale dating the Prescription).)
     */
    public Period getValidityPeriod() {
      if (this.validityPeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.validityPeriod");
        else if (Configuration.doAutoCreate())
          this.validityPeriod = new Period(); // cc
      return this.validityPeriod;
    }

    public boolean hasValidityPeriod() {
      return this.validityPeriod != null && !this.validityPeriod.isEmpty();
    }

    /**
     * @param value {@link #validityPeriod} (This indicates the validity period of a
     *              prescription (stale dating the Prescription).)
     */
    public MedicationRequestDispenseRequestComponent setValidityPeriod(Period value) {
      this.validityPeriod = value;
      return this;
    }

    /**
     * @return {@link #numberOfRepeatsAllowed} (An integer indicating the number of
     *         times, in addition to the original dispense, (aka refills or repeats)
     *         that the patient can receive the prescribed medication. Usage Notes:
     *         This integer does not include the original order dispense. This means
     *         that if an order indicates dispense 30 tablets plus "3 repeats", then
     *         the order can be dispensed a total of 4 times and the patient can
     *         receive a total of 120 tablets. A prescriber may explicitly say that
     *         zero refills are permitted after the initial dispense.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getNumberOfRepeatsAllowed" gives direct access to the value
     */
    public UnsignedIntType getNumberOfRepeatsAllowedElement() {
      if (this.numberOfRepeatsAllowed == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.numberOfRepeatsAllowed");
        else if (Configuration.doAutoCreate())
          this.numberOfRepeatsAllowed = new UnsignedIntType(); // bb
      return this.numberOfRepeatsAllowed;
    }

    public boolean hasNumberOfRepeatsAllowedElement() {
      return this.numberOfRepeatsAllowed != null && !this.numberOfRepeatsAllowed.isEmpty();
    }

    public boolean hasNumberOfRepeatsAllowed() {
      return this.numberOfRepeatsAllowed != null && !this.numberOfRepeatsAllowed.isEmpty();
    }

    /**
     * @param value {@link #numberOfRepeatsAllowed} (An integer indicating the
     *              number of times, in addition to the original dispense, (aka
     *              refills or repeats) that the patient can receive the prescribed
     *              medication. Usage Notes: This integer does not include the
     *              original order dispense. This means that if an order indicates
     *              dispense 30 tablets plus "3 repeats", then the order can be
     *              dispensed a total of 4 times and the patient can receive a total
     *              of 120 tablets. A prescriber may explicitly say that zero
     *              refills are permitted after the initial dispense.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getNumberOfRepeatsAllowed" gives direct access to the value
     */
    public MedicationRequestDispenseRequestComponent setNumberOfRepeatsAllowedElement(UnsignedIntType value) {
      this.numberOfRepeatsAllowed = value;
      return this;
    }

    /**
     * @return An integer indicating the number of times, in addition to the
     *         original dispense, (aka refills or repeats) that the patient can
     *         receive the prescribed medication. Usage Notes: This integer does not
     *         include the original order dispense. This means that if an order
     *         indicates dispense 30 tablets plus "3 repeats", then the order can be
     *         dispensed a total of 4 times and the patient can receive a total of
     *         120 tablets. A prescriber may explicitly say that zero refills are
     *         permitted after the initial dispense.
     */
    public int getNumberOfRepeatsAllowed() {
      return this.numberOfRepeatsAllowed == null || this.numberOfRepeatsAllowed.isEmpty() ? 0
          : this.numberOfRepeatsAllowed.getValue();
    }

    /**
     * @param value An integer indicating the number of times, in addition to the
     *              original dispense, (aka refills or repeats) that the patient can
     *              receive the prescribed medication. Usage Notes: This integer
     *              does not include the original order dispense. This means that if
     *              an order indicates dispense 30 tablets plus "3 repeats", then
     *              the order can be dispensed a total of 4 times and the patient
     *              can receive a total of 120 tablets. A prescriber may explicitly
     *              say that zero refills are permitted after the initial dispense.
     */
    public MedicationRequestDispenseRequestComponent setNumberOfRepeatsAllowed(int value) {
      if (this.numberOfRepeatsAllowed == null)
        this.numberOfRepeatsAllowed = new UnsignedIntType();
      this.numberOfRepeatsAllowed.setValue(value);
      return this;
    }

    /**
     * @return {@link #quantity} (The amount that is to be dispensed for one fill.)
     */
    public Quantity getQuantity() {
      if (this.quantity == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.quantity");
        else if (Configuration.doAutoCreate())
          this.quantity = new Quantity(); // cc
      return this.quantity;
    }

    public boolean hasQuantity() {
      return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount that is to be dispensed for one
     *              fill.)
     */
    public MedicationRequestDispenseRequestComponent setQuantity(Quantity value) {
      this.quantity = value;
      return this;
    }

    /**
     * @return {@link #expectedSupplyDuration} (Identifies the period time over
     *         which the supplied product is expected to be used, or the length of
     *         time the dispense is expected to last.)
     */
    public Duration getExpectedSupplyDuration() {
      if (this.expectedSupplyDuration == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.expectedSupplyDuration");
        else if (Configuration.doAutoCreate())
          this.expectedSupplyDuration = new Duration(); // cc
      return this.expectedSupplyDuration;
    }

    public boolean hasExpectedSupplyDuration() {
      return this.expectedSupplyDuration != null && !this.expectedSupplyDuration.isEmpty();
    }

    /**
     * @param value {@link #expectedSupplyDuration} (Identifies the period time over
     *              which the supplied product is expected to be used, or the length
     *              of time the dispense is expected to last.)
     */
    public MedicationRequestDispenseRequestComponent setExpectedSupplyDuration(Duration value) {
      this.expectedSupplyDuration = value;
      return this;
    }

    /**
     * @return {@link #performer} (Indicates the intended dispensing Organization
     *         specified by the prescriber.)
     */
    public Reference getPerformer() {
      if (this.performer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.performer");
        else if (Configuration.doAutoCreate())
          this.performer = new Reference(); // cc
      return this.performer;
    }

    public boolean hasPerformer() {
      return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (Indicates the intended dispensing
     *              Organization specified by the prescriber.)
     */
    public MedicationRequestDispenseRequestComponent setPerformer(Reference value) {
      this.performer = value;
      return this;
    }

    /**
     * @return {@link #performer} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Indicates the
     *         intended dispensing Organization specified by the prescriber.)
     */
    public Organization getPerformerTarget() {
      if (this.performerTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestComponent.performer");
        else if (Configuration.doAutoCreate())
          this.performerTarget = new Organization(); // aa
      return this.performerTarget;
    }

    /**
     * @param value {@link #performer} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Indicates the
     *              intended dispensing Organization specified by the prescriber.)
     */
    public MedicationRequestDispenseRequestComponent setPerformerTarget(Organization value) {
      this.performerTarget = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("initialFill", "",
          "Indicates the quantity or duration for the first dispense of the medication.", 0, 1, initialFill));
      children.add(new Property("dispenseInterval", "Duration",
          "The minimum period of time that must occur between dispenses of the medication.", 0, 1, dispenseInterval));
      children.add(new Property("validityPeriod", "Period",
          "This indicates the validity period of a prescription (stale dating the Prescription).", 0, 1,
          validityPeriod));
      children.add(new Property("numberOfRepeatsAllowed", "unsignedInt",
          "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.  A prescriber may explicitly say that zero refills are permitted after the initial dispense.",
          0, 1, numberOfRepeatsAllowed));
      children.add(new Property("quantity", "SimpleQuantity", "The amount that is to be dispensed for one fill.", 0, 1,
          quantity));
      children.add(new Property("expectedSupplyDuration", "Duration",
          "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.",
          0, 1, expectedSupplyDuration));
      children.add(new Property("performer", "Reference(Organization)",
          "Indicates the intended dispensing Organization specified by the prescriber.", 0, 1, performer));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1232961255:
        /* initialFill */ return new Property("initialFill", "",
            "Indicates the quantity or duration for the first dispense of the medication.", 0, 1, initialFill);
      case 757112130:
        /* dispenseInterval */ return new Property("dispenseInterval", "Duration",
            "The minimum period of time that must occur between dispenses of the medication.", 0, 1, dispenseInterval);
      case -1434195053:
        /* validityPeriod */ return new Property("validityPeriod", "Period",
            "This indicates the validity period of a prescription (stale dating the Prescription).", 0, 1,
            validityPeriod);
      case -239736976:
        /* numberOfRepeatsAllowed */ return new Property("numberOfRepeatsAllowed", "unsignedInt",
            "An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.  A prescriber may explicitly say that zero refills are permitted after the initial dispense.",
            0, 1, numberOfRepeatsAllowed);
      case -1285004149:
        /* quantity */ return new Property("quantity", "SimpleQuantity",
            "The amount that is to be dispensed for one fill.", 0, 1, quantity);
      case -1910182789:
        /* expectedSupplyDuration */ return new Property("expectedSupplyDuration", "Duration",
            "Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.",
            0, 1, expectedSupplyDuration);
      case 481140686:
        /* performer */ return new Property("performer", "Reference(Organization)",
            "Indicates the intended dispensing Organization specified by the prescriber.", 0, 1, performer);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 1232961255:
        /* initialFill */ return this.initialFill == null ? new Base[0] : new Base[] { this.initialFill }; // MedicationRequestDispenseRequestInitialFillComponent
      case 757112130:
        /* dispenseInterval */ return this.dispenseInterval == null ? new Base[0]
            : new Base[] { this.dispenseInterval }; // Duration
      case -1434195053:
        /* validityPeriod */ return this.validityPeriod == null ? new Base[0] : new Base[] { this.validityPeriod }; // Period
      case -239736976:
        /* numberOfRepeatsAllowed */ return this.numberOfRepeatsAllowed == null ? new Base[0]
            : new Base[] { this.numberOfRepeatsAllowed }; // UnsignedIntType
      case -1285004149:
        /* quantity */ return this.quantity == null ? new Base[0] : new Base[] { this.quantity }; // Quantity
      case -1910182789:
        /* expectedSupplyDuration */ return this.expectedSupplyDuration == null ? new Base[0]
            : new Base[] { this.expectedSupplyDuration }; // Duration
      case 481140686:
        /* performer */ return this.performer == null ? new Base[0] : new Base[] { this.performer }; // Reference
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 1232961255: // initialFill
        this.initialFill = (MedicationRequestDispenseRequestInitialFillComponent) value; // MedicationRequestDispenseRequestInitialFillComponent
        return value;
      case 757112130: // dispenseInterval
        this.dispenseInterval = castToDuration(value); // Duration
        return value;
      case -1434195053: // validityPeriod
        this.validityPeriod = castToPeriod(value); // Period
        return value;
      case -239736976: // numberOfRepeatsAllowed
        this.numberOfRepeatsAllowed = castToUnsignedInt(value); // UnsignedIntType
        return value;
      case -1285004149: // quantity
        this.quantity = castToQuantity(value); // Quantity
        return value;
      case -1910182789: // expectedSupplyDuration
        this.expectedSupplyDuration = castToDuration(value); // Duration
        return value;
      case 481140686: // performer
        this.performer = castToReference(value); // Reference
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("initialFill")) {
        this.initialFill = (MedicationRequestDispenseRequestInitialFillComponent) value; // MedicationRequestDispenseRequestInitialFillComponent
      } else if (name.equals("dispenseInterval")) {
        this.dispenseInterval = castToDuration(value); // Duration
      } else if (name.equals("validityPeriod")) {
        this.validityPeriod = castToPeriod(value); // Period
      } else if (name.equals("numberOfRepeatsAllowed")) {
        this.numberOfRepeatsAllowed = castToUnsignedInt(value); // UnsignedIntType
      } else if (name.equals("quantity")) {
        this.quantity = castToQuantity(value); // Quantity
      } else if (name.equals("expectedSupplyDuration")) {
        this.expectedSupplyDuration = castToDuration(value); // Duration
      } else if (name.equals("performer")) {
        this.performer = castToReference(value); // Reference
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("initialFill")) {
        this.initialFill = (MedicationRequestDispenseRequestInitialFillComponent) value; // MedicationRequestDispenseRequestInitialFillComponent
      } else if (name.equals("dispenseInterval")) {
        this.dispenseInterval = null;
      } else if (name.equals("validityPeriod")) {
        this.validityPeriod = null;
      } else if (name.equals("numberOfRepeatsAllowed")) {
        this.numberOfRepeatsAllowed = null;
      } else if (name.equals("quantity")) {
        this.quantity = null;
      } else if (name.equals("expectedSupplyDuration")) {
        this.expectedSupplyDuration = null;
      } else if (name.equals("performer")) {
        this.performer = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1232961255:
        return getInitialFill();
      case 757112130:
        return getDispenseInterval();
      case -1434195053:
        return getValidityPeriod();
      case -239736976:
        return getNumberOfRepeatsAllowedElement();
      case -1285004149:
        return getQuantity();
      case -1910182789:
        return getExpectedSupplyDuration();
      case 481140686:
        return getPerformer();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1232961255:
        /* initialFill */ return new String[] {};
      case 757112130:
        /* dispenseInterval */ return new String[] { "Duration" };
      case -1434195053:
        /* validityPeriod */ return new String[] { "Period" };
      case -239736976:
        /* numberOfRepeatsAllowed */ return new String[] { "unsignedInt" };
      case -1285004149:
        /* quantity */ return new String[] { "SimpleQuantity" };
      case -1910182789:
        /* expectedSupplyDuration */ return new String[] { "Duration" };
      case 481140686:
        /* performer */ return new String[] { "Reference" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("initialFill")) {
        this.initialFill = new MedicationRequestDispenseRequestInitialFillComponent();
        return this.initialFill;
      } else if (name.equals("dispenseInterval")) {
        this.dispenseInterval = new Duration();
        return this.dispenseInterval;
      } else if (name.equals("validityPeriod")) {
        this.validityPeriod = new Period();
        return this.validityPeriod;
      } else if (name.equals("numberOfRepeatsAllowed")) {
        throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.numberOfRepeatsAllowed");
      } else if (name.equals("quantity")) {
        this.quantity = new Quantity();
        return this.quantity;
      } else if (name.equals("expectedSupplyDuration")) {
        this.expectedSupplyDuration = new Duration();
        return this.expectedSupplyDuration;
      } else if (name.equals("performer")) {
        this.performer = new Reference();
        return this.performer;
      } else
        return super.addChild(name);
    }

    public MedicationRequestDispenseRequestComponent copy() {
      MedicationRequestDispenseRequestComponent dst = new MedicationRequestDispenseRequestComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(MedicationRequestDispenseRequestComponent dst) {
      super.copyValues(dst);
      dst.initialFill = initialFill == null ? null : initialFill.copy();
      dst.dispenseInterval = dispenseInterval == null ? null : dispenseInterval.copy();
      dst.validityPeriod = validityPeriod == null ? null : validityPeriod.copy();
      dst.numberOfRepeatsAllowed = numberOfRepeatsAllowed == null ? null : numberOfRepeatsAllowed.copy();
      dst.quantity = quantity == null ? null : quantity.copy();
      dst.expectedSupplyDuration = expectedSupplyDuration == null ? null : expectedSupplyDuration.copy();
      dst.performer = performer == null ? null : performer.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof MedicationRequestDispenseRequestComponent))
        return false;
      MedicationRequestDispenseRequestComponent o = (MedicationRequestDispenseRequestComponent) other_;
      return compareDeep(initialFill, o.initialFill, true) && compareDeep(dispenseInterval, o.dispenseInterval, true)
          && compareDeep(validityPeriod, o.validityPeriod, true)
          && compareDeep(numberOfRepeatsAllowed, o.numberOfRepeatsAllowed, true)
          && compareDeep(quantity, o.quantity, true)
          && compareDeep(expectedSupplyDuration, o.expectedSupplyDuration, true)
          && compareDeep(performer, o.performer, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof MedicationRequestDispenseRequestComponent))
        return false;
      MedicationRequestDispenseRequestComponent o = (MedicationRequestDispenseRequestComponent) other_;
      return compareValues(numberOfRepeatsAllowed, o.numberOfRepeatsAllowed, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(initialFill, dispenseInterval, validityPeriod,
          numberOfRepeatsAllowed, quantity, expectedSupplyDuration, performer);
    }

    public String fhirType() {
      return "MedicationRequest.dispenseRequest";

    }

  }

  @Block()
  public static class MedicationRequestDispenseRequestInitialFillComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * The amount or quantity to provide as part of the first dispense.
     */
    @Child(name = "quantity", type = { Quantity.class }, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "First fill quantity", formalDefinition = "The amount or quantity to provide as part of the first dispense.")
    protected Quantity quantity;

    /**
     * The length of time that the first dispense is expected to last.
     */
    @Child(name = "duration", type = { Duration.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "First fill duration", formalDefinition = "The length of time that the first dispense is expected to last.")
    protected Duration duration;

    private static final long serialVersionUID = 1223227956L;

    /**
     * Constructor
     */
    public MedicationRequestDispenseRequestInitialFillComponent() {
      super();
    }

    /**
     * @return {@link #quantity} (The amount or quantity to provide as part of the
     *         first dispense.)
     */
    public Quantity getQuantity() {
      if (this.quantity == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestInitialFillComponent.quantity");
        else if (Configuration.doAutoCreate())
          this.quantity = new Quantity(); // cc
      return this.quantity;
    }

    public boolean hasQuantity() {
      return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The amount or quantity to provide as part of
     *              the first dispense.)
     */
    public MedicationRequestDispenseRequestInitialFillComponent setQuantity(Quantity value) {
      this.quantity = value;
      return this;
    }

    /**
     * @return {@link #duration} (The length of time that the first dispense is
     *         expected to last.)
     */
    public Duration getDuration() {
      if (this.duration == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestDispenseRequestInitialFillComponent.duration");
        else if (Configuration.doAutoCreate())
          this.duration = new Duration(); // cc
      return this.duration;
    }

    public boolean hasDuration() {
      return this.duration != null && !this.duration.isEmpty();
    }

    /**
     * @param value {@link #duration} (The length of time that the first dispense is
     *              expected to last.)
     */
    public MedicationRequestDispenseRequestInitialFillComponent setDuration(Duration value) {
      this.duration = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("quantity", "SimpleQuantity",
          "The amount or quantity to provide as part of the first dispense.", 0, 1, quantity));
      children.add(new Property("duration", "Duration",
          "The length of time that the first dispense is expected to last.", 0, 1, duration));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -1285004149:
        /* quantity */ return new Property("quantity", "SimpleQuantity",
            "The amount or quantity to provide as part of the first dispense.", 0, 1, quantity);
      case -1992012396:
        /* duration */ return new Property("duration", "Duration",
            "The length of time that the first dispense is expected to last.", 0, 1, duration);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -1285004149:
        /* quantity */ return this.quantity == null ? new Base[0] : new Base[] { this.quantity }; // Quantity
      case -1992012396:
        /* duration */ return this.duration == null ? new Base[0] : new Base[] { this.duration }; // Duration
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -1285004149: // quantity
        this.quantity = castToQuantity(value); // Quantity
        return value;
      case -1992012396: // duration
        this.duration = castToDuration(value); // Duration
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("quantity")) {
        this.quantity = castToQuantity(value); // Quantity
      } else if (name.equals("duration")) {
        this.duration = castToDuration(value); // Duration
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("quantity")) {
        this.quantity = null;
      } else if (name.equals("duration")) {
        this.duration = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1285004149:
        return getQuantity();
      case -1992012396:
        return getDuration();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1285004149:
        /* quantity */ return new String[] { "SimpleQuantity" };
      case -1992012396:
        /* duration */ return new String[] { "Duration" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("quantity")) {
        this.quantity = new Quantity();
        return this.quantity;
      } else if (name.equals("duration")) {
        this.duration = new Duration();
        return this.duration;
      } else
        return super.addChild(name);
    }

    public MedicationRequestDispenseRequestInitialFillComponent copy() {
      MedicationRequestDispenseRequestInitialFillComponent dst = new MedicationRequestDispenseRequestInitialFillComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(MedicationRequestDispenseRequestInitialFillComponent dst) {
      super.copyValues(dst);
      dst.quantity = quantity == null ? null : quantity.copy();
      dst.duration = duration == null ? null : duration.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof MedicationRequestDispenseRequestInitialFillComponent))
        return false;
      MedicationRequestDispenseRequestInitialFillComponent o = (MedicationRequestDispenseRequestInitialFillComponent) other_;
      return compareDeep(quantity, o.quantity, true) && compareDeep(duration, o.duration, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof MedicationRequestDispenseRequestInitialFillComponent))
        return false;
      MedicationRequestDispenseRequestInitialFillComponent o = (MedicationRequestDispenseRequestInitialFillComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(quantity, duration);
    }

    public String fhirType() {
      return "MedicationRequest.dispenseRequest.initialFill";

    }

  }

  @Block()
  public static class MedicationRequestSubstitutionComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * True if the prescriber allows a different drug to be dispensed from what was
     * prescribed.
     */
    @Child(name = "allowed", type = { BooleanType.class,
        CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Whether substitution is allowed or not", formalDefinition = "True if the prescriber allows a different drug to be dispensed from what was prescribed.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActSubstanceAdminSubstitutionCode")
    protected Type allowed;

    /**
     * Indicates the reason for the substitution, or why substitution must or must
     * not be performed.
     */
    @Child(name = "reason", type = {
        CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Why should (not) substitution be made", formalDefinition = "Indicates the reason for the substitution, or why substitution must or must not be performed.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-SubstanceAdminSubstitutionReason")
    protected CodeableConcept reason;

    private static final long serialVersionUID = 547265407L;

    /**
     * Constructor
     */
    public MedicationRequestSubstitutionComponent() {
      super();
    }

    /**
     * Constructor
     */
    public MedicationRequestSubstitutionComponent(Type allowed) {
      super();
      this.allowed = allowed;
    }

    /**
     * @return {@link #allowed} (True if the prescriber allows a different drug to
     *         be dispensed from what was prescribed.)
     */
    public Type getAllowed() {
      return this.allowed;
    }

    /**
     * @return {@link #allowed} (True if the prescriber allows a different drug to
     *         be dispensed from what was prescribed.)
     */
    public BooleanType getAllowedBooleanType() throws FHIRException {
      if (this.allowed == null)
        this.allowed = new BooleanType();
      if (!(this.allowed instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
            + this.allowed.getClass().getName() + " was encountered");
      return (BooleanType) this.allowed;
    }

    public boolean hasAllowedBooleanType() {
        return this.allowed instanceof BooleanType;
    }

    /**
     * @return {@link #allowed} (True if the prescriber allows a different drug to
     *         be dispensed from what was prescribed.)
     */
    public CodeableConcept getAllowedCodeableConcept() throws FHIRException {
      if (this.allowed == null)
        this.allowed = new CodeableConcept();
      if (!(this.allowed instanceof CodeableConcept))
        throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
            + this.allowed.getClass().getName() + " was encountered");
      return (CodeableConcept) this.allowed;
    }

    public boolean hasAllowedCodeableConcept() {
        return this.allowed instanceof CodeableConcept;
    }

    public boolean hasAllowed() {
      return this.allowed != null && !this.allowed.isEmpty();
    }

    /**
     * @param value {@link #allowed} (True if the prescriber allows a different drug
     *              to be dispensed from what was prescribed.)
     */
    public MedicationRequestSubstitutionComponent setAllowed(Type value) {
      if (value != null && !(value instanceof BooleanType || value instanceof CodeableConcept))
        throw new Error("Not the right type for MedicationRequest.substitution.allowed[x]: " + value.fhirType());
      this.allowed = value;
      return this;
    }

    /**
     * @return {@link #reason} (Indicates the reason for the substitution, or why
     *         substitution must or must not be performed.)
     */
    public CodeableConcept getReason() {
      if (this.reason == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicationRequestSubstitutionComponent.reason");
        else if (Configuration.doAutoCreate())
          this.reason = new CodeableConcept(); // cc
      return this.reason;
    }

    public boolean hasReason() {
      return this.reason != null && !this.reason.isEmpty();
    }

    /**
     * @param value {@link #reason} (Indicates the reason for the substitution, or
     *              why substitution must or must not be performed.)
     */
    public MedicationRequestSubstitutionComponent setReason(CodeableConcept value) {
      this.reason = value;
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("allowed[x]", "boolean|CodeableConcept",
          "True if the prescriber allows a different drug to be dispensed from what was prescribed.", 0, 1, allowed));
      children.add(new Property("reason", "CodeableConcept",
          "Indicates the reason for the substitution, or why substitution must or must not be performed.", 0, 1,
          reason));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -1336663592:
        /* allowed[x] */ return new Property("allowed[x]", "boolean|CodeableConcept",
            "True if the prescriber allows a different drug to be dispensed from what was prescribed.", 0, 1, allowed);
      case -911343192:
        /* allowed */ return new Property("allowed[x]", "boolean|CodeableConcept",
            "True if the prescriber allows a different drug to be dispensed from what was prescribed.", 0, 1, allowed);
      case 177755488:
        /* allowedBoolean */ return new Property("allowed[x]", "boolean|CodeableConcept",
            "True if the prescriber allows a different drug to be dispensed from what was prescribed.", 0, 1, allowed);
      case 963125465:
        /* allowedCodeableConcept */ return new Property("allowed[x]", "boolean|CodeableConcept",
            "True if the prescriber allows a different drug to be dispensed from what was prescribed.", 0, 1, allowed);
      case -934964668:
        /* reason */ return new Property("reason", "CodeableConcept",
            "Indicates the reason for the substitution, or why substitution must or must not be performed.", 0, 1,
            reason);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -911343192:
        /* allowed */ return this.allowed == null ? new Base[0] : new Base[] { this.allowed }; // Type
      case -934964668:
        /* reason */ return this.reason == null ? new Base[0] : new Base[] { this.reason }; // CodeableConcept
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -911343192: // allowed
        this.allowed = castToType(value); // Type
        return value;
      case -934964668: // reason
        this.reason = castToCodeableConcept(value); // CodeableConcept
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("allowed[x]")) {
        this.allowed = castToType(value); // Type
      } else if (name.equals("reason")) {
        this.reason = castToCodeableConcept(value); // CodeableConcept
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("allowed[x]")) {
        this.allowed = null;
      } else if (name.equals("reason")) {
        this.reason = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -1336663592:
        return getAllowed();
      case -911343192:
        return getAllowed();
      case -934964668:
        return getReason();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -911343192:
        /* allowed */ return new String[] { "boolean", "CodeableConcept" };
      case -934964668:
        /* reason */ return new String[] { "CodeableConcept" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("allowedBoolean")) {
        this.allowed = new BooleanType();
        return this.allowed;
      } else if (name.equals("allowedCodeableConcept")) {
        this.allowed = new CodeableConcept();
        return this.allowed;
      } else if (name.equals("reason")) {
        this.reason = new CodeableConcept();
        return this.reason;
      } else
        return super.addChild(name);
    }

    public MedicationRequestSubstitutionComponent copy() {
      MedicationRequestSubstitutionComponent dst = new MedicationRequestSubstitutionComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(MedicationRequestSubstitutionComponent dst) {
      super.copyValues(dst);
      dst.allowed = allowed == null ? null : allowed.copy();
      dst.reason = reason == null ? null : reason.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof MedicationRequestSubstitutionComponent))
        return false;
      MedicationRequestSubstitutionComponent o = (MedicationRequestSubstitutionComponent) other_;
      return compareDeep(allowed, o.allowed, true) && compareDeep(reason, o.reason, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof MedicationRequestSubstitutionComponent))
        return false;
      MedicationRequestSubstitutionComponent o = (MedicationRequestSubstitutionComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(allowed, reason);
    }

    public String fhirType() {
      return "MedicationRequest.substitution";

    }

  }

  /**
   * Identifiers associated with this medication request that are defined by
   * business processes and/or used to refer to it when a direct URL reference to
   * the resource itself is not appropriate. They are business identifiers
   * assigned to this resource by the performer or other systems and remain
   * constant as the resource is updated and propagates from server to server.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "External ids for this request", formalDefinition = "Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
  protected List<Identifier> identifier;

  /**
   * A code specifying the current state of the order. Generally, this will be
   * active or completed state.
   */
  @Child(name = "status", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown", formalDefinition = "A code specifying the current state of the order.  Generally, this will be active or completed state.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-status")
  protected Enumeration<MedicationRequestStatus> status;

  /**
   * Captures the reason for the current state of the MedicationRequest.
   */
  @Child(name = "statusReason", type = {
      CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Reason for current status", formalDefinition = "Captures the reason for the current state of the MedicationRequest.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-status-reason")
  protected CodeableConcept statusReason;

  /**
   * Whether the request is a proposal, plan, or an original order.
   */
  @Child(name = "intent", type = { CodeType.class }, order = 3, min = 1, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "proposal | plan | order | original-order | reflex-order | filler-order | instance-order | option", formalDefinition = "Whether the request is a proposal, plan, or an original order.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-intent")
  protected Enumeration<MedicationRequestIntent> intent;

  /**
   * Indicates the type of medication request (for example, where the medication
   * is expected to be consumed or administered (i.e. inpatient or outpatient)).
   */
  @Child(name = "category", type = {
      CodeableConcept.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Type of medication usage", formalDefinition = "Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-category")
  protected List<CodeableConcept> category;

  /**
   * Indicates how quickly the Medication Request should be addressed with respect
   * to other requests.
   */
  @Child(name = "priority", type = { CodeType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "routine | urgent | asap | stat", formalDefinition = "Indicates how quickly the Medication Request should be addressed with respect to other requests.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
  protected Enumeration<MedicationRequestPriority> priority;

  /**
   * If true indicates that the provider is asking for the medication request not
   * to occur.
   */
  @Child(name = "doNotPerform", type = {
      BooleanType.class }, order = 6, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "True if request is prohibiting action", formalDefinition = "If true indicates that the provider is asking for the medication request not to occur.")
  protected BooleanType doNotPerform;

  /**
   * Indicates if this record was captured as a secondary 'reported' record rather
   * than as an original primary source-of-truth record. It may also indicate the
   * source of the report.
   */
  @Child(name = "reported", type = { BooleanType.class, Patient.class, Practitioner.class, PractitionerRole.class,
      RelatedPerson.class, Organization.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Reported rather than primary record", formalDefinition = "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.")
  protected Type reported;

  /**
   * Identifies the medication being requested. This is a link to a resource that
   * represents the medication which may be the details of the medication or
   * simply an attribute carrying a code that identifies the medication from a
   * known list of medications.
   */
  @Child(name = "medication", type = { CodeableConcept.class,
      Medication.class }, order = 8, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Medication to be taken", formalDefinition = "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-codes")
  protected Type medication;

  /**
   * A link to a resource representing the person or set of individuals to whom
   * the medication will be given.
   */
  @Child(name = "subject", type = { Patient.class,
      Group.class }, order = 9, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Who or group medication request is for", formalDefinition = "A link to a resource representing the person or set of individuals to whom the medication will be given.")
  protected Reference subject;

  /**
   * The actual object that is the target of the reference (A link to a resource
   * representing the person or set of individuals to whom the medication will be
   * given.)
   */
  protected Resource subjectTarget;

  /**
   * The Encounter during which this [x] was created or to which the creation of
   * this record is tightly associated.
   */
  @Child(name = "encounter", type = {
      Encounter.class }, order = 10, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Encounter created as part of encounter/admission/stay", formalDefinition = "The Encounter during which this [x] was created or to which the creation of this record is tightly associated.")
  protected Reference encounter;

  /**
   * The actual object that is the target of the reference (The Encounter during
   * which this [x] was created or to which the creation of this record is tightly
   * associated.)
   */
  protected Encounter encounterTarget;

  /**
   * Include additional information (for example, patient height and weight) that
   * supports the ordering of the medication.
   */
  @Child(name = "supportingInformation", type = {
      Reference.class }, order = 11, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Information to support ordering of the medication", formalDefinition = "Include additional information (for example, patient height and weight) that supports the ordering of the medication.")
  protected List<Reference> supportingInformation;
  /**
   * The actual objects that are the target of the reference (Include additional
   * information (for example, patient height and weight) that supports the
   * ordering of the medication.)
   */
  protected List<Resource> supportingInformationTarget;

  /**
   * The date (and perhaps time) when the prescription was initially written or
   * authored on.
   */
  @Child(name = "authoredOn", type = {
      DateTimeType.class }, order = 12, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "When request was initially authored", formalDefinition = "The date (and perhaps time) when the prescription was initially written or authored on.")
  protected DateTimeType authoredOn;

  /**
   * The individual, organization, or device that initiated the request and has
   * responsibility for its activation.
   */
  @Child(name = "requester", type = { Practitioner.class, PractitionerRole.class, Organization.class, Patient.class,
      RelatedPerson.class, Device.class }, order = 13, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Who/What requested the Request", formalDefinition = "The individual, organization, or device that initiated the request and has responsibility for its activation.")
  protected Reference requester;

  /**
   * The actual object that is the target of the reference (The individual,
   * organization, or device that initiated the request and has responsibility for
   * its activation.)
   */
  protected Resource requesterTarget;

  /**
   * The specified desired performer of the medication treatment (e.g. the
   * performer of the medication administration).
   */
  @Child(name = "performer", type = { Practitioner.class, PractitionerRole.class, Organization.class, Patient.class,
      Device.class, RelatedPerson.class,
      CareTeam.class }, order = 14, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Intended performer of administration", formalDefinition = "The specified desired performer of the medication treatment (e.g. the performer of the medication administration).")
  protected Reference performer;

  /**
   * The actual object that is the target of the reference (The specified desired
   * performer of the medication treatment (e.g. the performer of the medication
   * administration).)
   */
  protected Resource performerTarget;

  /**
   * Indicates the type of performer of the administration of the medication.
   */
  @Child(name = "performerType", type = {
      CodeableConcept.class }, order = 15, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Desired kind of performer of the medication administration", formalDefinition = "Indicates the type of performer of the administration of the medication.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/performer-role")
  protected CodeableConcept performerType;

  /**
   * The person who entered the order on behalf of another individual for example
   * in the case of a verbal or a telephone order.
   */
  @Child(name = "recorder", type = { Practitioner.class,
      PractitionerRole.class }, order = 16, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Person who entered the request", formalDefinition = "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.")
  protected Reference recorder;

  /**
   * The actual object that is the target of the reference (The person who entered
   * the order on behalf of another individual for example in the case of a verbal
   * or a telephone order.)
   */
  protected Resource recorderTarget;

  /**
   * The reason or the indication for ordering or not ordering the medication.
   */
  @Child(name = "reasonCode", type = {
      CodeableConcept.class }, order = 17, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Reason or indication for ordering or not ordering the medication", formalDefinition = "The reason or the indication for ordering or not ordering the medication.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-code")
  protected List<CodeableConcept> reasonCode;

  /**
   * Condition or observation that supports why the medication was ordered.
   */
  @Child(name = "reasonReference", type = { Condition.class,
      Observation.class }, order = 18, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Condition or observation that supports why the prescription is being written", formalDefinition = "Condition or observation that supports why the medication was ordered.")
  protected List<Reference> reasonReference;
  /**
   * The actual objects that are the target of the reference (Condition or
   * observation that supports why the medication was ordered.)
   */
  protected List<Resource> reasonReferenceTarget;

  /**
   * The URL pointing to a protocol, guideline, orderset, or other definition that
   * is adhered to in whole or in part by this MedicationRequest.
   */
  @Child(name = "instantiatesCanonical", type = {
      CanonicalType.class }, order = 19, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Instantiates FHIR protocol or definition", formalDefinition = "The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.")
  protected List<CanonicalType> instantiatesCanonical;

  /**
   * The URL pointing to an externally maintained protocol, guideline, orderset or
   * other definition that is adhered to in whole or in part by this
   * MedicationRequest.
   */
  @Child(name = "instantiatesUri", type = {
      UriType.class }, order = 20, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Instantiates external protocol or definition", formalDefinition = "The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.")
  protected List<UriType> instantiatesUri;

  /**
   * A plan or request that is fulfilled in whole or in part by this medication
   * request.
   */
  @Child(name = "basedOn", type = { CarePlan.class, MedicationRequest.class, ServiceRequest.class,
      ImmunizationRecommendation.class }, order = 21, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "What request fulfills", formalDefinition = "A plan or request that is fulfilled in whole or in part by this medication request.")
  protected List<Reference> basedOn;
  /**
   * The actual objects that are the target of the reference (A plan or request
   * that is fulfilled in whole or in part by this medication request.)
   */
  protected List<Resource> basedOnTarget;

  /**
   * A shared identifier common to all requests that were authorized more or less
   * simultaneously by a single author, representing the identifier of the
   * requisition or prescription.
   */
  @Child(name = "groupIdentifier", type = {
      Identifier.class }, order = 22, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Composite request this is part of", formalDefinition = "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.")
  protected Identifier groupIdentifier;

  /**
   * The description of the overall patte3rn of the administration of the
   * medication to the patient.
   */
  @Child(name = "courseOfTherapyType", type = {
      CodeableConcept.class }, order = 23, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Overall pattern of medication administration", formalDefinition = "The description of the overall patte3rn of the administration of the medication to the patient.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-course-of-therapy")
  protected CodeableConcept courseOfTherapyType;

  /**
   * Insurance plans, coverage extensions, pre-authorizations and/or
   * pre-determinations that may be required for delivering the requested service.
   */
  @Child(name = "insurance", type = { Coverage.class,
      ClaimResponse.class }, order = 24, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Associated insurance coverage", formalDefinition = "Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.")
  protected List<Reference> insurance;
  /**
   * The actual objects that are the target of the reference (Insurance plans,
   * coverage extensions, pre-authorizations and/or pre-determinations that may be
   * required for delivering the requested service.)
   */
  protected List<Resource> insuranceTarget;

  /**
   * Extra information about the prescription that could not be conveyed by the
   * other attributes.
   */
  @Child(name = "note", type = {
      Annotation.class }, order = 25, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Information about the prescription", formalDefinition = "Extra information about the prescription that could not be conveyed by the other attributes.")
  protected List<Annotation> note;

  /**
   * Indicates how the medication is to be used by the patient.
   */
  @Child(name = "dosageInstruction", type = {
      Dosage.class }, order = 26, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "How the medication should be taken", formalDefinition = "Indicates how the medication is to be used by the patient.")
  protected List<Dosage> dosageInstruction;

  /**
   * Indicates the specific details for the dispense or medication supply part of
   * a medication request (also known as a Medication Prescription or Medication
   * Order). Note that this information is not always sent with the order. There
   * may be in some settings (e.g. hospitals) institutional or system support for
   * completing the dispense details in the pharmacy department.
   */
  @Child(name = "dispenseRequest", type = {}, order = 27, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Medication supply authorization", formalDefinition = "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.")
  protected MedicationRequestDispenseRequestComponent dispenseRequest;

  /**
   * Indicates whether or not substitution can or should be part of the dispense.
   * In some cases, substitution must happen, in other cases substitution must not
   * happen. This block explains the prescriber's intent. If nothing is specified
   * substitution may be done.
   */
  @Child(name = "substitution", type = {}, order = 28, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Any restrictions on medication substitution", formalDefinition = "Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.")
  protected MedicationRequestSubstitutionComponent substitution;

  /**
   * A link to a resource representing an earlier order related order or
   * prescription.
   */
  @Child(name = "priorPrescription", type = {
      MedicationRequest.class }, order = 29, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "An order/prescription that is being replaced", formalDefinition = "A link to a resource representing an earlier order related order or prescription.")
  protected Reference priorPrescription;

  /**
   * The actual object that is the target of the reference (A link to a resource
   * representing an earlier order related order or prescription.)
   */
  protected MedicationRequest priorPrescriptionTarget;

  /**
   * Indicates an actual or potential clinical issue with or between one or more
   * active or proposed clinical actions for a patient; e.g. Drug-drug
   * interaction, duplicate therapy, dosage alert etc.
   */
  @Child(name = "detectedIssue", type = {
      DetectedIssue.class }, order = 30, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "Clinical Issue with action", formalDefinition = "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.")
  protected List<Reference> detectedIssue;
  /**
   * The actual objects that are the target of the reference (Indicates an actual
   * or potential clinical issue with or between one or more active or proposed
   * clinical actions for a patient; e.g. Drug-drug interaction, duplicate
   * therapy, dosage alert etc.)
   */
  protected List<DetectedIssue> detectedIssueTarget;

  /**
   * Links to Provenance records for past versions of this resource or fulfilling
   * request or event resources that identify key state transitions or updates
   * that are likely to be relevant to a user looking at the current version of
   * the resource.
   */
  @Child(name = "eventHistory", type = {
      Provenance.class }, order = 31, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
  @Description(shortDefinition = "A list of events of interest in the lifecycle", formalDefinition = "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.")
  protected List<Reference> eventHistory;
  /**
   * The actual objects that are the target of the reference (Links to Provenance
   * records for past versions of this resource or fulfilling request or event
   * resources that identify key state transitions or updates that are likely to
   * be relevant to a user looking at the current version of the resource.)
   */
  protected List<Provenance> eventHistoryTarget;

  private static final long serialVersionUID = 1313900480L;

  /**
   * Constructor
   */
  public MedicationRequest() {
    super();
  }

  /**
   * Constructor
   */
  public MedicationRequest(Enumeration<MedicationRequestStatus> status, Enumeration<MedicationRequestIntent> intent,
      Type medication, Reference subject) {
    super();
    this.status = status;
    this.intent = intent;
    this.medication = medication;
    this.subject = subject;
  }

  /**
   * @return {@link #identifier} (Identifiers associated with this medication
   *         request that are defined by business processes and/or used to refer
   *         to it when a direct URL reference to the resource itself is not
   *         appropriate. They are business identifiers assigned to this resource
   *         by the performer or other systems and remain constant as the resource
   *         is updated and propagates from server to server.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setIdentifier(List<Identifier> theIdentifier) {
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

  public MedicationRequest addIdentifier(Identifier t) { // 3
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
   * @return {@link #status} (A code specifying the current state of the order.
   *         Generally, this will be active or completed state.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getStatus" gives direct access to the value
   */
  public Enumeration<MedicationRequestStatus> getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.status");
      else if (Configuration.doAutoCreate())
        this.status = new Enumeration<MedicationRequestStatus>(new MedicationRequestStatusEnumFactory()); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (A code specifying the current state of the
   *              order. Generally, this will be active or completed state.). This
   *              is the underlying object with id, value and extensions. The
   *              accessor "getStatus" gives direct access to the value
   */
  public MedicationRequest setStatusElement(Enumeration<MedicationRequestStatus> value) {
    this.status = value;
    return this;
  }

  /**
   * @return A code specifying the current state of the order. Generally, this
   *         will be active or completed state.
   */
  public MedicationRequestStatus getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value A code specifying the current state of the order. Generally,
   *              this will be active or completed state.
   */
  public MedicationRequest setStatus(MedicationRequestStatus value) {
    if (this.status == null)
      this.status = new Enumeration<MedicationRequestStatus>(new MedicationRequestStatusEnumFactory());
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #statusReason} (Captures the reason for the current state of
   *         the MedicationRequest.)
   */
  public CodeableConcept getStatusReason() {
    if (this.statusReason == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.statusReason");
      else if (Configuration.doAutoCreate())
        this.statusReason = new CodeableConcept(); // cc
    return this.statusReason;
  }

  public boolean hasStatusReason() {
    return this.statusReason != null && !this.statusReason.isEmpty();
  }

  /**
   * @param value {@link #statusReason} (Captures the reason for the current state
   *              of the MedicationRequest.)
   */
  public MedicationRequest setStatusReason(CodeableConcept value) {
    this.statusReason = value;
    return this;
  }

  /**
   * @return {@link #intent} (Whether the request is a proposal, plan, or an
   *         original order.). This is the underlying object with id, value and
   *         extensions. The accessor "getIntent" gives direct access to the value
   */
  public Enumeration<MedicationRequestIntent> getIntentElement() {
    if (this.intent == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.intent");
      else if (Configuration.doAutoCreate())
        this.intent = new Enumeration<MedicationRequestIntent>(new MedicationRequestIntentEnumFactory()); // bb
    return this.intent;
  }

  public boolean hasIntentElement() {
    return this.intent != null && !this.intent.isEmpty();
  }

  public boolean hasIntent() {
    return this.intent != null && !this.intent.isEmpty();
  }

  /**
   * @param value {@link #intent} (Whether the request is a proposal, plan, or an
   *              original order.). This is the underlying object with id, value
   *              and extensions. The accessor "getIntent" gives direct access to
   *              the value
   */
  public MedicationRequest setIntentElement(Enumeration<MedicationRequestIntent> value) {
    this.intent = value;
    return this;
  }

  /**
   * @return Whether the request is a proposal, plan, or an original order.
   */
  public MedicationRequestIntent getIntent() {
    return this.intent == null ? null : this.intent.getValue();
  }

  /**
   * @param value Whether the request is a proposal, plan, or an original order.
   */
  public MedicationRequest setIntent(MedicationRequestIntent value) {
    if (this.intent == null)
      this.intent = new Enumeration<MedicationRequestIntent>(new MedicationRequestIntentEnumFactory());
    this.intent.setValue(value);
    return this;
  }

  /**
   * @return {@link #category} (Indicates the type of medication request (for
   *         example, where the medication is expected to be consumed or
   *         administered (i.e. inpatient or outpatient)).)
   */
  public List<CodeableConcept> getCategory() {
    if (this.category == null)
      this.category = new ArrayList<CodeableConcept>();
    return this.category;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setCategory(List<CodeableConcept> theCategory) {
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

  public MedicationRequest addCategory(CodeableConcept t) { // 3
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
   * @return {@link #priority} (Indicates how quickly the Medication Request
   *         should be addressed with respect to other requests.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getPriority" gives direct access to the value
   */
  public Enumeration<MedicationRequestPriority> getPriorityElement() {
    if (this.priority == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.priority");
      else if (Configuration.doAutoCreate())
        this.priority = new Enumeration<MedicationRequestPriority>(new MedicationRequestPriorityEnumFactory()); // bb
    return this.priority;
  }

  public boolean hasPriorityElement() {
    return this.priority != null && !this.priority.isEmpty();
  }

  public boolean hasPriority() {
    return this.priority != null && !this.priority.isEmpty();
  }

  /**
   * @param value {@link #priority} (Indicates how quickly the Medication Request
   *              should be addressed with respect to other requests.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getPriority" gives direct access to the value
   */
  public MedicationRequest setPriorityElement(Enumeration<MedicationRequestPriority> value) {
    this.priority = value;
    return this;
  }

  /**
   * @return Indicates how quickly the Medication Request should be addressed with
   *         respect to other requests.
   */
  public MedicationRequestPriority getPriority() {
    return this.priority == null ? null : this.priority.getValue();
  }

  /**
   * @param value Indicates how quickly the Medication Request should be addressed
   *              with respect to other requests.
   */
  public MedicationRequest setPriority(MedicationRequestPriority value) {
    if (value == null)
      this.priority = null;
    else {
      if (this.priority == null)
        this.priority = new Enumeration<MedicationRequestPriority>(new MedicationRequestPriorityEnumFactory());
      this.priority.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #doNotPerform} (If true indicates that the provider is asking
   *         for the medication request not to occur.). This is the underlying
   *         object with id, value and extensions. The accessor "getDoNotPerform"
   *         gives direct access to the value
   */
  public BooleanType getDoNotPerformElement() {
    if (this.doNotPerform == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.doNotPerform");
      else if (Configuration.doAutoCreate())
        this.doNotPerform = new BooleanType(); // bb
    return this.doNotPerform;
  }

  public boolean hasDoNotPerformElement() {
    return this.doNotPerform != null && !this.doNotPerform.isEmpty();
  }

  public boolean hasDoNotPerform() {
    return this.doNotPerform != null && !this.doNotPerform.isEmpty();
  }

  /**
   * @param value {@link #doNotPerform} (If true indicates that the provider is
   *              asking for the medication request not to occur.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getDoNotPerform" gives direct access to the value
   */
  public MedicationRequest setDoNotPerformElement(BooleanType value) {
    this.doNotPerform = value;
    return this;
  }

  /**
   * @return If true indicates that the provider is asking for the medication
   *         request not to occur.
   */
  public boolean getDoNotPerform() {
    return this.doNotPerform == null || this.doNotPerform.isEmpty() ? false : this.doNotPerform.getValue();
  }

  /**
   * @param value If true indicates that the provider is asking for the medication
   *              request not to occur.
   */
  public MedicationRequest setDoNotPerform(boolean value) {
    if (this.doNotPerform == null)
      this.doNotPerform = new BooleanType();
    this.doNotPerform.setValue(value);
    return this;
  }

  /**
   * @return {@link #reported} (Indicates if this record was captured as a
   *         secondary 'reported' record rather than as an original primary
   *         source-of-truth record. It may also indicate the source of the
   *         report.)
   */
  public Type getReported() {
    return this.reported;
  }

  /**
   * @return {@link #reported} (Indicates if this record was captured as a
   *         secondary 'reported' record rather than as an original primary
   *         source-of-truth record. It may also indicate the source of the
   *         report.)
   */
  public BooleanType getReportedBooleanType() throws FHIRException {
    if (this.reported == null)
      this.reported = new BooleanType();
    if (!(this.reported instanceof BooleanType))
      throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
          + this.reported.getClass().getName() + " was encountered");
    return (BooleanType) this.reported;
  }

  public boolean hasReportedBooleanType() {
      return this.reported instanceof BooleanType;
  }

  /**
   * @return {@link #reported} (Indicates if this record was captured as a
   *         secondary 'reported' record rather than as an original primary
   *         source-of-truth record. It may also indicate the source of the
   *         report.)
   */
  public Reference getReportedReference() throws FHIRException {
    if (this.reported == null)
      this.reported = new Reference();
    if (!(this.reported instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but "
          + this.reported.getClass().getName() + " was encountered");
    return (Reference) this.reported;
  }

  public boolean hasReportedReference() {
      return this.reported instanceof Reference;
  }

  public boolean hasReported() {
    return this.reported != null && !this.reported.isEmpty();
  }

  /**
   * @param value {@link #reported} (Indicates if this record was captured as a
   *              secondary 'reported' record rather than as an original primary
   *              source-of-truth record. It may also indicate the source of the
   *              report.)
   */
  public MedicationRequest setReported(Type value) {
    if (value != null && !(value instanceof BooleanType || value instanceof Reference))
      throw new Error("Not the right type for MedicationRequest.reported[x]: " + value.fhirType());
    this.reported = value;
    return this;
  }

  /**
   * @return {@link #medication} (Identifies the medication being requested. This
   *         is a link to a resource that represents the medication which may be
   *         the details of the medication or simply an attribute carrying a code
   *         that identifies the medication from a known list of medications.)
   */
  public Type getMedication() {
    return this.medication;
  }

  /**
   * @return {@link #medication} (Identifies the medication being requested. This
   *         is a link to a resource that represents the medication which may be
   *         the details of the medication or simply an attribute carrying a code
   *         that identifies the medication from a known list of medications.)
   */
  public CodeableConcept getMedicationCodeableConcept() throws FHIRException {
    if (this.medication == null)
      this.medication = new CodeableConcept();
    if (!(this.medication instanceof CodeableConcept))
      throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
          + this.medication.getClass().getName() + " was encountered");
    return (CodeableConcept) this.medication;
  }

  public boolean hasMedicationCodeableConcept() {
      return this.medication instanceof CodeableConcept;
  }

  /**
   * @return {@link #medication} (Identifies the medication being requested. This
   *         is a link to a resource that represents the medication which may be
   *         the details of the medication or simply an attribute carrying a code
   *         that identifies the medication from a known list of medications.)
   */
  public Reference getMedicationReference() throws FHIRException {
    if (this.medication == null)
      this.medication = new Reference();
    if (!(this.medication instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but "
          + this.medication.getClass().getName() + " was encountered");
    return (Reference) this.medication;
  }

  public boolean hasMedicationReference() {
      return this.medication instanceof Reference;
  }

  public boolean hasMedication() {
    return this.medication != null && !this.medication.isEmpty();
  }

  /**
   * @param value {@link #medication} (Identifies the medication being requested.
   *              This is a link to a resource that represents the medication
   *              which may be the details of the medication or simply an
   *              attribute carrying a code that identifies the medication from a
   *              known list of medications.)
   */
  public MedicationRequest setMedication(Type value) {
    if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
      throw new Error("Not the right type for MedicationRequest.medication[x]: " + value.fhirType());
    this.medication = value;
    return this;
  }

  /**
   * @return {@link #subject} (A link to a resource representing the person or set
   *         of individuals to whom the medication will be given.)
   */
  public Reference getSubject() {
    if (this.subject == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.subject");
      else if (Configuration.doAutoCreate())
        this.subject = new Reference(); // cc
    return this.subject;
  }

  public boolean hasSubject() {
    return this.subject != null && !this.subject.isEmpty();
  }

  /**
   * @param value {@link #subject} (A link to a resource representing the person
   *              or set of individuals to whom the medication will be given.)
   */
  public MedicationRequest setSubject(Reference value) {
    this.subject = value;
    return this;
  }

  /**
   * @return {@link #subject} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (A link to a resource
   *         representing the person or set of individuals to whom the medication
   *         will be given.)
   */
  public Resource getSubjectTarget() {
    return this.subjectTarget;
  }

  /**
   * @param value {@link #subject} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (A link to a
   *              resource representing the person or set of individuals to whom
   *              the medication will be given.)
   */
  public MedicationRequest setSubjectTarget(Resource value) {
    this.subjectTarget = value;
    return this;
  }

  /**
   * @return {@link #encounter} (The Encounter during which this [x] was created
   *         or to which the creation of this record is tightly associated.)
   */
  public Reference getEncounter() {
    if (this.encounter == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.encounter");
      else if (Configuration.doAutoCreate())
        this.encounter = new Reference(); // cc
    return this.encounter;
  }

  public boolean hasEncounter() {
    return this.encounter != null && !this.encounter.isEmpty();
  }

  /**
   * @param value {@link #encounter} (The Encounter during which this [x] was
   *              created or to which the creation of this record is tightly
   *              associated.)
   */
  public MedicationRequest setEncounter(Reference value) {
    this.encounter = value;
    return this;
  }

  /**
   * @return {@link #encounter} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The Encounter during
   *         which this [x] was created or to which the creation of this record is
   *         tightly associated.)
   */
  public Encounter getEncounterTarget() {
    if (this.encounterTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.encounter");
      else if (Configuration.doAutoCreate())
        this.encounterTarget = new Encounter(); // aa
    return this.encounterTarget;
  }

  /**
   * @param value {@link #encounter} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The Encounter
   *              during which this [x] was created or to which the creation of
   *              this record is tightly associated.)
   */
  public MedicationRequest setEncounterTarget(Encounter value) {
    this.encounterTarget = value;
    return this;
  }

  /**
   * @return {@link #supportingInformation} (Include additional information (for
   *         example, patient height and weight) that supports the ordering of the
   *         medication.)
   */
  public List<Reference> getSupportingInformation() {
    if (this.supportingInformation == null)
      this.supportingInformation = new ArrayList<Reference>();
    return this.supportingInformation;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setSupportingInformation(List<Reference> theSupportingInformation) {
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

  public MedicationRequest addSupportingInformation(Reference t) { // 3
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

  /**
   * @return {@link #authoredOn} (The date (and perhaps time) when the
   *         prescription was initially written or authored on.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getAuthoredOn" gives direct access to the value
   */
  public DateTimeType getAuthoredOnElement() {
    if (this.authoredOn == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.authoredOn");
      else if (Configuration.doAutoCreate())
        this.authoredOn = new DateTimeType(); // bb
    return this.authoredOn;
  }

  public boolean hasAuthoredOnElement() {
    return this.authoredOn != null && !this.authoredOn.isEmpty();
  }

  public boolean hasAuthoredOn() {
    return this.authoredOn != null && !this.authoredOn.isEmpty();
  }

  /**
   * @param value {@link #authoredOn} (The date (and perhaps time) when the
   *              prescription was initially written or authored on.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getAuthoredOn" gives direct access to the value
   */
  public MedicationRequest setAuthoredOnElement(DateTimeType value) {
    this.authoredOn = value;
    return this;
  }

  /**
   * @return The date (and perhaps time) when the prescription was initially
   *         written or authored on.
   */
  public Date getAuthoredOn() {
    return this.authoredOn == null ? null : this.authoredOn.getValue();
  }

  /**
   * @param value The date (and perhaps time) when the prescription was initially
   *              written or authored on.
   */
  public MedicationRequest setAuthoredOn(Date value) {
    if (value == null)
      this.authoredOn = null;
    else {
      if (this.authoredOn == null)
        this.authoredOn = new DateTimeType();
      this.authoredOn.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #requester} (The individual, organization, or device that
   *         initiated the request and has responsibility for its activation.)
   */
  public Reference getRequester() {
    if (this.requester == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.requester");
      else if (Configuration.doAutoCreate())
        this.requester = new Reference(); // cc
    return this.requester;
  }

  public boolean hasRequester() {
    return this.requester != null && !this.requester.isEmpty();
  }

  /**
   * @param value {@link #requester} (The individual, organization, or device that
   *              initiated the request and has responsibility for its
   *              activation.)
   */
  public MedicationRequest setRequester(Reference value) {
    this.requester = value;
    return this;
  }

  /**
   * @return {@link #requester} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The individual,
   *         organization, or device that initiated the request and has
   *         responsibility for its activation.)
   */
  public Resource getRequesterTarget() {
    return this.requesterTarget;
  }

  /**
   * @param value {@link #requester} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The individual,
   *              organization, or device that initiated the request and has
   *              responsibility for its activation.)
   */
  public MedicationRequest setRequesterTarget(Resource value) {
    this.requesterTarget = value;
    return this;
  }

  /**
   * @return {@link #performer} (The specified desired performer of the medication
   *         treatment (e.g. the performer of the medication administration).)
   */
  public Reference getPerformer() {
    if (this.performer == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.performer");
      else if (Configuration.doAutoCreate())
        this.performer = new Reference(); // cc
    return this.performer;
  }

  public boolean hasPerformer() {
    return this.performer != null && !this.performer.isEmpty();
  }

  /**
   * @param value {@link #performer} (The specified desired performer of the
   *              medication treatment (e.g. the performer of the medication
   *              administration).)
   */
  public MedicationRequest setPerformer(Reference value) {
    this.performer = value;
    return this;
  }

  /**
   * @return {@link #performer} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The specified desired
   *         performer of the medication treatment (e.g. the performer of the
   *         medication administration).)
   */
  public Resource getPerformerTarget() {
    return this.performerTarget;
  }

  /**
   * @param value {@link #performer} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The specified
   *              desired performer of the medication treatment (e.g. the
   *              performer of the medication administration).)
   */
  public MedicationRequest setPerformerTarget(Resource value) {
    this.performerTarget = value;
    return this;
  }

  /**
   * @return {@link #performerType} (Indicates the type of performer of the
   *         administration of the medication.)
   */
  public CodeableConcept getPerformerType() {
    if (this.performerType == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.performerType");
      else if (Configuration.doAutoCreate())
        this.performerType = new CodeableConcept(); // cc
    return this.performerType;
  }

  public boolean hasPerformerType() {
    return this.performerType != null && !this.performerType.isEmpty();
  }

  /**
   * @param value {@link #performerType} (Indicates the type of performer of the
   *              administration of the medication.)
   */
  public MedicationRequest setPerformerType(CodeableConcept value) {
    this.performerType = value;
    return this;
  }

  /**
   * @return {@link #recorder} (The person who entered the order on behalf of
   *         another individual for example in the case of a verbal or a telephone
   *         order.)
   */
  public Reference getRecorder() {
    if (this.recorder == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.recorder");
      else if (Configuration.doAutoCreate())
        this.recorder = new Reference(); // cc
    return this.recorder;
  }

  public boolean hasRecorder() {
    return this.recorder != null && !this.recorder.isEmpty();
  }

  /**
   * @param value {@link #recorder} (The person who entered the order on behalf of
   *              another individual for example in the case of a verbal or a
   *              telephone order.)
   */
  public MedicationRequest setRecorder(Reference value) {
    this.recorder = value;
    return this;
  }

  /**
   * @return {@link #recorder} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (The person who
   *         entered the order on behalf of another individual for example in the
   *         case of a verbal or a telephone order.)
   */
  public Resource getRecorderTarget() {
    return this.recorderTarget;
  }

  /**
   * @param value {@link #recorder} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (The person who
   *              entered the order on behalf of another individual for example in
   *              the case of a verbal or a telephone order.)
   */
  public MedicationRequest setRecorderTarget(Resource value) {
    this.recorderTarget = value;
    return this;
  }

  /**
   * @return {@link #reasonCode} (The reason or the indication for ordering or not
   *         ordering the medication.)
   */
  public List<CodeableConcept> getReasonCode() {
    if (this.reasonCode == null)
      this.reasonCode = new ArrayList<CodeableConcept>();
    return this.reasonCode;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setReasonCode(List<CodeableConcept> theReasonCode) {
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

  public MedicationRequest addReasonCode(CodeableConcept t) { // 3
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
   * @return {@link #reasonReference} (Condition or observation that supports why
   *         the medication was ordered.)
   */
  public List<Reference> getReasonReference() {
    if (this.reasonReference == null)
      this.reasonReference = new ArrayList<Reference>();
    return this.reasonReference;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setReasonReference(List<Reference> theReasonReference) {
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

  public MedicationRequest addReasonReference(Reference t) { // 3
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
   * @return {@link #instantiatesCanonical} (The URL pointing to a protocol,
   *         guideline, orderset, or other definition that is adhered to in whole
   *         or in part by this MedicationRequest.)
   */
  public List<CanonicalType> getInstantiatesCanonical() {
    if (this.instantiatesCanonical == null)
      this.instantiatesCanonical = new ArrayList<CanonicalType>();
    return this.instantiatesCanonical;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setInstantiatesCanonical(List<CanonicalType> theInstantiatesCanonical) {
    this.instantiatesCanonical = theInstantiatesCanonical;
    return this;
  }

  public boolean hasInstantiatesCanonical() {
    if (this.instantiatesCanonical == null)
      return false;
    for (CanonicalType item : this.instantiatesCanonical)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #instantiatesCanonical} (The URL pointing to a protocol,
   *         guideline, orderset, or other definition that is adhered to in whole
   *         or in part by this MedicationRequest.)
   */
  public CanonicalType addInstantiatesCanonicalElement() {// 2
    CanonicalType t = new CanonicalType();
    if (this.instantiatesCanonical == null)
      this.instantiatesCanonical = new ArrayList<CanonicalType>();
    this.instantiatesCanonical.add(t);
    return t;
  }

  /**
   * @param value {@link #instantiatesCanonical} (The URL pointing to a protocol,
   *              guideline, orderset, or other definition that is adhered to in
   *              whole or in part by this MedicationRequest.)
   */
  public MedicationRequest addInstantiatesCanonical(String value) { // 1
    CanonicalType t = new CanonicalType();
    t.setValue(value);
    if (this.instantiatesCanonical == null)
      this.instantiatesCanonical = new ArrayList<CanonicalType>();
    this.instantiatesCanonical.add(t);
    return this;
  }

  /**
   * @param value {@link #instantiatesCanonical} (The URL pointing to a protocol,
   *              guideline, orderset, or other definition that is adhered to in
   *              whole or in part by this MedicationRequest.)
   */
  public boolean hasInstantiatesCanonical(String value) {
    if (this.instantiatesCanonical == null)
      return false;
    for (CanonicalType v : this.instantiatesCanonical)
      if (v.getValue().equals(value)) // canonical
        return true;
    return false;
  }

  /**
   * @return {@link #instantiatesUri} (The URL pointing to an externally
   *         maintained protocol, guideline, orderset or other definition that is
   *         adhered to in whole or in part by this MedicationRequest.)
   */
  public List<UriType> getInstantiatesUri() {
    if (this.instantiatesUri == null)
      this.instantiatesUri = new ArrayList<UriType>();
    return this.instantiatesUri;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setInstantiatesUri(List<UriType> theInstantiatesUri) {
    this.instantiatesUri = theInstantiatesUri;
    return this;
  }

  public boolean hasInstantiatesUri() {
    if (this.instantiatesUri == null)
      return false;
    for (UriType item : this.instantiatesUri)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #instantiatesUri} (The URL pointing to an externally
   *         maintained protocol, guideline, orderset or other definition that is
   *         adhered to in whole or in part by this MedicationRequest.)
   */
  public UriType addInstantiatesUriElement() {// 2
    UriType t = new UriType();
    if (this.instantiatesUri == null)
      this.instantiatesUri = new ArrayList<UriType>();
    this.instantiatesUri.add(t);
    return t;
  }

  /**
   * @param value {@link #instantiatesUri} (The URL pointing to an externally
   *              maintained protocol, guideline, orderset or other definition
   *              that is adhered to in whole or in part by this
   *              MedicationRequest.)
   */
  public MedicationRequest addInstantiatesUri(String value) { // 1
    UriType t = new UriType();
    t.setValue(value);
    if (this.instantiatesUri == null)
      this.instantiatesUri = new ArrayList<UriType>();
    this.instantiatesUri.add(t);
    return this;
  }

  /**
   * @param value {@link #instantiatesUri} (The URL pointing to an externally
   *              maintained protocol, guideline, orderset or other definition
   *              that is adhered to in whole or in part by this
   *              MedicationRequest.)
   */
  public boolean hasInstantiatesUri(String value) {
    if (this.instantiatesUri == null)
      return false;
    for (UriType v : this.instantiatesUri)
      if (v.getValue().equals(value)) // uri
        return true;
    return false;
  }

  /**
   * @return {@link #basedOn} (A plan or request that is fulfilled in whole or in
   *         part by this medication request.)
   */
  public List<Reference> getBasedOn() {
    if (this.basedOn == null)
      this.basedOn = new ArrayList<Reference>();
    return this.basedOn;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setBasedOn(List<Reference> theBasedOn) {
    this.basedOn = theBasedOn;
    return this;
  }

  public boolean hasBasedOn() {
    if (this.basedOn == null)
      return false;
    for (Reference item : this.basedOn)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addBasedOn() { // 3
    Reference t = new Reference();
    if (this.basedOn == null)
      this.basedOn = new ArrayList<Reference>();
    this.basedOn.add(t);
    return t;
  }

  public MedicationRequest addBasedOn(Reference t) { // 3
    if (t == null)
      return this;
    if (this.basedOn == null)
      this.basedOn = new ArrayList<Reference>();
    this.basedOn.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #basedOn}, creating it
   *         if it does not already exist
   */
  public Reference getBasedOnFirstRep() {
    if (getBasedOn().isEmpty()) {
      addBasedOn();
    }
    return getBasedOn().get(0);
  }

  /**
   * @return {@link #groupIdentifier} (A shared identifier common to all requests
   *         that were authorized more or less simultaneously by a single author,
   *         representing the identifier of the requisition or prescription.)
   */
  public Identifier getGroupIdentifier() {
    if (this.groupIdentifier == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.groupIdentifier");
      else if (Configuration.doAutoCreate())
        this.groupIdentifier = new Identifier(); // cc
    return this.groupIdentifier;
  }

  public boolean hasGroupIdentifier() {
    return this.groupIdentifier != null && !this.groupIdentifier.isEmpty();
  }

  /**
   * @param value {@link #groupIdentifier} (A shared identifier common to all
   *              requests that were authorized more or less simultaneously by a
   *              single author, representing the identifier of the requisition or
   *              prescription.)
   */
  public MedicationRequest setGroupIdentifier(Identifier value) {
    this.groupIdentifier = value;
    return this;
  }

  /**
   * @return {@link #courseOfTherapyType} (The description of the overall patte3rn
   *         of the administration of the medication to the patient.)
   */
  public CodeableConcept getCourseOfTherapyType() {
    if (this.courseOfTherapyType == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.courseOfTherapyType");
      else if (Configuration.doAutoCreate())
        this.courseOfTherapyType = new CodeableConcept(); // cc
    return this.courseOfTherapyType;
  }

  public boolean hasCourseOfTherapyType() {
    return this.courseOfTherapyType != null && !this.courseOfTherapyType.isEmpty();
  }

  /**
   * @param value {@link #courseOfTherapyType} (The description of the overall
   *              patte3rn of the administration of the medication to the
   *              patient.)
   */
  public MedicationRequest setCourseOfTherapyType(CodeableConcept value) {
    this.courseOfTherapyType = value;
    return this;
  }

  /**
   * @return {@link #insurance} (Insurance plans, coverage extensions,
   *         pre-authorizations and/or pre-determinations that may be required for
   *         delivering the requested service.)
   */
  public List<Reference> getInsurance() {
    if (this.insurance == null)
      this.insurance = new ArrayList<Reference>();
    return this.insurance;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setInsurance(List<Reference> theInsurance) {
    this.insurance = theInsurance;
    return this;
  }

  public boolean hasInsurance() {
    if (this.insurance == null)
      return false;
    for (Reference item : this.insurance)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addInsurance() { // 3
    Reference t = new Reference();
    if (this.insurance == null)
      this.insurance = new ArrayList<Reference>();
    this.insurance.add(t);
    return t;
  }

  public MedicationRequest addInsurance(Reference t) { // 3
    if (t == null)
      return this;
    if (this.insurance == null)
      this.insurance = new ArrayList<Reference>();
    this.insurance.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #insurance}, creating
   *         it if it does not already exist
   */
  public Reference getInsuranceFirstRep() {
    if (getInsurance().isEmpty()) {
      addInsurance();
    }
    return getInsurance().get(0);
  }

  /**
   * @return {@link #note} (Extra information about the prescription that could
   *         not be conveyed by the other attributes.)
   */
  public List<Annotation> getNote() {
    if (this.note == null)
      this.note = new ArrayList<Annotation>();
    return this.note;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setNote(List<Annotation> theNote) {
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

  public MedicationRequest addNote(Annotation t) { // 3
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
   * @return {@link #dosageInstruction} (Indicates how the medication is to be
   *         used by the patient.)
   */
  public List<Dosage> getDosageInstruction() {
    if (this.dosageInstruction == null)
      this.dosageInstruction = new ArrayList<Dosage>();
    return this.dosageInstruction;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setDosageInstruction(List<Dosage> theDosageInstruction) {
    this.dosageInstruction = theDosageInstruction;
    return this;
  }

  public boolean hasDosageInstruction() {
    if (this.dosageInstruction == null)
      return false;
    for (Dosage item : this.dosageInstruction)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Dosage addDosageInstruction() { // 3
    Dosage t = new Dosage();
    if (this.dosageInstruction == null)
      this.dosageInstruction = new ArrayList<Dosage>();
    this.dosageInstruction.add(t);
    return t;
  }

  public MedicationRequest addDosageInstruction(Dosage t) { // 3
    if (t == null)
      return this;
    if (this.dosageInstruction == null)
      this.dosageInstruction = new ArrayList<Dosage>();
    this.dosageInstruction.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #dosageInstruction},
   *         creating it if it does not already exist
   */
  public Dosage getDosageInstructionFirstRep() {
    if (getDosageInstruction().isEmpty()) {
      addDosageInstruction();
    }
    return getDosageInstruction().get(0);
  }

  /**
   * @return {@link #dispenseRequest} (Indicates the specific details for the
   *         dispense or medication supply part of a medication request (also
   *         known as a Medication Prescription or Medication Order). Note that
   *         this information is not always sent with the order. There may be in
   *         some settings (e.g. hospitals) institutional or system support for
   *         completing the dispense details in the pharmacy department.)
   */
  public MedicationRequestDispenseRequestComponent getDispenseRequest() {
    if (this.dispenseRequest == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.dispenseRequest");
      else if (Configuration.doAutoCreate())
        this.dispenseRequest = new MedicationRequestDispenseRequestComponent(); // cc
    return this.dispenseRequest;
  }

  public boolean hasDispenseRequest() {
    return this.dispenseRequest != null && !this.dispenseRequest.isEmpty();
  }

  /**
   * @param value {@link #dispenseRequest} (Indicates the specific details for the
   *              dispense or medication supply part of a medication request (also
   *              known as a Medication Prescription or Medication Order). Note
   *              that this information is not always sent with the order. There
   *              may be in some settings (e.g. hospitals) institutional or system
   *              support for completing the dispense details in the pharmacy
   *              department.)
   */
  public MedicationRequest setDispenseRequest(MedicationRequestDispenseRequestComponent value) {
    this.dispenseRequest = value;
    return this;
  }

  /**
   * @return {@link #substitution} (Indicates whether or not substitution can or
   *         should be part of the dispense. In some cases, substitution must
   *         happen, in other cases substitution must not happen. This block
   *         explains the prescriber's intent. If nothing is specified
   *         substitution may be done.)
   */
  public MedicationRequestSubstitutionComponent getSubstitution() {
    if (this.substitution == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.substitution");
      else if (Configuration.doAutoCreate())
        this.substitution = new MedicationRequestSubstitutionComponent(); // cc
    return this.substitution;
  }

  public boolean hasSubstitution() {
    return this.substitution != null && !this.substitution.isEmpty();
  }

  /**
   * @param value {@link #substitution} (Indicates whether or not substitution can
   *              or should be part of the dispense. In some cases, substitution
   *              must happen, in other cases substitution must not happen. This
   *              block explains the prescriber's intent. If nothing is specified
   *              substitution may be done.)
   */
  public MedicationRequest setSubstitution(MedicationRequestSubstitutionComponent value) {
    this.substitution = value;
    return this;
  }

  /**
   * @return {@link #priorPrescription} (A link to a resource representing an
   *         earlier order related order or prescription.)
   */
  public Reference getPriorPrescription() {
    if (this.priorPrescription == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.priorPrescription");
      else if (Configuration.doAutoCreate())
        this.priorPrescription = new Reference(); // cc
    return this.priorPrescription;
  }

  public boolean hasPriorPrescription() {
    return this.priorPrescription != null && !this.priorPrescription.isEmpty();
  }

  /**
   * @param value {@link #priorPrescription} (A link to a resource representing an
   *              earlier order related order or prescription.)
   */
  public MedicationRequest setPriorPrescription(Reference value) {
    this.priorPrescription = value;
    return this;
  }

  /**
   * @return {@link #priorPrescription} The actual object that is the target of
   *         the reference. The reference library doesn't populate this, but you
   *         can use it to hold the resource if you resolve it. (A link to a
   *         resource representing an earlier order related order or
   *         prescription.)
   */
  public MedicationRequest getPriorPrescriptionTarget() {
    if (this.priorPrescriptionTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MedicationRequest.priorPrescription");
      else if (Configuration.doAutoCreate())
        this.priorPrescriptionTarget = new MedicationRequest(); // aa
    return this.priorPrescriptionTarget;
  }

  /**
   * @param value {@link #priorPrescription} The actual object that is the target
   *              of the reference. The reference library doesn't use these, but
   *              you can use it to hold the resource if you resolve it. (A link
   *              to a resource representing an earlier order related order or
   *              prescription.)
   */
  public MedicationRequest setPriorPrescriptionTarget(MedicationRequest value) {
    this.priorPrescriptionTarget = value;
    return this;
  }

  /**
   * @return {@link #detectedIssue} (Indicates an actual or potential clinical
   *         issue with or between one or more active or proposed clinical actions
   *         for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage
   *         alert etc.)
   */
  public List<Reference> getDetectedIssue() {
    if (this.detectedIssue == null)
      this.detectedIssue = new ArrayList<Reference>();
    return this.detectedIssue;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setDetectedIssue(List<Reference> theDetectedIssue) {
    this.detectedIssue = theDetectedIssue;
    return this;
  }

  public boolean hasDetectedIssue() {
    if (this.detectedIssue == null)
      return false;
    for (Reference item : this.detectedIssue)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addDetectedIssue() { // 3
    Reference t = new Reference();
    if (this.detectedIssue == null)
      this.detectedIssue = new ArrayList<Reference>();
    this.detectedIssue.add(t);
    return t;
  }

  public MedicationRequest addDetectedIssue(Reference t) { // 3
    if (t == null)
      return this;
    if (this.detectedIssue == null)
      this.detectedIssue = new ArrayList<Reference>();
    this.detectedIssue.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #detectedIssue},
   *         creating it if it does not already exist
   */
  public Reference getDetectedIssueFirstRep() {
    if (getDetectedIssue().isEmpty()) {
      addDetectedIssue();
    }
    return getDetectedIssue().get(0);
  }

  /**
   * @return {@link #eventHistory} (Links to Provenance records for past versions
   *         of this resource or fulfilling request or event resources that
   *         identify key state transitions or updates that are likely to be
   *         relevant to a user looking at the current version of the resource.)
   */
  public List<Reference> getEventHistory() {
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    return this.eventHistory;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public MedicationRequest setEventHistory(List<Reference> theEventHistory) {
    this.eventHistory = theEventHistory;
    return this;
  }

  public boolean hasEventHistory() {
    if (this.eventHistory == null)
      return false;
    for (Reference item : this.eventHistory)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Reference addEventHistory() { // 3
    Reference t = new Reference();
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    this.eventHistory.add(t);
    return t;
  }

  public MedicationRequest addEventHistory(Reference t) { // 3
    if (t == null)
      return this;
    if (this.eventHistory == null)
      this.eventHistory = new ArrayList<Reference>();
    this.eventHistory.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #eventHistory},
   *         creating it if it does not already exist
   */
  public Reference getEventHistoryFirstRep() {
    if (getEventHistory().isEmpty()) {
      addEventHistory();
    }
    return getEventHistory().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier",
        "Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("status", "code",
        "A code specifying the current state of the order.  Generally, this will be active or completed state.", 0, 1,
        status));
    children.add(new Property("statusReason", "CodeableConcept",
        "Captures the reason for the current state of the MedicationRequest.", 0, 1, statusReason));
    children.add(
        new Property("intent", "code", "Whether the request is a proposal, plan, or an original order.", 0, 1, intent));
    children.add(new Property("category", "CodeableConcept",
        "Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).",
        0, java.lang.Integer.MAX_VALUE, category));
    children.add(new Property("priority", "code",
        "Indicates how quickly the Medication Request should be addressed with respect to other requests.", 0, 1,
        priority));
    children.add(new Property("doNotPerform", "boolean",
        "If true indicates that the provider is asking for the medication request not to occur.", 0, 1, doNotPerform));
    children.add(new Property("reported[x]",
        "boolean|Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)",
        "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.",
        0, 1, reported));
    children.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)",
        "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.",
        0, 1, medication));
    children.add(new Property("subject", "Reference(Patient|Group)",
        "A link to a resource representing the person or set of individuals to whom the medication will be given.", 0,
        1, subject));
    children.add(new Property("encounter", "Reference(Encounter)",
        "The Encounter during which this [x] was created or to which the creation of this record is tightly associated.",
        0, 1, encounter));
    children.add(new Property("supportingInformation", "Reference(Any)",
        "Include additional information (for example, patient height and weight) that supports the ordering of the medication.",
        0, java.lang.Integer.MAX_VALUE, supportingInformation));
    children.add(new Property("authoredOn", "dateTime",
        "The date (and perhaps time) when the prescription was initially written or authored on.", 0, 1, authoredOn));
    children.add(new Property("requester",
        "Reference(Practitioner|PractitionerRole|Organization|Patient|RelatedPerson|Device)",
        "The individual, organization, or device that initiated the request and has responsibility for its activation.",
        0, 1, requester));
    children.add(new Property("performer",
        "Reference(Practitioner|PractitionerRole|Organization|Patient|Device|RelatedPerson|CareTeam)",
        "The specified desired performer of the medication treatment (e.g. the performer of the medication administration).",
        0, 1, performer));
    children.add(new Property("performerType", "CodeableConcept",
        "Indicates the type of performer of the administration of the medication.", 0, 1, performerType));
    children.add(new Property("recorder", "Reference(Practitioner|PractitionerRole)",
        "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.",
        0, 1, recorder));
    children.add(new Property("reasonCode", "CodeableConcept",
        "The reason or the indication for ordering or not ordering the medication.", 0, java.lang.Integer.MAX_VALUE,
        reasonCode));
    children.add(new Property("reasonReference", "Reference(Condition|Observation)",
        "Condition or observation that supports why the medication was ordered.", 0, java.lang.Integer.MAX_VALUE,
        reasonReference));
    children.add(new Property("instantiatesCanonical", "canonical",
        "The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.",
        0, java.lang.Integer.MAX_VALUE, instantiatesCanonical));
    children.add(new Property("instantiatesUri", "uri",
        "The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.",
        0, java.lang.Integer.MAX_VALUE, instantiatesUri));
    children
        .add(new Property("basedOn", "Reference(CarePlan|MedicationRequest|ServiceRequest|ImmunizationRecommendation)",
            "A plan or request that is fulfilled in whole or in part by this medication request.", 0,
            java.lang.Integer.MAX_VALUE, basedOn));
    children.add(new Property("groupIdentifier", "Identifier",
        "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.",
        0, 1, groupIdentifier));
    children.add(new Property("courseOfTherapyType", "CodeableConcept",
        "The description of the overall patte3rn of the administration of the medication to the patient.", 0, 1,
        courseOfTherapyType));
    children.add(new Property("insurance", "Reference(Coverage|ClaimResponse)",
        "Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.",
        0, java.lang.Integer.MAX_VALUE, insurance));
    children.add(new Property("note", "Annotation",
        "Extra information about the prescription that could not be conveyed by the other attributes.", 0,
        java.lang.Integer.MAX_VALUE, note));
    children
        .add(new Property("dosageInstruction", "Dosage", "Indicates how the medication is to be used by the patient.",
            0, java.lang.Integer.MAX_VALUE, dosageInstruction));
    children.add(new Property("dispenseRequest", "",
        "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.",
        0, 1, dispenseRequest));
    children.add(new Property("substitution", "",
        "Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.",
        0, 1, substitution));
    children.add(new Property("priorPrescription", "Reference(MedicationRequest)",
        "A link to a resource representing an earlier order related order or prescription.", 0, 1, priorPrescription));
    children.add(new Property("detectedIssue", "Reference(DetectedIssue)",
        "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.",
        0, java.lang.Integer.MAX_VALUE, detectedIssue));
    children.add(new Property("eventHistory", "Reference(Provenance)",
        "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.",
        0, java.lang.Integer.MAX_VALUE, eventHistory));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case -892481550:
      /* status */ return new Property("status", "code",
          "A code specifying the current state of the order.  Generally, this will be active or completed state.", 0, 1,
          status);
    case 2051346646:
      /* statusReason */ return new Property("statusReason", "CodeableConcept",
          "Captures the reason for the current state of the MedicationRequest.", 0, 1, statusReason);
    case -1183762788:
      /* intent */ return new Property("intent", "code",
          "Whether the request is a proposal, plan, or an original order.", 0, 1, intent);
    case 50511102:
      /* category */ return new Property("category", "CodeableConcept",
          "Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).",
          0, java.lang.Integer.MAX_VALUE, category);
    case -1165461084:
      /* priority */ return new Property("priority", "code",
          "Indicates how quickly the Medication Request should be addressed with respect to other requests.", 0, 1,
          priority);
    case -1788508167:
      /* doNotPerform */ return new Property("doNotPerform", "boolean",
          "If true indicates that the provider is asking for the medication request not to occur.", 0, 1, doNotPerform);
    case -241505587:
      /* reported[x] */ return new Property("reported[x]",
          "boolean|Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)",
          "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.",
          0, 1, reported);
    case -427039533:
      /* reported */ return new Property("reported[x]",
          "boolean|Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)",
          "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.",
          0, 1, reported);
    case 1219992533:
      /* reportedBoolean */ return new Property("reported[x]",
          "boolean|Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)",
          "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.",
          0, 1, reported);
    case 1198143416:
      /* reportedReference */ return new Property("reported[x]",
          "boolean|Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)",
          "Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.",
          0, 1, reported);
    case 1458402129:
      /* medication[x] */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case 1998965455:
      /* medication */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case -209845038:
      /* medicationCodeableConcept */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case 2104315196:
      /* medicationReference */ return new Property("medication[x]", "CodeableConcept|Reference(Medication)",
          "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.",
          0, 1, medication);
    case -1867885268:
      /* subject */ return new Property("subject", "Reference(Patient|Group)",
          "A link to a resource representing the person or set of individuals to whom the medication will be given.", 0,
          1, subject);
    case 1524132147:
      /* encounter */ return new Property("encounter", "Reference(Encounter)",
          "The Encounter during which this [x] was created or to which the creation of this record is tightly associated.",
          0, 1, encounter);
    case -1248768647:
      /* supportingInformation */ return new Property("supportingInformation", "Reference(Any)",
          "Include additional information (for example, patient height and weight) that supports the ordering of the medication.",
          0, java.lang.Integer.MAX_VALUE, supportingInformation);
    case -1500852503:
      /* authoredOn */ return new Property("authoredOn", "dateTime",
          "The date (and perhaps time) when the prescription was initially written or authored on.", 0, 1, authoredOn);
    case 693933948:
      /* requester */ return new Property("requester",
          "Reference(Practitioner|PractitionerRole|Organization|Patient|RelatedPerson|Device)",
          "The individual, organization, or device that initiated the request and has responsibility for its activation.",
          0, 1, requester);
    case 481140686:
      /* performer */ return new Property("performer",
          "Reference(Practitioner|PractitionerRole|Organization|Patient|Device|RelatedPerson|CareTeam)",
          "The specified desired performer of the medication treatment (e.g. the performer of the medication administration).",
          0, 1, performer);
    case -901444568:
      /* performerType */ return new Property("performerType", "CodeableConcept",
          "Indicates the type of performer of the administration of the medication.", 0, 1, performerType);
    case -799233858:
      /* recorder */ return new Property("recorder", "Reference(Practitioner|PractitionerRole)",
          "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.",
          0, 1, recorder);
    case 722137681:
      /* reasonCode */ return new Property("reasonCode", "CodeableConcept",
          "The reason or the indication for ordering or not ordering the medication.", 0, java.lang.Integer.MAX_VALUE,
          reasonCode);
    case -1146218137:
      /* reasonReference */ return new Property("reasonReference", "Reference(Condition|Observation)",
          "Condition or observation that supports why the medication was ordered.", 0, java.lang.Integer.MAX_VALUE,
          reasonReference);
    case 8911915:
      /* instantiatesCanonical */ return new Property("instantiatesCanonical", "canonical",
          "The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.",
          0, java.lang.Integer.MAX_VALUE, instantiatesCanonical);
    case -1926393373:
      /* instantiatesUri */ return new Property("instantiatesUri", "uri",
          "The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.",
          0, java.lang.Integer.MAX_VALUE, instantiatesUri);
    case -332612366:
      /* basedOn */ return new Property("basedOn",
          "Reference(CarePlan|MedicationRequest|ServiceRequest|ImmunizationRecommendation)",
          "A plan or request that is fulfilled in whole or in part by this medication request.", 0,
          java.lang.Integer.MAX_VALUE, basedOn);
    case -445338488:
      /* groupIdentifier */ return new Property("groupIdentifier", "Identifier",
          "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.",
          0, 1, groupIdentifier);
    case -447282031:
      /* courseOfTherapyType */ return new Property("courseOfTherapyType", "CodeableConcept",
          "The description of the overall patte3rn of the administration of the medication to the patient.", 0, 1,
          courseOfTherapyType);
    case 73049818:
      /* insurance */ return new Property("insurance", "Reference(Coverage|ClaimResponse)",
          "Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.",
          0, java.lang.Integer.MAX_VALUE, insurance);
    case 3387378:
      /* note */ return new Property("note", "Annotation",
          "Extra information about the prescription that could not be conveyed by the other attributes.", 0,
          java.lang.Integer.MAX_VALUE, note);
    case -1201373865:
      /* dosageInstruction */ return new Property("dosageInstruction", "Dosage",
          "Indicates how the medication is to be used by the patient.", 0, java.lang.Integer.MAX_VALUE,
          dosageInstruction);
    case 824620658:
      /* dispenseRequest */ return new Property("dispenseRequest", "",
          "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.",
          0, 1, dispenseRequest);
    case 826147581:
      /* substitution */ return new Property("substitution", "",
          "Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.",
          0, 1, substitution);
    case -486355964:
      /* priorPrescription */ return new Property("priorPrescription", "Reference(MedicationRequest)",
          "A link to a resource representing an earlier order related order or prescription.", 0, 1, priorPrescription);
    case 51602295:
      /* detectedIssue */ return new Property("detectedIssue", "Reference(DetectedIssue)",
          "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.",
          0, java.lang.Integer.MAX_VALUE, detectedIssue);
    case 1835190426:
      /* eventHistory */ return new Property("eventHistory", "Reference(Provenance)",
          "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.",
          0, java.lang.Integer.MAX_VALUE, eventHistory);
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
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // Enumeration<MedicationRequestStatus>
    case 2051346646:
      /* statusReason */ return this.statusReason == null ? new Base[0] : new Base[] { this.statusReason }; // CodeableConcept
    case -1183762788:
      /* intent */ return this.intent == null ? new Base[0] : new Base[] { this.intent }; // Enumeration<MedicationRequestIntent>
    case 50511102:
      /* category */ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
    case -1165461084:
      /* priority */ return this.priority == null ? new Base[0] : new Base[] { this.priority }; // Enumeration<MedicationRequestPriority>
    case -1788508167:
      /* doNotPerform */ return this.doNotPerform == null ? new Base[0] : new Base[] { this.doNotPerform }; // BooleanType
    case -427039533:
      /* reported */ return this.reported == null ? new Base[0] : new Base[] { this.reported }; // Type
    case 1998965455:
      /* medication */ return this.medication == null ? new Base[0] : new Base[] { this.medication }; // Type
    case -1867885268:
      /* subject */ return this.subject == null ? new Base[0] : new Base[] { this.subject }; // Reference
    case 1524132147:
      /* encounter */ return this.encounter == null ? new Base[0] : new Base[] { this.encounter }; // Reference
    case -1248768647:
      /* supportingInformation */ return this.supportingInformation == null ? new Base[0]
          : this.supportingInformation.toArray(new Base[this.supportingInformation.size()]); // Reference
    case -1500852503:
      /* authoredOn */ return this.authoredOn == null ? new Base[0] : new Base[] { this.authoredOn }; // DateTimeType
    case 693933948:
      /* requester */ return this.requester == null ? new Base[0] : new Base[] { this.requester }; // Reference
    case 481140686:
      /* performer */ return this.performer == null ? new Base[0] : new Base[] { this.performer }; // Reference
    case -901444568:
      /* performerType */ return this.performerType == null ? new Base[0] : new Base[] { this.performerType }; // CodeableConcept
    case -799233858:
      /* recorder */ return this.recorder == null ? new Base[0] : new Base[] { this.recorder }; // Reference
    case 722137681:
      /* reasonCode */ return this.reasonCode == null ? new Base[0]
          : this.reasonCode.toArray(new Base[this.reasonCode.size()]); // CodeableConcept
    case -1146218137:
      /* reasonReference */ return this.reasonReference == null ? new Base[0]
          : this.reasonReference.toArray(new Base[this.reasonReference.size()]); // Reference
    case 8911915:
      /* instantiatesCanonical */ return this.instantiatesCanonical == null ? new Base[0]
          : this.instantiatesCanonical.toArray(new Base[this.instantiatesCanonical.size()]); // CanonicalType
    case -1926393373:
      /* instantiatesUri */ return this.instantiatesUri == null ? new Base[0]
          : this.instantiatesUri.toArray(new Base[this.instantiatesUri.size()]); // UriType
    case -332612366:
      /* basedOn */ return this.basedOn == null ? new Base[0] : this.basedOn.toArray(new Base[this.basedOn.size()]); // Reference
    case -445338488:
      /* groupIdentifier */ return this.groupIdentifier == null ? new Base[0] : new Base[] { this.groupIdentifier }; // Identifier
    case -447282031:
      /* courseOfTherapyType */ return this.courseOfTherapyType == null ? new Base[0]
          : new Base[] { this.courseOfTherapyType }; // CodeableConcept
    case 73049818:
      /* insurance */ return this.insurance == null ? new Base[0]
          : this.insurance.toArray(new Base[this.insurance.size()]); // Reference
    case 3387378:
      /* note */ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
    case -1201373865:
      /* dosageInstruction */ return this.dosageInstruction == null ? new Base[0]
          : this.dosageInstruction.toArray(new Base[this.dosageInstruction.size()]); // Dosage
    case 824620658:
      /* dispenseRequest */ return this.dispenseRequest == null ? new Base[0] : new Base[] { this.dispenseRequest }; // MedicationRequestDispenseRequestComponent
    case 826147581:
      /* substitution */ return this.substitution == null ? new Base[0] : new Base[] { this.substitution }; // MedicationRequestSubstitutionComponent
    case -486355964:
      /* priorPrescription */ return this.priorPrescription == null ? new Base[0]
          : new Base[] { this.priorPrescription }; // Reference
    case 51602295:
      /* detectedIssue */ return this.detectedIssue == null ? new Base[0]
          : this.detectedIssue.toArray(new Base[this.detectedIssue.size()]); // Reference
    case 1835190426:
      /* eventHistory */ return this.eventHistory == null ? new Base[0]
          : this.eventHistory.toArray(new Base[this.eventHistory.size()]); // Reference
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
      value = new MedicationRequestStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<MedicationRequestStatus>
      return value;
    case 2051346646: // statusReason
      this.statusReason = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -1183762788: // intent
      value = new MedicationRequestIntentEnumFactory().fromType(castToCode(value));
      this.intent = (Enumeration) value; // Enumeration<MedicationRequestIntent>
      return value;
    case 50511102: // category
      this.getCategory().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1165461084: // priority
      value = new MedicationRequestPriorityEnumFactory().fromType(castToCode(value));
      this.priority = (Enumeration) value; // Enumeration<MedicationRequestPriority>
      return value;
    case -1788508167: // doNotPerform
      this.doNotPerform = castToBoolean(value); // BooleanType
      return value;
    case -427039533: // reported
      this.reported = castToType(value); // Type
      return value;
    case 1998965455: // medication
      this.medication = castToType(value); // Type
      return value;
    case -1867885268: // subject
      this.subject = castToReference(value); // Reference
      return value;
    case 1524132147: // encounter
      this.encounter = castToReference(value); // Reference
      return value;
    case -1248768647: // supportingInformation
      this.getSupportingInformation().add(castToReference(value)); // Reference
      return value;
    case -1500852503: // authoredOn
      this.authoredOn = castToDateTime(value); // DateTimeType
      return value;
    case 693933948: // requester
      this.requester = castToReference(value); // Reference
      return value;
    case 481140686: // performer
      this.performer = castToReference(value); // Reference
      return value;
    case -901444568: // performerType
      this.performerType = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -799233858: // recorder
      this.recorder = castToReference(value); // Reference
      return value;
    case 722137681: // reasonCode
      this.getReasonCode().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case -1146218137: // reasonReference
      this.getReasonReference().add(castToReference(value)); // Reference
      return value;
    case 8911915: // instantiatesCanonical
      this.getInstantiatesCanonical().add(castToCanonical(value)); // CanonicalType
      return value;
    case -1926393373: // instantiatesUri
      this.getInstantiatesUri().add(castToUri(value)); // UriType
      return value;
    case -332612366: // basedOn
      this.getBasedOn().add(castToReference(value)); // Reference
      return value;
    case -445338488: // groupIdentifier
      this.groupIdentifier = castToIdentifier(value); // Identifier
      return value;
    case -447282031: // courseOfTherapyType
      this.courseOfTherapyType = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 73049818: // insurance
      this.getInsurance().add(castToReference(value)); // Reference
      return value;
    case 3387378: // note
      this.getNote().add(castToAnnotation(value)); // Annotation
      return value;
    case -1201373865: // dosageInstruction
      this.getDosageInstruction().add(castToDosage(value)); // Dosage
      return value;
    case 824620658: // dispenseRequest
      this.dispenseRequest = (MedicationRequestDispenseRequestComponent) value; // MedicationRequestDispenseRequestComponent
      return value;
    case 826147581: // substitution
      this.substitution = (MedicationRequestSubstitutionComponent) value; // MedicationRequestSubstitutionComponent
      return value;
    case -486355964: // priorPrescription
      this.priorPrescription = castToReference(value); // Reference
      return value;
    case 51602295: // detectedIssue
      this.getDetectedIssue().add(castToReference(value)); // Reference
      return value;
    case 1835190426: // eventHistory
      this.getEventHistory().add(castToReference(value)); // Reference
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
      value = new MedicationRequestStatusEnumFactory().fromType(castToCode(value));
      this.status = (Enumeration) value; // Enumeration<MedicationRequestStatus>
    } else if (name.equals("statusReason")) {
      this.statusReason = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("intent")) {
      value = new MedicationRequestIntentEnumFactory().fromType(castToCode(value));
      this.intent = (Enumeration) value; // Enumeration<MedicationRequestIntent>
    } else if (name.equals("category")) {
      this.getCategory().add(castToCodeableConcept(value));
    } else if (name.equals("priority")) {
      value = new MedicationRequestPriorityEnumFactory().fromType(castToCode(value));
      this.priority = (Enumeration) value; // Enumeration<MedicationRequestPriority>
    } else if (name.equals("doNotPerform")) {
      this.doNotPerform = castToBoolean(value); // BooleanType
    } else if (name.equals("reported[x]")) {
      this.reported = castToType(value); // Type
    } else if (name.equals("medication[x]")) {
      this.medication = castToType(value); // Type
    } else if (name.equals("subject")) {
      this.subject = castToReference(value); // Reference
    } else if (name.equals("encounter")) {
      this.encounter = castToReference(value); // Reference
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().add(castToReference(value));
    } else if (name.equals("authoredOn")) {
      this.authoredOn = castToDateTime(value); // DateTimeType
    } else if (name.equals("requester")) {
      this.requester = castToReference(value); // Reference
    } else if (name.equals("performer")) {
      this.performer = castToReference(value); // Reference
    } else if (name.equals("performerType")) {
      this.performerType = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("recorder")) {
      this.recorder = castToReference(value); // Reference
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().add(castToCodeableConcept(value));
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().add(castToReference(value));
    } else if (name.equals("instantiatesCanonical")) {
      this.getInstantiatesCanonical().add(castToCanonical(value));
    } else if (name.equals("instantiatesUri")) {
      this.getInstantiatesUri().add(castToUri(value));
    } else if (name.equals("basedOn")) {
      this.getBasedOn().add(castToReference(value));
    } else if (name.equals("groupIdentifier")) {
      this.groupIdentifier = castToIdentifier(value); // Identifier
    } else if (name.equals("courseOfTherapyType")) {
      this.courseOfTherapyType = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("insurance")) {
      this.getInsurance().add(castToReference(value));
    } else if (name.equals("note")) {
      this.getNote().add(castToAnnotation(value));
    } else if (name.equals("dosageInstruction")) {
      this.getDosageInstruction().add(castToDosage(value));
    } else if (name.equals("dispenseRequest")) {
      this.dispenseRequest = (MedicationRequestDispenseRequestComponent) value; // MedicationRequestDispenseRequestComponent
    } else if (name.equals("substitution")) {
      this.substitution = (MedicationRequestSubstitutionComponent) value; // MedicationRequestSubstitutionComponent
    } else if (name.equals("priorPrescription")) {
      this.priorPrescription = castToReference(value); // Reference
    } else if (name.equals("detectedIssue")) {
      this.getDetectedIssue().add(castToReference(value));
    } else if (name.equals("eventHistory")) {
      this.getEventHistory().add(castToReference(value));
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
    } else if (name.equals("intent")) {
      this.intent = null;
    } else if (name.equals("category")) {
      this.getCategory().remove(castToCodeableConcept(value));
    } else if (name.equals("priority")) {
      this.priority = null;
    } else if (name.equals("doNotPerform")) {
      this.doNotPerform = null;
    } else if (name.equals("reported[x]")) {
      this.reported = null;
    } else if (name.equals("medication[x]")) {
      this.medication = null;
    } else if (name.equals("subject")) {
      this.subject = null;
    } else if (name.equals("encounter")) {
      this.encounter = null;
    } else if (name.equals("supportingInformation")) {
      this.getSupportingInformation().remove(castToReference(value));
    } else if (name.equals("authoredOn")) {
      this.authoredOn = null;
    } else if (name.equals("requester")) {
      this.requester = null;
    } else if (name.equals("performer")) {
      this.performer = null;
    } else if (name.equals("performerType")) {
      this.performerType = null;
    } else if (name.equals("recorder")) {
      this.recorder = null;
    } else if (name.equals("reasonCode")) {
      this.getReasonCode().remove(castToCodeableConcept(value));
    } else if (name.equals("reasonReference")) {
      this.getReasonReference().remove(castToReference(value));
    } else if (name.equals("instantiatesCanonical")) {
      this.getInstantiatesCanonical().remove(castToCanonical(value));
    } else if (name.equals("instantiatesUri")) {
      this.getInstantiatesUri().remove(castToUri(value));
    } else if (name.equals("basedOn")) {
      this.getBasedOn().remove(castToReference(value));
    } else if (name.equals("groupIdentifier")) {
      this.groupIdentifier = null;
    } else if (name.equals("courseOfTherapyType")) {
      this.courseOfTherapyType = null;
    } else if (name.equals("insurance")) {
      this.getInsurance().remove(castToReference(value));
    } else if (name.equals("note")) {
      this.getNote().remove(castToAnnotation(value));
    } else if (name.equals("dosageInstruction")) {
      this.getDosageInstruction().remove(castToDosage(value));
    } else if (name.equals("dispenseRequest")) {
      this.dispenseRequest = (MedicationRequestDispenseRequestComponent) value; // MedicationRequestDispenseRequestComponent
    } else if (name.equals("substitution")) {
      this.substitution = (MedicationRequestSubstitutionComponent) value; // MedicationRequestSubstitutionComponent
    } else if (name.equals("priorPrescription")) {
      this.priorPrescription = null;
    } else if (name.equals("detectedIssue")) {
      this.getDetectedIssue().remove(castToReference(value));
    } else if (name.equals("eventHistory")) {
      this.getEventHistory().remove(castToReference(value));
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
    case -1183762788:
      return getIntentElement();
    case 50511102:
      return addCategory();
    case -1165461084:
      return getPriorityElement();
    case -1788508167:
      return getDoNotPerformElement();
    case -241505587:
      return getReported();
    case -427039533:
      return getReported();
    case 1458402129:
      return getMedication();
    case 1998965455:
      return getMedication();
    case -1867885268:
      return getSubject();
    case 1524132147:
      return getEncounter();
    case -1248768647:
      return addSupportingInformation();
    case -1500852503:
      return getAuthoredOnElement();
    case 693933948:
      return getRequester();
    case 481140686:
      return getPerformer();
    case -901444568:
      return getPerformerType();
    case -799233858:
      return getRecorder();
    case 722137681:
      return addReasonCode();
    case -1146218137:
      return addReasonReference();
    case 8911915:
      return addInstantiatesCanonicalElement();
    case -1926393373:
      return addInstantiatesUriElement();
    case -332612366:
      return addBasedOn();
    case -445338488:
      return getGroupIdentifier();
    case -447282031:
      return getCourseOfTherapyType();
    case 73049818:
      return addInsurance();
    case 3387378:
      return addNote();
    case -1201373865:
      return addDosageInstruction();
    case 824620658:
      return getDispenseRequest();
    case 826147581:
      return getSubstitution();
    case -486355964:
      return getPriorPrescription();
    case 51602295:
      return addDetectedIssue();
    case 1835190426:
      return addEventHistory();
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
    case -1183762788:
      /* intent */ return new String[] { "code" };
    case 50511102:
      /* category */ return new String[] { "CodeableConcept" };
    case -1165461084:
      /* priority */ return new String[] { "code" };
    case -1788508167:
      /* doNotPerform */ return new String[] { "boolean" };
    case -427039533:
      /* reported */ return new String[] { "boolean", "Reference" };
    case 1998965455:
      /* medication */ return new String[] { "CodeableConcept", "Reference" };
    case -1867885268:
      /* subject */ return new String[] { "Reference" };
    case 1524132147:
      /* encounter */ return new String[] { "Reference" };
    case -1248768647:
      /* supportingInformation */ return new String[] { "Reference" };
    case -1500852503:
      /* authoredOn */ return new String[] { "dateTime" };
    case 693933948:
      /* requester */ return new String[] { "Reference" };
    case 481140686:
      /* performer */ return new String[] { "Reference" };
    case -901444568:
      /* performerType */ return new String[] { "CodeableConcept" };
    case -799233858:
      /* recorder */ return new String[] { "Reference" };
    case 722137681:
      /* reasonCode */ return new String[] { "CodeableConcept" };
    case -1146218137:
      /* reasonReference */ return new String[] { "Reference" };
    case 8911915:
      /* instantiatesCanonical */ return new String[] { "canonical" };
    case -1926393373:
      /* instantiatesUri */ return new String[] { "uri" };
    case -332612366:
      /* basedOn */ return new String[] { "Reference" };
    case -445338488:
      /* groupIdentifier */ return new String[] { "Identifier" };
    case -447282031:
      /* courseOfTherapyType */ return new String[] { "CodeableConcept" };
    case 73049818:
      /* insurance */ return new String[] { "Reference" };
    case 3387378:
      /* note */ return new String[] { "Annotation" };
    case -1201373865:
      /* dosageInstruction */ return new String[] { "Dosage" };
    case 824620658:
      /* dispenseRequest */ return new String[] {};
    case 826147581:
      /* substitution */ return new String[] {};
    case -486355964:
      /* priorPrescription */ return new String[] { "Reference" };
    case 51602295:
      /* detectedIssue */ return new String[] { "Reference" };
    case 1835190426:
      /* eventHistory */ return new String[] { "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.status");
    } else if (name.equals("statusReason")) {
      this.statusReason = new CodeableConcept();
      return this.statusReason;
    } else if (name.equals("intent")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.intent");
    } else if (name.equals("category")) {
      return addCategory();
    } else if (name.equals("priority")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.priority");
    } else if (name.equals("doNotPerform")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.doNotPerform");
    } else if (name.equals("reportedBoolean")) {
      this.reported = new BooleanType();
      return this.reported;
    } else if (name.equals("reportedReference")) {
      this.reported = new Reference();
      return this.reported;
    } else if (name.equals("medicationCodeableConcept")) {
      this.medication = new CodeableConcept();
      return this.medication;
    } else if (name.equals("medicationReference")) {
      this.medication = new Reference();
      return this.medication;
    } else if (name.equals("subject")) {
      this.subject = new Reference();
      return this.subject;
    } else if (name.equals("encounter")) {
      this.encounter = new Reference();
      return this.encounter;
    } else if (name.equals("supportingInformation")) {
      return addSupportingInformation();
    } else if (name.equals("authoredOn")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.authoredOn");
    } else if (name.equals("requester")) {
      this.requester = new Reference();
      return this.requester;
    } else if (name.equals("performer")) {
      this.performer = new Reference();
      return this.performer;
    } else if (name.equals("performerType")) {
      this.performerType = new CodeableConcept();
      return this.performerType;
    } else if (name.equals("recorder")) {
      this.recorder = new Reference();
      return this.recorder;
    } else if (name.equals("reasonCode")) {
      return addReasonCode();
    } else if (name.equals("reasonReference")) {
      return addReasonReference();
    } else if (name.equals("instantiatesCanonical")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.instantiatesCanonical");
    } else if (name.equals("instantiatesUri")) {
      throw new FHIRException("Cannot call addChild on a singleton property MedicationRequest.instantiatesUri");
    } else if (name.equals("basedOn")) {
      return addBasedOn();
    } else if (name.equals("groupIdentifier")) {
      this.groupIdentifier = new Identifier();
      return this.groupIdentifier;
    } else if (name.equals("courseOfTherapyType")) {
      this.courseOfTherapyType = new CodeableConcept();
      return this.courseOfTherapyType;
    } else if (name.equals("insurance")) {
      return addInsurance();
    } else if (name.equals("note")) {
      return addNote();
    } else if (name.equals("dosageInstruction")) {
      return addDosageInstruction();
    } else if (name.equals("dispenseRequest")) {
      this.dispenseRequest = new MedicationRequestDispenseRequestComponent();
      return this.dispenseRequest;
    } else if (name.equals("substitution")) {
      this.substitution = new MedicationRequestSubstitutionComponent();
      return this.substitution;
    } else if (name.equals("priorPrescription")) {
      this.priorPrescription = new Reference();
      return this.priorPrescription;
    } else if (name.equals("detectedIssue")) {
      return addDetectedIssue();
    } else if (name.equals("eventHistory")) {
      return addEventHistory();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "MedicationRequest";

  }

  public MedicationRequest copy() {
    MedicationRequest dst = new MedicationRequest();
    copyValues(dst);
    return dst;
  }

  public void copyValues(MedicationRequest dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.status = status == null ? null : status.copy();
    dst.statusReason = statusReason == null ? null : statusReason.copy();
    dst.intent = intent == null ? null : intent.copy();
    if (category != null) {
      dst.category = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : category)
        dst.category.add(i.copy());
    }
    ;
    dst.priority = priority == null ? null : priority.copy();
    dst.doNotPerform = doNotPerform == null ? null : doNotPerform.copy();
    dst.reported = reported == null ? null : reported.copy();
    dst.medication = medication == null ? null : medication.copy();
    dst.subject = subject == null ? null : subject.copy();
    dst.encounter = encounter == null ? null : encounter.copy();
    if (supportingInformation != null) {
      dst.supportingInformation = new ArrayList<Reference>();
      for (Reference i : supportingInformation)
        dst.supportingInformation.add(i.copy());
    }
    ;
    dst.authoredOn = authoredOn == null ? null : authoredOn.copy();
    dst.requester = requester == null ? null : requester.copy();
    dst.performer = performer == null ? null : performer.copy();
    dst.performerType = performerType == null ? null : performerType.copy();
    dst.recorder = recorder == null ? null : recorder.copy();
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
    if (instantiatesCanonical != null) {
      dst.instantiatesCanonical = new ArrayList<CanonicalType>();
      for (CanonicalType i : instantiatesCanonical)
        dst.instantiatesCanonical.add(i.copy());
    }
    ;
    if (instantiatesUri != null) {
      dst.instantiatesUri = new ArrayList<UriType>();
      for (UriType i : instantiatesUri)
        dst.instantiatesUri.add(i.copy());
    }
    ;
    if (basedOn != null) {
      dst.basedOn = new ArrayList<Reference>();
      for (Reference i : basedOn)
        dst.basedOn.add(i.copy());
    }
    ;
    dst.groupIdentifier = groupIdentifier == null ? null : groupIdentifier.copy();
    dst.courseOfTherapyType = courseOfTherapyType == null ? null : courseOfTherapyType.copy();
    if (insurance != null) {
      dst.insurance = new ArrayList<Reference>();
      for (Reference i : insurance)
        dst.insurance.add(i.copy());
    }
    ;
    if (note != null) {
      dst.note = new ArrayList<Annotation>();
      for (Annotation i : note)
        dst.note.add(i.copy());
    }
    ;
    if (dosageInstruction != null) {
      dst.dosageInstruction = new ArrayList<Dosage>();
      for (Dosage i : dosageInstruction)
        dst.dosageInstruction.add(i.copy());
    }
    ;
    dst.dispenseRequest = dispenseRequest == null ? null : dispenseRequest.copy();
    dst.substitution = substitution == null ? null : substitution.copy();
    dst.priorPrescription = priorPrescription == null ? null : priorPrescription.copy();
    if (detectedIssue != null) {
      dst.detectedIssue = new ArrayList<Reference>();
      for (Reference i : detectedIssue)
        dst.detectedIssue.add(i.copy());
    }
    ;
    if (eventHistory != null) {
      dst.eventHistory = new ArrayList<Reference>();
      for (Reference i : eventHistory)
        dst.eventHistory.add(i.copy());
    }
    ;
  }

  protected MedicationRequest typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof MedicationRequest))
      return false;
    MedicationRequest o = (MedicationRequest) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true)
        && compareDeep(statusReason, o.statusReason, true) && compareDeep(intent, o.intent, true)
        && compareDeep(category, o.category, true) && compareDeep(priority, o.priority, true)
        && compareDeep(doNotPerform, o.doNotPerform, true) && compareDeep(reported, o.reported, true)
        && compareDeep(medication, o.medication, true) && compareDeep(subject, o.subject, true)
        && compareDeep(encounter, o.encounter, true)
        && compareDeep(supportingInformation, o.supportingInformation, true)
        && compareDeep(authoredOn, o.authoredOn, true) && compareDeep(requester, o.requester, true)
        && compareDeep(performer, o.performer, true) && compareDeep(performerType, o.performerType, true)
        && compareDeep(recorder, o.recorder, true) && compareDeep(reasonCode, o.reasonCode, true)
        && compareDeep(reasonReference, o.reasonReference, true)
        && compareDeep(instantiatesCanonical, o.instantiatesCanonical, true)
        && compareDeep(instantiatesUri, o.instantiatesUri, true) && compareDeep(basedOn, o.basedOn, true)
        && compareDeep(groupIdentifier, o.groupIdentifier, true)
        && compareDeep(courseOfTherapyType, o.courseOfTherapyType, true) && compareDeep(insurance, o.insurance, true)
        && compareDeep(note, o.note, true) && compareDeep(dosageInstruction, o.dosageInstruction, true)
        && compareDeep(dispenseRequest, o.dispenseRequest, true) && compareDeep(substitution, o.substitution, true)
        && compareDeep(priorPrescription, o.priorPrescription, true)
        && compareDeep(detectedIssue, o.detectedIssue, true) && compareDeep(eventHistory, o.eventHistory, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof MedicationRequest))
      return false;
    MedicationRequest o = (MedicationRequest) other_;
    return compareValues(status, o.status, true) && compareValues(intent, o.intent, true)
        && compareValues(priority, o.priority, true) && compareValues(doNotPerform, o.doNotPerform, true)
        && compareValues(authoredOn, o.authoredOn, true)
        && compareValues(instantiatesCanonical, o.instantiatesCanonical, true)
        && compareValues(instantiatesUri, o.instantiatesUri, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, statusReason, intent, category,
        priority, doNotPerform, reported, medication, subject, encounter, supportingInformation, authoredOn, requester,
        performer, performerType, recorder, reasonCode, reasonReference, instantiatesCanonical, instantiatesUri,
        basedOn, groupIdentifier, courseOfTherapyType, insurance, note, dosageInstruction, dispenseRequest,
        substitution, priorPrescription, detectedIssue, eventHistory);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.MedicationRequest;
  }

  /**
   * Search parameter: <b>requester</b>
   * <p>
   * Description: <b>Returns prescriptions prescribed by this prescriber</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.requester</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "requester", path = "MedicationRequest.requester", description = "Returns prescriptions prescribed by this prescriber", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Practitioner") }, target = { Device.class,
          Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class })
  public static final String SP_REQUESTER = "requester";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>requester</b>
   * <p>
   * Description: <b>Returns prescriptions prescribed by this prescriber</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.requester</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REQUESTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_REQUESTER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:requester</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REQUESTER = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:requester").toLocked();

  /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Returns medication request to be administered on a specific
   * date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationRequest.dosageInstruction.timing.event</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "date", path = "MedicationRequest.dosageInstruction.timing.event", description = "Returns medication request to be administered on a specific date", type = "date")
  public static final String SP_DATE = "date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Returns medication request to be administered on a specific
   * date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationRequest.dosageInstruction.timing.event</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_DATE);

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Return prescriptions with this external identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "MedicationRequest.identifier", description = "Return prescriptions with this external identifier", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Return prescriptions with this external identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>intended-dispenser</b>
   * <p>
   * Description: <b>Returns prescriptions intended to be dispensed by this
   * Organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.dispenseRequest.performer</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "intended-dispenser", path = "MedicationRequest.dispenseRequest.performer", description = "Returns prescriptions intended to be dispensed by this Organization", type = "reference", target = {
      Organization.class })
  public static final String SP_INTENDED_DISPENSER = "intended-dispenser";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>intended-dispenser</b>
   * <p>
   * Description: <b>Returns prescriptions intended to be dispensed by this
   * Organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.dispenseRequest.performer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam INTENDED_DISPENSER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_INTENDED_DISPENSER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:intended-dispenser</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_INTENDED_DISPENSER = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:intended-dispenser").toLocked();

  /**
   * Search parameter: <b>authoredon</b>
   * <p>
   * Description: <b>Return prescriptions written on this date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationRequest.authoredOn</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "authoredon", path = "MedicationRequest.authoredOn", description = "Return prescriptions written on this date", type = "date")
  public static final String SP_AUTHOREDON = "authoredon";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>authoredon</b>
   * <p>
   * Description: <b>Return prescriptions written on this date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>MedicationRequest.authoredOn</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam AUTHOREDON = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_AUTHOREDON);

  /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>Return prescriptions of this medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.medicationCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "code", path = "(MedicationRequest.medication as CodeableConcept)", description = "Return prescriptions of this medication code", type = "token")
  public static final String SP_CODE = "code";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>Return prescriptions of this medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.medicationCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CODE);

  /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>The identity of a patient to list orders for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "subject", path = "MedicationRequest.subject", description = "The identity of a patient to list orders  for", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Patient") }, target = { Group.class, Patient.class })
  public static final String SP_SUBJECT = "subject";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>The identity of a patient to list orders for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SUBJECT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:subject").toLocked();

  /**
   * Search parameter: <b>medication</b>
   * <p>
   * Description: <b>Return prescriptions for this medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.medicationReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "medication", path = "(MedicationRequest.medication as Reference)", description = "Return prescriptions for this medication reference", type = "reference", target = {
      Medication.class })
  public static final String SP_MEDICATION = "medication";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>medication</b>
   * <p>
   * Description: <b>Return prescriptions for this medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.medicationReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MEDICATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_MEDICATION);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:medication</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MEDICATION = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:medication").toLocked();

  /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Return prescriptions with this encounter identifier</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.encounter</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "encounter", path = "MedicationRequest.encounter", description = "Return prescriptions with this encounter identifier", type = "reference", providesMembershipIn = {
      @ca.uhn.fhir.model.api.annotation.Compartment(name = "Encounter") }, target = { Encounter.class })
  public static final String SP_ENCOUNTER = "encounter";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Return prescriptions with this encounter identifier</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.encounter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_ENCOUNTER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:encounter").toLocked();

  /**
   * Search parameter: <b>priority</b>
   * <p>
   * Description: <b>Returns prescriptions with different priorities</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.priority</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "priority", path = "MedicationRequest.priority", description = "Returns prescriptions with different priorities", type = "token")
  public static final String SP_PRIORITY = "priority";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>priority</b>
   * <p>
   * Description: <b>Returns prescriptions with different priorities</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.priority</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PRIORITY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_PRIORITY);

  /**
   * Search parameter: <b>intent</b>
   * <p>
   * Description: <b>Returns prescriptions with different intents</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.intent</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "intent", path = "MedicationRequest.intent", description = "Returns prescriptions with different intents", type = "token")
  public static final String SP_INTENT = "intent";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>intent</b>
   * <p>
   * Description: <b>Returns prescriptions with different intents</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.intent</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam INTENT = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_INTENT);

  /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Returns prescriptions for a specific patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "patient", path = "MedicationRequest.subject.where(resolve() is Patient)", description = "Returns prescriptions for a specific patient", type = "reference", target = {
      Patient.class })
  public static final String SP_PATIENT = "patient";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Returns prescriptions for a specific patient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PATIENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:patient").toLocked();

  /**
   * Search parameter: <b>intended-performer</b>
   * <p>
   * Description: <b>Returns the intended performer of the administration of the
   * medication request</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.performer</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "intended-performer", path = "MedicationRequest.performer", description = "Returns the intended performer of the administration of the medication request", type = "reference", target = {
      CareTeam.class, Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class,
      RelatedPerson.class })
  public static final String SP_INTENDED_PERFORMER = "intended-performer";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>intended-performer</b>
   * <p>
   * Description: <b>Returns the intended performer of the administration of the
   * medication request</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MedicationRequest.performer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam INTENDED_PERFORMER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_INTENDED_PERFORMER);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MedicationRequest:intended-performer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_INTENDED_PERFORMER = new ca.uhn.fhir.model.api.Include(
      "MedicationRequest:intended-performer").toLocked();

  /**
   * Search parameter: <b>intended-performertype</b>
   * <p>
   * Description: <b>Returns requests for a specific type of performer</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.performerType</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "intended-performertype", path = "MedicationRequest.performerType", description = "Returns requests for a specific type of performer", type = "token")
  public static final String SP_INTENDED_PERFORMERTYPE = "intended-performertype";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>intended-performertype</b>
   * <p>
   * Description: <b>Returns requests for a specific type of performer</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.performerType</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam INTENDED_PERFORMERTYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_INTENDED_PERFORMERTYPE);

  /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>Returns prescriptions with different categories</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "category", path = "MedicationRequest.category", description = "Returns prescriptions with different categories", type = "token")
  public static final String SP_CATEGORY = "category";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>Returns prescriptions with different categories</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CATEGORY);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Status of the prescription</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "MedicationRequest.status", description = "Status of the prescription", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Status of the prescription</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicationRequest.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
