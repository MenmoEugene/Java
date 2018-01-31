//语句嵌套形式,其实就是语句中还有语句.
//循环嵌套
//外循环控制行数,内循环控制每一行的列数,也就是一行中元素的个数。
class ForTest2 
{
	public static void main(String[] args) 
	{
		shun();
		dao();
	}

	public static void shun()
	{
		for (int x=1; x<=5; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------");
	}

	public static void dao()
	{
		for (int x=5; x>=0; x--)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
