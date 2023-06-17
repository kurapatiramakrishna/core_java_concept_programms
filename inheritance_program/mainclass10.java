class A
{
	public A(int a)
	{
		System.out.println("this is super class");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("this is sub class");
	}
}
class mainclass10
{
	public static void main(String[] args) 
	{
		B b1=new B();
	}
}
