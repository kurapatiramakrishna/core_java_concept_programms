class redmi
{
	public static int a=10;
	public void ram() 
	{
		System.out.println("This is ram non-static-method");
		oppo r1=new oppo();
		System.out.println(r1.b);
	}
}
class oppo
{
	public int b=20;
	public  static void ram1() 
	{
		System.out.println("this is ram1 static method");
		System.out.println(redmi.a);
	}
}
	class Mobile
	{
		public static void main(String[] args)
		{
			System.out.println("main starts");
			redmi r1=new redmi();
			r1.ram();
			oppo.ram1();
			System.out.println("main ends");
		}
}
