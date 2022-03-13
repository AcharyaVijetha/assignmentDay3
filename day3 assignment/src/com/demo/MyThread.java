package com.demo;

public class MyThread extends Thread {
@Override
public void run() {
	try {
		for(int i=0; i<10; i++) 
		{
		
		System.out.println("thread execute" + Thread.currentThread().getName());
		Thread.sleep(1000);
	     }
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	}
}


