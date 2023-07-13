class TeleComm
{
  static String simNames[] = {null, null, null, null, null};
  static int index;
  
  public static boolean addSim(String sim)
  {
  boolean isAdded = false;
  if(simNames!=null)
  {
   simNames[index] = sim;
   index++;
   isAdded = true;
   } else{
   System.out.println("cannot add the sim as it is null");
   }
   return isAdded;
   }
   
   public static void getSim()
   {
   for(String name:simNames)
   {
   String reference = name;
   System.out.println(reference);
   }
   }

   public static boolean updateSimNames(String existingSimName, String updatedSimName)
   {
	   boolean isUpdated = false;
	   for(int simIndex = 0; simIndex < simNames.length; simIndex++)
	   {
		   if(simNames[simIndex].equals(existingSimName))
		   {
			   simNames[simIndex] = updatedSimName;
			   isUpdated = true;
		   }
	   }
	   System.out.println(" Updated sim name is " +updatedSimName);
	   return isUpdated;
   }
   
   public static boolean deleteSimNames(String deletedSim)
	{
		 boolean isDeleted = false;
		 int simIndex;
		 int noOfElements = simNames.length;
		 for(simIndex = 0; simIndex < simNames.length; simIndex++)
		 {
			 if(simNames[simIndex] == deletedSim)
			 {
			   break;
		     }
         }
     if(simIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newSimIndex = simIndex; newSimIndex < noOfElements; newSimIndex++)
	  {
        simNames[newSimIndex] = simNames[newSimIndex+1];
	  }
	}
	System.out.println("Deleted Sim is" +deletedSim);
	return isDeleted;
  }

  public static void getAllSimNamesPostDeletion()
  {
   int noOfElements = simNames.length-1;
   for(int simIndex = 0; simIndex < noOfElements; simIndex++)
   {
     System.out.println(simNames[simIndex]);
   }
  }
}  