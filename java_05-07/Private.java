class Private
{ 
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setAge(24);
		p.speak();
	}
}

class Person
{
	private int age;
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	void speak(){
		System.out.println("age="+age);
	}
}