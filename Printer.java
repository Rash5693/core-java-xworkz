class Printer{

	String printerName;
	String typeOfPrinter;
	double price;
	int noOfSheets;

	Printer(String name, String top, double p, int nos){
		printerName=name;
		typeOfPrinter=top;
		price=p;
		noOfSheets=nos;
	}
	public static void printDetails(Printer obj){
		System.out.println("Printer name: "+obj.printerName);
		System.out.println("Type of printer :"+obj.typeOfPrinter);
		System.out.println("Price : Rs"+obj.price);
		System.out.println("Sheet storage :"+obj.noOfSheets+" Sheets");
		System.out.println();
	}
}