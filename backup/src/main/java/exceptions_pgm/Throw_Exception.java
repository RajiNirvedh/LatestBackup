package exceptions_pgm;

public class Throw_Exception {
	
	public static void totalMarks(int marks)
	{
		if(marks/5<250)
		{
		throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("PASS");
		}
	}

	public static void main(String[] args) {
		
		Throw_Exception obj=new Throw_Exception();
		obj.totalMarks(750);

	}

}
