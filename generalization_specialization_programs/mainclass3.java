class Phone
{
	public void perpose()
	{
		System.out.println("for calling perpose");
	}
	public void Phone()
	{
		System.out.println("for internet  perpose");
	}

}
class Charger extends Phone
{
	public void perpose()
	{
		System.out.println("for charging perpose");
	}
}
class mainclass3
{
	public static void main(String[] args) 
	{
		Charger charger=new Charger();
		charger.perpose();
	}
}
