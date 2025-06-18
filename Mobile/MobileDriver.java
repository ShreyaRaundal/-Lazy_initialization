package Mobile;
public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "S21", "350000.0", "5G");
        m1.displayMobile();
        
        m1.insertSim("Jio", "5G", "Prepaid", 9876543210L);
        m1.s.displaySim();
    }
}
