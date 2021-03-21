package util.observer;
import java.util.Iterator;
import java.util.Vector;



public class Observable {
    protected static Vector<IObserver> subscribers = new Vector<IObserver>(1);

    public static void addObserver(IObserver s) {
        subscribers.addElement(s);
    }

    public void removeObservers(IObserver s) {
        subscribers.removeElement(s);
    }

    public void removeAllObservers() {
        subscribers.removeAllElements();
    }

    public void notifyObservers() {
        for (Iterator<IObserver> iter = subscribers.iterator(); iter.hasNext();) {
            IObserver observer = iter.next();
            observer.update();
        }
    }
}
