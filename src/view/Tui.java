package view;

import controller.Controller;
import util.observer.IObserver;

import java.util.Scanner;


public class Tui implements IObserver {

    Controller controller;
    Scanner myScanner = new Scanner(System.in);


    public Tui(Controller controller) {
        this.controller = controller;
    }

    public  void printGame() {
        System.out.println(this.controller.getGameString());
        System.out.println(this.controller.getStatusMessage());
    }

    @Override
    public void update() {
        printGame();
        //cursorAngle(); // we remove the comment when we want to write in Console (Scanner)
    }
    public void cursorAngle() {
        if ((this.controller.getGame().getHeight() - 2) == this.controller.getGame().getShooter().getShootPositionY()
                && (this.controller.getGame().getWidth() / 2) == this.controller.getGame().getShooter().getShootPositionX()) {

            String Direction = myScanner.next();
            switch (Direction) {
                case "L":
                    this.controller.cursorAngleLeft();
                    break;
                case "R":
                    this.controller.cursorAngleRight();
                    break;
                case "C":
                    this.controller.cursorAngleCenter();
                    break;
                case "S":
                    this.controller.shoot();
                    break;

                default:
                    System.out.println("You must choose a Direction! --> (L,C,R,S)");

            }
        }else{
            this.controller.shoot();
        }
    }

}
