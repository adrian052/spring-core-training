package facade.components;

public class SamsungTV implements TV{

    private boolean isOn = false;

    public void turnOn() {
        if (isOn){
            System.out.println("Samsung TV: Already on");
            return;
        }
        isOn = true;
        System.out.println("Samsung TV: Turning On");
    }

    public void setChannel() {
        System.out.println("Samsung TV: Setting Channel");
    }

    public void setSound() {
        System.out.println("Samsung TV: Setting Sound");
    }

    public void turnOff() {
        if (!isOn){
            System.out.println("Samsung TV: Already off");
            return;
        }
        isOn = false;
        System.out.println("Samsung TV: Turning Off");
    }

    @Override
    public String toString() {
        return "SamsungTV";
    }
}
