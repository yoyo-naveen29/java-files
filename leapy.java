class leapy
{
	public static void main(String[] args)
	{
	int year=1947,end=2024,i=0;
	while(year<=end)
	{
	if((year%4==0 && year%100!=0)&&(year%12==0)||(year%400==0))
	{
		System.out.println(year);
		i++;
		System.out.println(i);
	}
		year=year+1;
	}
	}
}