/*
对一个字符串中的数值进行从小到大的排序。
"20 78 -7 88 36 29"
思路：
	1，排序
	2，如何获取到这个字符串中的这些需要排序的数值？
		发现这个字符串其实都是以空格来对数值进行分隔的。
		所以就想到用字符串对象的切割方法将大串变成多个小串。
	3，数值最终变成小字符串，怎么变成一个int数呢？
		字符串-->基本类型可以使用包装类。
*/
import java.util.Arrays;
public class WrapperTest
{
	private static final String SPACE_SEPARTOR = " ";
	public static void main(String[] args) 
	{
		String numStr = "20 78 -7 88 36 29";
		sop(numStr);
		numStr = sortStringNumber(numStr);
		sop(numStr);
	}
	public static String sortStringNumber(String numStr)
	{
		//1,将字符串变成字符串数组
		String[] str_arr = numStr.split(" ");
		//2,将字符串数组变成int数组。
		int[] num_arr = toIntArray(str_arr);
		//3,对int数组排序
		mySortArray(num_arr);
		//4,将排序后的int数组变成字符串
		String temp = arrayToString(num_arr);
		return temp;
	}
	public static String arrayToString(int[] num_arr)
	{
		StringBuilder sb = new StringBuilder();
		for(int x =0; x<num_arr.length; x++)
		{
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+" ");
			else
				sb.append(num_arr[x]);
		}
		return sb.toString();
	}

	public static void mySortArray(int[] num_arr)
	{
		Arrays.sort(num_arr);
	}
	public static int[] toIntArray(String[] str_arr)
	{
		int[] arr = new int[str_arr.length];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] =Integer.parseInt(str_arr[i]);
		}return arr;
	}
	public static String[] stringToArray(String numStr)
	{
		String[] str_arr = numStr.split(SPACE_SEPARTOR+"+");
		return str_arr;
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

