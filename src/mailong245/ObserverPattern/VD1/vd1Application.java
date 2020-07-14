package mailong245.ObserverPattern.VD1;

import mailong245.ObserverPattern.VD1.concreteObserver.Logger;
import mailong245.ObserverPattern.VD1.concreteObserver.Mailer;
import mailong245.ObserverPattern.VD1.concreteObserver.Protector;
import mailong245.ObserverPattern.VD1.concreteSubject.AccountService;
import mailong245.ObserverPattern.VD1.model.LoginStatus;

public class vd1Application {
    public static void main(String[] args) {
        AccountService account1 = createAccount("contact@gpcoder.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("---");
        AccountService account2 = createAccount("contact@gpcoder.com", "116.108.77.231");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
