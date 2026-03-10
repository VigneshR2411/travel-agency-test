package VigneshR;

class account {
	public int balance=20000;


		 synchronized void withdrawal(int amount) {
			if(balance >=amount) {
				balance -=amount;
				System.out.println("withdrawal Successfully "+amount+" current balance is "+balance);

			}else {
				System.out.println("insufficient balance"+balance);
			}
		}
		
}
public class BankAccount {
	public static void main(String[] args) {
		account a1 = new account();

		Thread t1 = new Thread(()->{a1.withdrawal(5000);});
		Thread t2 = new Thread(()->{a1.withdrawal(5000);});
		t1.start();
		t2.start();
	}
}