package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollectionInterface {

	public static void main(String[] args) {

		Collection values = new ArrayList(); // When type of collection is not defined as Generics, it can add any type
												// of values.

		values.add("Aiman");
		values.add(89);
		values.add(8.9);

		for (Object a : values) {
			System.out.println(a);
		}

		Collection<Integer> values2 = new ArrayList<>(); // When type of collection is defined as Generics, it can add
															// only that type
		// of values.

		values2.add(52);
		values2.add(89);
		values2.add(8);

		for (int a : values2) {
			System.out.println(a);
		}

		// If you want to add any element at any particular index, you can not do that
		// with collection interface, as collection interface does not work with
		// indexes. For this purpose we have List interface.
		//values.add(4,9) this will not work.

	}

}
