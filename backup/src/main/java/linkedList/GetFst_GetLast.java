package linkedList;

import java.util.LinkedList;

public class GetFst_GetLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> obj=new LinkedList<Integer>();//class name shouldnot be LinkedList
		obj.add(5);
		obj.add(8);
		obj.add(9);
		obj.add(50);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
	}

}
