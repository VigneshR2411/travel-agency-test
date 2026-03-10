package VigneshR;

import java.util.Map;
import java.util.HashMap;
public class MapExample {
public static void main(String[] args) {
	Map<Integer,String>Employee = new HashMap<>();
//	HashMap<Integer,String>Employee1 = new HashMap<>();
//	HashMap<Integer,String>Employee2 =new HashMap();
	System.out.println("Map is Empty: "+Employee.isEmpty());
	Employee.put(101, "R");
	Employee.put(102,"Vignesh");
	System.out.println(Employee);
	boolean check =Employee.containsKey(101);
	System.out.println(check);
	System.out.println(Employee.get(102)); 
	Employee.put(104, null);
	System.out.println(Employee);
	Employee.putIfAbsent(104, "David");
//	Employee.put(104, "David");
	System.out.println(Employee);
	System.out.println(Employee.size());
	System.out.println(Employee.toString());
	System.out.println(Employee.keySet());
}
}

