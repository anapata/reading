package anapata.chapter3;

public class 単位 {

	public static final 単位 FEET = new 単位("FEET");
	public static final 単位 INCH = new 単位("INCH");
	public static final 単位 M = new 単位("M");
	public static final 単位 MM = new 単位("MM");
	public static final 単位 CM = new 単位("CM");

	private String name = null;
	public 単位(String name) {
		this.name = name;
	}

	public float get換算率(単位 convert) {
		return 換算率.get換算率(this, convert);
	}

	public boolean equals(Object compare){
		return this.name.equals(((単位)compare).name);
	}

}
