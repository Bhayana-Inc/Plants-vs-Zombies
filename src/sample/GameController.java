package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;


public class GameController implements Initializable  {

    private ArrayList<Level> level=new ArrayList<>();
    public void ChooseLevel(){}
    public void Play(){}
    private Suntoken suntoken=new Suntoken();
    @FXML
    Text suntokentext;
    @FXML
    GridPane grid;
    Showel showel;
    ArrayList<String> zombietype=new ArrayList<>();

    @FXML
    AnchorPane lc1;
    @FXML
    AnchorPane lc2;
    @FXML
    AnchorPane lc3;
    @FXML
    AnchorPane lc4;
    @FXML
    AnchorPane lc5;
    @FXML
    ImageView landmower1;
    @FXML
    ImageView landmower2;
    @FXML
    ImageView landmower3;
    @FXML
    ImageView landmower4;
    @FXML
    ImageView landmower5;

    public void generatezombie()
    {
        zombietype.add("NormalZombie");
        zombietype.add(" BucketZombie");
        zombietype.add("ConeZombie");
        zombietype.add("PlayerZombie");
        AnchorPane a=new AnchorPane();
        Random r= new Random();
        int x =r.nextInt(4);
        int y=r.nextInt(5);
        if (y==0)
            a=lc1;
        else if (y==1)
            a=lc2;
        else if (y==2)
            a=lc3;
        else if (y==3)
            a=lc4;
        else if (y==4)
            a=lc5;
        String s=zombietype.get(x);
        ZombieFactory factory=new ZombieFactory();
        ImageView im= factory.createZombie(s,a);
        im.setFitWidth(60);
        im.setFitHeight(80);
        Node node=(Node) im;

        TranslateTransition translate = new TranslateTransition();
        translate.setByX(-600);
        translate.setDuration(Duration.millis(20000));

        translate.setNode(node);

        translate.play();

    }


    public void menumenu (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuMenu.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }



    public void increasetoken(ImageView im)
    {

        suntoken.setValue(suntoken.getValue()+10);
        im.setOpacity(0);
        String str=String.valueOf(suntoken.getValue());
        suntokentext.setText(str);
    }



    public void lawntranslate(MouseEvent mouseEvent)

        {   ImageView image = (ImageView)mouseEvent.getSource();
            Node node=(Node) image;
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(800);
            translate.setDuration(Duration.millis(1000));

            translate.setNode(node);

            translate.play();
        }

    @FXML
    ImageView z1;
    @FXML
    ImageView z2;
    @FXML
    ImageView z3;
    @FXML
    ImageView z4;


    public void zombietranslate ()

    {
        Node node=(Node) z1;

        TranslateTransition translate = new TranslateTransition();
        translate.setByX(-600);
        translate.setDuration(Duration.millis(20000));

        translate.setNode(node);

        translate.play();

    }
    @Override
    public void  initialize(URL location, ResourceBundle resources) {
        suntokentext.setText("100");

        skulltranslate();
        Timeline t= new Timeline(
                new KeyFrame(Duration.seconds(10), e -> sundrop()),new KeyFrame(Duration.seconds(20), e -> sundrop()));
        t.setCycleCount(t.INDEFINITE);
        t.play();
        Timeline tz=new Timeline(new KeyFrame(Duration.seconds(10), e -> generatezombie()));
        tz.setCycleCount(5);
        tz.play();
    }
    @FXML
    AnchorPane gg;


    public void sundrop() {
        Timeline timeline=new Timeline();
        ImageView image= new ImageView();
        image.setImage(new Image("Images/sun.gif"));
        gg.getChildren().add(image);
        Random r=new Random();
        int x=r.nextInt(700-150)+150;
        image.setLayoutX(x);
        image.setLayoutY(0);
        timeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, new KeyValue(image.translateYProperty(), 0)),
                    new KeyFrame(new Duration(10000),new KeyValue(image.translateYProperty(), 400)));
        timeline.play();
        image.setOnMouseClicked(e -> increasetoken(image));





    }
//    public void sundrop()
//    {
//        Random r= new Random();
//        int x=r.nextInt(550)+150;
//        ImageView image= new ImageView();
//        image.setImage(new Image("Images/sun.gif"));
//        gg.getChildren().add(image);
//        image.setLayoutX(x);
//        image.setLayoutY(0);
//
//        Node n= (Node) image;
//        TranslateTransition translate = new TranslateTransition();
//        translate.setByY(500);
//        translate.setDuration(Duration.millis(20000));
//        translate.setNode(n);
//        translate.play();
//
//
//    }




    @FXML
    ImageView skull;
    public void skulltranslate()

    {
        Node n=(Node) skull;
        TranslateTransition translate = new TranslateTransition();
        translate.setByX(-280);
        translate.setDuration(Duration.millis(100000));

        translate.setNode(n);

        translate.play();
    }


//    TimerTask t=new TimerTask() {
//            @Override
//            public void run() {
//                sundrop();
//            }
//        };


    @FXML
    ImageView sun;

    ArrayList<Sun> suntokens = new ArrayList<>();

//    public void suntranslate()
//
//    {   Random r = new Random();
//        int x=r.nextInt(11);
//        Node n=(Node) sun;
//        n.setLayoutX(x*50);
//        n.setLayoutY(0);
//        TranslateTransition translate = new TranslateTransition();
//        translate.setByY(500);
//        translate.setDuration(Duration.millis(20000));
//        translate.setNode(n);
//        translate.play();
//
//    }
//    public void sundropping()
//    {
//        Timer time = new Timer();
//        time.schedule(t,0,10000);
//
//    }

    PurchasePlantMenu ppm= new PurchasePlantMenu(0);
    static int x=0;
    public void getidd(MouseEvent mouseEvent)
    {   ImageView image = (ImageView)mouseEvent.getSource();

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
    }


    public void tokenincrease(ImageView image,int z)
    {
        suntoken.setValue(suntoken.getValue()+10);
        String str=String.valueOf(suntoken.getValue());
        suntokentext.setText(str);
        zchange(image,z);
    }

    public void hello(ImageView image,int z)
    {
        z=1;
        image.setOpacity(z);

            image.setOnMouseClicked(e -> tokenincrease(image, 0));


    }

    public void zchange(ImageView image, int z)
    {   Timeline t= new Timeline(
            new KeyFrame(Duration.seconds(10), e-> hello(image,0)));

        z=0;
        image.setOpacity(z);
        t.play();




    }
    public void setplant(MouseEvent mouseEvent)
    {
        ImageView image= new ImageView();
        AnchorPane anchor= (AnchorPane) mouseEvent.getSource();

                if (x != 0 && x != 5 && anchor.getChildren().isEmpty()) {

                        if (x == 1)
                        {
                            Shooter shooter= new Shooter(anchor);
                            if (suntoken.getValue()>=shooter.getcost())
                            {
                                suntoken.setValue(suntoken.getValue()-shooter.getcost());
                                String str=String.valueOf(suntoken.getValue());
                                suntokentext.setText(str);
                                x = 0;
                                shooter.attack();
                            }
                            else{
                                InsufficientTokenException e= new InsufficientTokenException();
                            }
                        }
                        else if (x == 2)
                        {   if (suntoken.getValue()>=50) {
                            suntoken.setValue(suntoken.getValue()-50);
                            String str=String.valueOf(suntoken.getValue());
                            suntokentext.setText(str);
                            int z = 0;
                            image.setImage(new Image("Images/sun_flower.gif"));
                            ImageView sunonplant = new ImageView();
                            sunonplant.setImage(new Image("Images/sun.gif"));
                            anchor.getChildren().add(image);
                            anchor.getChildren().add(sunonplant);
                            sunonplant.setOpacity(z);

                            zchange(sunonplant, z);
                        }
                        else
                        {
                            InsufficientTokenException e= new InsufficientTokenException();
                        }



                        }
                        else if (x == 3)
                        {

                            if (suntoken.getValue()>=150) {
                                suntoken.setValue(suntoken.getValue()-150);
                                String str = String.valueOf(suntoken.getValue());
                                suntokentext.setText(str);
                                image.setImage(new Image("Images/cherrrrr.png"));
                                image.setFitHeight(80);
                                image.setFitWidth(60);
                                anchor.getChildren().add(image);
                                x = 0;

                            }
                            else
                            {
                                InsufficientTokenException e= new InsufficientTokenException();
                            }
                        }
                        else if (x == 4)
                        {
                            if (suntoken.getValue()>=50) {
                                suntoken.setValue(suntoken.getValue()-50);
                                String str = String.valueOf(suntoken.getValue());
                                suntokentext.setText(str);

                            image.setImage(new Image("Images/walnut_full_life.gif"));
                            anchor.getChildren().add(image);
                            x = 0;
                            }
                            else
                            {
                                InsufficientTokenException e= new InsufficientTokenException();
                            }
                        }


            }else if (x == 5) {
            showel.getInstance().clear(anchor);
            x = 0;



        }

    }


}



