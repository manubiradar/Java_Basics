package Java_learning_Array;

import java.util.*;

public class AarraylistDemo {

	public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<Object>();

		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		l.add(20);
		System.out.println("The List are: "+l);
		l.set(0, 30);
		System.out.println(l);
		
		l.remove(0);
		System.out.println(l);
		
		l.add(1, 20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		l.clear();
		System.out.println(l.isEmpty());

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		System.out.println(list);
     
	}

}
