class primenumber
{
	public static void main(String[] args)
	{
		int num=5,count=0,end=num,start=1;
		while(end>=start)
		{
			if(num%end==0)
			{
				count++;
			}
		end--;
		}
			System.out.println(count);
			if(count==2)
			System.out.println("prime number");
			else
			System.out.println("not a prime number");
	}
}