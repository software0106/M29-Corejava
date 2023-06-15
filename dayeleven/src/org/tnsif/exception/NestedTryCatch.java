package org.tnsif.exception;

import java.util.Scanner;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter X and Y");
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]= new int[] {101,33,78};
		try
		{
			try {
				 System.out.println(arr[x]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception handle"+ e);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception handle"+ e);
			}
			try {
				System.out.println(x/y);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception handle"+ e);
			}
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}