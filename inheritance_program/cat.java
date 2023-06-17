class cat extends animal
{
	public cat(String selfname,String breed,int wight,String sound,String color) 
	{
		super(selfname,breed,wight,sound,color);
	}
	public void catdetailes()
	{
		int i=2;
		System.out.println((char)i+""+(char)i+""+(char)i+" CAT-DETAILES "+(char)i+""+(char)i+""+(char)i);
		System.out.println();
		animaldetailes();
	}
}
