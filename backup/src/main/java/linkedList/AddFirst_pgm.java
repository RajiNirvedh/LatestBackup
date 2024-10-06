package linkedList;

import java.util.LinkedList;

public class AddFirst_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> obj=new LinkedList<Integer>();//class name shouldnot be LinkedList
		obj.add(5);
		obj.add(8);
		obj.add(9);
		obj.add(5);
		obj.addFirst(100);//add extra value
		System.out.println(obj);
	}

}
