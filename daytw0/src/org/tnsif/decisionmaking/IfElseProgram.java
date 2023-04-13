package org.tnsif.decisionmaking;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class IfElseProgram {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the age and weight of a " + "donor");
		int age=S.nextInt();
		int weight=S.hashCode();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood ");
		}
		else
		{
			System.out.println("not eligible to donate the" + "blood");
		}
	}

}
