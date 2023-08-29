class module
{
	public static void main(String[] args)
	{
		int a=5454,b=31056,c=13056;
		if(a>b)
		{
			a=a+b;
			b=a-b; 
			a=a-b;
			
		}
		
			
				
		if(a>c)
		{
			a=a+c;
			c=a-c;
			a=a-c;
		}
			if(b>c)
		{
			b=b+c;
			c=b-c;
			b=b-c;
			
		}
			System.out.println("a=" + a+"  "+   "b=" + b+"   "+  "c=" + c);
	}
}
