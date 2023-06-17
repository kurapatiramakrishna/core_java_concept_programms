class Acs
{
	public void Acs()
	{
		System.out.println("to use cooling perpose");
	}
}
class central extends Acs
{
	public void central()
	{
	 System.out.println("to use for big hall");
	}
}
class split extends Acs
{
	public void split()
	{
	 System.out.println("to use for mini hall");
	}
}
class mainclass3 
{
	public static void main(String[] args) 
	{
	 Acs a1	=(Acs)new central();  // up casting   1st class
	 a1.Acs();
	 central s=(central)a1; // down casting    1st class
	 s.Acs();
	 s.central();
	 System.out.println();
	Acs a2=(Acs)new split();    // up casting of 2nd class
	a2.Acs();
	split c=(split)a2;        //down casting of 2nd class
	c.Acs();
	c.split();
	}
}
