# Observer Pattern

Observer Pattern is a behavioral design pattern that establishes a one-to-many relationships between an object that has a changing state (the Subject) and other objects that relies on this state (Observers). It allows the observers to get notified every time the Subject's state change, allowing them to respond accordingly.

## Benefits of Using the Observer Pattern

By programming to the Observer Interface, the observer pattern introduces a flexible way for the subject to notify all interested objects when a change occurs, without needing knowledge of these objects. This approach effectively decouples the Subject from the Observers and allows the adding and removal of observers in runtime.
The Observer Pattern also adheres to design principles as `Encapsulate What Varies` and `Open-Closed`. By encapsulating the type and number of the observer objects, the pattern ensures that when new objects need to observe the Subject, modifications to the Subject class are unnecessary.

## Example (Weather Station from Head First Design Patterns book):

**Work Statement**
We are creating an internet-based weather monitoring station. The station is based on the `WeatherData` object which tracks the current weather conditions (temperature, humidity, pressure, ...). We'd like you to create an application that introduces initially three display elements: current conditions, weather statistics, and a simple forecast, all updated in realtime as the WeatherData aquires new measurements.

- **Define Subject and Observer Interfaces**: Create a `Subject interface` that defines methods for attaching, detaching, and notifying observers. This interface will be implemented by the subject (WeatherData).
  Create an Observer interface that defines an update method. This interface will be implemented by the display elements (observers).

- **Implement the Concrete Subject Class WeatherData**: Create The `WeatherData` class as a concrete subject. This class will maintain its state and notify the observers when changes occur.

- **Implement the Concrete Observer, Display Classes CurrentConditionsDisplay and StatisticsDisplay**: These classes will implement the Observer interface and define how they react to updates.

- **Manage the observers subscription to the Subject**: This can either be done in the client code or in the observers.

Refer to the `WeatherStation` directory to find a java implementation as well as the UML diagram of this example .

## Notes:

The Subject can `push` its state to the observers as arguments to the `update` method, or allow the observers to `pull` the data they need by providing public getters.

While the first approach is completely valid and is widely used, it has its drawbacks. By passing the subject's state as arguments to the observers through the update method, all `update` declarations and calls would need to be updated every time the WeatherData state is expanded. The `push` approach also forces the passing of the whole state to each observer even those who need to access only one or two members.
