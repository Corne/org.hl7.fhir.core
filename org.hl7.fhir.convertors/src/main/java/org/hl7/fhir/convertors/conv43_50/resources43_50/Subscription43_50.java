package org.hl7.fhir.convertors.conv43_50.resources43_50;

import org.hl7.fhir.convertors.context.ConversionContext43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.general43_50.ContactPoint43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.Instant43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.String43_50;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus;
import org.hl7.fhir.r5.model.Enumeration;
import org.hl7.fhir.r5.model.Enumerations;
import org.hl7.fhir.r5.model.Enumerations.SubscriptionStatusCodes;

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
// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0
public class Subscription43_50 {


  public static org.hl7.fhir.r5.model.Subscription convertSubscription(org.hl7.fhir.r4b.model.Subscription src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Subscription tgt = new org.hl7.fhir.r5.model.Subscription();

    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyDomainResource(src, tgt);

    for (org.hl7.fhir.r4b.model.ContactPoint t : src.getContact()) {
      tgt.addContact(ContactPoint43_50.convertContactPoint(t));
    }

    if (src.hasStatus()) {
      tgt.setStatusElement(convertStatus(src.getStatusElement()));
    }
    if (src.hasEnd()) {
      tgt.setEndElement(Instant43_50.convertInstant(src.getEndElement()));
    }
    if (src.hasReason()) {
      tgt.setReasonElement(String43_50.convertString(src.getReasonElement()));
    }

    return tgt;
  }


  public static org.hl7.fhir.r4b.model.Subscription convertSubscription(org.hl7.fhir.r5.model.Subscription src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4b.model.Subscription tgt = new org.hl7.fhir.r4b.model.Subscription();

    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyDomainResource(src, tgt);

    for (org.hl7.fhir.r5.model.ContactPoint t : src.getContact()) {
      tgt.addContact(ContactPoint43_50.convertContactPoint(t));
    }


    if (src.hasStatus()) {
      tgt.setStatusElement(convertStatus(src.getStatusElement()));
    }
    if (src.hasEnd()) {
      tgt.setEndElement(Instant43_50.convertInstant(src.getEndElement()));
    }
    if (src.hasReason()) {
      tgt.setReasonElement(String43_50.convertString(src.getReasonElement()));
    }

    return tgt;
  }


  private static Enumeration<SubscriptionStatusCodes> convertStatus(org.hl7.fhir.r4b.model.Enumeration<SubscriptionStatus> src) {
    if (src == null || src.isEmpty())
      return null;
    Enumeration<Enumerations.SubscriptionStatusCodes> tgt = new Enumeration<>(new Enumerations.SubscriptionStatusCodesEnumFactory());
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyElement(src, tgt);
    if (src.getValue() == null) {
      tgt.setValue(null);
    } else {
      switch (src.getValue()) {
      case REQUESTED:
        tgt.setValue(Enumerations.SubscriptionStatusCodes.REQUESTED);
        break;
      case ACTIVE:
        tgt.setValue(Enumerations.SubscriptionStatusCodes.ACTIVE);
        break;
      case ERROR:
        tgt.setValue(Enumerations.SubscriptionStatusCodes.ERROR);
        break;
      case OFF:
        tgt.setValue(Enumerations.SubscriptionStatusCodes.OFF);
        break;
      default:
        tgt.setValue(Enumerations.SubscriptionStatusCodes.NULL);
        break;
      }
    }
    return tgt;
  }
  
  private static org.hl7.fhir.r4b.model.Enumeration<SubscriptionStatus> convertStatus(Enumeration<SubscriptionStatusCodes> src) {
    if (src == null || src.isEmpty())
      return null;
    org.hl7.fhir.r4b.model.Enumeration<SubscriptionStatus> tgt = new org.hl7.fhir.r4b.model.Enumeration<>(new org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatusEnumFactory());
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyElement(src, tgt);
    if (src.getValue() == null) {
      tgt.setValue(null);
    } else {
      switch (src.getValue()) {
      case REQUESTED:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.REQUESTED);
        break;
      case ACTIVE:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.ACTIVE);
        break;
      case ERROR:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.ERROR);
        break;
      case OFF:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.OFF);
        break;
      case ENTEREDINERROR:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.OFF);
        break;
      default:
        tgt.setValue(org.hl7.fhir.r4b.model.Enumerations.SubscriptionStatus.NULL);
        break;
      }
    }
    return tgt;
  }

}