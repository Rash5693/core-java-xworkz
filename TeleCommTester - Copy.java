class TeleCommTester
{
  public static void main(String args[])
  {
   TeleComm.addSim("Airtel");
   TeleComm.addSim("BSNL");
   TeleComm.addSim("Jio");
   TeleComm.addSim("Vodafone");
   TeleComm.addSim("Docomo");
   TeleComm.getSim();
   TeleComm.deleteSimNames("BSNL");
   TeleComm.getAllSimNamesPostDeletion();
   
   }
   }
   