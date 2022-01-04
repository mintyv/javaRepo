package com.training.mars;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		try {
//			show();
			if(a>b) {
				System.out.println("A is greater");
			}
			else {
				throw new MyException("Lesser value");
	}
	
//	private static void show() {
//		int a = 5;
////		try {
////		int b = a/0;
////		System.out.println("Value of b is: "+b);
//		
	}
//		catch(Exception e) {
////			System.out.println("Some exception happened");
//			e.printStackTrace();
		
		
		catch(AritmeticException e) {
			System.out.println("Exception thrown from show method");
		} catch (MyException e) {
			System.out.println("Inside catch block");
			System.out.println(e.getMessage());
			
		}
	}
	private static void show() throws ArithmeticException()int a = 5;
	
}
