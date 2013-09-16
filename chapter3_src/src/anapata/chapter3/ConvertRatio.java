package anapata.chapter3;

import java.util.List;
import java.util.Vector;

/**
 * 変換率.
 * 単位の変換率を保持する.
 * 予め決められた単位と単位の変換率を保持し、指定された単位の変換率を取得して返す.
 * 
 * @author shibamiya
 *
 */
public class ConvertRatio {

	private Unit from = null;
	private Unit to = null;
	private float rate = 0;

	/**
	 * 単位の変換率を保持する.
	 */
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
	
	/**
	 * 変換率を取得する.
	 * パラメータで指定された単位の変換率を返す.
	 * 保持している単位の関係から変換率を返すが、単純に登録された変換率だけではなく、逆方向の変換率、再帰的に取得可能な変換率も返す.
	 * 例、(mm, cm, 0.1)の関係が登録されている場合、fromにmm, toにcmが指定された場合は0.1を返すが、fromにcm, toにmmの場合は10を返す.
	 * 更に(cm, m, 0.01)の関係が登録されている場合、fromにmm, toにmが指定された場合は再帰的に取得して0.001を返す.
	 * @param from 変換元の単位
	 * @param to 変換先の単位
	 * @return 変換率
	 */
	public static float getConvertRatio(Unit from, Unit to) {
		//順方向の変換率を探す
		for (ConvertRatio rate : rates){
			if(rate.from.equals(from)){
				if(rate.to.equals(to))return rate.rate;
//				try{
//					//再帰的な変換率を探す
//					return rate.rate * get換算率(rate.to, to);
//				}catch(RuntimeException ex){
//					//見つからなかったら次に行くだけなので処理はしない
//				}
			}

		}
		//逆方向の変換率を探す
		for(ConvertRatio rate : rates){
			if(rate.from.equals(to) && rate.to.equals(from))
				return 1/rate.rate;
		}
		throw new RuntimeException("not supported");
	}
}
