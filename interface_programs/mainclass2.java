interface Sample
{
	void test();
}
interface Sample1 extends Sample
{
	void test1();
}
interface Sample2 extends Sample
{
	void test2();
}
class Demo implements Sample
{
	public void test()
	{
		System.out.println("test is completed");
	}
	public void test1()
	{
	   System.out.println("test1 is completed");
	}
}
class Demo1 implements Sample2
{
	public void test()
	{
		System.out.println("test is completed");
	}
	public void test2()
	{
		System.out.println("test2 is completed");
	}
}

class mainclass2 
{
	public static void main(String[] args) 
	{
		Demo rv=new Demo();
		rv.test();
		rv.test1();
		System.out.println();
		Demo1 rv1=new Demo1();
		rv1.test();
		rv1.test2();
	}
}
