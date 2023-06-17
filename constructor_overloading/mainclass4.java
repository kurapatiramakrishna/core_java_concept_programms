class box
{
	public int length;
	public int width;
	public int hight;
	public box(int length,int width,int hight)
	{
		this(length,width);
		this.hight=hight;
	}
	public box(int length,int width)
	{
		this.length=length;
		this.width=width;
	}

	public void Dimensions()
	{
		System.out.println("---------------BOX-DETAILES---------------");
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		if (hight!=0)
		{
	
			System.out.println("hight = "+hight);
			System.out.println();
		}
	
	}

}
class mainclass4
{
	public static void main(String[] args) 
	{
	box b1=new box(5,10,6);
	box b2=new box(2,8,6);
	box b3=new box(5,9);
	b1.boxdetailes();
	b2.boxdetailes();
	b3.boxdetailes();
	}
}
