package sample;



import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    TextField addressBar;
    @FXML
    TextField addressBar1;
    @FXML
    TextField addressBar2;
    @FXML
    ListView listView;



    ObservableList<Contact> contacts = FXCollections.observableArrayList();

   public void addContact(  ){

       Contact newItem = new Contact( contacts.toArray());
       contacts.add(newItem);




   }


   public void removeContact(){
       Contact item = (Contact) listView.getSelectionModel().getSelectedItem();
       contacts.remove(item);

   }


    public void onKeyPressedNameBox(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER);


    }


    public void onKeyPressedPhoneBox(KeyEvent event) {
       if (event.getCode() == KeyCode.ENTER);

    }



    public void onKeyPressedEmailBox(KeyEvent event) {
       if (event.getCode() == KeyCode.ENTER);


    }













    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(contacts);
    }

    }
