class CricketMania
{
  static String topBatsmen[]={"Virat","Rohit","Gill","AB","Maxwell","MSD","Warner","Smith","William","KL Rahul"};
  static String topICCTeam[]={"Ind","Eng","NZ","Pak","SA","Aus","WI","SI","Ban","Afg"};
  static String topIplTeam[]={"RCB","CSK","MI","GT","KKR","SRH","LSG","PBKS","RR","DC"};
  public static void main(String args[])
  {
  System.out.println("Main Started");
  for(String topBatsmens : topBatsmen)
  {
	  System.out.println(topBatsmens);
  }
  for(String topICCTeams : topICCTeam)
  {
	  System.out.println(topICCTeams);
  }
  for(String topIPLTeams : topIplTeam)
  {
	  System.out.println(topIPLTeams);
  }
 
  System.out.println("Main Ended");
  }
  }