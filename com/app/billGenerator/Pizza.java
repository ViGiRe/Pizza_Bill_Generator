package com.app.billGenerator;

public class Pizza {

	private int price;
	private Boolean veg;
	
	private int addExtraCheese = 100;
	private int addExtraToppings = 150;
	private int backPackPrice = 50;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean TakeAwayIsOpted = false;
	
	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		
		if (this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
//	public void getPizzaPrice() {
//		System.out.println(basePizzaPrice);
//	}

	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
//		System.out.println("Extra Cheese Added");
		this.price += addExtraCheese;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
//		System.out.println("Extra Toppings Added");
		this.price += addExtraToppings;
	}
	
	public void TakeAway() {
		TakeAwayIsOpted = true;
//		System.out.println("Take Away Opted");
		this.price += backPackPrice;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Pizza "+basePizzaPrice);
		
		if (isExtraCheeseAdded) {
			bill += "Extra Cheese Added "+addExtraCheese+"\n";
		}
		if (isExtraToppingsAdded) {
			bill += "Extra Toppings Added "+addExtraToppings+"\n";
		}
		if (TakeAwayIsOpted) {
			bill += "Take Away "+backPackPrice+"\n";
		}
		bill += "Bill "+this.price+"\n";
		System.out.println(bill);
	}
}
