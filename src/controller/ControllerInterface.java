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

    public void cursorAngleRight();

    /**
     * set the cursorAngleStatue to the right direction.
     */

    public void ShootCentre();

    /**
     * shoot in the center direction.
     */

    public void ShootRight();

    /**
     * shoot in the right direction.
     */

    public void ShootLeft();

    /**
     * shoot to the left direction until the X = 0
     * then shoot to the right direction.
     */

    public void shoot();

    /**
     * shoot center if the condition is true
     * & shoot right if the second condition is true
     * shoot left if the third condition is true
     * then call the comparePosition method.
     */

    public void comparePositions();

    /**
     * compare the indexes X & Y
     * if the shooter is in a index of a Bubble, the bubble will be not alive
     * & call the method resetShooter.
     */

    public void ResetShooter();

    /**
     * Let the Shooter back to its place.
     */

    public void run();

    /**
     * While the variable isOver is true call the notifyObserver
     * & run the code in each 5 seconds.
     */
}
