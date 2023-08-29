class typecasting
{
         public static void main(String[] args)
        {
	String appname="FLIPKART";
        String productname1="iphone";
        String productname2="ear buds";
        int maxprice1=159999;
	int maxprice2=2999;
        double off=40;
        double discount1=off/100.0*maxprice1;
	double discount2=off/100.0*maxprice2;
	double DISCOUNT=(discount1+discount2);
	double FINALPRICE=(maxprice1+maxprice2);
	double TOTALAMOUNT=FINALPRICE-DISCOUNT;
        System.out.println("FINAL DISCOUNT   = " + DISCOUNT);
       System.out.println("FINAL PRICE   ="  + FINALPRICE);
	System.out.println("TOTAL AMOUNT  = " + TOTALAMOUNT);
	
       }
}