class Karnataka
{
  static String cityNames[] = {null, null, null, null, null, null};
  static int index;

public static boolean addCity(String city)
{
	boolean isAdded = false; 
	if(index < cityNames.length)
	{
	if(cityNames!=null) 
	{
		 cityNames[index] = city;
		 index++;
		 isAdded = true;
	} else{
		System.out.println("Cannot add city as it is a null value");
	}
	}
	else{
		System.out.println(" CityNames is full, cannot add further city names");
	}
	
	return isAdded;
}
  public static void getCity()
  {
    for(String name:cityNames)
	{    
	String reference = name;
	System.out.println(reference);
	}
	}
	
	public static boolean updateCityNames(String existingCityName, String updatedCityName)
	{
      boolean isUpdated = false;
      for(int cityIndex = 0; cityIndex < cityNames.length; cityIndex++)
	  {
		  if(cityNames[cityIndex].equals(existingCityName))
		  {
		  cityNames[cityIndex] = updatedCityName;
		  isUpdated = true;
		  }
	  }
		  System.out.println(" Updated City name is " +updatedCityName);
	  return isUpdated;
		  
	}   

   public static boolean deleteCityNames(String deletedCity)
	{
		 boolean isDeleted = false;
		 int cityIndex;
		 int noOfElements = cityNames.length;
		 for(cityIndex = 0; cityIndex < cityNames.length; cityIndex++)
		 {
			 if(cityNames[cityIndex] == deletedCity)
			 {
			   break;
		     }
         }
     if(cityIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newCityIndex = cityIndex; newCityIndex < noOfElements; newCityIndex++)
	  {
        cityNames[newCityIndex] = cityNames[newCityIndex+1];
	  }
	}
	System.out.println("Deleted City is" +deletedCity);
	return isDeleted;
  }

  public static void getAllCityNamesPostDeletion()
  {
   int noOfElements = cityNames.length-1;
   for(int cityIndex = 0; cityIndex < noOfElements; cityIndex++)
   {
     System.out.println(cityNames[cityIndex]);
   }
  }
}  