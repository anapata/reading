package anapata.chapter3;

import java.util.HashMap;
import java.util.Map;

public class PhenomenonType {
	
	static Map<String,Phenomenon[]> knownPhenomenonList = new HashMap<String,Phenomenon[]>();
	static{
		knownPhenomenonList.put("血液型",new Phenomenon[]{new Phenomenon("血液型A"),new Phenomenon("血液型B"),new Phenomenon("血液型AB"),new Phenomenon("血液型O")});
	}
	
	private String name = null;

	public PhenomenonType(String name) {
		this.name = name;
	}
	
	public Phenomenon[] getKnownPhenomenonList(){
		return knownPhenomenonList.get(name);
	}

	public String getName() {
		return name;
	}

}
