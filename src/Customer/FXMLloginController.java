/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import DB.Users;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author TANVIR
 */
public class FXMLloginController implements Initializable {
    
   public static OnlineBilling ob;
   static void set(OnlineBilling o)
   {
       ob=o;
   }
   
     @FXML
    private AnchorPane anchorpaneid;

    @FXML
    private TextField userid;

    @FXML
    private PasswordField passwordid;

    @FXML
    private Button loginbutton;

    @FXML
    private Button new_account_button;

    @FXML
    private Button forgetbutton;

    @FXML
    void on_forget_button(ActionEvent event) {

    }

    @FXML
    void on_login_button(ActionEvent event) throws IOException {
        
        String userName = userid.getText().trim();
        String password = passwordid.getText().trim();
        int userID = new Users().validateLogin(userName, password);
        if (userID != -1)
        {
            System.out.println(userID);
            // successful login
            try
            {
                ob.showTableView(userID);
            } catch (Exception e)
            {
                e.printStackTrace();
            }

        } else
        {
            // failed login
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Incorrect Credentials");
            alert.setHeaderText("Incorrect Credentials");
            alert.setContentText("The username and password you provided is not correct.");
            alert.showAndWait();
        }
    }
    @FXML
    void on_new_account(ActionEvent event) throws IOException {
           ob.showCreateAC();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    @FXML
    private void on_mouse_enter_forget(MouseEvent event) {
    }

    @FXML
    private void on_mouse_enter_anchorpane(MouseEvent event) {
    }


}
