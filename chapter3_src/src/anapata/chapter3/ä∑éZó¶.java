package anapata.chapter3;

import java.util.List;
import java.util.Vector;

public class ���Z�� {

	private �P�� from = null;
	private �P�� to = null;
	private float rate = 0;

	private static List<���Z��> rates = new Vector<���Z��>();

	static{
		rates.add(new ���Z��(�P��.MM,�P��.CM, 10));
		rates.add(new ���Z��(�P��.CM,�P��.M, 100));
		rates.add(new ���Z��(�P��.FEET,�P��.INCH, 12));
	}
	public ���Z��(�P�� from, �P�� to, float rate) {
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public static float get���Z��(�P�� from, �P�� to) {
		for (���Z�� rate : rates){
			if(rate.from.equals(from)){
				if(rate.to.equals(to))return rate.rate;
//				try{
//					return rate.rate * get���Z��(rate.to, to);
//				}catch(RuntimeException ex){
//					//������Ȃ������玟�ɍs�������Ȃ̂ŏ����͂��Ȃ�
//				}
			}

		}
		for(���Z�� rate : rates){
			if(rate.from.equals(to) && rate.to.equals(from))
				return 1/rate.rate;
		}
		throw new RuntimeException("not supported");
	}
}
