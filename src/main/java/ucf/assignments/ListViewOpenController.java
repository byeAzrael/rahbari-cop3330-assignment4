package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
public class ListViewOpenController implements Initializable {
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
    private List selectedList;
    public void initialize(URL location, ResourceBundle resources) {
        //Get initTable
        //Get loadData
        //Get setTitle
    }
    private void initTable() {
        //Get initCols
    }
    private void initCols() {
    //Make description val="description"
    //Make due date val="dueDate"
    //Make stat val="status"
    //Get editTableCols
    }
    private void editableCols() {
     //Description params:
     //Make text field as cell 
     //Make user input value 
     //Due date params:
     //Make text field as cell 
     //Make user input value 
     //Status params:
     //Make text field as cell 
     //Make user input value 
     //Make table info editable
    }
    private void loadData() {
     //Make selectedList.itemList for table items
    }
    private void loadNewData() {
    //Put item w/ default info 
    //Make table items="itemList"
    }
    private void setTitle() {
    //Make selectedList.title="List title"
    }
    @FXML
    private void itemAdded(ActionEvent event) {
    //Get loadNewData which adds a new row to the tabl
    }
    @FXML
    void backButtonClicked(ActionEvent event) {
    //Return Start Window:
        //Make new parent and open TodoList.fxml
        //Make new scene
        //Make new stage/retrieve info
        //Create scene
    }
    @FXML
    void deleteItemButtonClicked(ActionEvent event) {
    //Delete row
    //Get List.deleteItem
    }
    @FXML
    void deleteListButtonClicked(ActionEvent event) {
    //Get TodoList.deleteList
    //Return to start window:
       //create new parent and open TodoList.fxml
       //Make new parent and open TodoList.fxml
       //Make new scene
       //Make new stage/retrieve info
       //Create scene
    }
    @FXML
    void listTitleEdited(ActionEvent event) {
    //Modify title field to user input
    }
    @FXML
    void markedComplete(ActionEvent event) {
    //Set item.status=C
    }
    @FXML
    void markedIncomplete(ActionEvent event) {
    //Set item.status=I
    }
    private void loadComplete() {
    //Cycle selectedList
    //Status=I, next
    //Status=C, enter table
    }
    private void loadIncomplete() {
    //Cycle selectedList's items
    //if status=I, enter table
    //if status=C, skip
    }
    @FXML
    void showCompleteSelected(ActionEvent event) {
    //Get loadComplete
    }
    @FXML
    void showIncompleteSelected(ActionEvent event) {
    //Get loadIncomplete
    }
    @FXML
    void showAllSelected(ActionEvent event) {
    //Get loadData
    }
    @FXML
    void saveListButtonClicked(ActionEvent event) {
    //Open directory:
    //Open new text dialouge
    //Create title
    //Create content dialog input "please input directory"
    //Set string=field
    //New, editable text field
    //Track user info
    //Get List.setDirectory
    //Get List.createDirectory
    //Get List.saveListExternally
    }
}
