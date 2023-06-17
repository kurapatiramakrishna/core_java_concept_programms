class interviewexample 
{
	public static void main(String[] args) 
	{
		lion l1=new lion("chinni","biological",45,"roar","yellow-gold");
		cat c1=new cat("puppy","british-shorthair",5,"meow","white");
		dog d1=new dog("gimmy","german-shepherd",25,"bow bow","red-white");
		l1.liondetailes();
		System.out.println();
		c1.catdetailes();
		System.out.println();
		d1.dogdetailes();
	}
}
