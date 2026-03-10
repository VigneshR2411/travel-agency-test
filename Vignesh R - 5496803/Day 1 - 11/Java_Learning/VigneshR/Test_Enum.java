package VigneshR;

import java.util.Arrays;

enum Day
{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Test_Enum {
	
	
	public static void main(String[] args) {
	 
	Day[] allDays=Day.values();
	 
	System.out.println("All Days of the Week:");
	Day[] WorkingDays=new Day[5];
	int count=0;
	for(Day d: allDays)
	{
		System.out.println(d);
		if(count<5)
			WorkingDays[count]= d;
		count++;
		
			
		
	}
	System.out.println("Working Days are: "+Arrays.toString(WorkingDays));		
		
	}
	 
	
}

