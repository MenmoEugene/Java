/*
复制一张图片。
思路：
1，用字节读取流对象和图片关联。
2，用字节写入流对象创建一个图片文件，用于存储获取到的图片数据。
3，通过循环读写，完成数据存储。
4，关闭资源。
*/ 

import java.io.*;
class CopyPic 
{
	public static void main(String[] args) 
	{
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try
		{
			fos = new FileOutputStream("E:\\Ziliao\\Java\\practice\\2.jpg");
			fis = new FileInputStream("E:\\Ziliao\\Java\\practice\\1.jpg");

			byte[] buf = new byte[1024];

			int len = 0;

			while ((len=fis.read(buf))!=-1)
			{
				fos.write(buf,0,len);
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("复制文件失败");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch (IOException e)
			{
				throw new RuntimeException("写入关闭失败");
			}
		}
	}
}
