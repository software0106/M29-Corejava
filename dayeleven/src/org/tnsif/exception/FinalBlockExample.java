package org.tnsif.exception;

public class FinalBlockExample {

	public static void main(String[] args) {
		int arr[]= new int[] {101,33,78};
		System.out.println("Array is :");
		try {
			System.exit(0);
		System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Exception handle"+ e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
