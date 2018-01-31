class Switch
{
	public static void main(String[] args) 
	{
		char ch=13;
	
		switch (ch)
		{
		case 3: 
		case 4:  
		case 5: 
			sop("春季");break;
		case 6: 
		case 7: 
		case 8: 
			sop("夏季");break;
		case 9: 
		case 10: 
		case 11: 
			sop("秋季");break;
		case 1: 
		case 2: 
		case 12: 
			sop("冬季");break;
		default:
			sop("不存在该月份");
		}
	}
	public static void sop(Object obj)
	{System.out.println(obj);}
}
