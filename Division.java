class Division
{
 public static void main(String args[])
 {
    div(88,24,2);
	div(80,30,1);
	div(40,28,4);
	div(36,13,1);
	div(78,34,2);
	div(63,12);
	div(79,56);
	div(49,34);
	div(78,24);
	div(98,24);
 }
 public static void div(int a, int b)
 {
   System.out.println(a/b);
 }
 public static void div(int a, int b, int c)
 {
   System.out.println(a/b/c);
 }
}