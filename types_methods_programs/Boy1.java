import java.util.Scanner;
class Boy1
{
	public static void main(String[] args) 
	{
		System.out.println("......BOY PROBLEM PROGRAM......");
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the distance value:");
		int distance=scan.nextInt();
		System.out.println("Enter the speed value:");
		int speed=scan.nextInt();
		findTimeInMin(distance,speed);
	}
	public static void findTimeInMin(int distance, int speed)
	{
		int timeInSec=findTimeSec(distance,speed);
		/* this is the formula for minute to sec*/
		double timeInMin=timeInSec/60.0;
		System.out.println("The number minutes taken by the boy to cross the bridge is  : "+timeInMin);
		System.out.println(" ");
	}
		public static int  findTimeSec(int distance,int speed)
	{
			/* this is the formula for time in secounds*/
		int timeInSec=distance/speed; 
		return timeInSec;
	}
}
