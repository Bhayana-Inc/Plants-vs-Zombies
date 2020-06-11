package sample;
import javafx.scene.layout.AnchorPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
public class PlayerZombie extends Zombie{

    ImageView zombie = new ImageView();
    public PlayerZombie(AnchorPane anchor)
    {
        setType("PlayerZombie");
        setHealth(200);
        zombie.setImage(new Image("Images/zombie_football.gif"));
    }


}
