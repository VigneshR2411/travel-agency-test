package VigneshR;

abstract class empl{
	  String name;
	  int id;
	abstract void setName(String Name,int ID);
	abstract void work() ;
}
class manager extends empl{
	public void setName(String Name,int ID) {
		name = Name;
		id=ID;
	}
	public void work() {
		System.out.println("Manager is working to manage the team");
	}
	public void display() {
		System.out.println("Manager name is:"+name);
		System.out.println("Id is: "+id);
	}
}
class developer extends empl{
	public void setName(String Name,int ID) {
		name = Name;
		id=ID;
	}
	public void work() {
		System.out.println("Developer is working on the project");
	}
	public void display() {
		System.out.println("Developer name is:"+name);
		System.out.println("Id is: "+id);
	}
}
public class project {
	public static void main(String[] args) {
//		manager a = new manager();
		manager m = new manager();
		m.setName("Jack",50);
		m.display();
		m.work();
		
		developer d = new developer();
		d.setName("John", 51);
		d.display();
		d.work();
		
	}
}

