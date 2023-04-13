package org.tnsif.looping;

public class LableForLoop {

	public static void main(String[] args) {
    outer:
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println();
    		ineer:
    			for(int j=1;j<=5;j++)
    			{
    				System.out.print(j+" ");
    				if(j==4)
    					break;
    			}
    	}
	}

}
