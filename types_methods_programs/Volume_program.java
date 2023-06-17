class  Volume_program
{
	public  void findVolume(double length,double width,double height)
	{
		/* the formula for volume=length*width*height*/
		double volume=length*width*height;
		System.out.println("a box of diamension length is= "+length);
		System.out.println("a box of diamension width is= "+width);
		System.out.println("a box of diamension height is= "+height);
		System.out.println("The volume of box is = "+volume);
	}
	public static void main(String[] args) 
	{
		Volume_program v1=new  Volume_program();
		v1. findVolume(10.5,2.6,1.3);
	}
}
