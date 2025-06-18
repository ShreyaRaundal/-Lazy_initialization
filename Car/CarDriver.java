package Car;

public class CarDriver {
    public static void main(String[] args){
        Car c1=new Car("Hyundai","verna","Petrol",15000000.0);
        c1.displayCar();

        c1.insertEngine("v6", 220, 2.0);
        c1.e.displayEngine();

    }
    
}
