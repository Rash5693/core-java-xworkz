class AC
{
  static String name = "Godrej";;
  static int minTemperature=18;
  static int currentTemperature=22;
  static int maxTemperature=26;
  static boolean isPowered;
  
  public static boolean onOrOff()
  {
  System.out.println(" invoking onOrOff()");
  System.out.println("Parameter" + 0 );
  if(isPowered==false)
  {
   isPowered = true;
   System.out.println(" AC is turned on");
   
  }
  else
  if(isPowered==true)
  {
  isPowered = false;
  System.out.println(" AC is turned off ");
  }
  return isPowered;
  }
  
  public static void icreaseTemperature()
  {
	  if(isPowered == true)
	  {
		  if(currentTemperature < maxTemperature)
		  {
			 currentTemperature = currentTemperature + 1;
			 System.out.println("The current Temperature is"+currentTemperature);
		  }
		  else
		  {
			  System.out.println("Max temperature reached" );
		  }
		  
	  } else {
		  System.out.println("Turn on the AC");
	  }
  }
  public static void decreaseTemperature()
  {
	  if(isPowered == true)
	  {
		  if(currentTemperature > minTemperature)
		  {
			  currentTemperature = currentTemperature-1;
			  System.out.println(" The Current temperature is "+currentTemperature);
		  }
		  else{
			  System.out.println("Min temperature reached" +currentTemperature);
		  }
	  }
	  else {
		  System.out.println(" Turn on  the AC");
	  }
  }
}
  