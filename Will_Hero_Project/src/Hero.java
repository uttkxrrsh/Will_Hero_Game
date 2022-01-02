import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Hero extends GameObject implements Jumper{

    private int starscollected = 0;
    
    public int getStarsCollected() { return starscollected; }
    public void setStarsCollected(int starscollected) { starscollected++;}

    @Override
    public void jump(Node node){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(node);
        jump.setDuration(Duration.millis(700));
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-100);
        jump.setAutoReverse(true);
        jump.play();
    }

    public void heroDash(MouseEvent event, Node node) throws IOException{
        TranslateTransition dash = new TranslateTransition();
        dash.setNode(node);
        dash.setByX(100);
        dash.play();
    }
}
