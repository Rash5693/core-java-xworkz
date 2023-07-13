class SuperMarket
{
   static String vegetables[] = {"Potato","Onion" ,"Brinjal","Tomato"};
 
   
   static String biscuits []= {"Parle G","Hide & Seek","KrackJack","50-50","vita marie","Tiger","Gooday","Moms Magic","Bourbon","Marie Gold"};

   
   static String perfumes[] = {"Nivea","Magnet","Yardley","Fogg","Wildstone","Burberry","Layer Wattagirk","Miniso","Vanilla Iceberg","Axe"};

  
   static String groceries[] = {"Rice","Wheat","Nuts","Milk","Chillipowder","Green gram","Flour","Maida","Garam masala","Pepper"};

   
   public static void main(String market[]) {
   
   System.out.println("Main started");
   System.out.println("LIST OF VEGETABLES ARE");
   getVegetable();
   System.out.println("LIST OF BISCUITS ARE");
   getBiscuit();
   System.out.println("LIST OF PERFUMES ARE");
   getPerfume();
   System.out.println("LIST OF GROCERIES ARE");
   getGrocery();
   System.out.println("Main ended");
   
   }
      public static void getVegetable() 
   {
	   for(String vegetable : vegetables)
	   {
		   System.out.println(vegetable);
	   }
   }
   public static void getBiscuit()
   {
	   for(String biscuit : biscuits)
	   {
		   System.out.println(biscuit);
	   }
   }
   public static void getPerfume()
   {
	   for(String perfume: perfumes)
	   {
		   System.out.println(perfume);
	   }
   }
   public static void getGrocery()
   {
	   System.out.println("Inside getGrocery");
	   for(String grocery : groceries)
	   {
		   System.out.println(grocery);
	   }
   }
   
   
}
   
   