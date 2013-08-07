package anapata.chapter3;

/**
 * 測定.
 * 量で測定可能な観測のこと.
 * @author shibamiya
 *
 */
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
