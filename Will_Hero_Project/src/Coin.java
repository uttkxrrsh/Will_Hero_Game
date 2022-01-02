public class Coin extends GameObject{
    public Coin(){
        super();
        GameObject.getCoinList().add(this);
    }
}
