package sample;
import javafx.scene.media.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StartPage.fxml"));
        AnchorPane root = (AnchorPane) loader.load();
        primaryStage.setTitle("PlantsVsZombies");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        AudioInputStream audioInputStream = null;
        audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/RACHIT BHAYANA/IdeaProjects/gamee/src/Images/sound.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();



    }

    public static void main(String[] args) {

        launch(args);
    }
}
