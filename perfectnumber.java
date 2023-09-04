class perfectnum
{
	public static void main(String[] args)
	{
		int num=6,start=1,count=0,b=0;
		while(start<num)
		{
			if(num%start==0)
			{
				count++;
			}
			start++;
			count=count+b;
			System.out.println(count);
			if(count==num)
			System.out.println("perfect number");
			else
			System.out.println("not a perfect number");
		}
	}		
}