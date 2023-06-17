class f
{
	public int i=10;
}
class g extends f
{
	public int j=20;
	public void info()
 {
   System.out.println(i);
  System.out.println(j);

   }
 } 
 class h extends f
{
   public int k=30;
   public void display()
{
   System.out.println(i);
   System.out.println(k);

 }
}
class mainclass5 
{
	public static void main(String[] args) 
	{
		g g1=new g();
		g1.info();
   System.out.println(" ");
		h h1=new h();
		h1.display();
	}
}
