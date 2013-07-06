package test.anapata.chapter3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import anapata.chapter3.単位;
import anapata.chapter3.量;

public class Test量 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test単位の変換_サポート外の単位() {
		量 feet2 = new 量(2, 単位.FEET);
		try{
			feet2.convertTo(単位.CM);
		}catch(RuntimeException ex){
			assertEquals("not supported", ex.getMessage());
		}
	}
	@Test
	public void test単位の変換_正() {
		量 feet2 = new 量(2, 単位.FEET);
		assertEquals(new 量(24, 単位.INCH), feet2.convertTo(単位.INCH));
	}
	@Test
	public void test単位の変換_逆() {
		量 inch12 = new 量(12, 単位.INCH);
		assertEquals(new 量(1, 単位.FEET), inch12.convertTo(単位.FEET));
	}
	@Test
	public void test単位の変換_ホップ() {
		量 mm1000 = new 量(1000, 単位.MM);
		assertEquals(new 量(1, 単位.M), mm1000.convertTo(単位.M));
	}
}
