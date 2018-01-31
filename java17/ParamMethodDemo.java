/*
JDK1.5版本出现的新特性。

在使用方法的可变参数时，注意：
	可变参数一定要定义在参数列表最后面。
*/
class ParamMethodDemo
{
	public static void main(String[] args) 
	{
		//show(3,4);
		//虽然少定义了多个方法，但是每次都要定义一个数组，作为实际参数。
		//int[] arr = {3,4};
		//int[] arr1 = {3,4,5};
//		show(arr1);
/*
	可变参数。
	其实就是上一种数组参数的简写形式。
	不用每一次都手动的建立数组对象。
	只要将要操作的元素作为参数传递即可。
	隐式将这些参数封装成了数组。
*/
		show("hehe",2,3,6,5,8);
//		show();
	}
	public static void show(String str,int... arr)
	{
		System.out.println(arr.length);
	}
/*
	public static void show(int[] arr)
	{
	
	}
	public void show(int a,int b)
	{
		System.out.println(a+","+b);
	}
*/
}
