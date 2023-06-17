class Non_static_block 
{
	  // this is non static block
	{
		System.out.println("non static block");
	}
	// this non static block
	static
	{
	System.out.println("static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		// we must create object for non static block
        Non_static_block n=new Non_static_block ();
		System.out.println("main ends!");
	}
}
