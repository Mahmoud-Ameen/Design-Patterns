/**
 * The CurrentConditionsDisplay class is an observer that displays current weather conditions
 * including temperature and humidity. It subscribes to updates from a WeatherData subject
 * and automatically updates its display when new weather data is available.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;

    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        weatherData.addObserver(this);
        display();
    }

    @Override
    public void display() {
        System.out.println("*Current Conditions Display*:");
        System.out.println("Temperature: " + temperature + "F, "
                            + " Humidity: " + humidity + "%");
    }

    public void update(){
        this.humidity = weatherData.getHumidity();
        this.temperature = weatherData.getTemperature();

        display();
    }
}
