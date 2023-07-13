class Restaurant
{
  static String foodItem[] = {"idli", "Vada", "Masal Dosa", "Set Dosa", "Paneer biryani", "Rava Dosa", "Roti curry", "puri", "Pulav", "Fried Rice", "Jeera rice", "ghee rice", "curd rice", "meals", "Pakoda", "Fries", "gobi Manchuri", "Paneer Tikka", "Aloo dry", "Plain dosa"};

public static void main(String args[]) {
   System.out.println(" Main Started");
   System.out.println("LIST OF FOOD ITEMS ARE");
   getFoodItems();
   System.out.println("Main ended");
}
public static void getFoodItems()
{
	     
for(String foodItems : foodItem)
{
	System.out.println(foodItems);

  }
  }
}