package com.training.mars;

import java.util.Objects;

public class Student {

	private String name;
	private int rollNo;
	private char grade;

	public Student(String name, int rollNo, char grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

}