/* 
1*1=1 
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9


----*
---* *
--* * *
-* * * *
* * * * *
*/

class CFB
{
	public static void main(String[] args) 
	{
		for (int x=1; x<=9; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}

		System.out.println("---------------------------------------------");

		for (int x=5; x>0; x--)
		{
			for (int y=0; y<x-1; y++)
			{
				System.out.print(" ");
			}
			for (int z=0; z<=5-x; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
 