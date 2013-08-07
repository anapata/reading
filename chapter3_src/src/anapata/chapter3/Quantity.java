package anapata.chapter3;

/**
 * 量.
 * 数値と単位を保持し、量を表す.
 * 例、10kg, 5m, 100円,,,
 * @author shibamiya
 *
 */
public class Quantity {
	public float quantity;
	public Unit unit;

	public Quantity(float quantity, Unit unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

	/**
	 * 単位の変換.
	 * 現在の単位から指定された単位に変換して新しいQuantityを返す.
	 * 例、100cm → 1m
	 * @param convert 変換先の単位
	 * @return 変換された新しいQuantity
	 */
	public Quantity convertTo(Unit convert) {
		return new Quantity(unit.getConvertRatio(convert) * quantity, convert);
	}

	public boolean equals(Object compare) {
		return (this.quantity == ((Quantity) compare).quantity)
				&& this.unit.equals(((Quantity) compare).unit);
	}
}
