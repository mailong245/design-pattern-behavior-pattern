package mailong245.ObserverPattern.VD2.concreteSubject;

import mailong245.ObserverPattern.VD2.observer.Observer;
import mailong245.ObserverPattern.VD2.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    // Chúng ta thêm một ArrayList để lưu danh sách cách Observer, khởi tạo nó ở constructor.
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        // Khi một observer đăng kí quan sát, chúng ta sẽ thêm nó vào cuối danh sách.
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // Ngược lại, nếu một observer không muốn đăng kí nữa, chúng ta sẽ loại nó ra khỏi danh sách
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); ++i) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // Chúng ta thông báo cho các Observer một khi chúng ta đã cập nhật thành công các thông tin từ Weather Station.
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        // Chúng ta có phương thức này để tạm thời có thể thay đổi trạng thái của WeaterData.
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}