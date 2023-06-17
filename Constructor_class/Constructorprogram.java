class consta
{
	public String fname;
	public consta(String z)
	{
		fname=z;
	}
	public void Display()
	{
		System.out.println("flower name is = "+fname);
	}
}
class Constructorprogram 
{
	public static void main(String[] args) 
	{
		consta c1=new consta("rose");
		c1.Display();
		consta c2=new consta("jasmine");
		c2.Display();
	}
}
