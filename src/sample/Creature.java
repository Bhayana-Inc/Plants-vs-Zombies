package sample;

public abstract class Creature {
    private int health;
    private String type;
    private int xpos;
    private int ypos;
    public abstract void attack();
    public abstract void health();
    public abstract void image();

}
