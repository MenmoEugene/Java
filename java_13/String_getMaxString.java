//练习四:获取两个字符串中最大相同子串，第一个动作：将短的那个串进行长度依次递减的子串打印。

class String_getMaxString
{
	public static String getMaxSubString(String s1,String s2)
	{
		String max="",min="";
		max = (s1.length()>s2.length())?s1:s2;
		min = (max==s1)?s2:s1;

		for(int x=0;x<min.length();x++)
		{
			for(int y=0,z=min.length()-x; z!=min.length()+1;y++,z++)
			{
				String temp = min.substring(y,z);
				//sop(temp);
				if(max.contains(temp))//if(max.indexOf(temp)!=-1)
					return temp;
			}
		}return ""; 
	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		String s1 = "asddfgjhahasdfgg";
		String s2 = "gsfhahadg";
		sop(getMaxSubString(s1,s2));
	}
}
