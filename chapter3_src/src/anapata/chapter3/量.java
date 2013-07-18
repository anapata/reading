package anapata.chapter3;

public class 量 {
	public float quantity;
	public 単位 unit;

	public 量(float quantity, 単位 unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

	public 量 convertTo(単位 convert) {
		return new 量(unit.get換算率(convert) * quantity, convert);
	}

	public boolean equals(Object compare) {
		return (this.quantity == ((量) compare).quantity)
				&& this.unit.equals(((量) compare).unit);
	}
}
