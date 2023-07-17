class Snacks{
	String snackName;
	double price;
	String hotOrCold;
	boolean isSpicy;

	Snacks(String sn, String hc, double p, boolean isp){
		snackName=sn;
		price=p;
		hotOrCold=hc;
		isSpicy=isp;
	}
	public static void printSnacks(Snacks obj){
		System.out.println("The Snack Name is "+obj.snackName);
		System.out.println("The price is: Rs"+obj.price+"");
		System.out.println("Hot or cold:"+obj.hotOrCold);
		System.out.println("Is it spicy :"+obj.isSpicy);
		System.out.println("");
	}
}