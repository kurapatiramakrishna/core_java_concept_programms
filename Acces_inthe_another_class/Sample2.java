class Sample 
{
	public static int a=10;
	public static void ram() 
	{
		System.out.println("This is ram method");
	}
}
class Sample1
{
	public int b=20;
	public  void ram1() 
	{
		System.out.println("this is ram1 method");
	}
}
	class Sample2
	{
		public static void main(String[] args)
		{
			System.out.println("main starts");
			System.out.println(Sample.a);
			Sample.ram();
			Sample1 s1=new Sample1();
			s1.ram1();
			System.out.println(s1.b);
			System.out.println("main ends");
		}
}
