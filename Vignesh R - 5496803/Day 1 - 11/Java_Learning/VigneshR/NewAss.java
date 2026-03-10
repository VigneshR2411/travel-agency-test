package VigneshR;

class PrintNumers{
	private int n;
	private int current;
	public  void task() {
		for(int i =1; i<=n;i++) {
			System.out.print(current);
			current++;
		}
	}
	public PrintNumers(int n) {
		this.n= n;
	}
}
public class NewAss {
	public static void main(String args[]) {
		int n = 10;
		PrintNumers obj = new PrintNumers(n);
		Thread t1 = new Thread(()->{
			obj.task();
		});
		Thread t2 = new Thread(()->{
			obj.task();
		});
//		Thread t3 = new Thread(()->{
//			obj.task();
//		});
		t1.start();
		try {
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//try {
//			
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		t2.start();
//		t3.start();
		
	}
}
