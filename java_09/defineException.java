/*
因为项目中会出现特有的问题。
而这些问题并未被java所描述并封装对象。
所以对于这些特有的问题可以按照java对问题封装的思想。
讲特有的问题进行自定义的异常封装。

自定义异常
需求：在本程序中，对于除数时负数也视为错误的，无法进行运算的。
那么久需要对这个问题进行自定义的描述。

当在函数内部出现了throw抛出异常对象，那么久必须要给对应的处理动作。
要么在内部try catch处理
or 在函数上声明让调用者处理。

一般情况下，函数内出现异常，函数上需要声明。

如何定义异常信息呢？
因为父类中已经把异常信息的操作都完成了
所以子类只要在构造时，通过super语句将异常信息传递给父类。
这样就可以直接通过getMessage方法获取自定义的异常信息。

自定义异常：
必须是自定义类继承Exception。

继承Exception原因： 
异常体系有一个特点：因为异常类和异常对象都被抛出。
他们都具备可抛性，这个可抛性是Throwable这个体系中独有特点。
只有这个体系中的类和对象才可以被throws 和 throw 操作。
*/

class minusException extends Exception
{
	minusException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	int div(int a,int b)throws minusException
	{
		if(b<0)
			throw new minusException("参数出错了，被除数和除数不能为负数");
		return a/b;
	}
}
class defineException 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (minusException e)
		{
			System.out.println(e.toString());
			System.out.println("输入违规内容了");
		}
		System.out.println("over");
	}
}
