package models;

public interface ShooterInterface {

    public int getShootPositionX();
    /**
     * return the Integer of the position X of the Shooter.
     */

    public void setShootPositionX(int shootPositionX);
    /**
     * Set the Integer value of the position X of the Shooter.
     */

    public int getShootPositionY();
    /**
     * return the Integer of the position Y of the Shooter.
     */

    public void setShootPositionY(int shootPositionY);
    /**
     * Set the Integer value of the position Y of the Shooter.
     */

    public int getCursorAnglePX();
    /**
     *return the Integer of the position X of the Cursor.
     */

    public void setCursorAnglePX(int cursorAnglePX);
    /**
     * Set the Integer value of the position X of the Cursor.
     */

    public int getCursorAnglePY();
    /**
     * return the Integer of the position Y of the Cursor.
     */

    public void setCursorAnglePY(int cursorAnglePY);
    /**
     * Set the Integer value of the position Y of the Cursor.
     */

    public String getCursorAngleStatue();
    /**
     * return the String value of the Cursor.
     */

    public String setCursorAngleStatue(String cursorAngleStatue);
    /**
     * Set the String value of the Cursor when we need to move it left, right or center.
     */
}
