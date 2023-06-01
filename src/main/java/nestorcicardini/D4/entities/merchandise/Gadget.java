package nestorcicardini.D4.entities.merchandise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nestorcicardini.D4.entities.Product;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gadget extends Product {
	private gadgetType type;

	public enum gadgetType {
		shirt, mug, other
	}

	@Override
	public String toString() {
		return "Gadget [type=" + type + ", name=" + name + ", price=" + price
				+ "]";
	}

}
