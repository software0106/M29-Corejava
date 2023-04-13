package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseprogram {

	public static void main(String[] args) {
 Scanner S=new Scanner(System.in);
 System.out.println("Enter the three value: ");
 float percentage1=S.nextFloat();
 float percentage2=S.nextFloat();
 float percentage3=S.nextFloat();
 if(percentage1>percentage2 && percentage1>percentage3)
 {
	 System.out.println("person1 as the heighest percentage");
 }
 else if(percentage2>percentage3 && percentage2>percentage1)
 {
	 System.out.println("person2 has the heighest percentage");
 }
	

 
	}
}
