//JDK1.5版本以后出现的新特性。
class IntegerDemo1 
{
	public static void main(String[] args) 
	{
//		Integer x = new Integer(4);

		Integer x = 4;
		 
		x = x+2;

		Integer m =128;
		Integer n =128;
		System.out.println("m==n:"+(m==n));
		
		Integer a = 127;
		Integer b = 127;
		System.out.println("a==b:"+(a==b));

	}

	public static void method()
	{
		Integer x = new Integer("123");
		Integer y = new Integer(123);

		System.out.println("x==y:"+(x==y));
		System.out.println("x.equals(y)"+x.equals(y));
	}
}
