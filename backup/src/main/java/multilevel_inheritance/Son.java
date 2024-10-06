package multilevel_inheritance;

public class Son extends Parent {
	public void vijay()
	{
		System.out.println("HI iam Vijay");
	}

	public static void main(String[] args) {
	
Son obj=new Son();
obj.grandpa();
obj.parent();
obj.vijay();
	}

}
