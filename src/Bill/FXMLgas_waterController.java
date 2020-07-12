/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Customer.OnlineBilling;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author TANVIR
 */
public class FXMLgas_waterController implements Initializable {

    public static OnlineBilling ob;
    public  static void set(OnlineBilling o)
        {
           ob=o;
        }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
