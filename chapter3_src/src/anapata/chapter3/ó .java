package anapata.chapter3;

public class �� {
	public float quantity;
	public �P�� unit;

	public ��(float quantity, �P�� unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

	public �� convertTo(�P�� convert) {
		return new ��(unit.get���Z��(convert) * quantity, convert);
	}

	public boolean equals(Object compare) {
		return (this.quantity == ((��) compare).quantity)
				&& this.unit.equals(((��) compare).unit);
	}
}
