class Qizzbuzz
{
	public static void main(String[] args)
	{
		int a=17;
		if(a%3==0)
		{
		if(a%5==0)
		{
			System.out.println("FIZZbuzz");
		}
		else if(a%3==0)
		{
			System.out.println("fizz");
		}
		else if(a%5==0)
			System.out.println("BUZZ");
		}
		else
		{
			System.out.println(a);
		}
		
	}
}