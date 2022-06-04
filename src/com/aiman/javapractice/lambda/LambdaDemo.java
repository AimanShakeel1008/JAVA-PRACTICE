package com.aiman.javapractice.lambda;

interface A {
	void show();
}

//class B implements A{
//	public void show() {
//		System.out.println("A");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
//		 obj=new B();

		// Anonymous class
//		 obj=new A() {
//			 public void show() {
//				 System.out.println("A");
//			 }
//		 };

		
		//Lambda Expression
//		obj = () -> {
//			System.out.println("A");
//		};

		obj = () -> System.out.println("A");

		obj.show();
	}

}
