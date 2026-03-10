package VigneshR;


import java.util.Scanner;

public class studentscores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

			System.out.print("English: ");
			int marksEnglish = sc.nextInt();
			System.out.print("Maths: ");
			int marksMaths = sc.nextInt();
			int total = marksEnglish + marksMaths;
			System.out.println("Total: "+total);
			float percentage = total/2.0f;
			System.out.println("Percentage: "+percentage+"%");
			System.out.print("Grade: ");
			if(total>=90) {
				System.out.print("A");
			}else {
				if(total>=75) {
					System.out.print("B");
				}else {
					if(total >=50) {
						System.out.print("C");
					}
					else {
						System.out.print("Fail");
					}
				}
				
			}
			sc.close();
	}
}

