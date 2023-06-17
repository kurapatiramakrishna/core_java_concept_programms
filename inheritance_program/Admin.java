class Admin extends employee 
{
	public String type;
	public Admin(int id,String name,double ctc,String type) 
	{
	super(id,name,ctc);
	this.type=type;
	}
	public void adminDetailes()
	{
		System.out.println("-------->ADMIN-DETAILES<----");
		employeDetailes();
		System.out.println("type ="+type);
	}
}

