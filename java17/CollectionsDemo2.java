/*
fill 方法可以将list集合中所有元素替换成指定元素。
	将list集合中部分元素替换成指定元素。
*/
import java.util.*;
class CollectionsDemo2 
{
	public static void main(String[] args) 
	{
		fillDemo();
		replaceAllDemo();
	}
	public static void replaceAllDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("adbf");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");

		sop(list);
		//字符串替换
		Collections.replaceAll(list,"aaa","pp");
		//数组反转
		Collections.reverse(list);
		sop(list);
	}
	public static void fillDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("adbf");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");

		sop(list);
		Collections.fill(list,"pp");
		sop(list);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
