package com.app.billGenerator;

public class PizzaBillGeneratorApp {

	public static void main(String[] args) {
		
//		pizza basePizza = new pizza(false);
//		basePizza.getPizzaPrice();
//		basePizza.addExtraCheese();
//		basePizza.addExtraToppings();
//		basePizza.TakeAway();
//		basePizza.getBill();
		
		DeluxePizza deluxePizza = new DeluxePizza(true);
//		deluxePizza.addExtraCheese();  if i add here extra cheese and toppings this should not addup so we overridded an empty addExtraCheese() and addExtraToppings() Methods
//		deluxePizza.addExtraToppings(); now evn if we add extra's here no change is reflected..This is not a good practice anyway
		
		deluxePizza.TakeAway();
		deluxePizza.getBill();
		
	}
}
