/*
Object：所有对象的直接或者间接父类。
该类中定义了所有对象都具备的功能。

Object类中已经提供了对对象是否相同的方法。 

如果自定义类中也有比较相同的功能，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有比较内容即可，这就是覆盖。
*/
class Demo 
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)//Object obj = new Demo(); 多态
	{
		Demo d = (Demo)obj;//向下转型
		return this.num == d.num;
	}
	/*
	public boolean compare(Demo d)
	{
		return this.num == num;
	}
	*/
}

class Person 
{

}

class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(4);
		Person p = new Person();
		System.out.println(d1.equals(p));
	}
}
