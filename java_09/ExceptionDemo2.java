class Demo
{
	int div(int a,int b)throws Exception/在功能上通过throws的关键字声明了该功能有可能会出现问题
	{
		return a/b;
	}
}
class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,1);
			System.out.println("x="+x); 
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("over");
	}
}
