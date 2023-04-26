package org.tnsif.functionandrecursion;
import java.util.Scanner;
public class FunctionFibonacci {
	public static int fib(int n)
	{
		if(n<=1)
			return 1;
	
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=s.nextInt();
		System.out.print(0+" ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}
