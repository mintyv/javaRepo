package com.training.mars;

import java.util.Scanner;

public class DigitNumber {
	
	public static void main(String[] args) {
		 
	 
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a 4 Digit Number ");
        
        String ln = sc.next();
        if (ln.length() < 4 || ln.length() > 4) {
            System.out.println("ERROR: Please refresh and type in a 4 digit number.");
        }
        else {
  
      int number = sc.nextInt();
        
        int sum = 0;
        while(number!=0) {
        	sum = sum + number %10;
        	number = number /10;
        }
        System.out.println("Sum of all Digits: "+ sum);
        }
      
        
        }}
        
        
	
    