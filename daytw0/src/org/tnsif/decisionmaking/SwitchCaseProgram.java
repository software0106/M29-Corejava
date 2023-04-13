package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
Scanner S=new Scanner(System.in);
System.out.println("Enter the song input");
int songInput=S.nextInt();
switch(songInput)
{
case 1:
	System.out.println("calm dowm");
case 2:
	System.out.println("perfect");
	break;
case 3:
	System.out.println("Mallem song");
	break;
	default:
}
	}

}
