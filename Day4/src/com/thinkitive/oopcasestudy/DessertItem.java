package com.thinkitive.oopcasestudy;

public abstract class DessertItem {
	
	String name;
	
	public DessertItem() {
		// TODO Auto-generated constructor stub
	}
	
	public DessertItem(String name){
		this.name=name;
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract double getCost();

}
