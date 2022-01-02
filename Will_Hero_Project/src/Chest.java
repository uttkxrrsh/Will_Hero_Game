import javafx.scene.image.Image;

public class Chest extends GameObject{
    private boolean status = true;
    public Chest(){
        super();
        GameObject.getChestList().add(this);
    }

    public boolean isClosed(){ return status;}
    public void open(){ 
        this.status = false;
        Image img = new Image("assets/ChestOpen.png");
        getImage().setImage(img);
    }
}
