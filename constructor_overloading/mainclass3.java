class employe
{
	public String name;
	public int id;
	public int salary;
	public int yoe;
	public employe(String name,int id,int salary,int yoe)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.yoe=yoe;
	}
	public employe(String name,int id,int salary)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	}
	public void employedetailes()
	{
		System.out.println("---------------EMPLOYE DETAILES---------------");
		System.out.println("NAME = "+name);
		System.out.println("ID = "+id);
		System.out.println("SALARY = "+salary);
		if (yoe>0.0)
		{
		System.out.println("YOE = "+yoe+" YEARS");
		}
	}
}

class  mainclass3
{
	public static void main(String[] args) 
	{
		employe e1=new employe("RAMAKRISHNA",25645,60000);
		employe e2=new employe("RAMAKRISHNA",24875,45000);
		employe e3=new employe("VAMSHI SINGAM",12548,850000,8);
		employe e4=new employe("VAMSHI SINGAM",12548,540000,3);
		e1.employedetailes();
		e2.employedetailes();
		e3.employedetailes();
		e4.employedetailes();


		}
}
