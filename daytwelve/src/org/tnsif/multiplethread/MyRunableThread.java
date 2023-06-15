package org.tnsif.multiplethread;

public class MyRunableThread  implements Runable {
	
	@Override
	public void run() {
		System.out.println("Thread in running State");
	}

	public static void main(String[] args) {
		
		MyRunableThread m=new MyRunableThread();
		m.run();
}
}
