package VigneshR;


public class ThrowEx {
	public static void main(String args[]) {
	
		try {
			int bal = 2000;
			if(bal<5000) {
				throw new Exception("Insufficient bal");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
			}
}

