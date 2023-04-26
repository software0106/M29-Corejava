package org.tnsif.functionandrecursion;
import java.util.Scanner;

public class FunctionAdding {
	public static int AddNum(int a, int b)
	{
		int num=a+b;
		return num;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println(AddNum(4, 5));
	}
}
