package polymorphism_methodpgms;

public class Method_OverLoading2 {
	int a,b;
	float g;
	public int loading(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println("Integer value addition sum="+c);
		return c;
		
	}
	public float loading(float g,int b)
	{
		this.g=g;
		this.b=b;
		float d=g+b;
		System.out.println("Float value addition sum="+d);
		return d;
		
	}

	public static void main(String[] args) {
		
		Method_OverLoading2 obj=new Method_OverLoading2();
		int e=obj.loading(87,68);
		System.out.println("Integer addition sum="+e);
		float f=obj.loading(68.f, 85);
		System.out.println("Float  addition sum="+f);

	}

}
