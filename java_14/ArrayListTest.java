import java.util.*;
//ȥ��ArrayList�����е��ظ�Ԫ��
class ArrayListTest 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01"); 
		al.add("java02");
		al.add("java03");
		al.add("java02");
/*
		�ڵ���ʱѭ����next����һ�Σ���ҪhasNext�ж�һ�Ρ�
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"...."+it.next());
		}
*/
		System.out.println(al);
		al = singleElement(al);
		System.out.println(al);
	}

	public static ArrayList singleElement(ArrayList al)
	{
		ArrayList newAl = new ArrayList();
		Iterator it = al.iterator();
		while (it.hasNext())
		{
			Object obj = it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}return newAl;
	} 
}