package VigneshR;

class Salary{
	private int salary;
	public void setSalary(int amt) {
		salary = amt;
	}
	public int getSalary() {
		return salary;
	}
}
public class employee {
	public static void main(String[] args) {
		Salary obj = new Salary();
		obj.setSalary(10000);
		System.out.println(obj.getSalary());
	}
}

