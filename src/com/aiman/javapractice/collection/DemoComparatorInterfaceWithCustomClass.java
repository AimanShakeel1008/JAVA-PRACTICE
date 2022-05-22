package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparatorInterfaceWithCustomClass {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList<>();

		studs.add(new Student(1, 56));
		studs.add(new Student(2, 76));
		studs.add(new Student(3, 45));
		studs.add(new Student(4, 86));
		studs.add(new Student(5, 61));
		studs.add(new Student(6, 78));
		studs.add(new Student(7, 85));

		Collections.sort(studs, (s1, s2) -> s1.getMarks() > s2.getMarks() ? -1 : s1.getMarks() < s2.getMarks() ? 1 : 0);
		
		studs.forEach(System.out::println);

	}

}

class Student {

	int rollNo;
	int marks;

	public Student(int rollNo, int marks) {
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
	
	

}
