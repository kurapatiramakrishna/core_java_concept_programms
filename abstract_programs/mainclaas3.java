abstract class Irctc
{
	abstract public void travel1();
	abstract public void travel2();
}
abstract class  Humans extends Irctc
{
	public void travel1()
	{
		System.out.println("for travelling Humans");
	}
}
class Animals extends Humans
{
	public void travel2()
	{
	System.out.println("for travelling animals");
	}
}
class mainclaas3
{
	public static void main(String[] args) 
	{
		Animals animal=new Animals();
		animal.travel1();
		animal.travel2();
	}
}
