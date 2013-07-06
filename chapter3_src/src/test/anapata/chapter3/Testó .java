package test.anapata.chapter3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import anapata.chapter3.�P��;
import anapata.chapter3.��;

public class Test�� {

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
	public void test�P�ʂ̕ϊ�_�T�|�[�g�O�̒P��() {
		�� feet2 = new ��(2, �P��.FEET);
		try{
			feet2.convertTo(�P��.CM);
		}catch(RuntimeException ex){
			assertEquals("not supported", ex.getMessage());
		}
	}
	@Test
	public void test�P�ʂ̕ϊ�_��() {
		�� feet2 = new ��(2, �P��.FEET);
		assertEquals(new ��(24, �P��.INCH), feet2.convertTo(�P��.INCH));
	}
	@Test
	public void test�P�ʂ̕ϊ�_�t() {
		�� inch12 = new ��(12, �P��.INCH);
		assertEquals(new ��(1, �P��.FEET), inch12.convertTo(�P��.FEET));
	}
	@Test
	public void test�P�ʂ̕ϊ�_�z�b�v() {
		�� mm1000 = new ��(1000, �P��.MM);
		assertEquals(new ��(1, �P��.M), mm1000.convertTo(�P��.M));
	}
}
