//改变标准输入输出设备。
import java.io.*;
class TransStreamDemo2_
{
	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("PersonDemo.java"));

		System.setOut(new PrintStream("zz.txt"));

		//键盘录入最常见写法。 
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			

		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));


		String line = null;

		while ((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase()+"\r\n");
			bufw.newLine();
			bufw.flush();
		}
		bufr.close();
	}
}