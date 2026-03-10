package VigneshR;

public class myRunnable implements Runnable{
	public void run() {
		System.out.println("running");
	}
	public static void main(String args[]) {
		Thread t = new Thread(new myRunnable());
		t.start();
	}
}
