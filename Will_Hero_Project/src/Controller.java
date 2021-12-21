import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    private Stage stage;
    private Scene scene;

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
        alert.setHeaderText("You are about to Exit the game");
        alert.setContentText("Do you want to Exit the game without saving?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            System.out.println("Successfully Exited");
            stage.close();
        }
    }

}
