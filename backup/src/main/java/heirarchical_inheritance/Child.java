package heirarchical_inheritance;

public class Child extends Parent1{
	public void vijay()
	{
		System.out.println("HI iam Vijay");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.mother();
		obj.vijay();

	}

}
