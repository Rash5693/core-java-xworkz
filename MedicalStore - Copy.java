class MedicalStore
{
  static String MedicineNames[] = { null, null, null, null, null, null, null, null, null};
  static int index;
  
  public static boolean addMedicine(String medicine)
  {
    boolean isAdded = false;
	if(medicine!=null)
	{
	  MedicineNames[index] = medicine;
	  index++;
	  isAdded = true;
	  } else{
	   System.out.println("Cannot add the medicine as it is a null value");
	   }
	   return isAdded;
	   }
	   
	   public static void getMedicines()
	   {
	     for(String name : MedicineNames)
		 {
		   String reference = name;
		   System.out.println(reference);
		   }
		   }
		   
		   public static boolean updateMedicineNames(String existingMedicineName, String updatedMedicineName)
		   {
			     boolean isUpdated = false;
				 for(int medicineIndex = 0; medicineIndex < MedicineNames.length; medicineIndex++)
				 {
					 if(MedicineNames[medicineIndex] . equals(existingMedicineName))
					 {
						 MedicineNames[medicineIndex] = updatedMedicineName;
						 isUpdated = true;
					 }
				 }
				 System.out.println(" Updated Medicine is " +updatedMedicineName);
				 return isUpdated;
		   }
		   
     public static boolean deleteMedicineName(String deletedMedicine)
	{
		 boolean isDeleted = false;
		 int medicineIndex;
		 int noOfElements = MedicineNames.length;
		 for(medicineIndex = 0; medicineIndex < MedicineNames.length; medicineIndex++)
		 {
			 if(MedicineNames[medicineIndex] == deletedMedicine)
			 {
			   break;
		     }
         }
     if(medicineIndex <= noOfElements) 
	{
      noOfElements = noOfElements-1;
      for(int newmedicineIndex = medicineIndex; newmedicineIndex < noOfElements; newmedicineIndex++)
	  {
        MedicineNames[newmedicineIndex] = MedicineNames[newmedicineIndex+1];
	  }
	}
	System.out.println("Deleted medicine is" +deletedMedicine);
	return isDeleted;
  }

  public static void getAllMedicineNamesPostDeletion()
  {
   int noOfElements = MedicineNames.length-1;
   for(int medicineIndex = 0; medicineIndex < noOfElements; medicineIndex++)
   {
     System.out.println(MedicineNames[medicineIndex]);
   }
  }
}  
		 