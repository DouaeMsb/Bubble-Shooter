package controller;

import models.Game;

public interface ControllerInterface {
    
    public String getStatusMessage();

    /**
     * return the String WELCOME-MESSAGE of the Class Messages.
     */

    public Game getGame();

    /**
     * return the game.
     */

    public String getGameString();

    /**
     * return the method toString that return the printGame method.
     */

    public void cursorAngleCenter();

    /**
     * set the cursorAngleStatue to the center direction.
     */

    public void cursorAngleLeft();

    /**
     * set the cursorAngleStatue to the left direction.
     */

    public void ShootCentre();

    /**
     * shoot in the center direction.
     */

    public void ShootLeft();

    /**
     *shoot to the left direction until the X = 0 then shoot to the right direction.
     */
}
