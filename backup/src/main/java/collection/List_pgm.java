package collection;

import java.util.ArrayList;
import java.util.List;

public class List_pgm {

	public static void main(String[] args) {
		List <Integer> obj=new ArrayList<Integer>();
		obj.add(5);
		obj.add(8);
		obj.add(9);
		obj.add(5);
		//System.out.println(obj);
		for(int temp:obj)
		{
			System.out.println(temp);
		}
		//for each loop format to iterate elemnts and print in one by one in collection only this 
		//possible in generic because datatype is to be mentioned in this

	}

}
