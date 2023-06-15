package org.tnsif.arrayclassdemo;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		System.out.println("Enter thr number of elements");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		//array declaration
		int arr[] = new int[num];
		//array initialization
		for(int i=0;i<num;i++)
		{
			arr[i] = s.nextInt();
		}
		
		for(int itr:arr)
		{
			System.out.println("Array elements are: " + itr);
		}

	}

}