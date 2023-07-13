class Mixer
{
  static String name = "Preethi";;
  static int minSpeed;
  static int currentSpeed=2;
  static int maxSpeed=5;
  static boolean isPowered;
  
  public static boolean onOrOff()
  {
  System.out.println(" invoking onOrOff()");
  System.out.println("Parameter" + 0 );
  if(isPowered==false)
  {
   isPowered = true;
   System.out.println(" Mixer is turned on");
   
  }
  else
  if(isPowered==true)
  {
  isPowered = false;
  System.out.println(" Mixer is turned off ");
  }
  return isPowered;
  }
  
  public static void icreaseSpeed()
  {
	  if(isPowered == true)
	  {
		  if(currentSpeed < maxSpeed)
		  {
			 currentSpeed = currentSpeed + 1;
			 System.out.println("The current Speed is"+currentSpeed);
		  }
		  else
		  {
			  System.out.println("Max Speed reached");
		  }
		  
	  } else {
		  System.out.println("Turn on the Mixer");
	  }
  }
  public static void decreaseSpeed()
  {
	  if(isPowered == true)
	  {
		  if(currentSpeed > minSpeed)
		  {
			  currentSpeed = currentSpeed -1;
			  System.out.println(" The Current speed is "+currentSpeed);
		  }
		  else{
			  System.out.println("Min speed reached");
		  }
	  }
	  else {
		  System.out.println(" Turn on  the Mixer");
	  }
  }
}
  