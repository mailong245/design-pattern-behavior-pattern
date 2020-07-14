package mailong245.ObserverPattern.VD1.concreteObserver;

import mailong245.ObserverPattern.VD1.model.LoginStatus;
import mailong245.ObserverPattern.VD1.model.User;
import mailong245.ObserverPattern.VD1.observer.Observer;

public class Mailer implements Observer {

    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}