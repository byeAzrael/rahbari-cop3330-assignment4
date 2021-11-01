package ucf.assignments;
public class Item {
    //Contains strings "description", "dueDate", and "status"
    public Item() {    
   //Item Object Constructor takes description and dueDate parameters
       //Use "this", takes dueDate and description parameters to create description
       //Creates description+due date, default status set to "i"
    }
//"setters and getters"
    public String getDescription() {
       //Displays description
  // }

    // takes description parameter
    public void setDescription() {
        //Description set
    }

  //  public String getDueDate() {
        //Displays dueDate
  //  }

    // takes dueDate parameter
    public void setDueDate() {
        //Due date set
    }

  // public String getStatus() {
        //Display status
  // }

    public void markComplete() {
        //Status set "c"
    }

    public void markIncomplete() {
        //Status set "i"
    }
}
