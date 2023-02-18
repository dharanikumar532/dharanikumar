package sample1;

public class variables
{
	static String s="hai";
	
	void sample()
	{
		int a=10;
	}
	

	public static void main(String[] args) {
		variables v=new variables();
		System.out.println(v.s);
		System.out.println(s);
		System.out.println(variables.s);
	}

}
