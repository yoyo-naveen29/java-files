class month
{
	public static void main(String[] args)
	{
	int month=5;
	int totalmonths=12;
		if(month==1||month==3||month==5||month==7||month==9||month==11)
		System.out.println("it has 31 days");
	else if(month==2)
		System.out.println("it has 28 days");
	else
		System.out.println("it has 30 days");
	}
}