package Car;
public class Car{
    String brand;
    String model;
    String fuelType;
    double price;
    Engine e;

    public Car(){}
    Car(String brand,String model,String fuelType,double price){
        this.brand=brand;
        this.model=model;
        this.fuelType=fuelType;
        this.price=price;

    }
    // helpermethod
    public void insertEngine(String type,int horse,double capacity){
        e=new Engine(type,horse,capacity);
        System.out.println("Engine inserted into the car.");
    }
    public void displayCar(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Price : "+price);

    }

}