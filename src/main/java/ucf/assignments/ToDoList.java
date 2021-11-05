package ucf.assignments;
public class TodoList {
    //Contains lists "todoLists"
    //Contains string "directory"
    public TodoList() {
    //Declare empty list of Lists
    //Declare empty directory string
    }
    public void setDirectory() {
    //Directory=Input
    }
    public void createDirectory() {
    //Make directory for value per directory string
    //Upon directory existence, ignore 
    }
    public void addNewList() {
        //Make List object
        //Entered to list Lists   
    }
    public void deleteList() {
        //Loop until paramenter=list.title
        //Delete list
    }
    public void editListTitle() {
        //call list.setTitle and pass newTitle
        //Loop until oldtite=list.title
        }
    public void saveAllExternally() {
        //Phase through todo list
        //Creat txt file per list "[list title].txt" 
        //List per file (file writer)
        //Line 1 is title, followed by due date description status
    }
     public List getList() {
        //Loop todoLists so list.title=title
     }
    public void loadList() {
       //Per directory, load file where title=titleList
       //Get addNewList
       //Read first line to determine title (per scanner)
    }
}
