class FunctionDemo2 
{ 
	public static void main(String[] args) 
	{
//		int sum = getSum(6,8);
//		
//		System.out.println("sum="+sum);
		System.out.println(compareTo(-22,22));
	}
	/*
	如何定义一个函数？
	1，既然函数是一个独立的功能，那么该功能的运算结果是什么先明确。
	2，在明确定义该功能的过程中是否需要未知的内容参与运算。

	需求：定义一个3+4的运算，并将结果返回给调用者。

	1，明确功能的结果，是一个整数的和。
	2，在实现该功能的过程中是否有未知内容参与运算：没有。
	其实这两个功能就是在明确函数的定义。

	1，是在明确函数的返回值类型。
	2，明确函数的参数列表(参数的类型和参数的个数)。
	
	*/
	public static int getSum(int x,int y)
	{
		return x+y;
	}

/*
	需求：定义功能，对两个数进行比较，获取较大的数。

*/
	public static int compareTo(int a ,int b)
	{
		return (a>b)?a:b;
	}
}
