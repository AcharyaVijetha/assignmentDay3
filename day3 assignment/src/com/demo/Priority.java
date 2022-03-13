package com.demo;

public class Priority extends Thread{
		public void run() {
			Thread  m=Thread.currentThread();
			System.out.println("priotiry"+m.getName());


		try{
			
			for(int i=0;i<10;i++) {
				System.out.println("execute by"+Thread.currentThread().getName());

			Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
		        e.printStackTrace();

		}
		}
		}
