package models;

public interface GameInterface {

    public Shooter getShooter();
    /**
     * return the shooter.
     */
    public Bubble[][] getGameBubbles();
    /**
     * return gameBubbles.
     */
    public Bubble getBubble(int i, int j);
    /**
     *return the indexes i and j of the gameBubbles.
     */
    public int getHeight();
    /**
     *return the integer value of the height.
     */
    public int getWidth();
    /**
     *return the integer value of the width.
     */
    public int getBubblesSize();
    /**
     *return the size of the Bubbles.
     */
    public String getBubble(Bubble bubble);
    /**
     *return the String "0" if the Bubble is still alive.
     * & return nothing (" ") if it isn't alive.
     */
    public String toString();
    /**
     * return the method printGame that draw the Game.
     */
    public String printGame();
    /**
     * return the String result where we draw the method with the help of the for loop
     * & the condition if else.
     */
}
