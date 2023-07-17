class Icecream
{
  static String flavourNames[] = {null, null, null, null, null, null};
  static int index;
  
  public static boolean addFlavours(String flavour)
  {
  boolean isAdded = false;
  if(flavourNames!=null)
  {
  flavourNames[index] = flavour;
  index++;
  isAdded= true;
  } else{
  System.out.println("Cannot add the flavour as it is a null value");
  }
  return isAdded;
  }
  
  public static void getFlavours()
  {
   for(String name:flavourNames)
   {
    String reference = name;
	System.out.println(reference);
	}
	}
	
	public static boolean updateFlavourNames(String existingFlavourName, String updatedFlavourName)
	{
		boolean isUpdated = false;
		for(int flavourIndex = 0; flavourIndex < flavourNames.length; flavourIndex++)
		{
			if(flavourNames[flavourIndex] . equals(existingFlavourName))
			{
				flavourNames[flavourIndex] = updatedFlavourName;
				isUpdated = true;
			}
		}
		System.out.println(" Updated Flavour name is " +updatedFlavourName);
		return isUpdated;
	}
	
	public static boolean deleteFlavourNames(String deletedFlavour)
	{
		 boolean isDeleted = false;
		 int flavourIndex;
		 int noOfElements = flavourNames.length;
		 for(flavourIndex = 0; flavourIndex < flavourNames.length; flavourIndex++)
		 {
			 if(flavourNames[flavourIndex] == deletedFlavour)
			 {
			   break;
		     }
         }
     if(flavourIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newFlavourIndex = flavourIndex; newFlavourIndex < noOfElements; newFlavourIndex++)
	  {
        flavourNames[newFlavourIndex] = flavourNames[newFlavourIndex+1];
	  }
	}
	System.out.println("Deleted flavour is" +deletedFlavour);
	return isDeleted;
  }

  public static void getAllFlavourNamesPostDeletion()
  {
   int noOfElements = flavourNames.length-1;
   for(int flavourIndex = 0; flavourIndex < noOfElements; flavourIndex++)
   {
     System.out.println(flavourNames[flavourIndex]);
   }
  }
  
   public static String searchFlavourByName(String flavourName)
   
   { 
     System.out.println("Invoking searchFlavourByName");
	 System.out.println("No of parameter : 1, type String");
	 String sName = null;
	 for(String name : flavourNames)
	 {
		 if(name.equals(flavourName))
		 {
			 sName = name;
			 System.out.println("Flavour name Found " +sName);
		 }
	 }
	 return sName;
   }
}  
		
	
			

   
   
   