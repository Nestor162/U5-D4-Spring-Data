package nestorcicardini.D4.entities.drinks;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nestorcicardini.D4.entities.Consummation;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Drink")
public abstract class Drink extends Consummation {
	private double size;

	@Override
	public String toString() {
		return name + " " + size + ", calories=" + calories + ", price=" + price
				+ "]";
	}

}
