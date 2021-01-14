package com.thinkitive.oopcasestudy;

public class Sundae extends Icecream {
	
	public Sundae() {
		super();
		
	}

	public Sundae(String name) {
		super(name);
		this.toppings_cost=20;
	}

	double toppings_cost;
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+this.toppings_cost;
	}
	


}
