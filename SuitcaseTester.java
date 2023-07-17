class SuitcaseTester{
	public static void main(String[] args) {
		Suitcase s1= new Suitcase("VIP", 2000.0,20.0,true);
		Suitcase s2= new Suitcase("Wildcraft", 3000.0,15.0,false);
		Suitcase s3= new Suitcase("American Tourist", 4000.0,30.0,true);
		Suitcase s4= new Suitcase("American", 1500.0,20.0,false);
		Suitcase s5= new Suitcase("Tourister", 4600.0,50.0,true);
		Suitcase s6= new Suitcase("Sky bags", 1300.0,20.0,false);
		Suitcase s7= new Suitcase("wildcraft", 1400.0,60.0,true);
		Suitcase s8= new Suitcase("Puma", 4000.0,20.0,false);
		Suitcase s9= new Suitcase("Adidas", 6000.0,40.0,true);
		Suitcase s10= new Suitcase("Nike", 2400.0,20.0,false);

		s1.printDetails(s1);
		s2.printDetails(s2);
		s3.printDetails(s3);
		s4.printDetails(s4);
		s5.printDetails(s5);
		s6.printDetails(s6);
		s7.printDetails(s7);
		s8.printDetails(s8);
		s9.printDetails(s9);
		s10.printDetails(s10);



	}
}