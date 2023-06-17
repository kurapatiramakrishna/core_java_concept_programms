class Animal
{
	public void roam()
	{
		System.out.println("Roam arround the forest");
	}
}
class WildAnimal extends Animal
{
	public void hunt()
	{
		System.out.println("hunt the food");
	}
}

class Lion extends WildAnimal
{
	public void rule()
	{
		System.out.println("rule the forest");
	}
}
class mainclass5 
{
	public static void main(String[] args) 
	{
	   WildAnimal wa1=(WildAnimal)new Lion();
	   wa1.roam();
	   wa1.hunt();
	   Animal a1=(Animal)wa1;
	   a1.roam();
	   WildAnimal wa2=(WildAnimal)a1;
	   wa2.roam();
	   wa2.hunt();
	   Lion l1=(Lion)wa2;
	   l1.roam();
	   l1.hunt();
	   l1.rule();
	}
}
