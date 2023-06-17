class Phone
{
	public void change()
	{
		System.out.println("for company ringtone");
	}
	public void change1()
	{
		System.out.println("for user choice");
	}
}
class Modifing extends Phone
{
	public void change1()
	{
		System.out.println("user can change the ringtone");
	}
}
class mainclass2
{
	public static void main(String[] args) 
	{
		Modifing modifing=new Modifing();
		modifing.change1();
	}
}
