class printDay 
{ 
	public static void main(String[] args) 
	{
		printDay(4);
	}
	public static void printDay(int a)
	{
		if (a==1)
		sop("星期一");
		else if(a==2)
		sop("星期二");
		else if(a==3)
		sop("星期三");
		else if(a==4)
		sop("星期四");
		else if(a==5)
		sop("星期五");
		else if(a==6)
		sop("星期六");
		else if(a==7)
		sop("星期日");
		else
		sop("不存在");
	}
	public static void sop(Object obj)
	{System.out.println(obj);}
}
