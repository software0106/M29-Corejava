package org.tnsif.multiplethread;

public class ThreadProgram extends Thread {
	
	public void run()
	{
		System.out.println("Running State");
	}

	public static void main(String[] args) {
		ThreadProgram p=new ThreadProgram();
		p.start();

	}


}
