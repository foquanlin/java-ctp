/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.ctpJNI;

public class CThostFtdcBrokerField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerAbbr(String value) {
    ctpJNI.CThostFtdcBrokerField_BrokerAbbr_set(swigCPtr, this, value);
  }

  public String getBrokerAbbr() {
    return ctpJNI.CThostFtdcBrokerField_BrokerAbbr_get(swigCPtr, this);
  }

  public void setBrokerName(String value) {
    ctpJNI.CThostFtdcBrokerField_BrokerName_set(swigCPtr, this, value);
  }

  public String getBrokerName() {
    return ctpJNI.CThostFtdcBrokerField_BrokerName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CThostFtdcBrokerField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CThostFtdcBrokerField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcBrokerField() {
    this(ctpJNI.new_CThostFtdcBrokerField(), true);
  }

}
