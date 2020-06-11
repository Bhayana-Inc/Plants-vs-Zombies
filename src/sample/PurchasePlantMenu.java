package sample;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PurchasePlantMenu {

    private int x;

    public PurchasePlantMenu(int x){
        this.x=x;
    }
    public int whichplant(MouseEvent mouseEvent)

    {

        ImageView image = (ImageView)mouseEvent.getSource();

        String str=image.getId();

        if (str.equals("peashooter"))
        {x=1;
            System.out.println(x);}
        else if(str.equals("sunflower"))
        {x=2;
            System.out.println(x);}
        else if(str.equals("cherrybomb"))
        {  x=3;
            System.out.println(x);}
        else if(str.equals("potatobomb"))
        {x=4;
            System.out.println(x);}
        else if(str.equals("showel"))
        {x=5;
            System.out.println(x);}
        else
            x=0;


        return x;
    }

}
