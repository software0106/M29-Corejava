package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't instantiate any interface
				//ATMMachine a = new ATMMachine();
				
				ATM a1 = new ATMMachineChild();
				a1.deposit();
				a1.withdraw();

			}
	}

