class typecasting
{
        public static void main(String[] args)
       {
       String productname="watch";
       int maxprice=159999;
       double off=40;
       double discount=off/100.0*maxprice;
       double totalprice=maxprice-discount;
       System.out.println(discount);
      System.out.println(totalprice);
       }
}