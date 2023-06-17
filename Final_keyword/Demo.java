class Demo 
{
	public static void main(String[] args)     // here error accure why because remove reinitialization then it will work
	{
		final int a=10;
		a=20;
		System.out.println(a);
	}
}
