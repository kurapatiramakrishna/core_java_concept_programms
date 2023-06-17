class laptop
{
	public laptop(int a)
	{
		// dont initialized a value  here you get an error
		System.out.println("the value of a is: "+a);
	}
}
class Laptop1 
{
	public static void main(String[] args) 
	{

	laptop l1=new laptop(15);
	laptop l2=new laptop(16);
	laptop l3=new laptop(20);

	}
}
