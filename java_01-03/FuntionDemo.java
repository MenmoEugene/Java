/*
修饰符 返回值类型 函数名(参数类型 形式参数1, 参数类型 形式参数2)
{ 
	执行语句;
	return 返回值;
}
*/
class FuntionDemo 
{
	public static void main(String[] args) 
	{
		int m = Sum(6);
		System.out.println(m);
	}
	static int Sum(int x)
	{
		return x*3;
	}
}
