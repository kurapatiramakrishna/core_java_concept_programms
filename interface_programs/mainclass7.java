class Sample
{
	public void test()
	{
		System.out.println("test is completed");
	}
}
interface Sample1
	{
	       void test();
}
class Demo extends Sample implements Sample1
{
	//public void test()                      * implementing test method is not compalsury.because it is already implemented by indirectly by super class
	//{
	//	System.out.println("test is completed");
	//}
}
class mainclass7
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test();
	}
}
