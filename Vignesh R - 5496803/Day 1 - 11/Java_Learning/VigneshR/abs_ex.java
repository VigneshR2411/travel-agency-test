package VigneshR;


abstract class vehicle{
	abstract  void start();
}
class car extends vehicle{
	 void start() {
		System.out.println("Car starts with key");	
		}
}
public class abs_ex {
	public static void main(String[] args) {
		car v = new car();
		v.start();
	}
}
