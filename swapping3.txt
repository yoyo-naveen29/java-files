class swapping3
{
	public static void main(String[] args)
	{
		int n1=333,n2=2,n3=1;
		n1=n1+n2+n3;
		n2=n1-n2-n3;
		n3=n1-n2-n3;
		n1=n1-n2-n3;
		System.out.println(n1+"    "+n2+"    "+n3);
	}
}
