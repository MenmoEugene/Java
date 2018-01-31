/*
对给定数组进行排序。
{5,1,6,4,2,8,9}

****
***
**
*
 
*/
class ArrayTest
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,6,4,2,8,9};
		printArray(arr);
		SelectSort(arr);
		printArray(arr);
	}

	public static void SelectSort(int[] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					int temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}

	public static void printArray(int[] arr)
	{
		System.out.print("arr[]={");
		for (int x=0; x<arr.length; x++)
		{
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"};");
		}
	}
}
