package nestorcicardini.D4.entities.pizzas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import nestorcicardini.D4.entities.Consummation;

@Setter
@Getter
@ToString
public class Pizza extends Consummation { // Pizza base
	private String ingredientList;

	public Pizza() {
		this.name = "Margherita";
		this.calories = 1104;
		this.price = 4.99;
		this.ingredientList = "tomato, cheese";
	}

}
