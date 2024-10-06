package collection;

import java.util.ArrayList;

public class ForLoop_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("RAJI");
		obj.add("HI");
		obj.add("VEENA");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));//functions like for each 
		}
	}

}
