package anapata.chapter3;

import java.util.List;
import java.util.Vector;

public class Š·Z—¦ {

	private ’PˆÊ from = null;
	private ’PˆÊ to = null;
	private float rate = 0;

	private static List<Š·Z—¦> rates = new Vector<Š·Z—¦>();

	static{
		rates.add(new Š·Z—¦(’PˆÊ.MM,’PˆÊ.CM, 10));
		rates.add(new Š·Z—¦(’PˆÊ.CM,’PˆÊ.M, 100));
		rates.add(new Š·Z—¦(’PˆÊ.FEET,’PˆÊ.INCH, 12));
	}
	public Š·Z—¦(’PˆÊ from, ’PˆÊ to, float rate) {
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public static float getŠ·Z—¦(’PˆÊ from, ’PˆÊ to) {
		for (Š·Z—¦ rate : rates){
			if(rate.from.equals(from)){
				if(rate.to.equals(to))return rate.rate;
//				try{
//					return rate.rate * getŠ·Z—¦(rate.to, to);
//				}catch(RuntimeException ex){
//					//Œ©‚Â‚©‚ç‚È‚©‚Á‚½‚çŸ‚És‚­‚¾‚¯‚È‚Ì‚Åˆ—‚Í‚µ‚È‚¢
//				}
			}

		}
		for(Š·Z—¦ rate : rates){
			if(rate.from.equals(to) && rate.to.equals(from))
				return 1/rate.rate;
		}
		throw new RuntimeException("not supported");
	}
}
