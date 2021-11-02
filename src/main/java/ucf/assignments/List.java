package ucf.assignments;
import ucf.assignments.Item;
import java.util.*;

public class List {
    //Contains strings "title" and "directory"
    //Contains an list of items "itemList"
    public List() {
        //using "this":
        //Title set to "New List" (empty list created)
    }
    public String getTitle() {
        //Displays title
       }
    public void setTitle() {
        //Display title
    }
    public void setDirectory() {
        //Input set as directory
    }
    public void addNewItem() {
        //New item "object" created
        //Get item constructor
        //Add to "ItemList"
    }
    public void editDescription() {
        //Run itemList loop until item.description equals oldDesc 
        //Get item.setDescription, pass newDesc
    }
    public void editDueDate() {
        //Run itemList loop until item.description equals description
        //Get item.setDueDate, pass duedate
    }
    public void editStatus() {
        //Loop through itemList until item.description equals description
        //Status True; get item.markComplete
        //Status False; get item.markIncomplete
    }
    public void deleteItem() {
        //Run itemList loop until item.description equals description
        //Delete item from list
    }
    public void createDirectory() {
        //Checks "directory" string, then new directory is created
        //If prior already true, nothing happens
    }
    public void saveListExternally() {
        //Place and create new text file "[list title].txt" per specified directory
        //Write list to file (filewriter)
        //Line 1 is list title
        //Following lines are as reads; description, due date, status 
    }
}
