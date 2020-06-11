package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectUserController {

    public void mainmenuscreen(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();

    }
    public void newuserscreen (MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NewUser.fxml"));
        AnchorPane root = loader.load();
        stage.setTitle("PlantsVsZombies");

        stage.setScene(new Scene(root));
        stage.show();
    }


}