/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.ctpJNI;

public class CThostFtdcMarginModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarginModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarginModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMarginModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcMarginModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcMarginModelField_BrokerID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    ctpJNI.CThostFtdcMarginModelField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return ctpJNI.CThostFtdcMarginModelField_MarginModelID_get(swigCPtr, this);
  }

  public void setMarginModelName(String value) {
    ctpJNI.CThostFtdcMarginModelField_MarginModelName_set(swigCPtr, this, value);
  }

  public String getMarginModelName() {
    return ctpJNI.CThostFtdcMarginModelField_MarginModelName_get(swigCPtr, this);
  }

  public CThostFtdcMarginModelField() {
    this(ctpJNI.new_CThostFtdcMarginModelField(), true);
  }

}
