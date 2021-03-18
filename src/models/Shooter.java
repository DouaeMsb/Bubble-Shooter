package models;

public class Shooter implements ShooterInterface{

    int shootPositionX;
    int shootPositionY;
    int cursorAnglePX;
    int cursorAnglePY;
    String cursorAngleStatue;

    public Shooter(int shootPositionX, int shootPositionY, int cursorAnglePX, int cursorAnglePY, String cursorAngleStatue) {
        this.shootPositionX = shootPositionX;
        this.shootPositionY = shootPositionY;
        this.cursorAnglePX = cursorAnglePX;
        this.cursorAnglePY = cursorAnglePY;
        this.cursorAngleStatue = cursorAngleStatue;
    }

    public int getShootPositionX() {
        return shootPositionX;
    }

    public void setShootPositionX(int shootPositionX) {
        this.shootPositionX = shootPositionX;
    }

    public int getShootPositionY() {
        return shootPositionY;
    }

    public void setShootPositionY(int shootPositionY) {
        this.shootPositionY = shootPositionY;
    }

    public int getCursorAnglePX() {
        return cursorAnglePX;
    }

    public void setCursorAnglePX(int cursorAnglePX) {
        this.cursorAnglePX = cursorAnglePX;
    }

    public int getCursorAnglePY() {
        return cursorAnglePY;
    }

    public void setCursorAnglePY(int cursorAnglePY) {
        this.cursorAnglePY = cursorAnglePY;
    }

    public String getCursorAngleStatue() {
        return cursorAngleStatue;
    }

    public String setCursorAngleStatue(String cursorAngleStatue) {
        return this.cursorAngleStatue = cursorAngleStatue;
    }
}
