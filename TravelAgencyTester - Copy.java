class TravelAgencyTester
{
  public static void main(String args[])
  {
    TravelAgency.addPlaces("Manali");
	TravelAgency.addPlaces("Kerala");
	TravelAgency.addPlaces("Shimla");
	TravelAgency.addPlaces("Goa");
	TravelAgency.addPlaces("Singapore");
	TravelAgency.addPlaces("Malaysia");
	TravelAgency.addPlaces("Paris");
	TravelAgency.addPlaces("Maldives");
	TravelAgency.getPlaces();
	TravelAgency.deletePlaceNames("Shimla");
	TravelAgency.getAllPlaceNamesPostDeletion();
	}
	}