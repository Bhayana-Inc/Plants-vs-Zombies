package sample;

import javafx.scene.layout.AnchorPane;

public class Showel {
    private static Showel showel=null;
    private Showel(){
    }
    public static Showel getInstance()
    {
        if (showel == null) {
            showel = new Showel(); }
        return showel;
    }

    public void clear(AnchorPane anchorPane)
    {

        anchorPane.getChildren().clear();
    }
}
