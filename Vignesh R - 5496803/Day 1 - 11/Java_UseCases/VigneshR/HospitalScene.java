package VigneshR;

import java.util.HashSet;
import java.util.Set;

public class HospitalScene {
    private int patientId;
    private String name;
    private int age;

    public HospitalScene(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    private static Set<HospitalScene> patients = new HashSet<>();

    public static void registerPatient(HospitalScene patient) {
        if (patients.contains(patient)) {
            System.out.println("Patient ID " + patient.patientId + " is already registered");
        } else {
            patients.add(patient);
            System.out.println("Patient added to the System : " + patient);
        }
    }

    public static void displayPatient() {
        System.out.println("List of Unique Registered Patients:");
        for (HospitalScene p : patients) {
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HospitalScene patient = (HospitalScene) obj;
        return this.patientId == patient.patientId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(patientId);
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {
        HospitalScene p1 = new HospitalScene(101, "Ravi", 30);
        HospitalScene p2 = new HospitalScene(102, "Ram", 30);
        HospitalScene p3 = new HospitalScene(103, "Ramesh", 30);
        HospitalScene p4 = new HospitalScene(101, "Ravi", 30);

        registerPatient(p1);
        registerPatient(p2);
        registerPatient(p3);
        registerPatient(p4);
    }
}