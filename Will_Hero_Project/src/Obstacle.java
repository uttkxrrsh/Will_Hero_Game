import javafx.scene.image.Image;

public class Obstacle extends GameObject{
    private boolean status = true;
    public Obstacle(){
        super();
        GameObject.getObstacleList().add(this);
    }

    public boolean isIntact(){ return status;}
    public void blast(){ 
        this.status = false;
        Image img = new Image("assets/blast.jpeg");
        getImage().setImage(img);
    }

}
