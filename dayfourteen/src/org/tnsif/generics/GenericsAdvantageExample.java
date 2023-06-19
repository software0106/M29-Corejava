package org.tnsif.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		//Type-safety
		List<Integer> list=new ArrayList();
		list.add(11);
		//list.add(36.3);
		System.out.println(list);
		
		
		//before Generics,Typecasting is allowed
		ArrayList arr1=new ArrayList();
		arr1.add("St.John ");
		System.out.println(arr1);
		String str=(String)arr1.get(0);
		System.out.println(str);
		
		//after generics, Typecasting is allowed
		ArrayList<String> arr2=new ArrayList();
		arr1.add("St.John ");
		System.out.println(arr1);
		String str1=(String)arr1.get(0);
		System.out.println(str1);
		
		
		

	}
}
