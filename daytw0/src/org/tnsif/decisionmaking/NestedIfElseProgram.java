package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElseProgram {

	public static void main(String[] args) {
Scanner S=new Scanner(System.in);
int num=S.nextInt();
if(num>0)
{
	if(num<0)

{
System.out.println("Non-zero number");
}
else
{
	System.out.println("zero/non-zero");
	}	
}
else
{
	System.out.println("either non-zero/zero");
	
}
}
}