package VigneshR;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class CreateFileExample
{
public static void main(String[] args)
{
try {
	File file=new File("Tech.txt");
	
	if(file.createNewFile())
{
	System.out.println("File created Successfully");
}
else
{
	System.out.println("File alredy exists");
	
}try(FileWriter filewrite = new FileWriter("Tech.txt")){
	
	filewrite.write("Hi,This is the Demo File ");
	filewrite.append("successfully appended");
	filewrite.close();
}
	BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
    String line;
    while((line=br.readLine())!=null) {
    	System.out.println(line);
    }
    br.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
}
 
}
 
 
