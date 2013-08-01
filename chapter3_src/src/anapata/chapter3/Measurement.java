package anapata.chapter3;

public class Measurement extends Observation {
	private Quantity quantity = null;
	public Measurement(Quantity quantity, PhenomenonType pt) {
		super(pt);
		this.quantity = quantity;
	}

	public Quantity getQuantity() {
		return quantity;
	}
}
