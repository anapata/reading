package anapata.chapter3;

import java.util.List;
import java.util.Vector;

public class ConvertRatio {

	private Unit from = null;
	private Unit to = null;
	private float rate = 0;

	private static List<ConvertRatio> rates = new Vector<ConvertRatio>();

	static{
		rates.add(new ConvertRatio(anapata.chapter3.Unit.MM, anapata.chapter3.Unit.CM, 10));
		rates.add(new ConvertRatio(anapata.chapter3.Unit.CM, anapata.chapter3.Unit.M, 100));
		rates.add(new ConvertRatio(anapata.chapter3.Unit.FEET, anapata.chapter3.Unit.INCH, 12));
	}
	public ConvertRatio(Unit from, Unit to, float rate) {
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public static float getConvertRatio(Unit from, Unit to) {
		for (ConvertRatio rate : rates){
			if(rate.from.equals(from)){
				if(rate.to.equals(to))return rate.rate;
//				try{
//					return rate.rate * get換算率(rate.to, to);
//				}catch(RuntimeException ex){
//					//見つからなかったら次に行くだけなので処理はしない
//				}
			}

		}
		for(ConvertRatio rate : rates){
			if(rate.from.equals(to) && rate.to.equals(from))
				return 1/rate.rate;
		}
		throw new RuntimeException("not supported");
	}
}
