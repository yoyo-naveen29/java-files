class switch1
{
	public static void main(String[] args)
	{
		char ch='a';
		switch(ch)
		{
		case 'a','e','i','o','u','A','I','O','E','U' :
			System.out.println("vowels");
				break;
		
		default:
			System.out.println(" consonants");
				break;
		}
		
	}
}