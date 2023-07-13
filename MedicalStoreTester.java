class MedicalStoreTester
{
  public static void main(String args[])
  {
    MedicalStore.addMedicine("Dolo 650");
	MedicalStore.addMedicine("Solvin Cold");
	MedicalStore.addMedicine("Aspirin");
	MedicalStore.addMedicine("Enalapril");
	MedicalStore.addMedicine("Doxycyclin");
	MedicalStore.addMedicine("Atorvastatin");
	MedicalStore.addMedicine("Hydrochlorothiazide");
	MedicalStore.addMedicine("Atenolol");
	MedicalStore.addMedicine("Trazodone");
	MedicalStore.getMedicines();
	MedicalStore.deleteMedicineName("Hydrochlorothiazide");
	MedicalStore.getAllMedicineNamesPostDeletion();
	
	}
	}