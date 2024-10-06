package exceptions_pgm;

public class Exception_3keywords {

	public static void main(String[] args) {
	try
	{
		//int a=100/0;// Arithmetic exception
		//String a=null;//NullPointerException
		//System.out.println(a.length());//NullPointerException
		String a="RAJI";//NumberFormatException
		int b=Integer.parseInt(a);//NumberformatException
		//int a[]=new int[10];//IndexOutOfBoundsException
		//a[12]=120;//IndexOutOfBoundsException
	}
	catch(Exception o)
	{
	System.out.println(o);	
	}
	finally
	{
		int b=100;
		int c=250;
		int d= b+c;
		System.out.println("SUM = "+d);
	}
	}

}
