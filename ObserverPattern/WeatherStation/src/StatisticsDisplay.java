/**
 * The StatisticsDisplay class is an observer that displays statistical information about
 * temperature, including average, minimum, and maximum values. It subscribes to updates
 * from a WeatherData subject and updates its display accordingly.
 */
import java.util.ArrayList;

public class StatisticsDisplay implements DisplayElement, Observer{
    private float temperature;
    private WeatherData weatherData;
    private ArrayList<Float> temperatures = new ArrayList<>();

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        updateTemperature();

        weatherData.addObserver(this);
        display();
    }

    private float getAverageTemp(){
        float avg = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            avg += temperatures.get(i) / temperatures.size();
        }
        return avg;
    }
    private float getMinTemp(){
        if(temperatures.isEmpty()) throw new RuntimeException("Unexpected error occurred");

        float min = temperatures.get(0);
        for (float temp:temperatures) {
            if(temp < min) min = temp;
        }

        return min;
    }
    private float getMaxTemp(){
        if(temperatures.isEmpty()) throw new RuntimeException("Unexpected error occurred");

        float max = temperatures.get(0);
        for (float temp:temperatures) {
            if(temp > max) max = temp;
        }

        return max;
    }

    private void updateTemperature(){
        this.temperature = weatherData.getTemperature();
        temperatures.add(this.temperature);
    }

    @Override
    public void display() {
        System.out.println("*Statistics Display*:");
        System.out.println("AVG/Min/Max Temperatures: " + getAverageTemp() + "/"
                + getMinTemp() + "/" + getMaxTemp() + ".");
    }

    @Override
    public void update() {
        updateTemperature();
        display();
    }
}
