import java.io.*;
import java.util.*;

public class Search{
  Scanner scan = new Scanner(System.in);
  //arrayList of students
  ArrayList<Student> schoolList = new ArrayList<Student>(); 
  //arrayList of session
  ArrayList<Session> sessionList = new ArrayList<Session>();
  
  //data variable
  private String[] list;//list of the choices and schools

  //it loads the data and make it a list of usable and sorted data
  public void loadStudents() {
    //int tableSize = size;
     // ArrayList<Student> schoolList = new ArrayList<Student>(); 

    //based on w3school, check the multiline comment for extra information
     try {
      File myObj = new File("StudentChoice.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        //take all the stuff
        String data = myReader.nextLine();
        list = null;
        //make a list and divide it by comma
        list = data.split(",");  
        //call the makeStudent function and send the list into it
        //then add the student objects from the list into the arraylist
        schoolList.add(makeStudent(list));
      }
        
      
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

   // loadSession();
    /*
    for(int i =0; i< schoolList.size(); i++){
      System.out.println(schoolList.get(i));
    }
    */
    // test schedule plan array
    SchedulePlan s1 = new SchedulePlan();
    s1.groupIntoTables(schoolList,16);
    //Student[][] class = SchedulePlan.groupIntoTables(schoolList,16);
 
  }

  /*
  
  
  public void loadSession() {
    System.out.println("Currently Loading the Session...");
    
    //based on w3school, check the multiline comment for extra information
     try {
      File myObj = new File("SessionList.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        //take all the stuff
        String data = myReader.nextLine();
        list = null;
        //make a list and divide it by comma
        list = data.split(",");  
        //call the makeStudent function and send the list into it
        //then add the student objects from the list into the arraylist
        schoolList.add(makeStudent(list));
      }
        
      
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    
  }

  
  
  
  */

  public Student makeStudent(String[] plist){
    Student c1 = new Student(plist[1], plist[2],Integer.parseInt(plist[3]),Integer.parseInt(plist[4]),Integer.parseInt(plist[5]),Integer.parseInt(plist[6]),Integer.parseInt(plist[7]));
    return c1;
  }

//  System.out.printlnschoolList.toString();

  
}