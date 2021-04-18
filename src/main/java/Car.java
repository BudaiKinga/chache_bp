/**
 * Created by BudaiK on Nov, 2020.
 */
public class Car {
    private String vin;
    private String color;

    public Car(String vin, String color) {
        this.vin = vin;
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return vin;
    }



}
