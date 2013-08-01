package test.anapata.chapter3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import anapata.chapter3.CategoryObservation;
import anapata.chapter3.Human;
import anapata.chapter3.Measurement;
import anapata.chapter3.Observation;
import anapata.chapter3.Phenomenon;
import anapata.chapter3.PhenomenonType;
import anapata.chapter3.Quantity;

public class TestHuman {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test6Feet() {
		Human john = new Human();
		Quantity feet6 = new Quantity(6, anapata.chapter3.Unit.FEET);
		PhenomenonType pt = new PhenomenonType("身長");
		Measurement mea = new Measurement(feet6, pt);
		john.addObservations(mea);
		List<Observation> meas = john.getObservations();
		assertEquals(feet6, ((Measurement)meas.get(0)).getQuantity());
		assertEquals("身長", meas.get(0).getPhenomenonType().getName());
	}
	@Test
	public void testBloodGroup() {
		Human john = new Human();
		PhenomenonType pt = new PhenomenonType("血液型");
		CategoryObservation groupA = new CategoryObservation(new Phenomenon("血液型A"), pt);
		john.addObservations(groupA);
		List<Observation> meas = john.getObservations();
		assertEquals("血液型A", ((CategoryObservation)meas.get(0)).getPhenomenon().getName());
		assertEquals("血液型", meas.get(0).getPhenomenonType().getName());
	}

}
