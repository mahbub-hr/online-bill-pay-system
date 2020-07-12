/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import DB.Users;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import DB.Users;

/**
 * FXML Controller class
 *
 * @author mahbub
 */
public class tableViewController implements Initializable {
     private OnlineBilling main;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<?, ?> consumerID;
    @FXML
    private TableColumn<?, ?> serviceID;
    @FXML
    private TableColumn<?, ?> serviceName;
    @FXML
    private TableColumn<?, ?> startReading;
    @FXML
    private TableColumn<?, ?> endReading;
    @FXML
    private Button button;
    ObservableList<User> data;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonAction(ActionEvent event) {
    }
    
    
    public void load(int consumer)
    {
        

        data = FXCollections.observableArrayList();
         System.out.println("Customer.tableViewController.load()");
        List<List<String>> userDataList = new Users().ShowUsage(consumer);
        for (List<String> row : userDataList)
        {
            System.out.println(row.get(0));
            data.add(new User(row.get(0), row.get(1), row.get(2), row.get(3),row.get(4)));
        }
    tableView.setEditable(true);
    tableView.setItems(data);
}

    void setMain(OnlineBilling aThis) {
        main = aThis;
    }
}
