package anapata.chapter3;

public class —Ê {
	public float quantity;
	public ’PˆÊ unit;

	public —Ê(float quantity, ’PˆÊ unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

	public —Ê convertTo(’PˆÊ convert) {
		return new —Ê(unit.getŠ·ŽZ—¦(convert) * quantity, convert);
	}

	public boolean equals(Object compare) {
		return (this.quantity == ((—Ê) compare).quantity)
				&& this.unit.equals(((—Ê) compare).unit);
	}
}
