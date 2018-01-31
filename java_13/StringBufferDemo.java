/*
StringBuffer是字符串缓冲区，是一个容器。
特定：
1，而且长度是可变化的
2，可以直接操作多个数据类型。
3，最终会通过toString方法变成字符串

C create U update R read D delete

1，存储。
	StringBuffer append():将制定数据作为参数添加到已有数据结尾处。
	StringBuffer insert(index,数据):可以将数据插入到指定index位置。

2，删除。
	StringBuffer delete(start,end):删除缓冲区中的数据，包含start，不包含end。
	StringBuffer deleteCharAt(index):删除指定位置的字符。

3，获取。
	char charAt(int index):获取一个脚标字符
	int indexOf(String str):获取位置 
	int lastIndexOf(String str):
	int length()
	String substring(int start,int end)//访问的还是String，不是StringBuffer
4，修改。
	StringBuffer replace(index start,end,String);
	void setCharAt(int index, char ch);

5,反转。
	StringBuffer reverse();

6,
	将缓冲区中指定数据存储到指定字符数组中。
	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
	//            从...开始，   从...结束， 存储到 ....,从...角标位置开始存

JDK1.5 版本之后出现了StringBuilder.

StringBuffer是线程同步
StringBuilder是线程不同步

以后开发建议使用StringBuilder
java升级围绕三个因素：提高效率，简化书写，提高安全性。
*/
class StringBufferDemo 
{
	public static void main(String[] args) 
	{
//		method_del();
		method_update();

//		StringBuffer sb = new StringBuffer("abcdef");
		StringBuilder sb = new StringBuilder("abcdef");

		char[] chs = new char[4];
		sb.getChars(1,4,chs,1);
		for (int x=0; x<chs.length; x++)
		{
			sop("chs["+x+"]="+chs[x]+";");
		}
	}

	public static void method_update()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.replace(1,4,"java");
		sb.setCharAt(2,'k');
		sop(sb.toString());
	}
	public static void method_del()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.delete(1,3);
//		sb.delete(0,sb.length());//清空缓冲区
//		sb.delete(2,3);//清除一个，等同于 sb.deleteCharAt(2);

		sop(sb.toString());
	}
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(34);

		sb.append("abc").append(true).append(34);//结尾处添加  .append()
//		sop("sb==sb1:"+(sb==sb1));
		sb.insert(1,"qq");
		sop(sb.toString());
//		sop(sb1.toString());
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
