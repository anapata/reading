package anapata.chapter3;

public class Quantity {
	public float quantity;
	public Unit unit;

	public Quantity(float quantity, Unit unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

	public Quantity convertTo(Unit convert) {
		return new Quantity(unit.get換算率(convert) * quantity, convert);
	}

	public boolean equals(Object compare) {
		return (this.quantity == ((Quantity) compare).quantity)
				&& this.unit.equals(((Quantity) compare).unit);
	}
}
