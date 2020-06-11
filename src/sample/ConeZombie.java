package sample;
import javafx.scene.layout.AnchorPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
public class ConeZombie extends Zombie{


    ImageView zombie = new ImageView();
    public ConeZombie(AnchorPane anchor)
    {
        setType("ConeZombie");
        setHealth(100);
        zombie.setImage(new Image("Images/M1.png"));
    }


}
