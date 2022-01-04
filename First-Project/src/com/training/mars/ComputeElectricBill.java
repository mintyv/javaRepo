package com.training.mars;



	class ComputeElectricBill{
		int consumerId;
		String name;
		int units;

		void setData(int id, String name, int units)
		{
		consumerId=id;
		this.name=name;
		this.units=units;
		}

		void display()
		{
		System.out.println("Consumer id: "+consumerId);
		System.out.println("Consumer Name: "+name);
		System.out.println("Consumed unit: "+units);

		}

		double balanceCalc(){
		double billAmount=0.0;
		if(units>0 && units<=100)
		billAmount=units*1.5;
		else if(units>100 && units<=200)
		billAmount=100*1.5+(units-100)*3;
		else if(units>200 && units<=300)
		billAmount=(100*1.5)+200*3+(units-200)*5;

		else if(units>350)
		billAmount=(100*1.5)+200*3+(300-200)*5+(units-350)*6;

		else
		System.out.println("No charges");
		System.out.println("bill to pay: "+billAmount);
		return billAmount;
		}
		}
	class Calc_Bill {
	    public static void main(String args[]){
	    	ComputeElectricBill obj=new ComputeElectricBill();
	        obj.setData(101,"Jhon",351);                   
	        double billPay=obj.balanceCalc();            
	        obj.display();                                 
	        System.out.println("bill to pay: "+billPay);    
	    }
	    
	}
	 
		