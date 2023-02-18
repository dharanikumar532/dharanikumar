package sample1;
public class method2 
{
	protected static void student(int id)
	{
		switch(id)
		{
		case 1 : 
			System.out.println("name : Dharani");
			System.out.println("marks : 95");
			break;
		case 2 : 
			System.out.println("name : kumar");
			System.out.println("marks : 85");
			break;
		case 3 : 
			System.out.println("name : Ramesh");
			System.out.println("marks : 75");
			break;
		case 4 : 
			System.out.println("name : Anuradha");
			System.out.println("marks : 65");
			break;
		case 5 : 
			System.out.println("name : Srividya");
			System.out.println("marks : 55");
			break;
		case 6 : 
			System.out.println("name : sudha");
			System.out.println("marks : 45");
			break;
		default :
			System.out.println("wrong id");
		}
	}
	public static void main(String[] args) {
		method2 m1=new method2();
		m1.student(4);
	}
}
