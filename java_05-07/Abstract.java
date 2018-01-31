/* 
当多个类中出现相同功能，但是功能主体不同，
这是可以进行向上抽取。只抽取功能定义，而不抽取功能主体。

抽象即看不懂。

抽象的特点：
	1，抽象方法一定在抽象类中。
	2，抽象方法和抽象类都必须被abstract关键字修饰。
	3，抽象类不可以用new创建对象，因为调用抽象方法没意义。
	4，抽象类中的抽象方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
		如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。

抽象类和一般类没有太大的不同。
该如何描述事物就如何描述事物，只不过该事物出现了一些看不懂的东西，
这些不确定的部分，也是该事物的功能，需要明确出现。但是无法定义主体。
通过抽象方法来表示。

抽象类比一般类多了个抽象函数，就是在类中可以定义抽象方法。
抽象类不可以实例化。

特殊：抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象。
*/
abstract class Student 
{
	private String name;
	private String sex;
	private int age;
	Student(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public abstract void live();
}

class Personal extends Student
{
	private String hobby;
	Personal(String name,String sex,int age,String hobby)
	{
		super(name,sex,age);
		this.hobby = hobby;
		System.out.println("<"+name+",\""+sex+"\","+age+">");
	}
	public void live()
	{
		System.out.println("easy to live");
	}
}

class Classmate extends Student
{
	private String custom;
	Classmate(String name,String sex,int age,String custom)
	{
		super(name,sex,age);
		this.custom = custom;
		System.out.println("<"+name+",\""+sex+"\","+age+">");
	}
	public void live()
	{
		System.out.println("active to live");
	}
}

class Abstract 
{
	public static void main(String[] args) 
	{
		Classmate c = new Classmate("xml","female",23,"up and down");
		c.live();
		Personal p = new Personal("menmo","male",24,"sport");
		p.live();
	}
}
