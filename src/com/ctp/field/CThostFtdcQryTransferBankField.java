/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package com.ctp.field;

import com.ctp.swig.ctpJNI;

public class CThostFtdcQryTransferBankField
{
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryTransferBankField(long cPtr, boolean cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr(CThostFtdcQryTransferBankField obj)
	{
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize()
	{
		delete();
	}

	public synchronized void delete()
	{
		if (swigCPtr != 0)
		{
			if (swigCMemOwn)
			{
				swigCMemOwn = false;
				ctpJNI.delete_CThostFtdcQryTransferBankField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBankID(String value)
	{
		ctpJNI.CThostFtdcQryTransferBankField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID()
	{
		return ctpJNI.CThostFtdcQryTransferBankField_BankID_get(swigCPtr, this);
	}

	public void setBankBrchID(String value)
	{
		ctpJNI.CThostFtdcQryTransferBankField_BankBrchID_set(swigCPtr, this, value);
	}

	public String getBankBrchID()
	{
		return ctpJNI.CThostFtdcQryTransferBankField_BankBrchID_get(swigCPtr, this);
	}

	public CThostFtdcQryTransferBankField()
	{
		this(ctpJNI.new_CThostFtdcQryTransferBankField(), true);
	}
}
