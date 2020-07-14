package mailong245.ObserverPattern.VD2;

import mailong245.ObserverPattern.VD2.concreteSubject.WeatherData;
import mailong245.ObserverPattern.VD2.display.CurrentConditionsDisplay;

public class vd2Application {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
