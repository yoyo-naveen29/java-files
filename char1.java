class char1
{
	public static void main(String[] args)
	{
		char yoyo='r';
		int y1=(int)yoyo;
		int y2=0;
		if(y1>65)
		{
		if(y1<90)
		{
			y2=y1+32;
		}
		
		else if(y1>97)
		{
		if(y1<122)
		{
			y2=y1-32;
		}
		}
		}
			y2=(char)y2;
			System.out.println(y2);
	}
		
}