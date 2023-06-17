class Vehicle
{
	public void speed()
	{
		System.out.println("speed is 170k/h");
	}
}
class Bike extends Vehicle
{
	public void speed()
	{
		System.out.println("the speed of bike 10k/h");
	}
}
class Car extends Vehicle
{
}
class Bus extends Vehicle
{
	public void speed()
	{
		System.out.println("the speed of bus 120 k/h");
	}
}
class  mainclass
{
	public static void display(Vehicle vehicle)
	{
		vehicle.speed();
	}
	public static void main(String[] args) 
	{
		display(new Bike());
		display(new Car());
		display(new Bus());
		
	}
}
