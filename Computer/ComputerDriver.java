package Computer;

public class ComputerDriver {
    public static void main(String[]args){
        Computer c1 = new Computer("Hp", 8, 512, "i5", 40000.0);
        c1.displayComputer();

        c1.insertPendrive("Sandisk", 32, 400, 50000.0);
        c1.p.displayPendrive();
    }
}
