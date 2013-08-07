package anapata.chapter3;

public class CategoryObservation extends Observation {
	private Phenomenon phenomenon = null;
	public CategoryObservation(Phenomenon phenomenon, PhenomenonType pt) {
		super(pt);
		checkPhenomenon(pt,phenomenon);
		this.phenomenon = phenomenon;
	}
	private void checkPhenomenon(PhenomenonType pt, Phenomenon phenomenon2) {
		for(Phenomenon pheno : pt.getKnownPhenomenonList()){
			if (pheno.equals(phenomenon2)) return;
		}
		throw new RuntimeException(pt.getName()+"には"+phenomenon2.getName()+"は設定できません");
	}
	public Phenomenon getPhenomenon(){
		return phenomenon;
	}
	
	

}
