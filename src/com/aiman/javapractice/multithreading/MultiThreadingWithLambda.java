package com.aiman.javapractice.multithreading;

public class MultiThreadingWithLambda {

	public static void main(String[] args) {

		System.out.println("Current Thread::" + Thread.currentThread().getName());


		Thread threadHi = new Thread(()->{
			for (int i = 1; i <= 5; i++) {

				System.out.println("Hi--printed by: " + Thread.currentThread().getName());

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread threadHello = new Thread(()->{
			for (int i = 1; i <= 5; i++) {

				System.out.println("Hello--printed by: " + Thread.currentThread().getName());

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		threadHi.setName("Hi Thread");
		threadHi.start();

		threadHello.setName("Hello Thread");
		threadHello.start();

	}

}
