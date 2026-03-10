package VigneshR;

import java.util.Scanner;

public class switch_example {
 
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
 
		System.out.println("Enter first number:");
		int a=sc.nextInt();
 
		System.out.println("Enter second number:");
		int b=sc.nextInt();
 
		System.out.println("Choose operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
 
		int choice =sc.nextInt();
 
		switch(choice)
			{
			case 1:
				System.out.println("Addition= " +(a+b));
				break;
 
			case 2:
				System.out.println("Subtraction= " +(a-b));
				break;
	
			case 3:
				System.out.println("Multiplication= " +(a*b));
				break;
			case 4:
				System.out.println("Division= " +(a/b));
				break;
	
			default:
				System.out.println("Invalid choice");	
			}
		sc.close(); // release the resources
 
	}
 
}
 

