import java.util.*;
/*
将自定义对象作为元素存到ArrayList集合中，并去除重复元素。

比如：存人对象，同姓名同年龄视为同一个人，为重复元素。

思路：
1，对人描述，将数据封装进人对象。
2，定义容器，将人存入。
3，取出。
 

List集合判断元素是否相同，依据的是元素的equals方法。
*/
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
//		System.out.println(this.name+"..."+p.name);
		return this.name.equals(p.name) && this.age ==p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}


class ArrayListTest2 
{
	public static ArrayList singleElement(ArrayList al)
	{
		ArrayList newAl = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}return newAl;
	}

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new Person("java01",20));//al.add(Object obj);---Object obj = new Person("list",24);
		al.add(new Person("java02",21));
		al.add(new Person("java03",23));
		al.add(new Person("java02",21));

		al = singleElement(al);
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Person p = (Person)it.next();//多态异常，需要做强转动作(向下转型)
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}
}
