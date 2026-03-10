package VigneshR;

import java.util.*;
public class ATMCardException {
	public static void logs() {
		
	}
	public static void main(String[] args) {
		int correctPin=1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Your Card");
		System.out.println("Enter Your Pin");
		int pin = sc.nextInt();
		try {
			if(pin!=correctPin) {
				throw new Exception("Incorrect PIN");
			}else {
				System.out.println("Pin is Correct");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}

