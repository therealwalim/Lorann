/**
 *
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class ModelTest.
 *
 * @author Jean-Aymeric Diet
 */
public class ModelTest {
	private Model model;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@Before
	public void setUp() throws Exception {
		this.model = new Model();
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *           the exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetObservable() throws Exception {

	}

	@Test
	public void testGetMap() throws Exception {
		this.model.loadMap("MAP1");
		Assert.assertEquals("BHHHHHHHHHHHHHHHHHHB\n" +
				"V    V             V\n" +
				"V    V             V\n" +
				"V    V     P       V\n" +
				"V  P BHHHHHB       V\n" +
				"V P P1     K  L   CV\n" +
				"V  P BHHHHHB       V\n" +
				"V    V     P       V\n" +
				"V    V             V\n" +
				"V    V             V\n" +
				"V    V             V\n" +
				"BHHHHHHHHHHHHHHHHHHB", this.model.getMap());
	}

	@Test
	public void testLoadMap() throws Exception {

	}
}
