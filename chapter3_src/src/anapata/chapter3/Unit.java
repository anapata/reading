package anapata.chapter3;
/**
 * 単位.
 */
public class Unit {

	public static final Unit FEET = new Unit("FEET");
	public static final Unit INCH = new Unit("INCH");
	public static final Unit M = new Unit("M");
	public static final Unit MM = new Unit("MM");
	public static final Unit CM = new Unit("CM");

	private String name = null;
	public Unit(String name) {
		this.name = name;
	}

	/**
	 * 換算率の取得
	 */
	public float getConvertRatio(Unit convert) {
		return ConvertRatio.getConvertRatio(this, convert);
	}

	public boolean equals(Object compare){
		return this.name.equals(((Unit)compare).name);
	}

}
