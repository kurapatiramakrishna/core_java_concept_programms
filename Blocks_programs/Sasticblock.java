class Sasticblock
{
	static 
	{
	  System.out.println("This is static block-1...!!");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println("main ends");
	}
	static
	{
		System.out.println("this is static block-2....!!");
	}
}
// it doen't matter where to write but it will print order static blocks..