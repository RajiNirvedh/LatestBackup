package heirarchical_inheritance;

public class Childbaby extends Parent1 {
	public void baby()
	{
		System.out.println("HI iam sister of Vijay");
	}
	public static void main(String[] args) {
		Childbaby obj=new Childbaby();
		obj.mother();
		obj.baby();
	}

}
