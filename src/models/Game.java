package models;

public class Game implements GameInterface {

    Shooter shooter;
    private Bubble[][] gameBubbles;
    private int height = 8;
    private int BubblesSize = 4;
    private int width = 5;

    public Game() {
        this.gameBubbles = new Bubble[this.BubblesSize][this.width];
        for (int i = 0; i < this.BubblesSize; i++) {
            for (int j = 0; j < this.width; j++) {
                this.gameBubbles[i][j] = new Bubble();

            }
        }
        this.shooter = new Shooter(width / 2, 6, width / 2, 7, "|");
    }

    public Shooter getShooter() {
        return shooter;
    }

    public Bubble[][] getGameBubbles() {
        return gameBubbles;
    }

    public Bubble getBubble(int i, int j) {
        return this.gameBubbles[i][j];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getBubblesSize() {
        return BubblesSize;
    }

    public String getBubble(Bubble bubble) {
        if (bubble.isaLive()) {
            return "O";
        } else {
            return " ";
        }
    }

    public String toString() {
        return printGame();
    }

    public String printGame() {
        String result = "/";
        for (int j = 0; j < this.width; j++) {
            result += "-";
        }

        result += "\\\n";
        for (int i = 0; i < this.height; i++) {
            result += "|";
            for (int j = 0; j < this.width; j++) {
                if (i < BubblesSize && this.gameBubbles[i][j].isaLive()) {
                    result += getBubble(this.gameBubbles[i][j]);
                } else if ((j == shooter.getShootPositionX()) && (i == shooter.getShootPositionY())) {
                    result += "o";
                } else if ((j == shooter.getCursorAnglePX()) && (i == shooter.getCursorAnglePY())) {
                    result += this.shooter.getCursorAngleStatue();
                } else {
                    result += " ";
                }
            }
            result += "|\n";
        }

        result += "\\";
        for (int j = 0; j < this.width; j++) {
            result += "-";
        }
        result += "/\n";


        return result;
    }
}