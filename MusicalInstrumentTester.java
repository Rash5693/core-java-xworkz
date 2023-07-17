class MusicalInstrumentTester{
	public static void main(String[] args) {
		MusicalInstrument m1=new MusicalInstrument("Guitar",2000.0,false,true);
		MusicalInstrument m2=new MusicalInstrument("Electric Guitar",3500.0,true,true);
		MusicalInstrument m3=new MusicalInstrument("Drums",5000.0,false,true);
		MusicalInstrument m4=new MusicalInstrument("Flute",1500.0,false,false);
		MusicalInstrument m5=new MusicalInstrument("Musical Keyboard",2000.0,true,true);
		MusicalInstrument m6=new MusicalInstrument("Piano",20000.0,false,false);
		MusicalInstrument m7=new MusicalInstrument("Violin",2500.0,false,true);
		MusicalInstrument m8=new MusicalInstrument("Trumpet",2000.0,false,false);
		MusicalInstrument m9=new MusicalInstrument("Harmonica",2000.0,false,true);
		MusicalInstrument m10=new MusicalInstrument("Electric Drum",2000.0,true,false);

		m1.printDetails(m1);
		m2.printDetails(m2);
		m3.printDetails(m3);
		m4.printDetails(m4);
		m5.printDetails(m5);
		m6.printDetails(m6);
		m7.printDetails(m7);
		m8.printDetails(m8);
		m9.printDetails(m9);
		m10.printDetails(m10);



	}
}