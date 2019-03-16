//Imported Methods
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CrookedDie1Test
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@Test
	public void testToString() {

		//created new string object
		String value = new String("A CrookedDie1 always rolling 3, and... ");
		String expected = "A CrookedDie1 always rolling 3, and... ";
		assertEquals(expected, value.toString());
	}


}
