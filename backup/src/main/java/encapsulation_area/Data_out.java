package encapsulation_area;

public class Data_out {
	

	public static void main(String[] args) {
		Data_in obj=new Data_in();
		int s=obj.getside();
		int area=s*s;
		System.out.println("Area of square = "+area+"sq.cm");
		

	}

}
