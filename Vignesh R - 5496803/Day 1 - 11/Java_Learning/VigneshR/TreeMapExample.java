package VigneshR;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		Map <Integer,String> Employee =new TreeMap<>(Comparator.reverseOrder());
		Employee.put(101, "vicky");
		Employee.put(102, "vignesh");
		Employee.put(103, "jacks");
		System.out.println(Employee);
	}
}
