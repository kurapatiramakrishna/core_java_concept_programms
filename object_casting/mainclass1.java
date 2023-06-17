class A
{
	public void wings()
	{
		System.out.println("use wings to control navigation");    //super class
	}
}
class B extends A
{
	public void wheels()
	{
		System.out.println("use wheels for ground");            // sub class
	}
}
class mainclass1 
{
	public static void main(String[] args) 
	{
		A a1=(A)new B();
		a1.wings();
		B b1=(B)a1;
		b1.wings();
		b1.wheels();

	}
}
