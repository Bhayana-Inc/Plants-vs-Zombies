package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.io.Serializable;
import java.util.ArrayList;

public class Lawn  implements Serializable {
    @FXML
    GridPane grid;
    Cell cell;
    ArrayList<ArrayList<Cell>> arr;
    public Lawn()
    {

        for (int i=0;i<9;i++) {
            for (int j = 0; j < 5; j++) {
                cell = new Cell();
                arr.get(i).add(cell);

            }
        }
    }


}
