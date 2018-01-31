//取出两端空格
class String_Trim
{
	public static void sop(String str)
	{
		System.out.println(str);
	}

	public static String Trim(String str)
	{
		int start =0, end = str.length()-1;
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ')
			end--;
		return str.substring(start,end+1);
	}
 
	public static void main(String[] args) 
	{
		String s = "    ab  cd   ";

		sop("("+s+")");
		s = Trim(s);
		sop("("+s+")");
	}
}
