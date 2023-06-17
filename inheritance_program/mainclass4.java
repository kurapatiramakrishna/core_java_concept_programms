class judge
{
public String file=" marder case";
}
class lawyer extends judge
{
 public void Display()
	{
	System.out.println("lawyer take the marder case:");
  }
}
class criminal extends lawyer
{
	public void Display1()
	{
	System.out.println("criminal attempt the marder:");
	 Display();
	}
}
class mainclass4 
{
	public static void main(String[] args) 
	{
		criminal c1=new criminal();
		c1.Display1();
	}
}
