/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Customer.OnlineBilling;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author TANVIR
 */
public class FXMLbillpageController implements Initializable {
    public static OnlineBilling ob;
     public static void set(OnlineBilling o)
        {
           ob=o;
        }

    @FXML
    private ListView<?> listviewbillid; /*list view ,,,,this is the list of 
                                          month and year and  payment status  
    @FXML                                */
    private Button backbutton; // back button

    @FXML
    void on_back_button(ActionEvent event) { // back to before page

    }

    @FXML
    void on_mouse_clicked_listview(MouseEvent event) { //go to payment page // to see bill in details

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
