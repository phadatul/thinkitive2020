package com.thinkitive.oopcasestudy;

public class Checkout {
	DessertItem cashRegister[];

	public void addItems(DessertItem items[]) {
		this.cashRegister = items;
	}

	public void clearCart() {
		if (cashRegister != null) {
			cashRegister = null;
		} else {
			System.err.println("Cart is empty!!!!!");
		}
	}

	public int getNumberOfItems() {
		if (cashRegister != null) {
			return cashRegister.length;
		} else {
			System.err.println("Cart is empty!!!!!");
			return 0;
		}
	}

	public double getTotalCost() {
		double total = 0;
		if (cashRegister != null) {

			for (DessertItem d : cashRegister) {
				total = total + d.getCost();
			}

			return total;
		} else {
			System.err.println("Cart is empty!!!!!");
			return 0;
		}
	}

	@Override
	public String toString() {
		System.out.println("#################   Invoice  ################");
		String s = "";

		double total = 0;
		if (cashRegister != null) {

			for (DessertItem d : cashRegister) {
				s = s + d.getName() + "<====     ====>" + d.getCost()+"\n";
			}
			s = s + " TOTAL " + "<====     ====>" + this.getTotalCost();

			return s;
		} else {
			System.err.println("Cart is empty!!!!!");
			return s;
		}

	}

}
