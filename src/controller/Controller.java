package controller;

import models.Game;
import models.Messages;

import java.util.Scanner;

public class Controller implements ControllerInterface {
    Game game;
    String statusMessage;
    boolean LeftDirection = true;
    Scanner myScanner = new Scanner(System.in);
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
    }

    public void cursorAngleLeft() {
        this.game.getShooter().setCursorAngleStatue("\\");
        A = 1;
    }

    public void cursorAngleRight() {
        this.game.getShooter().setCursorAngleStatue("/");
        A = 2;
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

    public void cursorAngle() {
        if ((game.getHeight() - 2) == game.getShooter().getShootPositionY()
                && (game.getWidth() / 2) == game.getShooter().getShootPositionX()) {

            String Direction = myScanner.next();
            switch (Direction) {
                case "L":
                    cursorAngleLeft();
                    break;
                case "R":
                    cursorAngleRight();
                    break;
                case "C":
                    cursorAngleCenter();
                    break;
                case "S":
                    shoot();
                    break;

                default:
                    System.out.println("You must choose a Direction! --> (L,C,R,U,S)");

            }
        } else {
            shoot();
        }
    }


}
