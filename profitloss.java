class profitloss
{
	public static void main(String[] args)
{
	int c=500;
	int s=150;
	if(s>500)
	{
		double profit=s-c;
		System.out.println("PROFIT="+ profit);

	}
	else
	{
		double loss=c-s;
		System.out.println("LOSS="+ loss);
	}
	
}
}