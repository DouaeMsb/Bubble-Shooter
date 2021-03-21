import controller.Controller;
import models.Game;
import view.Tui;

public class BubbleShooter {
    public static void main(String[] args) {
        Game game = new Game();
        Controller controller = new Controller(game);
        Tui tui = new Tui(controller);
        controller.addObserver(tui);
        controller.run();
    }
}
