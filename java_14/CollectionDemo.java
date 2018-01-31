/*
1,add方法的参数类型是Object，以便于接受任意类型对象。
2，集合中存储的都是对象的引用(地址)

什么是迭代器?
其实就是集合取出元素的方式
*/

import java.util.*;
class CollectionDemo 
{
	public static void method_get()
	{
		ArrayList al = new ArrayList();
		al.add("java01"); 
		al.add("java02");
		al.add("java03");
		al.add("java04");

		Iterator it = al.iterator();//获取迭代器，用于取出集合中的元素。
		while(it.hasNext())
		{
			sop(it.next());
		}
/*内存更优化
		for(Iterator it = al.iterator();it.hasNext();)
		{
			sop(it.next());
		}
*/
	}
	public static void method_get2()
	{
		ArrayList al1 = new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		ArrayList al2 = new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		al1.retainAll(al2);//取交集，al1中只会保留和al2中相同的元素。
		al1.removeAll(al2);//删除相同的交集

		sop("al1:"+al1);
		sop("al2:"+al2);
	}
	public static void method_base()
	{
		ArrayList a1 = new ArrayList();//创建一个集合容器，使用Collection接口的子类，ArrayList
		a1.add("java01");//添加元素
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");

		sop("原集合:"+a1);

//		a1.remove("java02");//删除元素
//		a1.clear();//清空集合

		sop("java03是否存在:"+a1.contains("java03"));//判断元素
		sop("集合是否为空？"+a1.isEmpty());

		sop("size:"+a1.size());//获取个数，集合长度

		sop(a1);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		method_get();
		method_base();
	}
}
