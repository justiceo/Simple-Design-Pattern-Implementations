package Observer;

import java.util.List;

/**
 * Created by Justice on 1/19/2016.
 */
public class SubjectB {

    List<IObserver> observerList;
    List<String> stringList;
    List<ConcreteObserverA> concreteObserverAs;

    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void notifyObservers() {
        for(IObserver observer2: observerList) {
            observer2.notify();
        }

        for(String s: stringList) {
            s.toString();
        }

        for(ConcreteObserverA a: concreteObserverAs) {
            a.notify();
        }
    }

    public void detachObserver(IObserver observer) {
        observerList.remove(observer);
    }

}
