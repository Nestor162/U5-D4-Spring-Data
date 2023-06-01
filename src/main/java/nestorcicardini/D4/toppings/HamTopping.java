package nestorcicardini.D4.toppings;

import nestorcicardini.D4.entities.Consummation;

public class HamTopping extends ToppingsDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Ham";
		this.price = 0.99;
		this.calories = 35;

	}
}
