package VigneshR;

import java.util.*;

public class AtmScenerio {
	public static void logAttempt() {
		System.out.println("Log attempt!!");
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Pin");
	int pin=1234;
	int n = sc.nextInt();
	try {
		if (pin != n) {
//              throw new Exception("");
        }

    } catch (Exception  e) {
        System.out.println("Invalid input! Please enter numbers only.");

    }
	finally {
		logAttempt();
	}

	sc.close();
}
}