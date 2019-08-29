package com.cg.demoone.excep;

import com.cg.demoone.excep.MyException;
public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try
		        { 
		           
		            throw new MyException(10);
		        } 
		        catch (MyException ex) 
		        { 
		            System.out.println("Caught"); 
		            System.out.println(ex); 
		        } 
		     
	}

}
