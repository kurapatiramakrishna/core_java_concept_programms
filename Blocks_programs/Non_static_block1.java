class Non_static_block1
{
	public static int a;
	static
	{
		b=50;
		System.out.println("This is staic block");
		Non_static_block1 n=new Non_static_block1();
	}
	{
		System.out.println("non static block-1");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main sarts");
		Non_static_block1 n1=new Non_static_block1();
		System.out.println("main ends");
	}
	public static int b;
	static 
	{
		a=60;
		System.out.println("static block1");
	}
	{
		System.out.println("non static block");
		System.out.println(b);
	}
}
