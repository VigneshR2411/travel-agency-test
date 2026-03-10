package VigneshR;



class PatientRegistration{
	private String id;
	private String name;
	private int age;
	private String illness;
	
	
	void setAllInfo(String id,String name,int age,String illness) {
		this.id= id;
		this.name= name;
		this.age= age;
		this.illness= illness;
	}
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getIllness() {
		return illness;
	}
	void Display() {
		System.out.println("Patient Id :" + id);
		System.out.println("Patient Name :" + name);
		System.out.println("Patient Age :" + age);
		System.out.println("Patient Status :" + illness);
	}
};
 
abstract class Doctor{
	public static String DocName;
	public static String Specialisation;
	
	public void DocInfo(String DocName, String Specialisation) {
		System.out.println("Docter Name :"+ DocName);
		System.out.println("Docter Speciality :"+ Specialisation);
	}
	
abstract void Diagnosed();
 
}
 
//class DocS extends Doctor{
//	void Diagnosed() {
//		System.out.println("You have No Health issue");
//	}
//}
class GenPhysician extends Doctor{
	void Diagnosed() {
		System.out.println("Diagnoses patients with basic logic");
		}
}
class Cardiologist extends Doctor{
	void Diagnosed() {
		System.out.println("Diagnoses patients, but specializies in heart-related illnesses");
	}
}
 
 
 
public class HealthCareSector {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRegistration Pr= new PatientRegistration();
		Pr.setAllInfo("123", "Rushi", 24, "Fine");
//		Pr.setAllInfo("223", "Rohit", 23, "FineToo!");
		Pr.Display();
		GenPhysician G = new GenPhysician();
		G.DocInfo("Dr.Purohit", "Eye Specialist");
		G.Diagnosed();
		Cardiologist C = new Cardiologist();
		C.DocInfo("Dr.Purohit", "Eye Specialist");
		C.Diagnosed();
	}
 
}

