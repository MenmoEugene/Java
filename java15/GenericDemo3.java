class Worker
{
}
class Student
{
}
//����ǰ������(��Ҫǿת)
class Tool
{
	private Object obj;
	public void setObject(Object obj)
	{
		this.obj = obj;
	}
	public Object getObject()
	{
		return obj;
	}
}
/*������
ʲôʱ���巺���ࣿ
������Ҫ�����������������Ͳ�ȷ����ʱ��
���ڶ���Object�������չ��
���ڶ��巺���������չ��
*/
class Utils<QQ>
{
	public QQ q;
	public void setObject(QQ q)
	{
		this.q = q;
	}
	public QQ getObject()
	{
		return q;
	}
}
class GenericDemo3 
{
	public static void main(String[] args) 
	{
		Utils<Worker> u = new Utils<Worker>();
		
		u.setObject(new Worker());
		Worker w = u.getObject();
	}
}