package controller;

import models.Game;
import models.Messages;
import util.observer.Observable;

import java.util.concurrent.TimeUnit;

public class Controller extends Observable implements ControllerInterface {
    Game game;
    String statusMessage;
    boolean LeftDirection = true;
    boolean isOver = false;
    int A;

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
        notifyObservers();
    }

    public void cursorAngleLeft() {
        this.game.getShooter().setCursorAngleStatue("\\");
        A = 1;
        notifyObservers();
    }

    public void cursorAngleRight() {
        this.game.getShooter().setCursorAngleStatue("/");
        A = 2;
        notifyObservers();
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

    public void ShootRight() {
        this.game.getShooter().setShootPositionY(this.game.getShooter().getShootPositionY() - 1);
        if (LeftDirection) {
            this.game.getShooter().setShootPositionX(this.game.getShooter().getShootPositionX() + 1);
        } else {
            this.game.getShooter().setShootPositionX(this.game.getShooter().getShootPositionX() - 1);
        }

        if (this.game.getShooter().getShootPositionX() == 0) {
            LeftDirection = true;
        }
        if (this.game.getShooter().getShootPositionX() == this.game.getWidth() - 1) {
            LeftDirection = false;
        }
    }

    public void shoot() {
        if (A == 0) {
            ShootCentre();
        } else if (A == 2) {
            ShootRight();
        } else if (A == 1) {
            ShootLeft();
        }
        comparePositions();
    }

    public void comparePositions() {
        for (int i = 0; i < game.getBubblesSize(); i++) {
            for (int j = 0; j < game.getWidth(); j++) {
                if (i == game.getShooter().getShootPositionY()
                        && j == game.getShooter().getShootPositionX()
                        && game.getGameBubbles()[i][j].isaLive()) {
                    game.getGameBubbles()[i][j].setaLive(false);
                    ResetShooter();
                }
            }
        }
    }

    public void ResetShooter() {
        game.getShooter().setShootPositionX(game.getWidth() / 2);
        game.getShooter().setShootPositionY((game.getHeight() - 2));
    }
    public void run() {
        while (!isOver) {
            notifyObservers();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
