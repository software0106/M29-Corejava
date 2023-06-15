package org.tnsif.abstractkyworddemo;

public class Remote {
public String cellName;
	
	//abstract method
	abstract void functionRemote();
	
	//concrete method
	void display()
	{
		System.out.println("Cell name is: " + cellName);
	}

}

class RemoteChild extends Remote
{
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
}
