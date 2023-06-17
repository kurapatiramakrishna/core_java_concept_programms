class Developer extends employee 
{
	public String language;
	public Developer(int id,String name,double ctc,String language) 
	{
	super(id,name,ctc);
	this.language=language;
	}
	public void developerDetailes()
	{
		System.out.println("------->EMPLOYEE-DETAILES<----");
		employeDetailes();
		System.out.println("language ="+language);
	}
}
