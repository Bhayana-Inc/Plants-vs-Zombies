package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Shooter extends Plant {

    AnchorPane anchor;
    ImageView shooter=new ImageView();
    ImageView shot=new ImageView();
    public Shooter(AnchorPane anchor)
    {   this.anchor=anchor;
        this.setCost(100);
        shooter.setImage(new Image("Images/pea_shooter.gif"));
        shot.setImage(new Image("Images/ProjectilePea.png"));
        anchor.getChildren().add(shooter);
        anchor.getChildren().add(shot);
    }

    public AnchorPane getAnchor()
    {
        return anchor;
    }
    @Override
    public void attack()
    {

        Timeline shootpea = new Timeline();
        shootpea.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, new KeyValue(shot.translateXProperty(), shot.getLayoutX())),
                new KeyFrame(new Duration(5000), new KeyValue(shot.translateXProperty(), 700 - shooter.getLayoutX())));
        shootpea.setCycleCount(shootpea.INDEFINITE);
        shootpea.play();
    }

}
