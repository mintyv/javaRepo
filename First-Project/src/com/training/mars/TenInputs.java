package com.training.mars;

import java.util.Scanner;

public class TenInputs {

	public static void main(String[] args) throws CustomException {
	
//		java.util.Scanner in=new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);
		int[] array=new int[10];

		int sum=0;

		for(int i=0;i<array.length;i++){

		System.out.println("Enter the "+(i+1)+" number");

		array[i]=in.nextInt();

		sum+=array[i];

		}

		System.out.println("The sum is:"+ sum);
	}
	
	catch (Exception e) {
	    System.out.println(e.getMessage());
	}
		return sum;
		
		}
	}


