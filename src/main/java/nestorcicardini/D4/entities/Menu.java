package nestorcicardini.D4.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Slf4j
@Table(name = "menus")
@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	@OneToMany(mappedBy = "menu")
	private List<Product> productList = new ArrayList<>();

	public void printMenu() {
		this.productList.forEach(p -> log.info(p.toString()));
	}

}
