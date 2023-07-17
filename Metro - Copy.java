class Metro
{
  static String stationNames[] = {null, null, null, null, null, null, null};
  static int index;
  
  public static boolean addStation(String stations)
  {
  boolean isAdded = false;
   if(stationNames!=null)
   {
    stationNames[index] = stations;
	index++;
	isAdded = true;
	} else{
	System.out.println("Cannot add the station as it is a null value");
	}
	return isAdded;
	}
	
	public static void getStations()
	{
	  for(String name : stationNames)
	  {
	  String reference = name;
	  System.out.println(reference);
	  }
	}
	  
	  public static boolean updateStationNames(String existingStationName, String updatedStationName)
	  {
		  boolean isUpdated = false;
		  for(int stationIndex = 0; stationIndex < stationNames.length; stationIndex++)
		  {
			  if(stationNames[stationIndex] . equals(existingStationName))
			  {
				  stationNames[stationIndex] = updatedStationName;
				  isUpdated = true;
			  }
		  }
		  System .out.println(" Updated Station name is " +updatedStationName);
		  return isUpdated;
	  }

   public static boolean deleteStationNames(String deletedStation)
	{
		 boolean isDeleted = false;
		 int stationIndex;
		 int noOfElements = stationNames.length;
		 for(stationIndex = 0; stationIndex < stationNames.length; stationIndex++)
		 {
			 if(stationNames[stationIndex] == deletedStation)
			 {
			   break;
		     }
         }
     if(stationIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newStationIndex = stationIndex; newStationIndex < noOfElements; newStationIndex++)
	  {
        stationNames[newStationIndex] = stationNames[newStationIndex+1];
	  }
	}
	System.out.println("Deleted station is" +deletedStation);
	return isDeleted;
  }

  public static void getAllStationNamesPostDeletion()
  {
   int noOfElements = stationNames.length-1;
   for(int stationIndex = 0; stationIndex < noOfElements; stationIndex++)
   {
     System.out.println(stationNames[stationIndex]);
   }
  }
}  