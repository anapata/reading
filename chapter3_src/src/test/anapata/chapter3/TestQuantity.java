package test.anapata.chapter3;

import anapata.chapter3.Unit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import anapata.chapter3.Quantity;

import static org.junit.Assert.assertEquals;

public class TestQuantity {

	@Test
	public void 単位の変換_サポート外の単位の場合例外を投げる() {
		Quantity feet2 = new Quantity(2, anapata.chapter3.Unit.FEET);
		try{
			feet2.convertTo(anapata.chapter3.Unit.CM);
		}catch(RuntimeException ex){
			assertEquals("not supported", ex.getMessage());
		}
	}
	@Test
	public void 単位の変換_登録済み単位についての変換を行う() {
		Quantity feet2 = new Quantity(2, anapata.chapter3.Unit.FEET);
		assertEquals(new Quantity(24, anapata.chapter3.Unit.INCH), feet2.convertTo(anapata.chapter3.Unit.INCH));
	}
	@Test
	public void 単位の変換_登録済みの単位について逆の変換もできることを確認する() {
		Quantity inch12 = new Quantity(12, anapata.chapter3.Unit.INCH);
		assertEquals(new Quantity(1, anapata.chapter3.Unit.FEET), inch12.convertTo(anapata.chapter3.Unit.FEET));
	}
//	@Test
//	public void 単位の変換_登録済みの単位について辿ることもできることを確認する() {
//		Quantity mm1000 = new Quantity(1000, anapata.chapter3.Unit.MM);
//		assertEquals(new Quantity(1, anapata.chapter3.Unit.M), mm1000.convertTo(Unit.M));
//	}
}
