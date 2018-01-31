class danli
{ 
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setNum(0);
		s2.setNum(24);
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());
	}
}

class Single
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	private Single(){}
	private static Single s = new Single();
	public static Single getInstance()
	{
		return s;
	}
}