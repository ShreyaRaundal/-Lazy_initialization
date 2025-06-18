package Computer;

public class Pendrive {
    String brand;
    int memory;
    int speed;
    double price;

    public Pendrive(){}

    Pendrive(String brand,int memory,int speed,double price){
        this.brand=brand;
        this.memory=memory;
        this.speed=speed;
        this.price=price;
    }
    public void displayPendrive(){
        System.out.println("brand : "+brand);
        System.out.println("memory : "+memory);
        System.out.println("speed : "+speed);
        System.out.println("price : "+price);
        System.out.println("-------------------------");

    }
}
