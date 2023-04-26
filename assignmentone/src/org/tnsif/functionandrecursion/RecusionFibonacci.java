package org.tnsif.functionandrecursion;
import java.util.Scanner;
public class RecusionFibonacci {
	public static void fib(int n)
	{
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		fib(n);
	}
}
