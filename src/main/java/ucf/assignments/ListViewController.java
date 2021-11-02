package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    @FXML
    private TextField listTitle;
    @FXML
    private TableView<List> list;
    @FXML
    private TableColumn<Item, String> colItem;
    @FXML
    private TableColumn<Item, String> colDate;
    @FXML
    private TableColumn<Item, String> colStatus;
    //Begin to create editable table
    public void initialize(URL location, ResourceBundle resources) {
        //Get initTable
    }
    private void initTable() {
        //Get initCols
    }
    private void initCols() {
        //Description value="description"
        //Due date value="dueDate"
        //Set status value="status"
        //Get editTableCols
    }
    private void editableCols() {
         //For status, due date and description:
         //Make cell as text field
         //Make value as user input
    }
    private void loadData() {
        //Add item to ItemList, default value 
        //Designate table items=itemList
    }
    @FXML
    private void itemAdded(ActionEvent event) {
        //Get loadData (+row)
    }
    @FXML
    void backButtonClicked(ActionEvent event) {
        //Return start window:
        //Make new parent, open TodoList.fxml
        //Set and create new scene and stage
    }
    @FXML
    void deleteItemButtonClicked(ActionEvent event) {
        //(-row) tableview
        //Get List.deleteItem   
    }
    @FXML
    void deleteListButtonClicked(ActionEvent event) {
        //call TodoList.deleteList and pass list title
        //Return to start window:
         //Set and create new scene and stage
    }
    @FXML
    void listTitleEdited(ActionEvent event) {
        //Object's title field changed to user comman
    }
    @FXML
    void markedComplete(ActionEvent event) {
        //Value of item.status="c"   
    }
    @FXML
    void markedIncomplete(ActionEvent event) {
        //Value of item.status="i"   
    }
    private void loadComplete() {
        //Status = i, skip
        //Status = c, load
    }
    private void loadIncomplete() {
        //Status = I, load 
        //Status = C, skip
    }
    @FXML
    void showCompleteButtonClicked(ActionEvent event) {
        //Get loadComplete
    }
    @FXML
    void showIncompleteButtonClicked(ActionEvent event) {
        //Get loadIncomplete     
    }
    @FXML
    void showAllSelected(ActionEvent event) {
        //Get loadData
    }
    @FXML
    void saveListButtonClicked(ActionEvent event) {
        //*Current List Saved*
        //Text input dialog opens
        //Make title of text input dialog
        //Make content of input dialog to "please input directory"
        //Make field=string
        //New editable text field
        //Get List.setDirectory
        //Get List.createDirectory
        //Get List.saveListExternally
    }
}
