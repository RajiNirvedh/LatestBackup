package method_overriding;

public class Child_Class extends ParentClass{
	public void family()
	{
		System.out.println("SON FAMILY");
	}

	public static void main(String[] args) {
		
		Child_Class obj=new Child_Class();
		obj.family();
		

	}

}
