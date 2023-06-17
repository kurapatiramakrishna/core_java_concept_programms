import java.util.Scanner;
class Car_problem 
{
	public static void main(String[] args) 
	{
	System.out.println("..CAR PROGRAM..");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a speed value:");
	int speed=scan.nextInt();
	System.out.println("Enter the time :");
	int time=scan.nextInt();
	findDistance(speed,time);

	}
	public static void findDistance(int speed,int time)
	{
	int distance=findMeter(speed,time);
		int meter=distance*1000;
	System.out.println(" The distance travelled by a car in meters is  :"+meter"  meter");
	}
	public static int findMeter(int speed,int time)
	{
		int  distance=speed*time;
		return distance;
	}
}
