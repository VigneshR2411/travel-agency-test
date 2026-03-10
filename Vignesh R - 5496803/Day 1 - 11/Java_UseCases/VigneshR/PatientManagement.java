package VigneshR;

import java.util.*;
public class PatientManagement {
	public static void main(String args[]) {
		LinkedList<String>patients = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of Patients:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int a=0;a<n;a++) {
			System.out.print("Name of Patient: ");
			patients.add(sc.nextLine());
		}
		System.out.println("List of Patients:");
		int i=1;
		for(String queue:patients) {
			System.out.println(i+" "+queue);
			i++;
		}
		patients.addFirst("Hobs");
		System.out.println("Emergency case, Patient Name: "+patients.getFirst());
		System.out.println("Total no. of patients are now: "+patients.size());
		System.out.println("Treated patients are:\n"+patients.getFirst()+"\n"+patients.get(1));
		patients.remove(0);
		patients.remove(1);
		System.out.println("Updated list of Patients:");
		int j =1;
		for(String patient1:patients) {
			System.out.println(j+" "+patient1);
			j++;
		}
		System.out.println("");
		
		System.out.println("Checking the First Patient in Queue: "+patients.getFirst());
		System.out.println("Checking the Last Patient in Queue: "+patients.getLast());
		sc.close();
	}
}

