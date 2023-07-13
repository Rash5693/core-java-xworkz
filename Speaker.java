class Speaker
{
  static String name = "JBI";;
  static int minVolume;
  static int currentVolume;
  static int maxVolume=10;
  static boolean isConnected;
  
  public static boolean onOrOff()
  {
  System.out.println(" invoking onOrOff()");
  System.out.println("Parameter" + 0 );
  if(isConnected==false)
  {
   isConnected = true;
   System.out.println(" System is turned on");
   
  }
  else
  if(isConnected==true)
  {
  isConnected = false;
  System.out.println(" System is turned off ");
  }
  return isConnected;
  }
  
  public static void increaseVolume()
  {
	  if(isConnected == true)
	  {
		  if(currentVolume < maxVolume)
		  {
			 currentVolume = currentVolume + 1;
			 System.out.println("The current volume is"+currentVolume);
		  }
		  else
		  {
			  System.out.println("Max volume reached");
		  }
		  
	  } else {
		  System.out.println("Connect the speaker");
	  }
  }
  public static void decreaseVolume()
  {
	  if(isConnected == true)
	  {
		  if(currentVolume > minVolume)
		  {
			  currentVolume = currentVolume - 1;
			  System.out.println(" The Current volume is "+currentVolume);
		  }
		  else{
			  System.out.println("Min volume reached");
		  }
	  }
	  else {
		  System.out.println(" Connect the speaker");
		  }
	  }
  }
}
  