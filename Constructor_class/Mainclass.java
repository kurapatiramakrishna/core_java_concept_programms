class Sample
{
	//method name must be class name
	public Sample()
	{
		System.out.println("This is constructor class...");
	}
}
class Mainclass 
{
	public static void main(String[] args) 
	{
		// object is not created constructor will not execute 
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
	}
}
