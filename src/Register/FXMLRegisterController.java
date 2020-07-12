/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;
import Customer.FXMLloginController;
import Customer.FXMLuserpageController;
import Customer.OnlineBilling;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author TANVIR
 */
public class FXMLRegisterController implements Initializable {
    public static OnlineBilling ob;
      public static void set(OnlineBilling o)
        {
           ob=o;
          
        }
@FXML
    private TextField customerid;

    @FXML
    private TextField companyname;

    @FXML
    private TextField code;

    @FXML
    private Button okbutton;

    @FXML
    void on_ok_button(ActionEvent event) throws IOException {
        
        ob.userpage();
        
        

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
