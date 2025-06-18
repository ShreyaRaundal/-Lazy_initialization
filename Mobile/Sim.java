package Mobile;
public class Sim{
    String serviceProvider;
    String networkType;
    String type;
    long simNo;

    public Sim() {}

    Sim(String serviceProvider, String networkType, String type, long simNo)
{
        this.serviceProvider=serviceProvider;
        this.networkType=networkType;
        this.type=type;
        this.simNo=simNo;
    }
    public void displaySim(){
        System.out.println(serviceProvider);
        System.out.println(networkType);
        System.out.println(type);
        System.out.println(simNo);
        System.out.println("-----------------------------------");
    }
}