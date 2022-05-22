package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoListInterface {

	public static void main(String[] args) {
		
		List<Integer> values= new ArrayList<>();
		
		values.add(8);
		values.add(9);
		values.add(89);
		values.add(76);
		values.add(4);
		values.add(23);
		values.add(87);
		
		values.forEach(System.out::println); //stream API... Lambda
		
		values.add(5,45); // you can add element at particular index
		
		values.forEach(System.out::println);
		
		System.out.println(values.get(5));
		
		
		System.out.println("Sorting List");

		Collections.sort(values);
		
		System.out.println("Iterating list with iterator");
		Iterator<Integer> it=values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		List<Integer> values2= Arrays.asList(78,67,45,98,45);
		
		List<Integer> values3= new ArrayList<>() {{
			
			add(34);
			add(12);
			add(98);
			add(25);
			add(67);
		}};


		
	}

}
