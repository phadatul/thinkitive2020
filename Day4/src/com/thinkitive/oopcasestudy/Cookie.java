package com.thinkitive.oopcasestudy;

public class Cookie extends DessertItem {

	int no_of_units;
	double price_dozen;

	public Cookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name, int no_of_units) {
		super(name);
		this.no_of_units = no_of_units;
		this.price_dozen = 120;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (this.price_dozen*this.no_of_units)/12;
	}

}
