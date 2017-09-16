package org.tc.thread;

public class MyThread implements Runnable{
 
    public static int count = 0;
    //public static int threadPriority = 0;
	@Override
	public void run() {
		//Thread t = null;
		if(count < 10){
 		// 	 System.out.println(Thread.currentThread().getName());
 		 	 Thread t = new Thread(new MyThread());
			 t.setName("Thread running ... :"+ ++count);
			 t.start();
			 //t.yield();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		} 
		//System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String ...strings ){
		Thread t = new Thread(new MyThread());
		t.setName("Thread running ... :"+ ++count);
		t.start();
	}

}
