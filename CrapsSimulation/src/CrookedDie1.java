
public class CrookedDie1 extends Die
{
	public CrookedDie1()
	{
		CrapsGame.println("  CrookedDie1's constructor called.");

	}

	public int getLastRoll() // this OVERRIDES Die's getLastRoll(), replacing
								// it!
	{
		return 3;
	}

	public String toString() // this OVERRIDES Die's toString() *hint super
	{
		return "A CrookedDie1 always rolling 3, and... " + super.toString();
	}

	public static CrookedDie1 testingStatic()
	{
		//Creating new objects
		CrookedDie1 dieObjectA = new CrookedDie1();
		StdOut.println("Executing CrookedDie1's Static Method");
		return dieObjectA;
	}

}
