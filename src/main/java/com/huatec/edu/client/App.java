package com.huatec.edu.client;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyThread myThread = new MyThread(Thread.currentThread());
        
        
        myThread.start();
        System.out.println("loop on");

        while (!Thread.interrupted()) 
			System.out.println("main has been interrupted");
			


    }
}
