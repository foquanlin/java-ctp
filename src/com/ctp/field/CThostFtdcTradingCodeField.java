/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.ctpJNI;

public class CThostFtdcTradingCodeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CThostFtdcTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CThostFtdcTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    ctpJNI.CThostFtdcTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return ctpJNI.CThostFtdcTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CThostFtdcTradingCodeField() {
    this(ctpJNI.new_CThostFtdcTradingCodeField(), true);
  }

}
