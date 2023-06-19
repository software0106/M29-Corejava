package org.tnsif.enumeration;

public class EmployeeEnumeration {
	enum empType
	{
		CONTRACT,PERMANENT,PARTTIME
	}
	
	void print(empType a)
	{
		if(a==empType.CONTRACT)
		{
			System.out.println("You are contract Employee");
		}
		else if(a==empType.PERMANENT)
		{
			System.out.println("You are Permanent Employee");
			
		}
		else 
			System.out.println("You are Part-Time Employee");
	}

	public static void main(String[] args) {
		empType a=empType.PERMANENT;
		System.out.println(a);
		

	}

}
