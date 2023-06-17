class rect
{
	public int length;
	public int width;
	public rect(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public void Dimensions()
	{
		System.out.println("[length x width ] =["+length+"x"+width+"]");
 }
}
class Rectangle0 
{
	public static void main(String[] args) 
	{
		rect r1=new rect(10,20);
		rect r2=new rect(1,2);
		r1.Dimensions();
		r2.Dimensions();
	}
}
