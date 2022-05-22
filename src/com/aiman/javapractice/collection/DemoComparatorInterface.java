package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparatorInterface {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();

		values.add(890);
		values.add(965);
		values.add(893);
		values.add(746);
		values.add(441);
		values.add(233);
		values.add(879);

//		Comparator<Integer> comp = new Comparator<>() {   //implementing Comparator using anonymous class
//
//			@Override
//			public int compare(o1,o2) {
//				if (o1%10 > o2%10) {
//					return 1;
//				}
//				return -1;
//			}
//
//		};

//		Comparator<Integer> comp = (o1, o2) -> { // implementing Comparator using Lambda
//			if (o1 % 10 > o2 % 10) {
//				return 1;
//			}
//			return -1;
//		};
//
//		Collections.sort(values, comp); // sorting on the basis of last digit

		Collections.sort(values, (o1, o2) -> o1 % 10 > o2 % 10 ? 1 : -1); // sorting on the basis of last digit, by
																			// direct passing the implementation of
																			// compare method as lambda and using
																			// ternary operator.

		values.forEach(System.out::println);

	}

}
