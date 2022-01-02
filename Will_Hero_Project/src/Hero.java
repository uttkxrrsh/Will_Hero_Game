import java.io.IOException;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Hero extends GameObject implements Jumper{

    private int starscollected = 0;
    private int points = 0;

    public int getStarsCollected() { return starscollected; }
    public void setStarsCollected(int starscollected) { starscollected++;}

    public Hero(){
        super();
        GameObject.getHeroList().add(this);
    }

    @Override
    public void jump(Node node){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(node);
        jump.setDuration(Duration.millis(500));
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-100);
        jump.setAutoReverse(true);
        jump.play();
    }

    public int heroDash(MouseEvent event, Node node) throws IOException{
        TranslateTransition dash = new TranslateTransition();
        dash.setNode(node);
        dash.setByX(100);
        dash.setDuration(Duration.millis(100));
        dash.play();
        points++;
        System.out.println("Current Score: " + points);
        return points;
    }

    public void die(){
        
    }

}