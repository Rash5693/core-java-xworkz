class Televisionn
{
  static String name = "Sony";;
  static int minChannel=1;
  static int currentChannel=22;
  static int maxChannel=50;
  static boolean isPowered;
  
  public static boolean onOrOff()
  {
  System.out.println(" invoking onOrOff()");
  System.out.println("Parameter" + 0 );
  if(isPowered==false)
  {
   isPowered = true;
   System.out.println(" TV is turned on");
   
  }
  else
  if(isPowered==true)
  {
  isPowered = false;
  System.out.println(" TV is turned off ");
  }
  return isPowered;
  }
  
  public static void increaseChannel()
  {
	  if(isPowered == true)
	  {
		  if(currentChannel < maxChannel)
		  {
			 currentChannel = currentChannel + 1;
			 System.out.println("The current channel is"+currentChannel);
		  }
		  else
		  {
			  System.out.println("Max channel reached" );
		  }
		  
	  } else {
		  System.out.println("Turn on the TV");
	  }
  }
  public static void decreaseChannel()
  {
	  if(isPowered == true)
	  {
		  if(currentChannel > minChannel)
		  {
			  currentChannel = currentChannel-1;
			  System.out.println(" The Current channel is "+currentChannel);
		  }
		  else{
			  System.out.println("Min channel reached" +currentChannel);
		  }
	  }
	  else {
		  System.out.println(" Turn on  the TV");
	  }
  }
}