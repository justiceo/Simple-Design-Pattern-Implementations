package Observer;

/**
 * Created by Justice on 1/19/2016.
 */
public class ConcreteObserverA implements IObserver {

    public void notifyObservers() {


        System.out.println("concrete Observer A received the message");
    }
}
