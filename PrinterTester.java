class PrinterTester{
	public static void main(String[] args) {
		Printer p1=new Printer("Hp","Colour",20000.0,150);
		Printer p2=new Printer("Hp","Black and white",20000.0 ,150);
		Printer p3=new Printer("Dell","Colour",25000.0 ,150);
		Printer p4=new Printer("Dell","Black and white",25000.0 ,150);
		Printer p5=new Printer("Lenovo","Colour",30000.0 ,150);
		Printer p6=new Printer("Lenovo","Black and white",30000.0 ,150);
		Printer p7=new Printer("Sony","Colour",35000.0 ,150);
		Printer p8=new Printer("Sony","Black and white",35000.0 ,150);
		Printer p9=new Printer("Shell","Colour",10000.0 ,150);
		Printer p10=new Printer("Shell","Black and white",10000.0 ,150);

		p1.printDetails(p1);
		p2.printDetails(p2);
		p3.printDetails(p3);
		p4.printDetails(p4);
		p5.printDetails(p5);
		p6.printDetails(p6);
		p7.printDetails(p7);
		p8.printDetails(p8);
		p9.printDetails(p9);
		p10.printDetails(p10);




	}
}