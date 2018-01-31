//获取一个字符串在另一个字符串中出现的次数
class String_Gettimes
{
	public static int getSubCount(String str,String key)
	{
		int count =0;
		int index =0;
		while ((index=str.indexOf(key))!=-1)
		{
			sop("str="+str);
			str = str.substring(index+key.length());
			count++;
		}return count;
	}
	 
//方式二
	public static int getSubCount_2(String str,String key)
	{
		int count = 0;
		int index = 0;
		while ((index= str.indexOf(key,index))!=-1)
		{
			sop("index="+index);
			index = index + key.length();
			count++;
		}return count;
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		String str = "dfsjfksjsdgasdgjkgffk";

		//sop("count===="+str.split("f").length);//不建议使用，并非所有情况都通用

		sop("count="+getSubCount_2(str,"f"));
	}
}
