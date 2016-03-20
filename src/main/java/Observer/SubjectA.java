package Observer;

import java.util.List;

/**
 * Created by Justice on 1/19/2016.
 */
public class SubjectA {

    List<IObserver> observerList;

    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void notifyObservers() {
        for(IObserver observer1: observerList) {
            observer1.notify();
        }
    }

    public void detachObserver(IObserver observer) {
        observerList.remove(observer);
    }

}
