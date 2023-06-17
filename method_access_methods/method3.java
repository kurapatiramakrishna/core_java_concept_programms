class method3
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		ball();
		System.out.println("main ends...");
	}
	public static void ball() 
	{
		System.out.println("ball starts..");
		method3 m1=new method3();
		m1.ball1();
		System.out.println("ball ends...");
	}
	public void ball1() 
	{
		System.out.println("ball1  starts..");

		System.out.println("ball1 ends...");
	}
}
