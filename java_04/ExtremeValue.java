/*
给定一个数组{5,1,6,4,2,8,9}
 
1,获取数组中的最大值，以及最小值。
*/
class ExtremeValue
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,6,4,2,8,9};
		bianli(arr);
		int max = getMax(arr);
		System.out.println("max="+max);
		int min = getMin(arr);
		System.out.println("min="+min);
	}

	public static void bianli(int[] arr)
	{
		System.out.print("arr[]={");
		for (int x=0; x<arr.length; x++)
		{
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"}");
		}
	}
	public static int getMax(int[] arr)
	{
		int max=arr[0];
		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
				max=arr[x];
		}return max;
	}
	public static int getMin(int[] arr)
	{
		int min=arr[0];
		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]<min)
				min=arr[x];
		}return min;
	}
}
