package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    public void selectuserscreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectUser.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
    public void endgame()
    {
        System.exit(0);
    }
    public void selectlevelscreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectLevel.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
    public void gamescreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
    public void leaderboardscreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LeaderBoard.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }
}
