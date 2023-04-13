//whileLoop Program
package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
// print 1 to n 
		int i=1;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a value of N; ");
	int N=S.nextInt();
	while(i<=N)
	{
		System.out.print(i+"  ");
		i++;
	}
	}
}

