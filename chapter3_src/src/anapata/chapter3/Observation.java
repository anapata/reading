package anapata.chapter3;
/**
 * 観測.
 * @author shibamiya
 *
 */
public class Observation {
	private PhenomenonType pt = null;
	
	public Observation(PhenomenonType pt){
		this.pt = pt;
	}

	public PhenomenonType getPhenomenonType() {
		return pt;
	}

}
