package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Level implements Serializable {
    private  Lawn lawn =new Lawn();
    private ArrayList<Lawnmower> lawnmower= new ArrayList<>();
    private ArrayList<Plant> plants= new ArrayList<>();
    private ArrayList<Zombie> zombies= new ArrayList<>();
    private Suntoken suntoken=new Suntoken();
    private SelectLevelController selectLevelController=new SelectLevelController();
    private PurchasePlantMenu purchasePlantMenu=new PurchasePlantMenu(0);
    private MenuMenuController menuMenuController= new MenuMenuController();

    public void InitialiseLevel(){}
    public void StartLevel(){}
}
