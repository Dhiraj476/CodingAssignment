package com.code.demos;

class MyRunnable implements Runnable 
{
	private final String name;
	
	public MyRunnable(String name )
	{
		this.name=name;
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++)
		{
			System.out.println( name + ":" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
				
			
			
			
		}
		
		
		
	}
	
}

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MyRunnable("Thread 1"));
		Thread thread2 = new Thread(new MyRunnable("Thread 2"));
		
		thread1.start();
		thread2.start();

	}

}
