package com.demo;

public class MainThread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.out.println("welcome to thread");
		MyThread m=new MyThread();
               m.start();
             m.join();
            System.out.println("thread ends");
	}

}
