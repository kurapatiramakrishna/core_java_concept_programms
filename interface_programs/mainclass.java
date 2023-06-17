interface Sample
{
	void test1();
}
interface Sample1 extends Sample
{
	void test2();
}
class Demo implements Sample1
{
	public void test1()
	{
		System.out.println("test1 is completed");
	}
	public void test2()
	{
		System.out.println("test2 is completed");
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test1();
		d.test2();
	}
}
