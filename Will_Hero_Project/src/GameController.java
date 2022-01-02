import java.io.IOException;
import java.net.URL;
// import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameController extends GameObject implements Initializable{
    private Stage stage;
    private Scene scene;


    @FXML
    private ImageView herowithsword;
    @FXML
    private ImageView orc1;
    @FXML
    private ImageView orc2;
    @FXML
    private AnchorPane base;
    @FXML
    private Pane basepane;
    @FXML
    private Text points;

    Hero hero = new Hero();
    Orc orc_1 = new Orc();
    Orc orc_2 = new Orc();

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

    AnimationTimer collisionTimer = new AnimationTimer() {
        @Override
        public void handle(long timestamp){
            checkCollision();
        }
    };


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hero.setImage(herowithsword);
        orc_1.setImage(orc1);
        orc_2.setImage(orc2);
        hero.jump(herowithsword);
        orc_1.jump(orc1);
        orc_1.jump(orc2);
        collisionTimer.start();
    }

    public void dash(MouseEvent event) throws IOException {
        TranslateTransition dash = new TranslateTransition();
        dash.setNode(base);
        dash.setByX(-100);
        dash.setDuration(Duration.millis(100));
        dash.play();
        TranslateTransition imgmove = new TranslateTransition();
        imgmove.setNode(basepane);
        imgmove.setByX(100);
        imgmove.setDuration(Duration.millis(100));
        imgmove.play();
        int p = hero.heroDash(event,herowithsword);
        points.setText(""+p);
    }

    public void checkCollision(){
        for(Orc i : GameObject.getOrcList()){
            if(herowithsword.getBoundsInParent().intersects(i.getImage().getBoundsInParent())){
                System.out.println("collision");
            }
        }
        for(Coin i: GameObject.getCoinList()){
            if(herowithsword.getBoundsInParent().intersects(i.getImage().getBoundsInParent())){
                System.out.println("collision");
            }
        }
    }
}
