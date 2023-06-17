class employe 
{
	public int id;
	public String name;
	public double ctc;
	public String language;
	public String type;
	public void sup(int id,String name,double ctc,String language,String type)
	{
	this.id=id;
	this.name=name;
	this.ctc=ctc;
	this.language=language;
	this.type=type;
	}
}
class Developer extends employe                                             //int id,String name,double ctc,String language
{
	public Developer()
	{
		System.out.println("ID = "+id);
		System.out.println("NAME = "+name);
		System.out.println("CTC = "+ctc);
		System.out.println("LANGUAGE = "+language);
		sup();

	}                                                           
}
class Admin extends employe
{
	public Admin()
	{
		System.out.println("ID = "+id);
		System.out.println("NAME = "+name);
		System.out.println("CTC = "+ctc);
		System.out.println("TYPE = "+type);
		sup();
	}
}
class mainclass8
{
	public static void main()
	{
	Developer e1=new Developer(1234,"RAMAKRISHNA",4.5,"ORACLE SQL AND JAVA ");
	Admin e2=new Admin(4321,"VAMSHI SINGAM",5.6,"OFFICE MANAGER");
	e1.employe();
	e2.employe();

	}
}
