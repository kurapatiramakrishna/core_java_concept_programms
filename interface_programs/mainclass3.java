interface Sample6
{
	void test6();
}
interface Sample7
{
	void test7();
}
interface Smaple8 extends Sample6,Sample7
{
	void test8();
	
}
class Demo implements Smaple8
{
	public void test6()
	{
		System.out.println("test6 is completed");
	}
	public void test7()
	{
		System.out.println("test7 is commpleted");
	}
	public void test8()
	{
		System.out.println("test8 is completed");
	}
}
class mainclass3
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test6();
		d.test7();
		d.test8();
	}
}
