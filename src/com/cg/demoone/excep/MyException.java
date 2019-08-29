package com.cg.demoone.excep;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empid;
	public MyException(int s) 
    { 
        // Call constructor of parent Exception 
        empid = s;
    }
	@Override
	public String toString() {
		return "MyException new exception";
	} 
	
}
