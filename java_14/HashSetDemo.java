/*Ԫ��
|--Set:Ԫ��������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
	|--HashSet���ײ����ݽṹ�ǹ�ϣ��
			HashSet����α�֤Ԫ��Ψһ�Ե��أ�
					��ͨ��Ԫ�ص�����������hashCode��equals����ɡ�
					���Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
					���Ԫ�ص�hashCodeֵ��ͬ���������equals��

					ע�⣺�����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ����������ķ�����Ԫ�ص�hashCode��equals������
	|--TreeSet

Set���ϵĹ��ܺ�Collection��һ�µġ�
*/ 
import java.util.*;
class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		sop(hs.add("java01"));
		sop(hs.add("java01"));
		hs.add("java02");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");

		Iterator it = hs.iterator();

		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
