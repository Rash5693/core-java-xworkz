class GardenTester
{
  public static void main(String args[])
  {
   Garden.addFlowers("Rose");
   Garden.addFlowers("Jasmine");
   Garden.addFlowers("Sunflower");
   Garden.addFlowers("Hibiscus");
   Garden.getFlowers();
   Garden.deleteFlowerNames("Sunflower");
   Garden.getAllFlowerNamesPostDeletion();
   }
   }