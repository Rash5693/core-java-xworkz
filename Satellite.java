class Satellite{
	String country;
	String launchLocation;
	int launchYear;
	boolean isOperational;
	Satellite(String c,String ll,int ly,boolean iso){
     country=c;
     launchLocation=ll;
     launchYear=ly;
     isOperational=iso;
	}

	public static void printDetails(Satellite obj){
		System.out.println("The Satellite country is:"+obj.country);
		System.out.println("The Launch location:"+obj.launchLocation);
		System.out.println("Launch Year:"+obj.launchYear);
		System.out.println("Is Still operational:"+obj.isOperational);
		System.out.println();

	}
}