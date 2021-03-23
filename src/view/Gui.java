package view;
import controller.Controller;
import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
        Controller controller;
        private BubbleGui[][] guiGrid;
        private JPanel panelTop;
        JButton cursor;
        JButton free;
        int height;
        int width;
        int bubbleSize;
        JButton shooter;
        boolean isOver = false;
        boolean userClickedShoot = false;

        public Gui(Controller controller) {
            setTitle("Bubble Shooter");
            this.controller = controller;
            height = this.controller.getGame().getHeight();
            width = this.controller.getGame().getWidth();
            bubbleSize = this.controller.getGame().getBubblesSize();
            this.guiGrid = new BubbleGui[height][width];
            panelTop = new JPanel();
            panelTop.setLayout(new GridLayout((height + 1), width, 0, 0));

            for (int i = 0; i < (height - 1); i++) {
                for (int j = 0; j < width; j++) {
                    if (i < bubbleSize && this.controller.getGame().getGameBubbles()[i][j].isaLive()) {
                        this.guiGrid[i][j] = new BubbleGui(this.controller.getGame().getBubble(i, j).toString(), i, j);
                        panelTop.add(this.guiGrid[i][j]).setBackground(Color.darkGray);
                        this.guiGrid[i][j].setEnabled(false);
                        this.guiGrid[i][j].setBorderPainted(false);
                    } else if ((j == this.controller.getGame().getShooter().getShootPositionX())
                            && (i == this.controller.getGame().getShooter().getShootPositionY())) {
                        this.guiGrid[i][j] = new BubbleGui("o", i, j);
                        this.guiGrid[i][j].setBorderPainted(false);
                        this.guiGrid[i][j].setEnabled(false);
                        panelTop.add(this.guiGrid[i][j]).setBackground(Color.darkGray);
                        this.guiGrid[i][j].setEnabled(false);
                    } else {
                        this.guiGrid[i][j] = new BubbleGui(" ", i, j);
                        panelTop.add(this.guiGrid[i][j]).setEnabled(false);
                        this.guiGrid[i][j].setBorderPainted(false);
                        this.guiGrid[i][j].setBackground(Color.darkGray);
                    }
                }
            }

            cursor = new JButton("|");

            for (int j = 0; j < width; j++) {
                if (j == (width / 2)) {
                    panelTop.add(cursor).setEnabled(false);
                    cursor.setBorderPainted(false);
                    cursor.setBackground(Color.darkGray);
                } else {
                    free = new JButton(" ");
                    panelTop.add(free).setEnabled(false);
                    free.setBorderPainted(false);
                    free.setBackground(Color.darkGray);

                }
            }
        }
}

