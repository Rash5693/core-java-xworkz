class WalletTester{
	public static void main(String[] args) {
		Wallet w1= new Wallet("Allen Solly",500.0 , true,4);
		Wallet w2= new Wallet("Amazon",500.0 , false,3);
		Wallet w3= new Wallet("Myntra",600.0 , true,4);
		Wallet w4= new Wallet("Flipkart",600.0 , false,5);
		Wallet w5= new Wallet("Bata",1000.0 , true,4);
		Wallet w6= new Wallet("Puma",1000.0 , false,5);
		Wallet w7= new Wallet("Adidas",1500.0 , true,3);
		Wallet w8= new Wallet("Nike",1500.0 , false,4);
		Wallet w9= new Wallet("Peter England",2000.0 , true,4);
		Wallet w10= new Wallet("Titan",2000.0 , false,5);

		w1.printDetails(w1);
		w2.printDetails(w2);
		w3.printDetails(w3);
		w4.printDetails(w4);
		w5.printDetails(w5);
		w6.printDetails(w6);
		w7.printDetails(w7);
		w8.printDetails(w8);
		w9.printDetails(w9);
		w10.printDetails(w10);


	}
}