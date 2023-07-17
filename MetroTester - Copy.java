class MetroTester
{
  public static void main(String args[])
  {
   Metro.addStation("Dasarahalli");
   Metro.addStation("Jalahalli");
   Metro.addStation("Peenya Industry");
   Metro.addStation("Peenya");
   Metro.addStation("Goragontepalya");
   Metro.addStation("Yeshwantpur");
   Metro.addStation("Sandal soap factory");
   Metro.getStations();
   Metro.deleteStationNames("Goragontepalya");
   Metro.getAllStationNamesPostDeletion();
   }
   }