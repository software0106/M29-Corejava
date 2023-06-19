package org.tnsif.enumeration;

public class Size implements Pizza{
	
	SMALL,MEDIUM,LARGE;

	@Override
	public void displaySize() {
		System.out.println("Size: "+ this); 
		
	}


}
