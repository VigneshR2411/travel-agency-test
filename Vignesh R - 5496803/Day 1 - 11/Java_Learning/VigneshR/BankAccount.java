package VigneshR;

class Account {
	int bal = 20000;
	 synchronized void withdrawal (int amt) {
		if(bal<amt) {
			System.out.println("Insufficient balance");
		}else{
			bal-=amt;
			System.out.println("Successfully withdrawal,"+bal);
			
		}
	}
}
public class BankAccount {
public static void main(String[] args) {
	Account a1 = new Account();
	Thread t1 = new Thread(()->{a1.withdrawal(6000);});
	Thread t2 = new Thread(()->{a1.withdrawal(6000);});
	t1.start();
	t2.start();
}
}

