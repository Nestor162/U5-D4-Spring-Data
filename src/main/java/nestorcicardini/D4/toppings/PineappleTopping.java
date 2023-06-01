package nestorcicardini.D4.toppings;

import nestorcicardini.D4.entities.Consummation;

public class PineappleTopping extends ToppingsDecorator {
	public PineappleTopping(Consummation c) {
		super(c);
		this.name = "Pineapple";
		this.price = 0.79;
		this.calories = 24;

	}
}
