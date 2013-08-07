package anapata.chapter3;

public class Phenomenon  {
	private String name = null;
	public Phenomenon(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	@Override
	public boolean equals(Object o){
		return name.equals(((Phenomenon)o).getName());
	}

}
