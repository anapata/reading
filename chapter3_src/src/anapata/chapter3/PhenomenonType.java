package anapata.chapter3;

import java.util.HashMap;
import java.util.Map;
/**
 * 現象型.
 * 「身長」「体重」「血液型」「体重の変化」など、どのような観測なのかを表す.
 * 現象型がどのような現象を取り得るのかの関連も保持する.
 * 例、「血液型」という現象型の場合、「A」「B」「AB」「O」という現象のみ取り得る.
 * 
 * @see Phenomenon
 * @see Observation
 * @author shibamiya
 *
 */
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
