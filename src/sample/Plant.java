package sample;

import java.io.Serializable;

public class Plant extends Creature implements Serializable {
    private int cost;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getcost()
    {
        return cost;
    }

    @Override
    public void attack(){}

    @Override
    public void health(){}

    @Override
    public void image(){}
}
