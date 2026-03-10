package VigneshR;

public class SleepExample extends Thread{
	
public void run()
	{
//		setName();
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args)
{
	 SleepExample t1=new  SleepExample();
	 SleepExample t2=new  SleepExample();
	 
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
	 t1.start();
	 t2.start();
 
}
 
}
