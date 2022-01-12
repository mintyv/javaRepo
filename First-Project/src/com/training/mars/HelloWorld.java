package com.training.mars;

import java.util.Scanner;

public class HelloWorld {
	

	public static void main(String[] args) {
		System.out.println("Guess the correct number:");

	final int secretNum = 29;
		int guess = 0;
		
		while (true) {
		Scanner key = new Scanner(System.in);
		
			
			System.out.println("Guess Number: ");
			
			int tries = key.nextInt();
			
			guess++;
			
			if (tries == secretNum) {
				
				System.out.println("Correct!" + guess + " Number Of Attempts");
}
			
			else if (tries < secretNum) {
				System.out.println("Higher");
			
			}
			
			else if (tries > secretNum) {
				System.out.println("Lower");
			}
			key.close();
		}
	
			}
	
	
		}