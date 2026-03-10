package VigneshR;


import java.io.*;
import java.util.Scanner;
 
public class Learners  implements Serializable
{
 
int id;
String name;
double marks;
 
Learners(int id, String name, double marks)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
void display()
{
	System.out.println("ID: " + id);
	System.out.println("Name: " + name);
	System.out.println("Marks: " + marks);
}
 
public static void main(String[] args) {
 
try
{
	Scanner sc= new Scanner (System.in);
	
	System.out.print("Enter ID:");
	int id = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Enter Name: ");
	String name=sc.nextLine();
	
	System.out.println();
	double marks =sc.nextDouble();
	
	Learners l1=new Learners(id, name, marks);
	
	FileInputStream fis= new FileInputStream("../Learner.txt");
	ObjectInputStream ois= new ObjectInputStream(fis);
	
	Learners l2= (Learners) ois.readObject();
	
	ois.close();
	fis.close();
	
	System.out.println("Deserialized Obbject Data:");
	l2.display();
}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
