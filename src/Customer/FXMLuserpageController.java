/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.io.IOException;
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
public class FXMLuserpageController implements Initializable {
     public static OnlineBilling ob;
      static void set(OnlineBilling o)
        {
           ob=o;
        }
     @FXML
    private ListView<?> listviewid;

    @FXML
    private Button registerbutton;

    @FXML
    void on_mouse_clicked_listview(MouseEvent event) {

    }

    @FXML
    void on_register_button(ActionEvent event) throws IOException {
    
        
        ob.registerpage();
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
