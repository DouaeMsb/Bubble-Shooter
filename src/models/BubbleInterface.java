package models;

public interface BubbleInterface {
    public boolean isaLive();
    /**
     *this methode return true if the bubble is alive and false if it isn't exist.
     * @param aLive
     */

    public void setaLive(boolean aLive);
    /**
     *Set the boolean value of this variable when we need it.
     */

    public String toString();
    /**
     *When the bubble exist this methode return the String "0" if not return " ".
     */
}
