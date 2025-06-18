package Car;

public class Engine {
    String type;
    int horsePower;
    double capacity;

    public Engine(){}

    Engine(String type,int horsePower,double capacity){
        this.type=type;
        this.horsePower=horsePower;
        this.capacity=capacity;
    }
    public void displayEngine(){
        System.out.println("Type : "+type);
        System.out.println("HorsePower : "+horsePower);
        System.out.println("Capacity : "+capacity);
        System.out.println("-----------------------");
    }
}
