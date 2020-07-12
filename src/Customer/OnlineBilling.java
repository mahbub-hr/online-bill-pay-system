/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Bill.FXMLbillpageController;
import Bill.FXMLelectricitypageController;
import Bill.FXMLgas_waterController;
import Register.FXMLRegisterController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author TANVIR
 */
public class OnlineBilling extends Application {
   private Stage stage;
   public  void registerpage() throws IOException
    {
         stage.close();
         Stage stage=new Stage();
         this.stage=stage;
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Register/FXMLRegister.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   public  void userpage() throws IOException
    {
        stage.close();
         Stage stage=new Stage();
         this.stage=stage;
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLuserpage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   public void showLogin() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLlogin.fxml"));
        Parent root = loader.load();

        // Loading the controller
        FXMLloginController controller = loader.getController();
      
        Scene scene = new Scene(root,600,600);
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
   
   }
   public void showCreateAC() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateAccount.fxml"));
        Parent root = loader.load();
        CreateAccountController controll = loader.getController();
        controll.setMain(this);
        
        Scene scene = new Scene(root,600,650);
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
   }
   
   public void showTableView(int consumer) throws IOException
   {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tableview.fxml"));
        Parent root = loader.load();
        tableViewController controller = loader.getController();
        controller.setMain(this);
        controller.load(consumer);
        // Set the primary stage
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(root));
        stage.show();
   
   }
    @Override
    public void start(Stage stage) throws Exception {
         FXMLloginController.set(this);
         FXMLuserpageController.set(this);
         FXMLRegisterController.set(this);
         FXMLbillpageController.set(this);
         FXMLelectricitypageController.set(this);
         FXMLgas_waterController.set(this);
           this.stage=stage;
        showLogin();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        launch(args);
    }
    
}
