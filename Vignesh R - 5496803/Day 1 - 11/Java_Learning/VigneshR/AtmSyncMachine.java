package VigneshR;


public class AtmSyncMachine {
	
		 
		synchronized void withdraw(String Name)
		{
		System.out.println(Name + " is withdrawing money");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		 
		System.out.println(Name + " Withdrawal completed");
		}
			
		public static void main(String[] args) {
		 
			AtmSyncMachine atm=new AtmSyncMachine();
			
			new Thread(() -> atm.withdraw("User-1")).start();
			new Thread(() -> atm.withdraw("User-2")).start();
		 
			}
		 
		
}
