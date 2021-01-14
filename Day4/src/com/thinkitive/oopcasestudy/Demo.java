package com.thinkitive.oopcasestudy;

public class Demo {
	public static void main(String[] args) {
		Candy candy = new Candy("Orange Candy", 250);
		Cookie cookie = new Cookie("Blueberry Cookies", 6);
		Icecream icecream = new Icecream("vanilla ");
		Sundae sundae = new Sundae("Vanilla with Cherry");

		DessertItem items[] = { sundae, icecream, cookie, candy };
		Checkout cart=new Checkout();
		cart.addItems(items);
		System.out.println(cart);
		cart.clearCart();
		System.out.println(cart);
	}

}
