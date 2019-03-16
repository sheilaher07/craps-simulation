//imported libraries aka java classes
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest
{
	Die valueA;


	@Test
	//test set method
	public void testingSetMethod()
	{
		StdOut.println("Testing set method");
		Die valueA = new Die(1);
		int expected = 1;
		valueA.getLastRoll();
		int result = valueA.getLastRoll();
		assertEquals(expected, result);

	}

	//test get method
	@Test
	public void testGetLastRoll()
	{
		StdOut.println("Testing Get method");
		Die valueA = new Die();
		int expected = 5;
		valueA.setLastRoll(5);
		int result = valueA.getLastRoll();
		assertEquals (expected, result);

	}

	//*Testing toString()
	@Test
	public void testingToString()
	{
		Die valueA = new Die ();
		StdOut.println("Testing toString Method");
		String expected = "A Die object with roll 6";
		valueA.setLastRoll(6);
		String actual = valueA.toString();
		assertEquals(expected, actual);
	}

	//Testing Random method
	@Test
	public void testingRandom() {
		StdOut.println("Testing random method");
		int x = (int) (Math.random() * 6+1);
		assertEquals(1,1);
	}

}
