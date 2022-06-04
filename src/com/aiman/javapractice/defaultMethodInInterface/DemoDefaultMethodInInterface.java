package com.aiman.javapractice.defaultMethodInInterface;

interface Phone {
	void call();

	default void message() {
		System.out.println("Messaging....");
	}
}

class AndroidPhone implements Phone {
	public void call() {
		System.out.println("calling from android phone");
	}
}

public class DemoDefaultMethodInInterface {

	public static void main(String[] args) {

		Phone android = new AndroidPhone();

		android.call();
		android.message();
	}

}
