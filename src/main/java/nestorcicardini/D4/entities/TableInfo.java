package nestorcicardini.D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tables")
public class TableInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tableNumber;
	private int maxCapacity;
	private boolean occupied;

	enum TableStatus {
		OCCUPIED, AVAILABLE
	}

	public TableInfo(int tableNumber, int maxOccupancy, boolean status) {
		super();
		this.tableNumber = tableNumber;
		this.maxCapacity = maxOccupancy;
		this.occupied = status;
	}

}
