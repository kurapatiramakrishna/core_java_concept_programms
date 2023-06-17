class animal 
{
	public String selfname;
	public String breed;
	public int wight;
	public String sound;
	public String color;
	public animal(String selfname,String breed,int wight,String sound,String color) 
	{
		this.selfname=selfname;
		this.breed=breed;
		this.wight=wight;
		this.sound=sound;
		this.color=color;
	}
	public void animaldetailes()
	{
		System.out.println("SELFNAME = "+selfname);
		System.out.println("BREED = "+breed);
		System.out.println("WIGHT = "+wight+" kgs");
		System.out.println("SOUND  ="+sound);
		System.out.println("COLOR = "+color);
	}
}
