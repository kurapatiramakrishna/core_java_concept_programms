abstract class Demo
{
	abstract public void test();

}
class Sample extends Demo
{
	public void test()
	{
		System.out.println("test is completed");
	}
}
class mainclaas 
{
	public static void main(String[] args) 
	{
		Sample sample=new Sample();
		sample.test();
	}
}
