class cmpy
{
	public static String cname="TCS";
	public String name;
	public String dept;
	public double ctc;
	public cmpy(String a,double b,String c)
	{
	 dept=a;
	 ctc=b;
	 name=c;
	}
	public void Details()
	{
		System.out.println("The company name is:"+cmpy.cname);
		System.out.println("The employee name is :"+name);
		System.out.println("The  employee department is: "+dept);
	    System.out.println("The employee salary is is: "+ctc);
			System.out.println();
	}
}
class cmpy1 
{
	public static void main(String[] args) 
	{
		System.out.println("The employees are :");
		cmpy c1=new cmpy("salesforce",4.5,"ramakrishna");
		cmpy c2=new cmpy("cybersecurity",5.5,"gopi");
		cmpy c3=new cmpy("monitoring",8.4,"boss");
		c1.Details();
		c2.Details();
		c3.Details();
	}
}
                   