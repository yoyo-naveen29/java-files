class math2
{
	public static void main(String[] args)
	{
		int a=10;
		int b=57;
		int c=20;
		double d1=-b;
		double d2=(Math.pow(b,2))-4*a*c;
		double d3=Math.sqrt(d2);
		double D1=d1+d3/2*a;
		double D2=d1-d3/2*a;
		System.out.println( D1);
		System.out.println(D2);
	}
}