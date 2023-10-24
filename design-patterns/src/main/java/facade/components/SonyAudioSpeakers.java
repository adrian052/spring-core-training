package facade.components;

public class SonyAudioSpeakers implements AudioSpeakers {
    private TV tv;
    private boolean isOn = false;

    public void turnOn() {
        if (isOn) {
            System.out.println("Sony AudioSpeakers: Already on");
        } else {
            isOn = true;
            System.out.println("Sony AudioSpeakers: Turning On");
        }
    }

    @Override
    public void connectToTv(TV tv) {
        if (isOn) {
            if (tv != null) {
                System.out.println("Sony AudioSpeakers: Connected to TV " + tv);
                this.tv = tv;
            } else {
                System.out.println("Sony AudioSpeakers: Cannot connect to TV. The TV is not specified.");
            }
        } else {
            System.out.println("Sony AudioSpeakers: Cannot connect to TV. The speakers are off.");
        }
    }

    @Override
    public void disconnectFromTv() {
        if (isOn) {
            if (tv != null) {
                System.out.println("Sony AudioSpeakers: Disconnected from TV: " + tv);
                tv = null;
            } else {
                System.out.println("Sony AudioSpeakers: Cannot disconnect from TV. Not connected to any TV.");
            }
        } else {
            System.out.println("Sony AudioSpeakers: Cannot disconnect from TV. The speakers are off.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            tv = null;
            System.out.println("Sony AudioSpeakers: Turning Off");
        } else {
            System.out.println("Sony AudioSpeakers: Already off");
        }
    }
}
