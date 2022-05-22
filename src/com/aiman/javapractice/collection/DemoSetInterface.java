package com.aiman.javapractice.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSetInterface {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>(); // No duplicate values
												// fetching is in random order

		hashSet.add(45);
		hashSet.add(97);
		hashSet.add(83);
		hashSet.add(12);
		hashSet.add(97);
		hashSet.add(34);

		System.out.println("Printing HashSet");
		hashSet.forEach(System.out::println);

		Set<Integer> treeSet = new TreeSet<>(); // No duplicate values
												// fetching is in ascending order

		treeSet.add(45);
		treeSet.add(97);
		treeSet.add(83);
		treeSet.add(12);
		treeSet.add(97);
		treeSet.add(34);

		System.out.println("Printing TreeSet");
		treeSet.forEach(System.out::println);

		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(); // No duplicate values
																	// fetching is in the same order as the elements are
																	// added

		linkedHashSet.add(45);
		linkedHashSet.add(97);
		linkedHashSet.add(83);
		linkedHashSet.add(12);
		linkedHashSet.add(97);
		linkedHashSet.add(34);

		System.out.println("Printing LinkedHashSet");
		linkedHashSet.forEach(System.out::println);

	}

}
