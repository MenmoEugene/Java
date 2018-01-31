class OtherDemo
{ 
	//break：跳出当前循环
	public static void main(String[] args) 
	{
		w:for (int x=0; x<4; x++)
		{
			q:for (int y=0; y<4; y++)
			{
				System.out.print(x);
				break q;
			}
			System.out.println();
		}
	
	//continue：只能作用于循环结构，继续循环。特点：结束本次循环，继续下一次循环。
		for (int x=1; x<10; x++)
		{
			if(x%2==1)
					continue;
				System.out.print(x);
		}
	}
	/*
	记住：
		1，break和continue语句作用的范围。
		2，break和continue单独存在时，下面不可以有任何语句，因为都执行不到。
	*/
}
