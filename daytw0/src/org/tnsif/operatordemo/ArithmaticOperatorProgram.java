package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmaticOperatorProgram {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int x=Sc.nextInt();
		int y=Sc.nextInt();
		System.out.println("The addition of two numbers; " +(x+y));
		System.out.println("The subtration of two numbers; " +(x-y));
		System.out.println("The Multiplication of two numbers; " +(x*y));
		System.out.println("The dividion of two numbers; " +(x/y));
		System.out.println("The modulo of two numbers; " +(x%y));
	
	
	}

}
