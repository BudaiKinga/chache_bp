/**
 * Created by BudaiK on Nov, 2020.
 */
public class MyClass {

    public static void main(String[] args) {
        // Least recently used
        MyCache cache = new MyCache();

        cache.printQueue();
        Car ret1 = cache.get("v1");
        cache.printQueue();
        cache.get("v2");
        cache.printQueue();
        cache.get("v3");
        cache.printQueue();
        cache.get("v1");
        cache.printQueue();
        cache.get("v3");
        cache.printQueue();
        cache.get("v4");
        cache.printQueue();

    }
}
