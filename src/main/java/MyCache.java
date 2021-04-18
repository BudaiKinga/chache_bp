import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by BudaiK on Nov, 2020.
 */
public class MyCache {

    private static final int MAX_CAPACITY = 3;
    private Map<String, Car> map = new HashMap<String, Car>();
    private Queue<Car> queue = new LinkedList<Car>();

    private void add(Car car) {
        if (queue.size() == MAX_CAPACITY) {
            Car lastCar = queue.remove();
            map.remove(lastCar.getVin());
        }
        map.put(car.getVin(), car);
        queue.add(car);
    }

    public Car get(String vin) {
        Car c = map.get(vin);
        if (c == null) {
            c = readFromDB(vin);
            add(c);
        } else {
            queue.remove(c);
            queue.add(c);
        }
        return c;
    }

    private Car readFromDB(String vin) {
        return new Car(vin, "rosu");
    }

    public void printQueue() {
        System.out.println(queue);
    }

}
