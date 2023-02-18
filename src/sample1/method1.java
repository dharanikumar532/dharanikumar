package sample1;

public class method1
{
	private static int a=100;
	static int b=25;
	 private void add()
	{
		
		int c;
		c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		
		int c;
		c=a-b;
		System.out.println(c);
	}
protected	int mul()
	{
		
		int c;
		c=a*b;
		return c;
	}
	void div()
	{
		
		int c;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		method1 m1=new method1();
		m1.add();
		m1.div();
		System.out.println(m1.mul());
		sub();

	}
}
