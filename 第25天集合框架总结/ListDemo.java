package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
		show(list);
	}

	private static void show(List list) {
		
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//插入元素
		list.add(1,"abc6");
		System.out.println(list);
		
		//删除元素
		System.out.println("remove:"+list.remove(2));
		
		//修改元素
		System.out.println("set:"+list.set(1, "abc4"));
		
		//获取子列表
		System.out.println("sublist:"+list.subList(1,2));
		System.out.println(list);
	}

}
