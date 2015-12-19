package ch.makery.address.view;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import ch.makery.address.MainApp;

public class RootLayoutController {

    // Reference to the main application
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }


    @FXML
    private void handleExit() {
        System.exit(0);
    }
 
    
    @FXML
    public void handleNew(){
    }
    
    @FXML
    public void handleOpen(){
    }
    
    @FXML
    public void handleSave(){
    }

    @FXML
    public void handleSaveAs(){
    }
    
    @FXML
    public void handleShowBirthdayStatistics(){
    }	
    
    @FXML
    public void handleAbout(){
    }

}