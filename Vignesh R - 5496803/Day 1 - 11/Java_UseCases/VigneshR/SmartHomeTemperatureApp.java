package VigneshR;


import java.util.*;
public class SmartHomeTemperatureApp {
	public static void main(String[] args) {
		ArrayList<Double> temperature = new ArrayList<>();
		temperature.add(26.8);
		temperature.add(31.0);
		temperature.add(24.8);
		temperature.add(28.8);
		System.out.println("Temperature Analysis");
		for(Double temp:temperature) {
			if(temp>28.0) {
				System.out.println("High temperature alert: "+temp+"Celsius");
			}
			else {
				System.out.println("Normal temperature:"+temp+"Celcius");
			}
		}
		System.out.println("Temperature values as String:");
		for(Double temp:temperature) {
			String value = temp.toString();
			System.out.println(value);
		}
	}
}
