package org.tnsif.statickeyworddemo;

public class Customer {
	private int cusID;
	private static String Companyname;
	
	static//static block
	{
		// we cannot use non static variable
		// ex -> name=
		
		Companyname="TATA";
	}

	public Customer() {
		cusID++;
		
	}

	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + "]";
	}
	static void display()
	{
		System.out.println("customer ID "+Companyname);
	}
	


}
