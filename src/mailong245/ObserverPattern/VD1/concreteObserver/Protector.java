package mailong245.ObserverPattern.VD1.concreteObserver;

import mailong245.ObserverPattern.VD1.model.LoginStatus;
import mailong245.ObserverPattern.VD1.model.User;
import mailong245.ObserverPattern.VD1.observer.Observer;

public class Protector implements Observer {

    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}