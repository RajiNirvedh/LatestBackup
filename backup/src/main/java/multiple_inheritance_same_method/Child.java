package multiple_inheritance_same_method;

public class Child implements ParentA,ParentB{
	public void parent()
	{
		System.out.println("Iam parent of ARJUN");
	}

	public static void main(String[] args) {
		
ParentA obj=new Child();
obj.parent();
	}

}
