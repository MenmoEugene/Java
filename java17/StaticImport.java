/*
StaticImport 静态导入。

当类名重名时，需要指定具体的包名。
当方法重名时，指定具备所属的对象或者类。
*/
import java.util.*;
import static java.util.Arrays.*;//导入的是Arrays这个类中的所有静态成员。

/*
packa/Demo.class
packb/Demo.class

import packa.*;
import packb.*;

*/
import static java.lang.System.*;//导入了System类中所有静态成员
class StaticImport extends Object
{
	public static void main(String[] args) 
	{
		out.println("haha");
		int[] arr = {2,1,8};

		sort(arr);
		int index = binarySearch(arr,8);
		System.out.println(Arrays.toString(arr));
		System.out.println("Index="+index);
	}
}
