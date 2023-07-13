class Modulus
{
  public static void main(String args[])
  {
    mod(88,42,5);
	mod(76,21,3);
	mod(80,32,5);
	mod(78,24,3);
	mod(88,22,2);
	mod(68,13);
	mod(93,32);
	mod(89,14);
	mod(70,45);
	mod(80,43);
	}
	public static void mod(int a, int b)
	{
	 System.out.println(a%b);
	 }
	 public static void mod(int a, int b, int c)
	{
	 System.out.println(a%b%c);
	 }
}