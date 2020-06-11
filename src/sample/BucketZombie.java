package sample;
import javafx.scene.layout.AnchorPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
public class BucketZombie extends Zombie{

    ImageView zombie = new ImageView();
    public BucketZombie(AnchorPane anchor)
    {
        setType("BucketZombie");
        setHealth(150);
        zombie.setImage(new Image("Images/M4.png"));
    }

    @Override
    public ImageView getImage() {
        return zombie;
    }



}

