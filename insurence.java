class insurence
{
	public static void main(String[] args)
	{
		String health="poor",gender="male",lives="village";
		double premium=0;
		if(health=="excellent" && gender=="male" && lives=="city")
		{
			int amount=200000;
			premium=(amount/1000.0)*4;
		}
		else if(health=="excellent" && gender=="female" && lives=="city")
		{
			int amount=100000;
			premium=(amount/1000.0)*3;
		}	
		else if(health=="poor" && gender=="male" && lives=="village")
		{
			int amount=10000;
			premium=(amount/1000.0)*6;
		}

		else
		{
			System.out.println("INSECURED");
		}

			System.out.println(premium);
	}

}