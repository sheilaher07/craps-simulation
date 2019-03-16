import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrookedDie2Test
{
	//creating variable and connecting w/class CrookedDie2
	CrookedDie2 CD2Test;



	@Test
	public void testToString()
	{
		//object creation
		CD2Test = new CrookedDie2();
		//testing toString method from CrookedDie2 class
		String expected = "A CrookedDie2 rolling 1,2,3,4,5,6 in sequence, and... ";
		String actual = CD2Test.toString();
		assertEquals(expected, actual);

	}

}
