public class Vehicle {
    public double calculateValue() {
        return 0;
    }
}
public class Car extends Vehicle{
    public double calculateValue(){
        return this.getValue()*0.8;
    }

    private double getValue() {
    }

    public class Truck extends Vehicle{
        public double calculateValue(){
            return this.getValue()*0.9;
        }

        private double getValue() {
        }

    };

