import java.io.IOException;
import java.net.URL;
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
    private ImageView orc3;
    @FXML
    private ImageView orc4;
    @FXML
    private ImageView orc5;
    @FXML
    private ImageView orc6;
    @FXML
    private ImageView orc7;
    @FXML
    private ImageView orc8;
    @FXML
    private ImageView orc9;
    @FXML
    private ImageView orc10;
    @FXML
    private ImageView orc11;
    @FXML
    private ImageView orc12;
    @FXML
    private ImageView orc13;
    @FXML
    private ImageView orc14;
    @FXML
    private ImageView orc15;
    @FXML
    private ImageView orc16;
    @FXML
    private ImageView orc17;
    @FXML
    private ImageView coin1;
    @FXML
    private ImageView coin2;
    @FXML
    private ImageView coin3;
    @FXML
    private ImageView coin4;
    @FXML
    private ImageView coin5;
    @FXML
    private ImageView coin6;
    @FXML
    private ImageView coin7;
    @FXML
    private ImageView coin8;
    @FXML
    private ImageView coin9;
    @FXML
    private ImageView coin10;
    @FXML
    private ImageView coin11;
    @FXML
    private ImageView coin12;
    @FXML
    private ImageView coin13;
    @FXML
    private ImageView coin14;
    @FXML
    private ImageView coin15;
    @FXML
    private ImageView coin16;
    @FXML
    private ImageView coin17;
    @FXML
    private ImageView coin18;
    @FXML
    private ImageView coin19;
    @FXML
    private ImageView coin20;
    @FXML
    private ImageView coin21;
    @FXML
    private ImageView coin22;
    @FXML
    private ImageView coin23;
    @FXML
    private ImageView coin24;
    @FXML
    private ImageView coin25;
    @FXML
    private ImageView coin26;
    @FXML
    private ImageView coin27;
    @FXML
    private ImageView chest1;
    @FXML
    private ImageView chest2;
    @FXML
    private ImageView chest3;
    @FXML
    private ImageView chest4;
    @FXML
    private AnchorPane base;
    @FXML
    private Pane basepane;
    @FXML
    private Text points;
    @FXML
    private Text points1;

    Hero hero = new Hero();
    Orc orc_1 = new Orc();
    Orc orc_2 = new Orc();
    Orc orc_3 = new Orc();
    Orc orc_4 = new Orc();
    Orc orc_5 = new Orc();
    Orc orc_6 = new Orc();
    Orc orc_7 = new Orc();
    Orc orc_8 = new Orc();
    Orc orc_9 = new Orc();
    Orc orc_10 = new Orc();
    Orc orc_11 = new Orc();
    Orc orc_12 = new Orc();
    Orc orc_13 = new Orc();
    Orc orc_14 = new Orc();
    Orc orc_15 = new Orc();
    Orc orc_16 = new Orc();
    Orc orc_17 = new Orc();
    Coin coin_1 = new Coin();
    Coin coin_2 = new Coin();
    Coin coin_3 = new Coin();
    Coin coin_4 = new Coin();
    Coin coin_5 = new Coin();
    Coin coin_6 = new Coin();
    Coin coin_7 = new Coin();
    Coin coin_8 = new Coin();
    Coin coin_9 = new Coin();
    Coin coin_10 = new Coin();
    Coin coin_11 = new Coin();
    Coin coin_12 = new Coin();
    Coin coin_13 = new Coin();
    Coin coin_14 = new Coin();
    Coin coin_15 = new Coin();
    Coin coin_16 = new Coin();
    Coin coin_17 = new Coin();
    Coin coin_18 = new Coin();
    Coin coin_19 = new Coin();
    Coin coin_20 = new Coin();
    Coin coin_21 = new Coin();
    Coin coin_22 = new Coin();
    Coin coin_23 = new Coin();
    Coin coin_24 = new Coin();
    Coin coin_25 = new Coin();
    Coin coin_26 = new Coin();
    Coin coin_27 = new Coin();
    Chest chest_1 = new Chest();
    Chest chest_2 = new Chest();
    Chest chest_3 = new Chest();
    Chest chest_4 = new Chest();
    
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
        orc_3.setImage(orc3);
        orc_4.setImage(orc4);
        orc_5.setImage(orc5);
        orc_6.setImage(orc6);
        orc_7.setImage(orc7);
        orc_8.setImage(orc8);
        orc_9.setImage(orc9);
        orc_10.setImage(orc10);
        orc_11.setImage(orc11);
        orc_12.setImage(orc12);
        orc_13.setImage(orc13);
        orc_14.setImage(orc14);
        orc_15.setImage(orc15);
        orc_16.setImage(orc16);
        orc_17.setImage(orc17);
        coin_1.setImage(coin1);
        coin_2.setImage(coin2);
        coin_3.setImage(coin3);
        coin_4.setImage(coin4);
        coin_5.setImage(coin5);
        coin_6.setImage(coin6);
        coin_7.setImage(coin7);
        coin_8.setImage(coin8);
        coin_9.setImage(coin9);
        coin_10.setImage(coin10);
        coin_11.setImage(coin11);
        coin_12.setImage(coin12);
        coin_13.setImage(coin13);
        coin_14.setImage(coin14);
        coin_15.setImage(coin15);
        coin_16.setImage(coin16);
        coin_17.setImage(coin17);
        coin_18.setImage(coin18);
        coin_19.setImage(coin19);
        coin_20.setImage(coin20);
        coin_21.setImage(coin21);
        coin_22.setImage(coin22);
        coin_23.setImage(coin23);
        coin_24.setImage(coin24);
        coin_25.setImage(coin25);
        coin_26.setImage(coin26);
        coin_27.setImage(coin27);
        hero.jump(herowithsword);
        orc_1.jump(orc1);
        orc_1.jump(orc2);
        orc_1.jump(orc3);
        orc_1.jump(orc4);
        orc_1.jump(orc5);
        orc_1.jump(orc6);
        orc_1.jump(orc7);
        orc_1.jump(orc8);
        orc_1.jump(orc9);
        orc_1.jump(orc10);
        orc_1.jump(orc11);
        orc_1.jump(orc12);
        orc_1.jump(orc13);
        orc_1.jump(orc14);
        orc_1.jump(orc15);
        orc_1.jump(orc16);
        orc_1.jump(orc17);
        chest_1.setImage(chest1);
        chest_2.setImage(chest2);
        chest_3.setImage(chest3);
        chest_4.setImage(chest4);
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
                i.getImage().setLayoutY(500);
                i.getImage().setVisible(false);
                hero.setStarsCollected(1);
                points1.setText(hero.getStarsCollected() + "");
                System.out.println("1 Coin collected");
                GameObject.getCoinList().remove(i);
            }
        }
        for(Chest i:GameObject.getChestList()){
            if(herowithsword.getBoundsInParent().intersects(i.getImage().getBoundsInParent())){
                if(i.isClosed()){
                    i.open();
                    hero.setStarsCollected(10);
                    points1.setText(hero.getStarsCollected() + "");
                    System.out.println("10 coins collected");
                }
            }
        }
    }
}
