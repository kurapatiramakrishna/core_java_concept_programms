class shyamsinghroy
{
	public void writer()
	{
		System.out.println("to write articles");
	}
}
class gautham extends shyamsinghroy
{
	public void director()
	{
		System.out.println("shoot movies");
	}
}
class mainclass2 
{
	public static void main(String[] args) 
	{
	   shyamsinghroy s1=(shyamsinghroy)new gautham();
	   s1.writer();
	   gautham g1=(gautham)s1;
	   g1.writer();
	   g1.director();

	}
}
