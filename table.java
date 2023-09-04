class table
{
	public static void main(String[] args)
	{
		int n=7,A;
		int f=30,a=1;
		while(f>=a)
		{
			if(f%5==0)
			{
				A=n*f;
				System.out.println(n +"x" + f + "=" + A);
			}
				f--;
		}
	}
}