package com.huatec.edu.client;

public class MyThread extends Thread {

	
	Thread father;
	
	public MyThread(Thread father) {
		// TODO Auto-generated constructor stub
		this.father = father;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("myThread sucessfully run");
		father.interrupt();
		super.run();
	}



}
