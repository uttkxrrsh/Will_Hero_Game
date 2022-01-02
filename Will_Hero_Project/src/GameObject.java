import java.io.Serializable;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class GameObject implements Serializable{
    private static ArrayList<Orc> orclist = new ArrayList<>();
    private static ArrayList<Hero> herolist = new ArrayList<>();
    private static ArrayList<Coin> coinlist = new ArrayList<>();
    private static ArrayList<Chest> chestlist = new ArrayList<>();
    private static ArrayList<Obstacle> obstaclelist = new ArrayList<>();

    public static ArrayList<Orc> getOrcList(){
        return orclist;
    }

    public static ArrayList<Hero> getHeroList(){
        return herolist;
    }

    public static ArrayList<Coin> getCoinList(){
        return coinlist;
    }

    public static ArrayList<Chest> getChestList(){
        return chestlist;
    }

    public static ArrayList<Obstacle> getObstacleList(){
        return obstaclelist;
    }

    @FXML
    private ImageView image;

    public void setImage(ImageView image){
        this.image = image;
    }

    public ImageView getImage(){
        return this.image;
    }
}
