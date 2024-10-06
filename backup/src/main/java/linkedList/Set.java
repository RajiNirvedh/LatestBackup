package linkedList;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> obj=new HashSet<Integer>();
		obj.add(5);
		obj.add(8);
		obj.add(9);
		obj.add(5);//duplication not possible in hashset
		obj.add(50);//insertion order not maintained so 
		//adding new data values can be displayed in anyorder
		System.out.println(obj.contains(50));//true will be output if the given value is there
		System.out.println(obj.contains(100));

	}

}
