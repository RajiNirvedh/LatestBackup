package linkedList;

import java.util.HashSet;

public class Remove_Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> obj=new HashSet<Integer>();
		obj.add(5);
		obj.add(8);
		obj.add(9);
		//obj.remove(9);//output [5,8]
		obj.clear();//output []
		System.out.println(obj);
	}

}
