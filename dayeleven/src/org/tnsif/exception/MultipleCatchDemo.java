package org.tnsif.exception;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {101,33,78};
		System.out.println("Array is :");
		try {
		  System.out.println(arr[3]);
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handle"+ e);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handle"+ e);
		}*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handle"+ e);
		}

	}
	
	}
