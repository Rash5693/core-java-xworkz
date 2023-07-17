class SnacksTester{
	public static void main(String[] args) {
		Snacks obj1=new Snacks("Masala puri","hot",30.0 ,true);
		Snacks obj2=new Snacks("Samosa","hot",20.0 ,true);
		Snacks obj3=new Snacks("Chips","Cold",15.0 ,false);
		Snacks obj4=new Snacks("Ice cream","Cold",40.0 ,false);
		Snacks obj5=new Snacks("Chocolate","Cold",40.0 ,false);
		Snacks obj6=new Snacks("Bhel puri","Cold",35.0 ,true);
		Snacks obj7=new Snacks("Rolls","Hot",60.0 ,true);
		Snacks obj8=new Snacks("French fries","hot",60.0 ,false);
		Snacks obj9=new Snacks("Sandwich","hot",40.0 ,false);
		Snacks obj10=new Snacks("Oreo Milkshake","Cold",40.0 ,false);
		
		obj1.printSnacks(obj1);
		obj2.printSnacks(obj2);
		obj3.printSnacks(obj3);
		obj4.printSnacks(obj4);
		obj5.printSnacks(obj5);
		obj6.printSnacks(obj6);
		obj7.printSnacks(obj7);
		obj8.printSnacks(obj8);
		obj9.printSnacks(obj9);
		obj10.printSnacks(obj10);
	}
}