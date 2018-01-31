/*
集合框架的工具类
Collection
*/
import java.util.*;
class CollectionsDemo
{
	public static void main(String[] args) 
	{
		sortDemo();
		maxDemo();
		binarySearchDemo();
	}
	public static void binarySearchDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("abse");
		list.add("sd");
		list.add("f");
		list.add("angry");
		list.add("fine");
		Collections.sort(list);
		Collections.sort(list,new StrLenComparator());
		sop(list);

//		int index = halfSearch(list,"af");
		int index = halfSearch2(list,"ddd",new StrLenComparator());
		sop("index="+index);

	}
	
	public static int halfSearch(List<String> list,String key)
	{
		int max,min,mid;
		max = list.size()-1;
		min=0;
		while(min<=max)
		{
			mid =(max+min)/2;
			String str = list.get(mid);

			int num = str.compareTo(key);
			if(num>0)
				max = mid -1;
			else if(num<0)
				min = mid +1;
			else
				return mid;
		}
		return -min-1;
	}
	public static int halfSearch2(List<String> list, String key, Comparator<String> cmp)
	{
		int max,min,mid;
		max = list.size()-1;
		min=0;
		while(min<=max)
		{
			mid = (max+min)/2;
			String str = list.get(mid);
			int num = cmp.compare(str,key);
			if(num>0)
				max = mid- 1;
			else if(num<0)
				min = mid+1;
			else
				return mid;
		}return -min-1;
	}
	public static void maxDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("abse");
		list.add("ag");
		list.add("sf");
		list.add("gdgss");
		list.add("kkkkkk");
		Collections.sort(list);
		sop("排序前:"+list);
		String max = Collections.max(list,new StrLenComparator());
		sop("max="+max);
	}
	public static void sortDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("abse");
		list.add("ag");
		list.add("sf");
		list.add("gdgss");
		list.add("kkkkkk");
		Collections.sort(list);
		sop(list);
		Collections.sort(list,new StrLenComparator());
		sop(list);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

	//按照长度给字符串排序
class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}
/*
class Student
{
}
list.add(new Student());
public static <T extends Comparable<? super Y>> void sort(List<T> list)
{
}
*/