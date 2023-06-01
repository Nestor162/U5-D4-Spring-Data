package nestorcicardini.D4.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderNumber;
	private List<Product> menuItems;
	private OrderStatus orderStatus;
	private int occupancy;
	private String orderTime;
	private double totalAmount;
	private double occupancyPrice;
	private String notes;

	@ManyToOne
	private TableInfo table;

	public enum OrderStatus {
		READY, IN_PROGRESS, SERVED
	}

	public Order(List<Product> orederedItems, int orderNumber,
			OrderStatus orderStatus, int occupancy, String orderTime,
			double occupancyPrice, TableInfo table, String notes) {
		super();
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		this.occupancy = occupancy;
		this.orderTime = orderTime;
		this.occupancyPrice = occupancyPrice;
		this.table = table;
		this.menuItems = orederedItems;
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", menuItems=" + menuItems
				+ ", orderStatus=" + orderStatus + ", occupancy=" + occupancy
				+ ", orderTime=" + orderTime + ", totalAmount=" + totalAmount
				+ ", occupancyPrice=" + occupancyPrice + ", table=" + table
				+ ", notes=" + notes + "]";
	}

}
