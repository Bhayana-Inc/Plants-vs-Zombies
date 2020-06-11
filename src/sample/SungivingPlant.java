package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class SungivingPlant extends Plant {

    AnchorPane anchor;
    ImageView sunflower = new ImageView();
    ImageView sun = new ImageView();

    public SungivingPlant(AnchorPane anchor) {
        this.anchor = anchor;
        this.setCost(50);
        sunflower.setImage(new Image("Images/sun_flower.gif"));
        sun.setImage(new Image("Images/sun.gif"));
        anchor.getChildren().add(sunflower);
        anchor.getChildren().add(sun);
    }

    @Override
    public void attack() {
        int z = 0;
        sun.setOpacity(z);
        zchange(sun, z);
    }



    public void hello(ImageView image, int z) {
        z = 1;
        image.setOpacity(z);




    }

    public void zchange(ImageView image, int z) {
        Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(10), e -> hello(image, 0)));

        z = 0;
        image.setOpacity(z);
        t.play();

    }
}