import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("scenes/home.fxml"));
            Scene scene = new Scene(root,815,458);
            stage.setScene(scene);
            stage.setTitle("Will Hero Game");
            stage.getIcons().add(new Image("assets/logo.png"));
            stage.setResizable(false);
            stage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}