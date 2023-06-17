abstract class Engine
{
	public void body1()
	{
		System.out.println("engine is attcthed but body is not");
	}
	abstract public void body();

}
class Bike extends Engine
{
	public void body()
	{
		System.out.println("engine is attactched to the body");
	}
}
class mainclaas1
{
	public static void main(String[] args) 
	{
		Bike bike=new Bike();
		bike.body1();
		bike.body();
	}
}
