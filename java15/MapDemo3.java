/*
map��չ֪ʶ��
map���ϱ�ʹ��ʱ��Ϊ�߱�ӳ���ϵ��

"yureban" Student("01" "zhangsan");
"yureban" Student("02" "lisi");

"jiuyeban" "01" "wangwu";
"jiuyeban" "02" "zhaoliu";

һ��ѧУ�ж�����ң�ÿһ�����Ҷ������ơ�
*/
import java.util.*;

class Student
{
	private String name;
	private String id;
	Student(String id,String name)
	{
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return id+":::"+name;
	}
}

class MapDemo3
{
	public static void demo() 
	{
		HashMap<String,List<Student>> czbk = new HashMap<String,List<Student>>();
		List<Student> yure = new ArrayList<Student>();
		List<Student> jiuye = new ArrayList<Student>();
		czbk.put("yereban",yure);
		czbk.put("jiuyeban",jiuye);

		yure.add(new Student("01","zhangsan"));
		yure.add(new Student("04","wangwu"));
		jiuye.add(new Student("01","zhouqi"));
		jiuye.add(new Student("02","zhaoli"));

		Iterator<String> it = czbk.keySet().iterator();
		while(it.hasNext())
		{
			String roomName = it.next();
			List<Student> room = czbk.get(roomName);
			System.out.println(roomName);
			getInfos(room);
		}
	}
	public static void getInfos(List<Student> list)
	{
		Iterator<Student> it = list.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}
	public static void main(String[] args)
	{
		demo();
/*
		HashMap<String,List<Student>> czbk = new HashMap<String,List<Student>>();
		HashMap<String,String> yure = new HashMap<String,String>();
		HashMap<String,String> jiuye = new HashMap<String,String>();
		czbk.put("yureban",yure);
		czbk.put("jiuyeban",jiuye);
		yure.put("01","zhangsan");
		yure.put("02","lisi");
		jiuye.put("01","wangwu");
		jiuye.put("02","zhaoliu");
		//����czbk���ϣ���ȡ���еĽ���
		getStudentInfo(jiuye);
		getStudentInfo(yure);
*/
	}
	public static void getStudentInfo(HashMap<String,String> roomMap)
	{
		Iterator<String> it = roomMap.keySet().iterator();
		while(it.hasNext())
		{
			String id = it.next();
			String name = roomMap.get(id);
			System.out.println(id+":"+name);
		}
	}
}