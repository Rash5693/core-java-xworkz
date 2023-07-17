class Wallet{
	String brandname;
	double price;
	boolean isLeather;
	int noOfCompartments;

	Wallet(String bn, double p, boolean isl, int noc){
		brandname=bn;
		price=p;
		isLeather=isl;
		noOfCompartments=noc;
	}

	public static void printDetails(Wallet obj){
		System.out.println("Wallet Brand: "+obj.brandname);
		System.out.println("Price: "+obj.price);
		System.out.println("Leather: "+obj.isLeather);
		System.out.println("No of Compartment:"+obj.noOfCompartments);
		System.out.println();

	}
}