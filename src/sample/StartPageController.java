package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class StartPageController {
@FXML
public void mainmenuscreen (MouseEvent mouseEvent) throws IOException
{   Stage stage= (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
    FXMLLoader loader=new FXMLLoader(getClass().getResource("MainMenu.fxml"));
    AnchorPane root = loader.load();
    stage.setTitle("PlantsVsZombies");

    stage.setScene(new Scene(root));
    stage.show();


}
}
