import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Orc extends GameObject implements Jumper{

    public Orc(){
        super();
        GameObject.getOrcList().add(this);
    }

    @Override
    public void jump(Node node){
        TranslateTransition jump = new TranslateTransition();
        jump.setNode(node);
        jump.setDuration(Duration.millis(900));
        jump.setCycleCount(TranslateTransition.INDEFINITE);
        jump.setByY(-150);
        jump.setAutoReverse(true);
        jump.play();
    }
}