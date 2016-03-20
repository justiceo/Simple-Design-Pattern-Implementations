package Observer;

/**
 * Created by Justice on 1/19/2016.
 */
public class ConcreteObserverB implements IObserver {

    public void notifyObservers() {
        System.out.println("concrete Observer B received the message");
    }
}
