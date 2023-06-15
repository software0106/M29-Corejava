package org.tnsif.multiplethread;

public class ThreadLifeCycle  extends Thread{
	
	public void run() 
	{
		System.out.println("Thread is alive "+this.isAlive());
		int x=0;
		while (x<3)
		{
			x++;
			System.out.println("X is  "+ x);
		}
		
		try {
			sleep(500);
			System.out.println("Thread is alive in sleeping state  "+this.isAlive());
		} catch (InterruptedException e) {
			System.out.println("Thread is Block");
		}
	}

	public static void main(String[] args) {
		ThreadLifeCycle t=new ThreadLifeCycle();
		System.out.println("if my thread Alive "+ t.isAlive());
		t.start();
		

	}

}
