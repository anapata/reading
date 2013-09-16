package anapata.chapter3;
/**
 * カテゴリ観測.
 * カテゴリ(現象)で測定される観測のこと.
 */
public class CategoryObservation extends Observation {

	private Phenomenon phenomenon = null;
	
	public CategoryObservation(Phenomenon phenomenon, PhenomenonType pt) {
		super(pt);
		this.phenomenon = phenomenon;
		checkPhenomenon(pt,phenomenon);
	}
	/**
	 * 現象のチェック.
	 * 現象型に対して規定された現象が設定されているかをチェックする.
	 * 例、現象型が血液型の場合はA/B/AB/Oのいずれかであることをチェックする.
	 * @param pt 現象型
	 * @param phenomenon 現象
	 */
	private void checkPhenomenon(PhenomenonType pt, Phenomenon phenomenon) {
		for(Phenomenon pheno : pt.getKnownPhenomenonList()){
			if (pheno.equals(phenomenon)) return;
		}
		throw new RuntimeException(pt.getName()+"には"+phenomenon.getName()+"は設定できません");
	}
	
	public Phenomenon getPhenomenon(){
		return phenomenon;
	}
	
	

}
