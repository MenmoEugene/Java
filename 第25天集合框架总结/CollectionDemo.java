package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
	}
	public static void show(Collection c1,Collection c2){
		//给c1、c2添加元素
		c1.add("demo1");
		c1.add("demo2");
		c1.add("demo3");
		c2.add("demo2");
		c2.add("demo4");
		c2.add("demo5");
		
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
//		c1.addAll(c2); //将c2中的元素添加到c1中。
//		System.out.println("c1:"+c1);
		
		//演示removeAll
//		boolean b = c1.removeAll(c2);//将两个集合中的相同元素从调用removeAll的集合中删除。
//		System.out.println("removeAll:"+b);
		
		//演示containsAll
//		boolean b = c1.containsAll(c2);
//		System.out.println("containsAll:"+b);
		
		//演示retianAll
		boolean b = c1.retainAll(c2);//取交集,保留和指定的集合相同的元素，而删除不同的元素。和removeAll功能相反。
		System.out.println("c1"+c1);
	}
	public static void show(Collection coll){
		//1,添加元素。add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");

		System.out.println(coll);
		

		//2，输出元素
		coll.remove("abc3");
		System.out.println(coll.contains("abc3"));
		System.out.println(coll);
	}
}
