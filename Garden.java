class Garden 
{
  static String flowerNames[] = {null, null, null, null};
  static int index;
  
  public static boolean addFlowers(String flower)
  {
   boolean isAdded = false;
   if(flowerNames!=null)
   {
   flowerNames[index] = flower;
   index++;
   isAdded = true;
   } else{
   System.out.println("Cannot add the flowers as it is null");
   }
   return isAdded;
   }
   
   public static void getFlowers()
   {
    for(String name:flowerNames)
	{
	String reference = name;
	System.out.println(reference);
	}
	}

	public static boolean updateFlowerNames(String existingFlowerName, String updatedFlowerName)
	{
		boolean isUpdated = false;
		for( int flowerIndex = 0; flowerIndex < flowerNames.length; flowerIndex++)
		{
			if(flowerNames[flowerIndex] . equals(existingFlowerName))
			{
				flowerNames[flowerIndex] = updatedFlowerName;
				isUpdated = true;
			}
		}
		System.out.println(" Updated flower name is " +updatedFlowerName);
		return isUpdated;
	}
				
  public static boolean deleteFlowerNames(String deletedFlower)
	{
		 boolean isDeleted = false;
		 int flowerIndex;
		 int noOfElements = flowerNames.length;
		 for(flowerIndex = 0; flowerIndex < flowerNames.length; flowerIndex++)
		 {
			 if(flowerNames[flowerIndex] == deletedFlower)
			 {
			   break;
		     }
         }
     if(flowerIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newFlowerIndex = flowerIndex; newFlowerIndex < noOfElements; newFlowerIndex++)
	  {
        flowerNames[newFlowerIndex] = flowerNames[newFlowerIndex+1];
	  }
	}
	System.out.println("Deleted flower is" +deletedFlower);
	return isDeleted;
  }

  public static void getAllFlowerNamesPostDeletion()
  {
   int noOfElements = flowerNames.length-1;
   for(int flowerIndex = 0; flowerIndex < noOfElements; flowerIndex++)
   {
     System.out.println(flowerNames[flowerIndex]);
   }
  }
}  