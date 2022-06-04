package com.aiman.javapractice.forEachInJava8;

import java.util.Arrays;
import java.util.List;

public class DemoforEachMethod {

	public static void main(String[] args) {
	
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7);
		
		//External loops
		System.out.println("Iterating list with traditional for loop");
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("Iterating list with enhanced for loop");
		for(Integer i:values) {
			System.out.println(i);
		}
		
		
		//Internal for loop
		System.out.println("Iterating list with forEach method");

		values.forEach(i->System.out.println(i));
	}

}
