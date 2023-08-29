class iphone7
{ 
         public static void main(String[] args)
         {
         String name="iphone";
        double maxprice=79900;
        double off=14;
       double pack=99;
      double discount=off/100*maxprice;
      System.out.println("DISCOUNT=" + discount);
      maxprice=maxprice-discount;
      System.out.println("Max price= " + maxprice);
         
      }
}