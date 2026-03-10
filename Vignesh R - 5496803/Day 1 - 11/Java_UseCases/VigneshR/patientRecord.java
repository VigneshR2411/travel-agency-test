package VigneshR;

import java.util.*;
class Patient {

    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId +
               ", Name=" + name +
               ", Age=" + age + "]";
    }
}
public class patientRecord {

	private Map<Integer, Patient> patients = new HashMap<>();
	public void addPatient(Patient patient) {
        if (patients.containsKey(patient.getPatientId())) {
            System.out.println("Patient ID already exists: " + patient.getPatientId());
        } else {
            patients.put(patient.getPatientId(), patient);
            System.out.println("Patient added successfully");
        }
    }
	public void updatePatient(int patientId, String name, int age) {
        Patient patient = patients.get(patientId);
        if (patient != null) {
            patient.setName(name);
            patient.setAge(age);
            System.out.println("Patient updated successfully");
        } else {
            System.out.println("Patient not found");
        }
    }
	  public void getPatient(int patientId) {
	        Patient patient = patients.get(patientId);
	        if (patient != null) {
	            System.out.println(patient);
	        } else {
	            System.out.println("Patient not found");
	        }
	    }
	    public void removePatient(int patientId) {
	        if (patients.remove(patientId) != null) {
	            System.out.println("Patient removed successfully");
	        } else {
	            System.out.println("Patient not found");
	        }
	    }
	    public void listAllPatients() {
	        if (patients.isEmpty()) {
	            System.out.println("No patients registered");
	            return;
	        }
	        for (Patient p : patients.values()) {
	            System.out.println(p);
	        }
	    }
	    public void patientExists(int patientId) {
	        System.out.println(
	            patients.containsKey(patientId)
	            ? "Patient exists"
	            : "Patient does not exist"
	        );
	    }
	    public void totalPatients() {
	        System.out.println("Total patients: " + patients.size());
	    }
	    public void clearSystem() {
	        patients.clear();
	        System.out.println("System cleared");
	    }
	    public static void main(String[] args) {

	        patientRecord system = new patientRecord();

	        system.addPatient(new Patient(101, "Rgayle", 30));
	        system.addPatient(new Patient(102, "Ramesh", 28));
	        system.addPatient(new Patient(101, "Duplicate", 40));

	        system.listAllPatients();

	        system.updatePatient(102, " Kumar", 29);
	        system.getPatient(102);

	        system.patientExists(103);

	        system.totalPatients();

	        system.removePatient(101);
	        system.listAllPatients();

	        system.clearSystem();
	        system.totalPatients();
	    }
}

