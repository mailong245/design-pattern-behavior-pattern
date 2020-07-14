package mailong245.ObserverPattern.VD1.concreteObserver;

import mailong245.ObserverPattern.VD1.model.User;
import mailong245.ObserverPattern.VD1.observer.Observer;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
