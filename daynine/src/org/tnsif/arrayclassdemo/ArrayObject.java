package org.tnsif.arrayclassdemo;

public class ArrayObject {

	public static void main(String[] args) {
		
Customer[] arr=new Customer[2];
		
		arr[0]=new Customer(123,"Aishwarya");
		arr[1]=new Customer(124,"Heram");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+"  "+arr[i].getName());
		}

	}

}
