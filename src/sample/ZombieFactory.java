package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ZombieFactory {
    Zombie zombie;
    ImageView image;
    public ImageView createZombie(String type, AnchorPane anchor)
    {
        if (type.equals("NormalZombie"))
        {
           zombie= new NormalZombie(anchor);
           zombie.setImage(new ImageView(new Image("Images/ZombieNormal.gif")));
        }
        else if (type.equals("PlayerZombie"))
        { zombie=new PlayerZombie(anchor);
            zombie.setImage(new ImageView(new Image("Images/ZombiePlayer.gif")));
        }
        else if (type.equals("BucketZombie"))
        {
            zombie= new BucketZombie(anchor);
            zombie.setImage(new ImageView(new Image("Images/M4.png")));
        }
        else {
            zombie = new ConeZombie(anchor);
            zombie.setImage(new ImageView(new Image("Images/M2.png")));
        }
        image=zombie.getImage();
        anchor.getChildren().add(image);
        return image;
    }


}
