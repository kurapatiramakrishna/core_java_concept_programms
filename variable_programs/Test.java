class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...!");
		info();
		Test o1=new Test();
		o1.result();
		System.out.println("main ends...!");
	}
	public static void info()
	{
		int n=12;
		System.out.println(n);
	}
	public void result()
	{
		double d=12.23;
		System.out.println(d);
	}


}
