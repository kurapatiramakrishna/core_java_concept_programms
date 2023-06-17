interface Tree
{
	void grow();
}
interface Branches extends Tree
{
	void grow1();
}
interface Leafs extends Branches
{
	void grow2();
}
class Demo implements Leafs
{
	public void grow()
	{
		System.out.println("first you need seed");
	}
	public void grow1()
	{
		System.out.println("all the branches are ");
	}
	public void grow2()
	{
		System.out.println("all the leafs are tree");
	}
}
class mainclass1 
{
	public static void main(String[] args) 
	{
		Demo rv=new Demo();
		rv.grow();
		rv.grow1();
		rv.grow2();
	}
}
