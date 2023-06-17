class  Circle_program
{
	public static void findRadius(int circumference,double pi )
	{
		/* here formula for the radius of circle is 
		* radius=circumference/pi value
		* but the actual formula is 
		* circumference=2 pi value *radius*/
		double radius=circumference/pi;
		System.out.println("The circumference is = "+circumference);
		System.out.println("The radius of the circle is =" +radius);
	}
	public static void main(String[] args) 
	{
		findRadius(2,2*3.14);
	}
}
