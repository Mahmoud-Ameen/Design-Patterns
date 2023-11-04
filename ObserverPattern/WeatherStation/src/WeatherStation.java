import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement display1 = new CurrentConditionsDisplay(weatherData);
        DisplayElement display2 = new StatisticsDisplay(weatherData);

        // Weather Measurements should be set by a station with sensors but for
        // simplicity we are directly setting these values.

        // Here we notice that every time the weatherData's state change, the displays update to reflect these updates.
        System.out.println();
        weatherData.setMeasurements(80,12,29);
        System.out.println();

        weatherData.removeObserver((Observer)display2);
        weatherData.setMeasurements(89,32,29);
    }
}