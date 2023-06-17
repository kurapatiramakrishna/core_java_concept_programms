class A
{
	public int i=10;
}
class B extends A
{
	public int j=20;
}
class C extends B
{
	public int k=36;
	public void Display()
	{
		System.out.println("This is super most class :"+i);
		System.out.println("This is super calss :"+j);
		System.out.println("This is sub class :"+k);
	}
}
class mainclass3
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.Display();

	}
}
