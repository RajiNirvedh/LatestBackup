package multiple_Inheritence;

public class Child implements ParentA,ParentB {
	public void mother()
	{
		System.out.println("I am Veena mother of Arjun");
	}
	
	public void father()
	{
		System.out.println("I am Aravind father of Arjun");
	}

	public static void main(String[] args) {
		
		ParentA obj=new Child();
		obj.mother();
		ParentB obj1=new Child();
		obj1.father();
	}

}
