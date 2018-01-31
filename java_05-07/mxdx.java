class mxdx 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name="menmo";
		p.age=23;
		p.run();

		Person p1 = new Person();
		p1.age=22;
		p1.run();
	}
}
class Person
{
	String name = "xml";
	int age = 23;
	void run(){
		System.out.println("name="+name+";\nage="+age);
	}
}