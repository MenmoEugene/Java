/* 
1,获取1~100的和，并打印。
2,1~100之间7的倍数的个数，并打印。
*/

class ForTest 
{
	public static void main(String[] args) 
	{
		Sum();
		SevenB();
	}
	public static void SevenB()
	{
		for (int x=1; x<=100; x++)
		{
			if(x%7==0)
				System.out.print(x+" ");
		}
	}

	public static void Sum()
	{
		int sum =0;
		for (int x=1; x<=10; x++)
		{
			sum+=x;
		}
		System.out.println("sum="+sum+";");
	}
	
}
