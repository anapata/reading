package anapata.chapter3;

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

	public float get換算率(Unit convert) {
		return ConvertRatio.get換算率(this, convert);
	}

	public boolean equals(Object compare){
		return this.name.equals(((Unit)compare).name);
	}

}
