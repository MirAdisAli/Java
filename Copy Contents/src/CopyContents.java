import java.util.*;
import java.io.*;
public class CopyContents
{
	public static void main(String[] args) 
	{
		try
		{
            FileReader fin = new FileReader("Input.txt");            
            FileWriter fout = new FileWriter("Output.txt");            
            int c = fin.read();
            
            while(c != -1) 
            {
                fout.write(c);
                
                c = fin.read();
            }
            System.out.println("Input.txt is copied into Output.txt");             
            fin.close();              
            fout.close();  
        } 
        catch(IOException e) 
        {
            System.out.println("Error: File not exist....");
        }  
	}
}

