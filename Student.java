import java.util.ArrayList;

public class Student {
  //people object variable
  private String email;
  private String name;
  private int choice1;
  private int choice2;
  private int choice3;
  private int choice4;
  private int choice5;

  public Student(String email, String fullname, int choice1, int choice2, int choice3,int choice4, int choice5) {
    
    this.email= email;
    name = fullname;
    this.choice1 = choice1;
    this.choice2 = choice2;
    this.choice3 = choice3;
    this.choice4 = choice4;
    this.choice5 = choice5;

  }

  // getter files because the data are private
  public String getName() {
    return name;
  }

  public int getChoice1() {
    return choice1;
  }

  public int getChoice2() {
    return choice2;
  }
  
  public int getChoice3() {
    return choice3;
  }
  
  public int getChoice4() {
    return choice4;
  }
  
  public int getChoice5() {
    return choice5;
  }

//not rly needed 
  public String toString(){
    return "Name: " + name + "; Choice1: " + choice1 + "; Choice2: " + choice2 + "; Choice3: " + choice3 + "; Choice4: " + choice4 + "; Choice5: " + choice5 + "\n";
  }

}

