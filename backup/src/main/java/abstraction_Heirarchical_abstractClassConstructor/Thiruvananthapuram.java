package abstraction_Heirarchical_abstractClassConstructor;

public class Thiruvananthapuram extends State{
	public void district()
	{
		System.out.println("Thiruvananthapuram is the capital of Kerala");
	}

	public static void main(String[] args) {
		
		Thiruvananthapuram obj=new Thiruvananthapuram();
		obj.district();
		Kollam obj1=new Kollam();
		obj1.district();
	}

}
