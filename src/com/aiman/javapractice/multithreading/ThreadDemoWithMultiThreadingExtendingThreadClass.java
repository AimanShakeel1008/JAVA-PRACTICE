package com.aiman.javapractice.multithreading;

class PrintingHiExtendingThreadclass extends Thread {

	public void run() {
		try {
			printHi();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printHi() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hi--printed by: " + Thread.currentThread().getName());

			Thread.sleep(500);
		}
	}
}

class PrintingHelloExtendingThreadclass extends Thread {

	public void run() {
		try {
			printHello();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printHello() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello--printed by: " + Thread.currentThread().getName());

			Thread.sleep(500);
		}
	}
}

public class ThreadDemoWithMultiThreadingExtendingThreadClass {

	public static void main(String[] args) {
		
		System.out.println("Current Thread::"+Thread.currentThread().getName());

		Thread objHiThread = new PrintingHiExtendingThreadclass();
		Thread objHelloThread = new PrintingHelloExtendingThreadclass();

		objHiThread.setName("Hi Thread");
		objHiThread.start();

		objHelloThread.setName("Hello Thread");
		objHelloThread.start();

	}

}
