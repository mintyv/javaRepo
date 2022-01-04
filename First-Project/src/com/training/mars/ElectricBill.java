package com.training.mars;

import java.util.Scanner;



	
		class ElectricBill {
			String n;
			int units;
			double bill;
			
			void accept()
			{Scanner in = new Scanner(System.in);
			int size;
			System.out.println("How Many Bills Would You Like To Be Prepared? ");
			size = in.nextInt();
			in.skip(System.lineSeparator());
			String[] consumersArr = new String[size];
			
			
			for (int counter=0; counter<size; counter++) {
			System.out.println("Enter Name of Customer");
			n = in.nextLine();
			System.out.println("Enter Number of Units Consumed");
			units = in.nextInt();
			consumersArr[counter] = in.nextLine(); 
			
	
			}
			in.close();
			
			}
			
			void calculate()
			{
				if(units<=200)
					bill = 50;
				else if(units>200 && units<=500)
					bill = 50 + (units-200)*1.25;
				else if(units>500 && units<=1000)
					bill = 50 + 300*1.25 + (units-500)*1.00;
				else if(units>=1000)
					bill = 50 + 300*1.25+ 500*1.00 +(units-1000)*0.75;
			}
			

		    void print()
		    {
		        System.out.println("Name : " + n);
		        System.out.println("Units Consumed : " + units);
		        System.out.printf("Amount Due: %.2f", bill);
		    }
		    
		    public static void main(String args[])
		    {
		        ElectricBill obj = new ElectricBill();
		   
		        obj.accept();
		        obj.calculate();
		        obj.print();
		    }
		    
			}
		
		