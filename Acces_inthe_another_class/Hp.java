class Dell
{
	public static int a=10;
	public static void ram() 
	{
		System.out.println("This is ram method");
		System.out.println(a);
	}
}
class Hcl
{
	public int b=20;
	public  void ram1() 
	{
		System.out.println("this is ram1 method");
		System.out.println(b);
	}
}
	class Hp
	{
		public static void main(String[] args)
		{
			System.out.println("main starts");
			Dell.ram();
			Hcl s1=new Hcl();
			s1.ram1();
			System.out.println("main ends");
		}
}