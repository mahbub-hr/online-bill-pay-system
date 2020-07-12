/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import DB.Users;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mahbub
 */
public class CreateAccountController implements Initializable {

    private OnlineBilling main;
    @FXML
    private Button new_account_button;
    
    public void setMain(OnlineBilling main) {
        this.main = main;
    }
    @FXML
    private AnchorPane anchorpaneid;
    @FXML
    private PasswordField passwordid;
    @FXML
    private Button createButton;
    @FXML
    private TextField emailID;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCreate(ActionEvent event) {
        String email = emailID.getText().trim();
        String pass = passwordid.getText().trim();
         boolean success = new Users().InsertUser(email, pass);
        if (success)
        {
            // successful login
            try
            {
                main.showLogin();
            } catch (Exception e)
            {
                e.printStackTrace();
            }

        } else
        {
            // failed login
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect Credentials");
            alert.setHeaderText("Incorrect Credentials");
            alert.setContentText("The username and password you provided is not correct.");
            alert.showAndWait();
        }
    }

    @FXML
    private void GoToLogIn(ActionEvent event) {
    }

    @FXML
    private void on_mouse_enter_anchorpane(MouseEvent event) {
    }

   
}
