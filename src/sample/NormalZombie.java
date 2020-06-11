package sample;

import javafx.scene.layout.AnchorPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class NormalZombie extends Zombie {

    ImageView zombie = new ImageView();
    public NormalZombie(AnchorPane anchor)
    {
        setType("NormalZombie");
        setHealth(50);
        zombie.setImage(new Image("Images/zombie_normal.gif"));
    }



}
