/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.ctpJNI;

public class CThostFtdcCancelAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCancelAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCancelAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcCancelAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ctpJNI.CThostFtdcCancelAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ctpJNI.CThostFtdcCancelAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcCancelAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcCancelAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcCancelAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ctpJNI.CThostFtdcCancelAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ctpJNI.CThostFtdcCancelAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ctpJNI.CThostFtdcCancelAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ctpJNI.CThostFtdcCancelAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ctpJNI.CThostFtdcCancelAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ctpJNI.CThostFtdcCancelAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcCancelAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcCancelAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ctpJNI.CThostFtdcCancelAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ctpJNI.CThostFtdcCancelAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ctpJNI.CThostFtdcCancelAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ctpJNI.CThostFtdcCancelAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcCancelAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcCancelAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ctpJNI.CThostFtdcCancelAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpJNI.CThostFtdcCancelAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpJNI.CThostFtdcCancelAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpJNI.CThostFtdcCancelAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpJNI.CThostFtdcCancelAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpJNI.CThostFtdcCancelAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ctpJNI.CThostFtdcCancelAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ctpJNI.CThostFtdcCancelAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ctpJNI.CThostFtdcCancelAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ctpJNI.CThostFtdcCancelAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpJNI.CThostFtdcCancelAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpJNI.CThostFtdcCancelAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ctpJNI.CThostFtdcCancelAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ctpJNI.CThostFtdcCancelAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ctpJNI.CThostFtdcCancelAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ctpJNI.CThostFtdcCancelAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ctpJNI.CThostFtdcCancelAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ctpJNI.CThostFtdcCancelAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ctpJNI.CThostFtdcCancelAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ctpJNI.CThostFtdcCancelAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ctpJNI.CThostFtdcCancelAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ctpJNI.CThostFtdcCancelAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ctpJNI.CThostFtdcCancelAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ctpJNI.CThostFtdcCancelAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ctpJNI.CThostFtdcCancelAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ctpJNI.CThostFtdcCancelAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ctpJNI.CThostFtdcCancelAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ctpJNI.CThostFtdcCancelAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcCancelAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpJNI.CThostFtdcCancelAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpJNI.CThostFtdcCancelAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcCancelAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcCancelAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ctpJNI.CThostFtdcCancelAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ctpJNI.CThostFtdcCancelAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcCancelAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    ctpJNI.CThostFtdcCancelAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return ctpJNI.CThostFtdcCancelAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ctpJNI.CThostFtdcCancelAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ctpJNI.CThostFtdcCancelAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ctpJNI.CThostFtdcCancelAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ctpJNI.CThostFtdcCancelAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ctpJNI.CThostFtdcCancelAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ctpJNI.CThostFtdcCancelAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ctpJNI.CThostFtdcCancelAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ctpJNI.CThostFtdcCancelAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ctpJNI.CThostFtdcCancelAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ctpJNI.CThostFtdcCancelAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ctpJNI.CThostFtdcCancelAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ctpJNI.CThostFtdcCancelAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ctpJNI.CThostFtdcCancelAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ctpJNI.CThostFtdcCancelAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ctpJNI.CThostFtdcCancelAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ctpJNI.CThostFtdcCancelAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ctpJNI.CThostFtdcCancelAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ctpJNI.CThostFtdcCancelAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcCancelAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcCancelAccountField_UserID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpJNI.CThostFtdcCancelAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CThostFtdcCancelAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CThostFtdcCancelAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CThostFtdcCancelAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcCancelAccountField() {
    this(ctpJNI.new_CThostFtdcCancelAccountField(), true);
  }

}
