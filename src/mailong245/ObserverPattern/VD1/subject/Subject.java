package mailong245.ObserverPattern.VD1.subject;

import mailong245.ObserverPattern.VD1.observer.Observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}
