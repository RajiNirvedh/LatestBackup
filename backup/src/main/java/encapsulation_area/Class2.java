package encapsulation_area;

public class Class2 {

	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.setside(8);
		float area=obj.getpi()*obj.getside();
		System.out.println("Area iof circle with diameter "+obj.getside()+"cm = "+area+"sq.cm");
		

	}

}
