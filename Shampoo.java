class Shampoo
{
   static String appliedFor = "Damage repair";
   static int price = 500;
   static String quantity = "500 ml";
   
   public static void main(String args[]) {
   System.out.println(" This shampoo is used for "+appliedFor);
   System.out.println(" cost of this shampoo id "+price);
   System.out.println(" Quantity is "+quantity);
   
   appliedFor = "Instant repair";
   price = 400;
   quantity = "300 ml";
   System.out.println(" This shampoo is used for "+appliedFor);
   System.out.println(" cost of this shampoo id "+price);
   System.out.println(" Quantity is "+quantity);
   
   }
   }