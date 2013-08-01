package anapata.chapter3;

public class CategoryObservation extends Observation {
	private Phenomenon phenomenon = null;
	public CategoryObservation(Phenomenon phenomenon, PhenomenonType pt) {
		super(pt);
		this.phenomenon = phenomenon;
	}
	public Phenomenon getPhenomenon(){
		return phenomenon;
	}
	
	

}
