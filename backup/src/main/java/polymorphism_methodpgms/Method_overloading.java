package polymorphism_methodpgms;

public class Method_overloading {
	int a,b;
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public float sum(float a,int b)
	{
		float c=a+b;
		return c;
	}
	public double sum(double a,int b)
	{
		double c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		Method_overloading obj=new Method_overloading();
		int d=obj.sum(650,150);
		float e=obj.sum(156.6f, 550);
		double f=obj.sum(152.65d, 241);
		System.out.println("Integer sum = "+d);
		System.out.println("Float sum = "+e);
		System.out.println("Double sum = "+f);
		
		

	}

}
