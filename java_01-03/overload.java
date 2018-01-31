class overload 
{
	public static void main(String[] args) 
	{
		add(3,5); 
		add(8,7,2);
		CFB();
	}

	public static void CFB(int num)
	{
		for (int x=1; x<=num; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	public static void CFB()
	{
		CFB(9);
	}

	public static void add(int a ,int b)
	{
		return a+b;
	}

	public static void add(int a ,int b,int c)
	{
		return add(a,b)+c;
	}
}
