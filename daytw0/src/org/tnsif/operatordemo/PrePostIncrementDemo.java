//pre post Increment
package org.tnsif.operatordemo;

public class PrePostIncrementDemo {

	public static void main(String[] args) {
   int a=12,b=7,c=3;
   int x=a++ ; //12
   ++a; //++13=14
   --b;//4
   int y=b--;//4--
   System.out.println(a);//14
   System.out.println(x);//12
   System.out.println(b); //3
   System.out.println(y);//6
	}

}
