class  Man_problem
{
	public static void calculateActualPrice(int sellingPrice,int profit)
	{
		/*actual price is nothing but cost price
		* cp=sp-p
		*/
		int costPrice=sellingPrice-profit;
		System.out.println("abook is sold at :"+sellingPrice+ "rs/-");
		System.out.println("gined profit of :"+profit+" rs/-");
		System.out.println("the actul price of book is:" +costPrice);
}
	public static void main(String[] args) 
	{
		calculateActualPrice(170,25);
	}
}
