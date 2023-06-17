import java.util.Scanner;
class Laptop
{
	public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number..");
	int n=scan.nextInt();
	System.out.println("main starts..");
    if(n<=0)
	{
		System.out.println("no motheds are called");
	}
	else if(n%2==1)
	{
		Laptop L1=new Laptop();
		L1.hp();
	}
	else 
	{
	dell();
	}
	System.out.println("main starts..");
}
	public static void dell() 
	{
		System.out.println("this is dell laptop:!");
	}
	public void hp()
	{
		System.out.println("this is hp laptop..");
	}

}
