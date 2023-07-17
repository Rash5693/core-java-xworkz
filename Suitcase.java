class Suitcase{
	String suitcaseName;
	double price;
	double capacity;
	boolean inStock;

	Suitcase(String sn,double p,double c,boolean ins){
		suitcaseName=sn;
		price=p;
		capacity=c;
		inStock=ins;
	}

	public static void printDetails(Suitcase obj){
		System.out.println("Name:"+obj.suitcaseName);
		System.out.println("Price:"+obj.price);
		System.out.println("Capacity"+obj.capacity);
		System.out.println("In Stock:"+obj.inStock);
		System.out.println();

	}
}