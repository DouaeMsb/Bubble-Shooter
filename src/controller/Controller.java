package controller;

import models.Game;
import models.Messages;

public class Controller implements ControllerInterface {
    Game game;
    String statusMessage;
    int A;
    boolean LeftDirection = true;

    public Controller(Game game) {
        this.game = game;
        this.statusMessage = Messages.WELCOME_MESSAGE;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public Game getGame() {
        return game;
    }

    public String getGameString() {
        return this.game.toString();
    }

    public void cursorAngleCenter() {
        this.game.getShooter().setCursorAngleStatue("|");
        A = 0;
    }

    public void cursorAngleLeft() {
        this.game.getShooter().setCursorAngleStatue("\\");
                A = 1;
    }

    public void ShootCentre() {
        this.game.getShooter().setShootPositionY(this.game.getShooter().getShootPositionY() - 1);
    }

    public void ShootLeft() {
        this.game.getShooter().setShootPositionY(this.game.getShooter().getShootPositionY() - 1);
        if (LeftDirection) {
            this.game.getShooter().setShootPositionX(this.game.getShooter().getShootPositionX() - 1);
        } else {
            this.game.getShooter().setShootPositionX(this.game.getShooter().getShootPositionX() + 1);
        }

        if (this.game.getShooter().getShootPositionX() == 0) {
            LeftDirection = false;
        }
        if (this.game.getShooter().getShootPositionX() == this.game.getWidth() - 1) {
            LeftDirection = true;
        }
    }
}
