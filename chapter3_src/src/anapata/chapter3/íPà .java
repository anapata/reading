package anapata.chapter3;

public class �P�� {

	public static final �P�� FEET = new �P��("FEET");
	public static final �P�� INCH = new �P��("INCH");
	public static final �P�� M = new �P��("M");
	public static final �P�� MM = new �P��("MM");
	public static final �P�� CM = new �P��("CM");

	private String name = null;
	public �P��(String name) {
		this.name = name;
	}

	public float get���Z��(�P�� convert) {
		return ���Z��.get���Z��(this, convert);
	}

	public boolean equals(Object compare){
		return this.name.equals(((�P��)compare).name);
	}

}
