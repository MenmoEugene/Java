/*
1,add�����Ĳ���������Object���Ա��ڽ����������Ͷ���
2�������д洢�Ķ��Ƕ��������(��ַ)

ʲô�ǵ�����?
��ʵ���Ǽ���ȡ��Ԫ�صķ�ʽ
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

		Iterator it = al.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�
		while(it.hasNext())
		{
			sop(it.next());
		}
/*�ڴ���Ż�
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

		al1.retainAll(al2);//ȡ������al1��ֻ�ᱣ����al2����ͬ��Ԫ�ء�
		al1.removeAll(al2);//ɾ����ͬ�Ľ���

		sop("al1:"+al1);
		sop("al2:"+al2);
	}
	public static void method_base()
	{
		ArrayList a1 = new ArrayList();//����һ������������ʹ��Collection�ӿڵ����࣬ArrayList
		a1.add("java01");//���Ԫ��
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");

		sop("ԭ����:"+a1);

//		a1.remove("java02");//ɾ��Ԫ��
//		a1.clear();//��ռ���

		sop("java03�Ƿ����:"+a1.contains("java03"));//�ж�Ԫ��
		sop("�����Ƿ�Ϊ�գ�"+a1.isEmpty());

		sop("size:"+a1.size());//��ȡ���������ϳ���

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
