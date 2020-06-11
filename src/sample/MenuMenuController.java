package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuMenuController {

    public void save(){}
    public void exit(){}


    public void gamescreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
    public void endgame(MouseEvent mouseEvent) throws IOException
    {
        System.exit(0);
    }
    public void mainmenuscreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
}
