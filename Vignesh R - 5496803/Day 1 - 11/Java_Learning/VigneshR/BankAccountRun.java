package VigneshR;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class BankAccountRun implements Runnable {
 
	private int balance=1000;
	private Lock lock=new ReentrantLock();
	
	public void withdraw(int amount)
	{
		lock.lock();
		try {
			if(balance>=amount)
			{
				System.out.println(Thread.currentThread().getName() + "withdrawing " + amount);
			
			balance-=amount;
			System.out.println("Remaining balance: " +balance);
		}
		
		else
		{
			System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
		}
		}	
		finally{
				lock.unlock();
			}
	
	}
@Override
public void run()
{
	withdraw(700);
}
public static void main(String[] args)
{
BankAccount account= new BankAccount();
 
Thread t1= new Thread("user-1");
Thread t2= new Thread("user-2");
 
t1.start();
t2.start();
 
}
}

