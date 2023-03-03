import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    class Student {
        int roll;
        String name;
        String email;
    }
    public List<Student> getStudentsList(String fileName){
        List<Student> list = new ArrayList<Student>();
        try{
	        LineNumberReader readFile = new LineNumberReader(new FileReader(fileName));
	        String lineData = readFile.readLine();
	        while(lineData != null){
	            String infoArray[] = lineData.split(",");
	            Student stud = new Student();
	            stud.roll = Integer.parseInt(infoArray[0]);
	            stud.name = infoArray[1];
	            stud.email = infoArray[2];
	            lineData = readFile.readLine();
	            list.add(stud);
	        }
	    }
	    catch(Exception ex){
	        System.out.println(ex);
	    }
	    return list;
    }
	public static void main(String[] args) {
	    
	    Main obj = new Main();
	    for(Main.Student stu : obj.getStudentsList("studentinfo.txt")){
	        System.out.println(stu.roll+","+stu.name+","+stu.email);
	    }
	}
}
