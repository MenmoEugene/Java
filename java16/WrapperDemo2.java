class WrapperDemo2
{
	public static void main(String[] args) 
	{
		int num =4;//i = new Integer(4);自动装箱，简化书写
		Integer i = 4;//i = new Integer(i.intValue() + 6);//i.intValue() 自动拆箱

		Integer a = new Integer(128);//false
		Integer b = new Integer(128);//true
		
		System.out.println(a==b);//JDK1.5以后自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		System.out.println(a.equals(b));

//		show(66);
		
		Integer x = 129;
		Integer y = 129;
		System.out.println(x==y);//true
		System.out.println(x.equals(y));//false
	}
		public static void show(Object a)//Object a = new Integer(66);
		{
			System.out.println("a="+a);
		}
}
