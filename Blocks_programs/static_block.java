class Non-static_block 
{
	{
		System.out.println("non static block");
	}
	static
	{
	System.out.println("static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
        Non-static_block n=new Non-static_block ();
		System.out.println("main ends!");
	}
}
