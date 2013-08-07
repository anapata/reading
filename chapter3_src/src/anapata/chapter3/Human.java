package anapata.chapter3;

import java.util.List;
import java.util.Vector;

/**
 * 人.
 * 観測を保持する.
 * @author shibamiya
 *
 */
public class Human {
	
	List<Observation> observations = new Vector<Observation>();

	public void addObservations(Observation obs) {
		observations.add(obs);
	}

	public List<Observation> getObservations() {
		return observations;
	}

}
