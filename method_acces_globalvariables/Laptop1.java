class Laptop1
{
	public  int a=20;
	public void ram()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Laptop l1=new Laptop();
		l1.ram();
		System.out.println("main starts...");
	}
}
