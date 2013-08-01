package anapata.chapter3;

import java.util.List;
import java.util.Vector;

public class Human {
	
	List<Observation> observations = new Vector<Observation>();

	public void addObservations(Observation obs) {
		observations.add(obs);
	}

	public List<Observation> getObservations() {
		return observations;
	}
	
	

}
