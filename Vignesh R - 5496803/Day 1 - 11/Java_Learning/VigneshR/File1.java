package VigneshR;

import java.io.*;
import java.util.*;
public class File1 {
	public static void main(String[] args) {
		
		File myFile=new File("Vignesh.txt");
		try {
			if(myFile.createNewFile()) {
				
				System.out.println("File is Created sucessfully");
			}
			else {
				System.out.println("File already exist");
			}
		
		
			try (FileWriter fileWriter = new FileWriter(myFile)){
				fileWriter.write("Hi,Vignesh");	
			}
			try(Scanner sc = new Scanner(myFile)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				}
			}try {
				System.out.println(myFile.getCanonicalPath());
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(myFile.delete()) {
				System.out.println("Successfully deleted");
			}
			}
		catch(IOException e) {
				e.printStackTrace();
			}
		
		}
		
}

