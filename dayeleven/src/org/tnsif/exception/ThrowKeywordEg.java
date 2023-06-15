package org.tnsif.exception;

import java.io.IOException;

public class ThrowKeywordExample {
	
	public static void donate(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
			System.out.println("You can Donate");
		else
			throw new IOException("You cannot Donate");
	}

	public static void main(String[] args) {
		try {
			ThrowKeywordExample.donate(16,55);
		}
		catch(IOException e) {
			System.out.println("Exception Here"+ e);
		}
		
		
	}

}