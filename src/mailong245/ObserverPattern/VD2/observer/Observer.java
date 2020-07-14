package mailong245.ObserverPattern.VD2.observer;

public interface Observer {
    void update(float temp,
                float humidity,
                float pressure);
}