class Single2
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
	}
}

class Single
{ 
	private static Single s = null;
	private Single(){}
	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized (Single.class)
			{
				if(s==null)
				{
					s = new Single();
				}
			}
		}
		return s;
	}
}
