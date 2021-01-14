package com.thinkitive.oopcasestudy;

public class Candy extends DessertItem {

	double weight_gms, price_kg;

	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, double weight_gms) {
		super(name);
		this.weight_gms = weight_gms;
		this.price_kg=100;
	}

	@Override
	public double getCost() {
		return (this.weight_gms * this.price_kg) / 1000;
	}

}
