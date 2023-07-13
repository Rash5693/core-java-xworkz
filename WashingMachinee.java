class WashingMachinee
{
  static String name = "Panasonic";;
  static int minTime=10;
  static int currentTime=30;
  static int maxTime=90;
  static boolean isPowered;
  
  public static boolean onOrOff()
  {
  System.out.println(" invoking onOrOff()");
  System.out.println("Parameter" + 0 );
  if(isPowered==false)
  {
   isPowered = true;
   System.out.println(" Washing machine is turned on");
   
  }
  else
  if(isPowered==true)
  {
  isPowered = false;
  System.out.println(" Washing machine is turned off ");
  }
  return isPowered;
  }
  
  public static void increaseTime()
  {
	  if(isPowered == true)
	  {
		  if(currentTime < maxTime)
		  {
			 currentTime = currentTime + 1;
			 System.out.println("The current time is" +currentTime);
		  }
		  else
		  {
			  System.out.println("Max time reached" );
		  }
		  
	  } else {
		  System.out.println("Turn on the Washing machine");
	  }
  }
  public static void decreaseTime()
  {
	  if(isPowered == true)
	  {
		  if(currentTime > minTime)
		  {
			  currentTime = currentTime-1;
			  System.out.println(" The Current time is " +currentTime);
		  }
		  else{
			  System.out.println("Min time reached" +currentTime);
		  }
	  }
	  else {
		  System.out.println(" Turn on  the Washing machine");
	  }
  }
}