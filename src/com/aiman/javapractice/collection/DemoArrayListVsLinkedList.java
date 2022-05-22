package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayListVsLinkedList {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<>(); // Works on on dynamic array
													// When adding element in between it is slow
													// When searching element at any index, it is fast

		List<Integer> liList = new LinkedList<>(); // Works on Doubly LinkedList
													// When adding element in between it is fast
													// When searching element at any index, it is slow
	}

}
