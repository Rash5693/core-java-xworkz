class Cosmetics
{
   public static void main(String args[])
   { 
   String cosmeticName[] = {"Kajal", "Eyeliner", "compact", "Priemer", "Foundation", "mascara", "conceler", "highlighter", "sunscreen", " toner", "lipbalm", "lip liner", "lipstick", "powder", "blush", "eye shadow", "Brush", "lotion", "moisturizer", "cream", "eye lashes", "setting spray", "lip & cheek tint", "lip gloss", "moisturising gel"};
   
     System.out.println(" Main Started");
	 System.out.println("LIST OF COSMETICS ARE");
	  getCosmetics();
	  System.out.println("Main ended");
   }
   public static void getCosmetics()
   {
	 for(String cosmeticNames : cosmeticName)
	 {
		  System.out.println(cosmeticNames);
	 }
	 
	 }
	 }