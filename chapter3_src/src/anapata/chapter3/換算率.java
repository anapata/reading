package anapata.chapter3;

import java.util.List;
import java.util.Vector;

public class 換算率 {

	private 単位 from = null;
	private 単位 to = null;
	private float rate = 0;

	private static List<換算率> rates = new Vector<換算率>();

	static{
		rates.add(new 換算率(anapata.chapter3.単位.MM, anapata.chapter3.単位.CM, 10));
		rates.add(new 換算率(anapata.chapter3.単位.CM, anapata.chapter3.単位.M, 100));
		rates.add(new 換算率(anapata.chapter3.単位.FEET, anapata.chapter3.単位.INCH, 12));
	}
	public 換算率(単位 from, 単位 to, float rate) {
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public static float get換算率(単位 from, 単位 to) {
		for (換算率 rate : rates){
			if(rate.from.equals(from)){
				if(rate.to.equals(to))return rate.rate;
//				try{
//					return rate.rate * get換算率(rate.to, to);
//				}catch(RuntimeException ex){
//					//見つからなかったら次に行くだけなので処理はしない
//				}
			}

		}
		for(換算率 rate : rates){
			if(rate.from.equals(to) && rate.to.equals(from))
				return 1/rate.rate;
		}
		throw new RuntimeException("not supported");
	}
}
