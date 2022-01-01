package com.training.mars;

public class Employee {

	private String name;
	private double salary;
	private String empId;
	private String department;
	
	public Employee() {
	}
	
	public Employee(String name, double Salary, String empID, String department) {
		this.department = department;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getNmae() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeInfo() {
		return "Name: "+name + " EmpID: "+empId+ " Salary "+salary +" Department: "+department;
		
		
	}
	

}
