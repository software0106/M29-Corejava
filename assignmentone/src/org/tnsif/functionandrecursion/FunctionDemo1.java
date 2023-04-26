package org.tnsif.functionandrecursion;
import java.util.Scanner;


public class FunctionDemo1 {
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number -> ");
		int n=s.nextInt();
		System.out.println(factorial(n));
	}


}
