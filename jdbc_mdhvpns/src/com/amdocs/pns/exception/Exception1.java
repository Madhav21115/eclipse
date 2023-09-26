package com.amdocs.pns.exception;

public class Exception1 extends Exception {
  String alert;
  public Exception1(String str) {
	  alert=str;
  }
  public String toString() {
	  return("something went wrong " + alert);
  }
  
}
