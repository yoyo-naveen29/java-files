class perfect
{
	public static void main(String[] args)
	{
		int num=8128,start=1,sum=0,p=num;
		while(p>start)
		{
			--p;
			if(num%p==0)
			{
				sum=p+sum; 
			}
			}
			System.out.println(sum);
			if(sum==num)
			System.out.println("perfect number");
			else
			System.out.println("not a perfect number");
		
	}		
}