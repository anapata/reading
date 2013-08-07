package anapata.chapter3;

/**
 * 現象.
 * ある現象型に属する現象を表す.例えば「血液型」という現象に対しては「A」「B」「AB」「O」などが現象となる.
 * また、「体重の変化」という現象に対しては「減少」「増加」「変化なし」といったものも現象となる.
 * @author shibamiya
 *
 */
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
