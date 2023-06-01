package nestorcicardini.D4.toppings;

import nestorcicardini.D4.entities.Consummation;

public class ToppingsDecorator extends Consummation {

	private Consummation decoratedPizza;

	public ToppingsDecorator(Consummation c) {
		this.decoratedPizza = c;
	}

	public String getName() {
		return this.decoratedPizza.getName() + "+" + this.name;
	}

	public int getCalories() {
		return this.decoratedPizza.getCalories() + this.calories;
	}

	public double getPrice() {
		return this.decoratedPizza.getPrice() + this.price;
	}

	@Override
	public String toString() {
		return this.getName() + ", Price: " + this.getPrice() + "€, Calories: "
				+ this.getCalories();
	}

	public String printTopping() {
		return this.name + ", Price: " + this.price + "€, Calories: "
				+ this.calories;
	}

}
