class student
{
	public String name;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
	public double masters;
	public student(String name,int age,double tenth,double inter,double degree,double masters)
	{
		this(name,age,tenth,inter,degree);
		this.masters=masters;
	}
	public student(String name,int age,double tenth,double inter,double degree)
	{
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
	}
	public void studentdetailes()
	{
		int i=1;
		System.out.println((char)i+"---------STUDENT DETAILES------"+(char)i);
		System.out.println("NAME = "+name);
		System.out.println("AGE =" +age+" YEARS");
		System.out.println("TENTH = "+tenth);
		System.out.println("INTER = "+inter);
		System.out.println("DEGREE = "+degree);
		if (masters!=0.0)
		{
			System.out.println("MASTERS = "+masters);
		}
	}

}

class mainclass1
{
	public static void main(String[] args) 
	{
		student s1=new student("RAMAKRISHNA",24,7.3,6.93,7.5,7.5);
		student s2=new student("VAMSHI",24,7.5,6.9,7.0,9.6);
		student s3=new student("GOPI RAJ",25,6.9,7.3,5.5);
		student s4=new student("SATHISH",22,6.9,8.3,6.5);
		student s5=new student("VISHNU",21,6.9,8.2,9.7);
		s1.studentdetailes();
		s2.studentdetailes();
		s3.studentdetailes();
		s4.studentdetailes();
		s5.studentdetailes();
	}
}
