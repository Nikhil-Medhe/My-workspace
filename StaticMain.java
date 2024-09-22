package basic;

public class StaticMain {

	static  String name="Nikhil";
	int roll=101;
	
	public static void main(String[] args) 
	{
		System.out.println(name);
		StaticMain v1= new StaticMain();
		v1.m2();
		v1.name;
		//System.out.println(v1.roll);
		
	}
	static void m1()
	{
		System.out.println("m1()method");
	}
	void m2()
	{
		System.out.println("in m2() non static");
	}

}
