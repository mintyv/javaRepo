package com.training.mars;

		
		class Calc_Bill {
		    public static void main(String args[]){
		    	ComputeElectricBill obj=new ComputeElectricBill();
		        obj.setData(101,"Jhon",351);                   
		        double billPay=obj.balanceCalc();            
		        obj.display();                                 
		        System.out.println("bill to pay: "+billPay);    
		    }
		    
		}
		 
