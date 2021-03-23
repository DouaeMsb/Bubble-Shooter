package view;
import javax.swing.*;

public class BubbleGui extends JButton {
    String value;
    int i;
    int j;
    public BubbleGui(String value,int i,int j){
        this.i = i;
        this.j = j;
        this.setText(value);
    }

    public void setValue(String value) {
        this.setText(value);
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}