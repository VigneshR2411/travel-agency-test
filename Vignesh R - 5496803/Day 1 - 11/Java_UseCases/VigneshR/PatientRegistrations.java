package VigneshR;

import java.util.*;
public class PatientRegistrations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> patientId=new HashSet<Integer>();
		patientId.add(1);
		patientId.add(2);
		patientId.add(3);
		patientId.add(4);
		patientId.add(5);
		System.out.print("Enter no. of patients that are need to be added: ");
		int n = sc.nextInt();
		while(n>0) {
			System.out.print("Enter the Id of Patient: ");
			int temp = sc.nextInt();
			if(patientId.contains(temp)) {
				System.out.println("Patient already Registered: ");
			}else {
				patientId.add(temp);
				System.out.println("Patient is Successfully registered ");
			}
			n--;
			
		}
		System.out.println("total no. of Patients are now: "+patientId.size());
		for(int patient:patientId) {
			System.out.println(patient);
		}
		sc.close();
		
		
		
	}
}

			
		
		
	
