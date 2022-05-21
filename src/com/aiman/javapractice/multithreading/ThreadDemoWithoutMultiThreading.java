package com.aiman.javapractice.multithreading;

class PrintingHi {
	public void printHi() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			Thread.sleep(500);
		}
	}
}

class PrintingHello {
	public void printHello() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			Thread.sleep(500);
		}
	}
}

public class ThreadDemoWithoutMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Current Thread::"+Thread.currentThread().getName());
		
		PrintingHi objHi = new PrintingHi();
		PrintingHello objHello = new PrintingHello();

		objHi.printHi();
		objHello.printHello();

	}

}
