class factorial
{
	public static void main(String[] args)
	{
		int end=1,start=5,fact=1;
		while(start>=end)
		{
			fact=start*fact;
			System.out.print(start + "*");
			start--;
		}
		System.out.println("=" +fact);
	}
}