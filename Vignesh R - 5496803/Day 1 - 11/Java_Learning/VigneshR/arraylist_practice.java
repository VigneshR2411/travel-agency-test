package VigneshR;

import java.util.*;
public class arraylist_practice {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(); 
		System.out.println("List is Empyt: "+list.isEmpty());
		list.add(123);
		list.add(1,34);
		list.addFirst(9);
		list.addLast(5);
		System.out.println(list.contains(55));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
//		list.clone();
//		list.forEach(null);
		
//		System.out.println(list.listIterator());
		list.remove(3);
		
		for(int i =0;i<list.size() ;i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println(list.indexOf(9));
		list.removeFirst();
		list.removeLast();
		list.reversed();
//		list.
		list.clear();
//		System.out.println();
	}
}
