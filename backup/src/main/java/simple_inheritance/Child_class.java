package simple_inheritance;

public class Child_class extends Parent_class {
	public void child()
	{
		System.out.println("CHILD");
	}

	public static void main(String[] args) {

		Child_class obj=new Child_class();
		obj.parent();
		obj.child();
	}

}
