/*
String类适用于描述字符串事物。
那么它就提供了多个方法对字符串进行操作。

常见的操作有哪些？
“afbs”

1，获取
	1.1 字符串中包含的字符数，也就是字符串的长度。
		int length(): 获取长度。
	1.2 根据位置获取位置上某个字符。
		char charAt(int index): 
	1.3 根据字符获取字符在字符串中位置。
		intindexOf(int ch): 返回的是ch在字符串中第一次出现的位置。
		intindexOf(int ch, int fromIndex): 从fromIndex指定位置开始，获取ch在字符串中出现的位置。

		intindexOf(int str): 返回的是str在字符串中第一次出现的位置。
		intindexOf(int str, int fromIndex): 从fromIndex指定位置开始，获取str在字符串中出现的位置。

		int lastIndexOf(int ch); 

2，判断。
	2.1 字符串中是否包含某一个子串。
		boolean contains(str):
		特殊之处：indexOf(str):可以索引str第一次出现的位置，如果返回-1.表示该str不存在字符串中。
					所以，也可以用于对指定判断是否包含。
				if(str.indexOf("aa")!=-1)
				而且该方法既可以判断，又可以获取出现的位置。
	2.2 字符串是否有内容。
		boolean ifEmpty(): 原理就是判断长度是否为0. 
	2.3 字符串是否是以指定内容开头。
		boolean startsWith(str);
	2.4 字符串是否是以指定内容结尾。
		boolean endsWith(str);
	2.5判断字符串内容是否相同。复写了Object类中的equals方法。
		boolean equals(str);
	2.6判断内容是否相同，并忽略大小写。
		boolean equalsIgnoreCase();

3，转换
	
	3.1 将字符数组转成字符串。
		构造函数：String(char[])
				  String(char[],offset,count):将字符数组中的一部分转成字符串。
		
		静态方法：
				  static String copyValueOf(char[]);
				  static String copyValueOf(char[] data,int offset,int count)

				  static String valueOf(char[]):
	3.2 将字符串转成字符数组。
		char[] toCharArray():

	3.3 将字节数组转成字符串。
		String(byte[])
		String(byte[],offset,count):将字节数组中的一部分转成字符串。
	3.4 将字符串转成字节数组。**
			byte[] getBytes():

	3.5 将基本数据类型转成字符串。
		static String valueOf(int)
		static String valueOf(double)

		3+"";//String.valueOf(3);

		特殊：字符串和字节数组在转换过程中，是可以指定编码表的。

4. 替换
	String replace(oldchar,newchar);

5. 切割
	String[] split(regex);

6. 子串  获取字符串中的一部分
	String substring(begin);
	String substring(begin,end);

7，转换，去除空格，比较。
	7.1 将字符串转成大写或小写。
		String toUpperCase();
		String toLowerCase();
	7.2 将字符串两端的多个空格去除。
		String trim();

	7.3 对两个字符串进行自然顺序的比较。
	int compareTo(string);
*/
class StringMethodDemo
{
	public static void method_qie()
	{
		String s = "    Hello Java   ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());

		String s1 = "aaa";
		String s2 = "aba";//ACII码相减
		sop(s1.compareTo(s2));
	}

	public static void method_sub()
	{
		String s = "adfgadfk";
		sop(s.substring(2));//从指定位置开始到结尾，如果角标不存在，会出现字符串角标越界异常。
		sop(s.substring(2,5));//包含头不包含尾。s.substring(0,s.length());
	}
	public static void method_split()
	{
		String s = "xumanli,eugene";
		String[] arr =s.split(",");
		for (int x=0; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}
	public static void method_replace()
	{
		String s = "haha java";
		//String s1 = s.replace('a','n');替换单个字符，从第几个角标开始索引

		String s1 = s.replace("java","fucker");
		sop("s="+s);
		sop("s1="+s1);//如果要替换的字符不存在，返回的还是原串。
	}
	
	public static void method_trans()
	{
		char[] arr ={'a','b','c','d','e','f'};
		String s = new String(arr,1,3);
		sop("s="+s);

		String s1 = "czfxml";
		char[] chs = s1.toCharArray();
		for (int x=0; x<arr.length; x++)
		{
			if(x>0)
				System.out.print(chs[x]);
			else
				System.out.print("ch="+chs[x]);
		}
	}

	public static void method_is()
	{
		String str = "ArrayDemo.java";
		//判断文件名称是否是Array单词开头
		sop(str.startsWith("Array"));
		//判断文件名称是否是.java的文件
		sop(str.endsWith(".java"));
		//判断文件中是否包含Demo
		sop(str.contains("Demo"));
	}

	public static void method_get()
	{
		String str = "abcgskfka";
		//长度
		sop(str.length());
		//根据索引获取字符
		sop(str.charAt(4));//当访问到字符串不存在的角标时，会发生StringIndexOfBoundsException。
		//根据字符获取索引
		sop(str.indexOf('a',3));//如果没有找到返回-1
		//反向索引一个字符出现位置
		sop(str.lastIndexOf('a'));
	}

	public static void main(String[] args) 
	{
		method_qie();
		method_split();
		method_replace();
		method_trans();
		method_is();
		method_get();

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = ("abc");
		sop(s1==s2);
		sop(s1==s3);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}