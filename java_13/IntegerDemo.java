/*
基本数据类型对象包装类。

byte	Byte
short	Short
int	Integer
long	Long
boolean	Boolean
float	Float
double	Double 
char	Character


基本数据类型对象包装类的最常见作用，
就是用于基本数据类型和字符串类型之间做转换

基本数据类型转成字符串。

	基本数据类型+""

	基本数据类型.toString(基本数据类型值);

	如：Integer.toString(34);//将34整数变成"34";

字符串转成基本数据类型。
	
	xxx a Xxx.parseXxx(String);

	int a = Integer.parseInt("124");

	double b = Double.parseDouble("12.34");

	boolean b = Boolean.parseBoolean("true");

	 非静态调用：
		Integer i = new Integer("123");
		
		int num = i.intValue();

十进制转成其他进制。
	toBinaryString();2
	toHexString();	 8
	toOctalString(); 16

其他进制转成十进制。
	parseInt(String,radix);//("数值",进制数)
	
*/
class IntegerDemo
{
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		//打印整数类型的最大值
		sop("int max:"+Integer.MAX_VALUE);

		//将一个字符串转成整数。
		int num = Integer.parseInt("321");//必须传入数字格式的字符串。
		long x = Long.parseLong("123");

		sop("num="+(num+4));
		sop(Integer.toBinaryString(-6));
		sop(Integer.toOctalString(60));

		int y = Integer.parseInt("3c",16);

		sop("y="+y);
	}
}
