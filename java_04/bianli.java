/*
定义功能：用于打印数组中的元素，元素间用逗号隔开
*/ 
class bianli
{
	public static void main(String[] args) 
	{
		int[] arr = {1,5,2,7,9,0,56,32};
		method_read(arr);
	}
	public static void method_read(int[] arr)
	{
		System.out.print("arr=[");
			
		for(int x=0; x<arr.length; x++)
		{
			if(x>arr.length-2)
				System.out.print(arr[x]+"]");
			else
				System.out.print(arr[x]+",");
		}
	}
}
		//元素类型[] 数组名 = new 元素类型[元素个数或数组长度];

		//需求: 想定义一个可以存储3个整数的容器.
//		int[] x = new int[2];