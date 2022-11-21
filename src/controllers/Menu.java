package controllers;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelTextMenu;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnOptions;

    @FXML
    private Button btnExit;

    @FXML
    void initialize() {

    }

   public void switchSceneGameField() throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("../scenes/gamefield.fxml"));
       Stage window = (Stage) btnStart.getScene().getWindow();
       window.setScene(new Scene(root, 600, 400));
   }

    public void switchSceneOptions() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../scenes/options.fxml"));
        Stage window = (Stage) btnOptions.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void switchSceneExit(){
        Stage window  = (Stage) btnExit.getScene().getWindow();
        window.close();
    }
}

