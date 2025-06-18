package Mobile;
public class Mobile{
    String brand;
    String name;
    String price;
    String type;
    Sim s;

    public Mobile(){}
    Mobile(String brand,String name,String price,String type){
        this.brand=brand;
        this.name=name;
        this.price=price;
        this.type=type;

        System.out.println("Mobile created");
    }
    // helpher method

    public void insertSim(String sp, String networktype, String simType, long simNo) {
    s = new Sim(sp, networktype, simType, simNo);
    System.out.println("SIM inserted");
    }

    public void displayMobile(){
        System.out.println(brand);
        System.out.println(name);
        System.out.println(price);
        System.out.println(type);
    }
}