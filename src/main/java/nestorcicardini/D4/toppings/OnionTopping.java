package nestorcicardini.D4.toppings;

import nestorcicardini.D4.entities.Consummation;

public class OnionTopping extends ToppingsDecorator {
	public OnionTopping(Consummation c) {
		super(c);
		this.name = "Onion";
		this.price = 0.69;
		this.calories = 22;

	}
}
