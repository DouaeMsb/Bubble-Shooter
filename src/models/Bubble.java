package models;

public class Bubble implements BubbleInterface {
    boolean aLive;

    public Bubble() {
        this.aLive = true;
    }

    public boolean isaLive() {
        return aLive;
    }

    public void setaLive(boolean aLive) {
        this.aLive = aLive;
    }

    public String toString() {
        return this.aLive ? "O" : " ";
    }
}
