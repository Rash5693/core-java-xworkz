class SatelliteTester{
	public static void main(String[] args) {
		
		Satellite s1=new Satellite("India","Andra Pradesh",2000, true);
		Satellite s2=new Satellite("India","Gujrat",2010, false);
		Satellite s3=new Satellite("Russia","Moscow",2000, true);
		Satellite s4=new Satellite("Russia","Gaitlin",2020, false);
		Satellite s5=new Satellite("USA","Los Angles",2006, true);
		Satellite s6=new Satellite("USA","Texas",1999, false);
		Satellite s7=new Satellite("China","Beijing",2015, true);
		Satellite s8=new Satellite("China","Beijing",2012, false);
		Satellite s9=new Satellite("Europe","London",2004, true);
		Satellite s10=new Satellite("Europe","France",2001, false);

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