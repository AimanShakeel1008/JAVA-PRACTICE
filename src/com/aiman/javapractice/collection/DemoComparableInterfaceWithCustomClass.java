package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparableInterfaceWithCustomClass {

	public static void main(String[] args) {

		List<Student2> studs = new ArrayList<>();

		studs.add(new Student2(1, 56));
		studs.add(new Student2(2, 76));
		studs.add(new Student2(3, 45));
		studs.add(new Student2(4, 86));
		studs.add(new Student2(5, 61));
		studs.add(new Student2(6, 78));
		studs.add(new Student2(7, 85));

		Collections.sort(studs);

		studs.forEach(System.out::println);

	}

}

class Student2 implements Comparable<Student2> {

	int rollNo;
	int marks;

	public Student2(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student2 s) {

		return this.getMarks() > s.getMarks() ? -1 : this.getMarks() < s.getMarks() ? 1 : 0;

	}

}
