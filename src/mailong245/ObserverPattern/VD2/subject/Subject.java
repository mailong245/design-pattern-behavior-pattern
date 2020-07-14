package mailong245.ObserverPattern.VD2.subject;

import mailong245.ObserverPattern.VD2.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(); // phương thức này được gọi để thông báo cho tất cả các observer một khi trạng thái của Subject được thay đổi.
}
