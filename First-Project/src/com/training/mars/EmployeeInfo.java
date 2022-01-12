package com.training.mars;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmpId("E101");
		emp1.setDepartment("Sales");
		emp1.setName("John");
		emp1.setSalary(2000.12);
		
		Employee emp2 = new Employee("Kevin", "Marketing", "E102", 4300.09);
		

		System.out.println(emp1.getEmployeeInfo());
		System.out.println(emp2.getEmployeeInfo());
	}

}
