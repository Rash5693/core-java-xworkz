class Netflix
{
static String kannadaMovies[]={"Upendra","Kabzaa","Super","H20","Topiwala","Aishwarya","Buddhivantha","Hollywood",
"Super Ranga","Parodi","Kantara","777 Charlie","K.G.F","K.G.F 2","Kirik Party","Vikrant Rona","Kranti","Robert","ugram",
"Googly","Pogaru","Dia","BellBottom","OM","A"};

static String tamilMovies[]={"Ghilli","Youth","Sivakasa","Thuppaki","Puli","Bhairava","Theri","Bigil","Master","Leo",
"Sarkar","Jilla","Varisu","Beast","ATM","Pokkiri","Villa","Adi","Sura","Love Today","Once more","Vikram","Vaathi",
"Kaththi","Thalavi"};

static String teluguMovies[]={"Custody","Dasara","Sir","Sita ram","Pushpa","Bahubali","Happy","RRR","Ravanasura"
,"HIT 1","HIT 2","Evarasu","Bahubali2","Dhamaka","Jersey","Love Story","Dj","Tilla","Arya","Arya2","Eega","AAA","Pushpa2",
"Virupaksha","liger"};

static String englishMovies[]={"HomeAlone","FastAndFurious1","FastAndFurious2","FastAndFurious3","FastAndFurious4","FastAndFurious5","FastAndFurious6","FastAndFurious7","FastAndFurious8","FastAndFurious9",
"FastX","GodFather","Hangover1","Hangover2","Hangover3","Hulk","Spider Man","Ant Man","Iron Man","Batman","Superman","Thor","Black Ador","Captain America","DARK"};

static String hindiMovies[]={"Krish1","Krish2","krish3","Dhoom1","Dhoom2","Dhoom3","Kabir Singh","Drishyam","Drishyam2",
"Doctor G","Housefull1","Housefull2","Housefull3","Housefull Return","gulty","Gully boy","Jersey","uri","Pathaan",
"Super 30","Vijay Sir","Tadap","radhe","Thappad","Anek"};

public static void main(String args[])
{
	System.out.println("Main started");
	System.out.println("LIST OF KANNADA MOVIES ARE");
	getKannadaMovies();
	System.out.println("LIST OF TAMIL MOVIES ARE");
	getTamilMovies();
	System.out.println("LIST OF TELUGU MOVIES ARE");
	getTeluguMovies();
	System.out.println("LIST OF ENGLISH MOVIES ARE");
	getEnglisgMovies();
	System.out.println("LIST OF HINDI MOVIES ARE");
	getHindiMovies();
}
public static void getKannadaMovies()
{
	
 for(String kannadaMovie : kannadaMovies)
 {
	 System.out.println(kannadaMovie);
 }
}
public static void getTamilMovies()
{
 for(String tamilMovie : tamilMovies)
 {
	  System.out.println(tamilMovie);
 }
}
public static void getTeluguMovies()
{
 for(String teluguMovie : teluguMovies)
 {
	  System.out.println(teluguMovie);
 }
}
public static void getEnglisgMovies()
{
 for(String englishMovie : englishMovies)
 {
	 System.out.println(englishMovie);
 }
}
public static void getHindiMovies()
{
 for(String hindiMovie : hindiMovies)
 {
	 System.out.println(hindiMovie);
 }
}
}

	 
	 
 
	 