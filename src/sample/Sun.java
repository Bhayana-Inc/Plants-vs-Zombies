package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sun {
    private ImageView i1;
    public Sun()
    {
        i1.setImage(new Image("Images/sun.gif"));
    }

    public ImageView getImage()
    {
        return i1;
    }
}
