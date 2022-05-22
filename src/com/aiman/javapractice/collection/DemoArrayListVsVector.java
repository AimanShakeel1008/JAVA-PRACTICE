package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoArrayListVsVector {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<>(); // Increases size by 50%
													// Not Thread Safe
													// fast

		List<Integer> vect = new Vector<>(); // Increases size by 100%
												// Thread safe
												// slow

	}

}
