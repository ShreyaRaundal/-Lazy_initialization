package Computer;

public class Computer {
    String brand;
    int ram;
    int rom;
    String processor;
    double price;
    Pendrive p;

    Computer(){}

    Computer(String brand,int ram,int rom,String processor,double price){
        this.brand=brand;
        this.ram=ram;
        this.rom=rom;
        this.processor=processor;
        this.price=price;
        System.out.println("Created computer");
    }
    public void displayComputer(){
        System.out.println("Brand : "+brand);
        System.out.println("Ram : "+ram);
        System.out.println("Rom : "+rom);
        System.out.println("Processor : "+processor);
        System.out.println("Price : "+price);
        System.out.println("---------------------------------------");
    }
    // healper method 
    public void insertPendrive(String brand,int memory,int speed,double price){
        p=new Pendrive(brand,memory,speed,price);

        System.out.println("Pendrive inserted");
    }
}
