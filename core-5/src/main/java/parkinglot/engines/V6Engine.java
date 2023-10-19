package parkinglot.engines;

public class V6Engine implements Engine{

    private int cylindersQuantity;

    public void setCylindersQuantity(int cylinders) {
        this.cylindersQuantity = cylinders;
    }

    public int getCylindersQuantity() {
        return cylindersQuantity;
    }

    @Override
    public void start() {
        System.out.println("Starting V6 Engine...");
    }

    @Override
    public String toString() {
        return "V6 Engine\n cylinders quantity: "+getCylindersQuantity();
    }
}
