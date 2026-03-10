package VigneshR;

public class hospital{
	private String name;
	private String status;
	private String healthIssue;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setstatus(String status) {
		this.status= status;
	}
	public void setIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}
	
	public String getName() {
		return name;
	}
	public String getstatus() {
		return status;
	}
	public String getIssue() {
		return healthIssue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hospital p = new hospital();
		p.setName("hema");
		p.setstatus("Fine");
		p.setIssue("Diabetic");
		System.out.println("Patient name is"  +  p.getName());
		System.out.println("Patient Status is"+ p.getstatus());
		System.out.println("Patient suffering from"+ p.getIssue());
		
		
 
	}
}