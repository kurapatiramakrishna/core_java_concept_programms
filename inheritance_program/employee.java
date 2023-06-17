class employee 
{
	public int id;
	public String name;
	public double ctc;
	public employee(int id,String name,double ctc) 
	{
	this.id=id;
	this.name=name;
	this.ctc=ctc;	
	}
	public void employeDetailes()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("ctc = "+ctc);
	}
}
