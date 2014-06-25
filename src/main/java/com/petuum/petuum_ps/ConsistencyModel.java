/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.petuum.petuum_ps;

public final class ConsistencyModel {
  public final static ConsistencyModel SSP = new ConsistencyModel("SSP", petuumJNI.SSP_get());
  public final static ConsistencyModel SSPPush = new ConsistencyModel("SSPPush", petuumJNI.SSPPush_get());
  public final static ConsistencyModel SSPPushValueBound = new ConsistencyModel("SSPPushValueBound", petuumJNI.SSPPushValueBound_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ConsistencyModel swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ConsistencyModel.class + " with value " + swigValue);
  }

  private ConsistencyModel(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ConsistencyModel(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ConsistencyModel(String swigName, ConsistencyModel swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ConsistencyModel[] swigValues = { SSP, SSPPush, SSPPushValueBound };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
