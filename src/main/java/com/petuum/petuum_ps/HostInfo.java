/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.petuum.petuum_ps;

public class HostInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected HostInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HostInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        petuumJNI.delete_HostInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    petuumJNI.HostInfo_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return petuumJNI.HostInfo_id_get(swigCPtr, this);
  }

  public void setIp(String value) {
    petuumJNI.HostInfo_ip_set(swigCPtr, this, value);
  }

  public String getIp() {
    return petuumJNI.HostInfo_ip_get(swigCPtr, this);
  }

  public void setPort(String value) {
    petuumJNI.HostInfo_port_set(swigCPtr, this, value);
  }

  public String getPort() {
    return petuumJNI.HostInfo_port_get(swigCPtr, this);
  }

  public HostInfo() {
    this(petuumJNI.new_HostInfo__SWIG_0(), true);
  }

  public HostInfo(int _id, String _ip, String _port) {
    this(petuumJNI.new_HostInfo__SWIG_1(_id, _ip, _port), true);
  }

  public HostInfo(HostInfo other) {
    this(petuumJNI.new_HostInfo__SWIG_2(HostInfo.getCPtr(other), other), true);
  }

}