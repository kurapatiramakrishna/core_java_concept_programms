class Account
{
	public void Account()
	{
		System.out.println("this is main account");
	}
}
class Saving extends Account
{
	public void Saving()
	{
		System.out.println("This account is used for the saving perpose");
	}
}
class Current  extends Account
{
	public void Current()
	{
	   System.out.println("This is account is used for the cuurent perpose");

	}
}
class mainclass4 
{
	public static void main(String[] args) 
	{
		Account a=(Account)new Saving();     //up casting
		a.Account();
		Saving s=(Saving)a;         // down casting		s.Account();
		s.Saving();
		System.out.println();
		Account b=(Account)new Current();
		b.Account();
		Current c=(Current)b;
		c.Account();
		c.Current();
	}
}
