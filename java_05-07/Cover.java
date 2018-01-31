/* 
子父类中的函数

当子类出现父类一模一样的函数时，
子类对象调用该函数，会运行子类函数的内容。
如同父类的函数被覆盖一样。
这种情况是函数的另一个特性：重写（覆盖）

当子类继承父类，沿袭了父类的功能到子类中，
但是子类虽具备该功能，但功能的内容和父类不一致，
这时，没有表定义新功能，而是使用覆盖特性，保留父类的功能定义，并重写功能内容。

覆盖：
1、子类覆盖父类，必须保证子类权限大于等于父类权限才可以覆盖，否则编译失败。
2、静态只能覆盖静态

重载：只看同名函数的参数列表。
重写：子父类方法要一模一样。
*/
class Cover 
{
	public static void main(String[] args) 
	{
		NewTel nt = new NewTel();
		nt.show();
	}
}

class Tel
{
	public void show()
	{
		System.out.println("num");
	}
}

class NewTel extends Tel
{
	public void show()
	{
		super.show();
		System.out.println("name");
	}
}