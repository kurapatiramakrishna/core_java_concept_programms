class Ststicblock1
{
	public static int a;
	static 
	{
	  a=20;
	  System.out.println("This is static block-1...!!");
	  System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println("main ends");
	}
	static
	{
		a=10;
		System.out.println("this is static block-2....!!");
		System.out.println(a);
	}
}
