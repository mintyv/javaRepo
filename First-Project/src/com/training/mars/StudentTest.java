package com.training.mars;

import java.util.HashSet;

public class StudentTest {

	public static void main(String[] args) {

		HashSet<Student> students = new HashSet<>();

		Student stud1 = new Student("John", 01, 'A');
		Student stud2 = new Student("Maria", 02, 'B');
		Student stud3 = new Student("Kevin", 03, 'B');
		Student stud4 = new Student("Kevin", 03, 'B');

		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);

		for (Student stud : students)
			System.out.println(stud);

	}

}
