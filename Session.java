import java.util.ArrayList;

public class Session {
  //people object variable
  private String SessionName;
  private int SessionID;
  private String Presenter;

// this class shud be used to idenify the other uses with
  public Session(String SessionName, int SessionID, String Presenter) {
    
    this.SessionName= SessionName;
    this.SessionID = SessionID;
    this.Presenter = Presenter;

  }

  // getter files because the data are private
  public String getSessionName() {
    return SessionName;
  }

  public int getSessionID() {
    return SessionID;
  }

  public String getPresenter() {
    return Presenter;
  }
  

//not rly needed 
  public String toString(){
    return "SessionName: " + SessionName + "; getSessionID: " + SessionID + "; getPresenter: " + Presenter +"\n";
  }

}
