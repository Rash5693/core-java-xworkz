class ChaiPoint
{
  
  static String chaiAvailable[] = {null, null, null, null, null, null, null, null, null, null};
static int index;

public static boolean addChai(String chai)
{
	boolean isAdded = false;
	if(chaiAvailable!=null) {
		 chaiAvailable[index] = chai;
		 index++;
		 isAdded = true;
	} else{
		System.out.println("Cannot add chai as it is a null value");
	}
	return isAdded;
}
  public static void getChaiPoint()
  {
    for(String name:chaiAvailable)
	{    
	String reference = name;
	System.out.println(reference);
	}
	}
	}