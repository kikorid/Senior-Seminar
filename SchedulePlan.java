import java.awt.desktop.PreferencesHandler;
import java.util.ArrayList;

public class SchedulePlan {
  //start inistiallizing the variable
  int numTimeSlots = 5;
  int numClass = 5;
  int maxRepeat = 2; 

  //if i can create a 2d arraylist, it will be very helpful 
  //i can start with an 2d arraylist of integers
  ArrayList<ArrayList<Integer>> schedule = new ArrayList<>();
  
  public void groupIntoTables(ArrayList<Student> list, int Max) {

    ////ArrayList<Student> students,int maxStudent
    //initailaizing the list for the things
    for(int i= 0;i < numTimeSlots; i++){
      //if there is less than the number of timeslots, i add one array lists
      ArrayList<Integer> rowNum = new ArrayList<>();
      for(int x = 0; x< numClass; x++){
        //so that there is no session schedule here
        //then i can update the list later with the value i want
        
        rowNum.add(0);
      }
      //add a 2d arraylist in a arraylist
      schedule.add(rowNum);
    }

    //making a for each loop that loops the perferences?
    for(int preference: PreferencesHandler){
      int bestChoice = 1;
      int bestClass = 1; 
      int bestScore =1 ;
      for(int i =0; i< numTimeSlots; i++){
        for(int j =0; j< numClass; j++){
          if(schedule. get(i).get(j)==0){
            //if the session is 0, meaning empty
            int score =0;
            //it means its a bad choie
            if(choice == i* numClass + j + 1){
              score =5; 
              // its the best choice because it meets top 
            }else if (choices.contains(schedule.get(i).get(j))) {
                    score = 0;
          }// it goes back to 0 bc its not the first choices 
            else{
                                // Check if adding the current student to this time slot and classroom
                    // will exceed the maximum number of students for the session.
                    int sessionID = choice;
                    int sessionCount = sessionCounts.get(sessionID);
                    if (sessionCount < 16) {
                        score = 1;
                    } else {
                        score = 0;
                    }
              /*
              } else {
                    int remainingSeats = 16 - sessionCounts.get(schedule.get(i).get(j));
                    score = remainingSeats > 0 ? remainingSeats : 0;
                }
                if (score > bestScore) {
                    bestTimeSlot = i;
                    bestClassroom = j;
                    bestScore = score;
                }
            }*/
                }
                if (score > bestScore) {
                    bestTimeSlot = i;
                    bestClassroom = j;
                    bestScore = score;
                }
            }
        }
    }
    // Update the schedule with the current student in the best available time slot and classroom.
    schedule.get(bestTimeSlot).set(bestClassroom, studentID);
    // Update the session count for the current session.
    sessionCounts.put(choice, sessionCounts.get(choice) + 1);
}
          }
        }
      }
      
    }

    printSession();
  }



/*
For each time slot and classroom, find a score for each student's preferred session based on how well it fits
- if the students first choice is avaible in the time and class-? score is 5-> if another 

For example, if a student's first choice session is available in the current time slot and classroom, the score could be set to 5. If another student has already been assigned to their first choice session, the score could be set to 0.

-  assign each student to their highest-scoring available sessio

if at max- 16-> 0
if assigned to another the score is 4
if the session has siggned to another but not as top-> score is 1 
if session avgaible and its students top 5-> 5
otherwise is 2 
-> total score for each session

  */
  public void printSession(){
    //borrow from my battleship proigram
    //print the header
    System.out.print("\n");
    // the classroom
    System.out.print("\t" + "\t");
    for (int a = 0; a < numClass; a++) {
      System.out.print((a+1) + "0" + (a+1) + "\t" + "\t");
    }
    System.out.print("\n");
    
    for(int i= 0;i < numTimeSlots; i++){
       //print random time for it
      System.out.print((i+1) + ":00: ");
      for(int j = 0; j< numClass; j++){
        //print classroom
        //i is the time and j is the class room 
        System.out.print("\t" + schedule.get(i).get(j) + "\t");
      }
      System.out.print("\n");
    }
  
  }



  
}