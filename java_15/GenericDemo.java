/*
	���ͣ�JDK1.5�汾�Ժ���ֵ������ԣ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ���ơ�

	�ô���
		1.������ʱ�ڳ�������ClassCastException��ת�Ƶ��˱���ʱ�ڡ�
			���ڳ���Ա������⣬����������������٣���ȫ��
			
		2,������ǿת�����鷳��
*/
import java.util.*;
class GenericDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("xml");
		al.add("relationship");
		al.add("menmo");

		Iterator <String>it = al.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s+":"+s.length());
		}
	}
}
