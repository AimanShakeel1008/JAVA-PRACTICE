package com.aiman.javapractice.multithreading;

public class MultiThreadingWithAnonymousClass {

	public static void main(String[] args) {

		System.out.println("Current Thread::" + Thread.currentThread().getName());

		Runnable runnableObjForHi = new Runnable() {

			@Override
			public void run() {
				try {
					printHi();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable runnableObjForHello = new Runnable() {

			@Override
			public void run() {
				try {
					printHello();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};

		Thread threadHi = new Thread(runnableObjForHi);
		Thread threadHello = new Thread(runnableObjForHello);

		threadHi.setName("Hi Thread");
		threadHi.start();

		threadHello.setName("Hello Thread");
		threadHello.start();

	}

	public static void printHello() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello--printed by: " + Thread.currentThread().getName());

			Thread.sleep(500);
		}
	}

	public static void printHi() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hi--printed by: " + Thread.currentThread().getName());

			Thread.sleep(500);
		}
	}

}
