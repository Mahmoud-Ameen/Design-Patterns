import java.util.ArrayList;

/**
 * The WeatherData class represents a subject in the Observer Pattern. It tracks weather data
 * including temperature, humidity, and pressure. Observers can register to receive updates
 * when weather data changes.
 */
public class WeatherData implements Subject{

    /** Subject Interface Related Members **/
    private ArrayList<Observer> observers;

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var observer:observers) {
            observer.update();
        }
    }

    private void measurementsChanged(){
        notifyObservers();
    }

    /** WeatherData Specifics **/
    private float temperature = 80.6F;
    private float humidity = 39;
    private float pressure = 29.92F;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getPressure() {
        return pressure;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getTemperature() {
        return temperature;
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
