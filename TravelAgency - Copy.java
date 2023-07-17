class TravelAgency
{
 static String touristPlaces[] = {null, null, null, null, null, null, null, null};
 static int index;
 
 public static boolean addPlaces(String places)
 {
   boolean isAdded = false;
   if(touristPlaces!=null)
   {
     touristPlaces[index] = places;
	 index++;
	 isAdded = true;
	 } else{
	 System.out.println(" Cannot add the places as it is a null value");
	 }
	 return isAdded;
	 }
	 
	 public static void getPlaces()
	 {
	   for(String name : touristPlaces)
	   {
	     String reference = name;
		 System.out.println(reference);
		 }
		 }
		 
		 public static boolean updateTouristPlaces(String existingTouristPlace, String updatedTouristPlace)
		 {
			 boolean isUpdated = false;
			 for(int placeIndex = 0; placeIndex < touristPlaces.length; placeIndex++)
			 {
				 if(touristPlaces[placeIndex] . equals(existingTouristPlace))
				 {
					 touristPlaces[placeIndex] = updatedTouristPlace;
					 isUpdated = true;
				 }
			 }
			 System.out.println(" Updated Tourist place is " +updatedTouristPlace);
			 return isUpdated;
		 }

  public static boolean deletePlaceNames(String deletedPlace)
	{
		 boolean isDeleted = false;
		 int placeIndex;
		 int noOfElements = touristPlaces.length;
		 for(placeIndex = 0; placeIndex < touristPlaces.length; placeIndex++)
		 {
			 if(touristPlaces[placeIndex] == deletedPlace)
			 {
			   break;
		     }
         }
     if(placeIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newPlaceIndex = placeIndex; newPlaceIndex < noOfElements; newPlaceIndex++)
	  {
        touristPlaces[newPlaceIndex] = touristPlaces[newPlaceIndex+1];
	  }
	}
	System.out.println("Deleted place is" +deletedPlace);
	return isDeleted;
  }

  public static void getAllPlaceNamesPostDeletion()
  {
   int noOfElements = touristPlaces.length-1;
   for(int placeIndex = 0; placeIndex < noOfElements; placeIndex++)
   {
     System.out.println(touristPlaces[placeIndex]);
   }
  }
}  
		 