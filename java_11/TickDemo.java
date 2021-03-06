/*
需求：简单的卖票程序。
多个窗口同时卖票。

创建线程的第二种方式：实现Runnable接口

步骤：
1，定义类实现Runnable接口
2，覆盖Runnable接口中的run方法
		将线程要运行的代码存放在该run方法中。

3，通过Thread类建立线程对象

4，将Runable接口的子类对象作为实际参数传递给Thread类的构造函数。
		为什么要将Runnable接口的子类对象传递给Thread的构造函数。
		因为自定义的run方法所属的对象是Runable接口的子类对象。
		所以要让线程去指定对象的run方法，就必须明确该run方法所属对象。

5，调用Thread类的start方法开启线程并调用Runnable接口子类的run方法。 

实现方式和继承方式有什么区别？（面试经常考）

实现方式的好处：避免了单继承的局限性。
在定义线程时，建议使用实现方式。

两种方式的区别：
继承Thread：线程代码存放在Thread子类run方法中。
实现Runnable,线程代码存在接口的子类的run方法中。
*/

class Ticket implements Runnable
{
	private int tick =100;
	public void run()
	{
		while (true)
		{
			if(tick<0)
				break;
			
				System.out.println(Thread.currentThread().getName()+"...sale..."+tick--);
			
		}
	}
}
class TickDemo 
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
