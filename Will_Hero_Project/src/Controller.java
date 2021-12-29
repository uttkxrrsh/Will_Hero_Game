import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller implements Initializable{

    private Stage stage;
    private Scene scene;

    @FXML
    private Pane herowithsword; 

    public void makeScene(MouseEvent event, String scenename) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("scenes/"+scenename));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGame(MouseEvent event) throws IOException{
        makeScene(event, "game.fxml");
    }

    public void switchToHome(MouseEvent event) throws IOException{
        makeScene(event, "home.fxml");
    }

    public void switchToLoadGame(MouseEvent event) throws IOException{
        makeScene(event, "loadgame.fxml");
    }

    public void switchToPauseGame(MouseEvent event) throws IOException{
        makeScene(event, "pausegame.fxml");
    }

    public void switchToMadeBy(MouseEvent event) throws IOException{
        makeScene(event,"madeby.fxml");
    }

    public void switchToAbout(MouseEvent event) throws IOException{
        makeScene(event,"about.fxml");
    }

    public void logout(MouseEvent event) throws IOException{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Exit??");
        alert.setHeaderText("You are about to exit the game");
        alert.setContentText("Do you want to exit the game without saving?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            System.out.println("Successfully Exited");
            stage.close();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(herowithsword);
        jump.setDuration(Duration.millis(700));
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-100);
        jump.setAutoReverse(true);
        jump.play();
    }

    public void jump(){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(herowithsword);
        jump.setDuration(Duration.millis(700));
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-100);
        jump.setAutoReverse(true);
        jump.play();
    }

    public void dash(MouseEvent event) throws IOException{
        TranslateTransition dash = new TranslateTransition();
        dash.setNode(herowithsword);
        dash.setByX(100);
        dash.play();
    }
    

}
