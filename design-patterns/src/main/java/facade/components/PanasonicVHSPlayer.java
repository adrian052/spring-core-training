package facade.components;

public class PanasonicVHSPlayer implements VHSPlayer {
    private Cassette cassette;
    private boolean isOn = false;
    private boolean isPlaying = false;

    public void turnOn() {
        if (isOn) {
            System.out.println("Panasonic VHSPlayer: Already on");
        } else {
            isOn = true;
            System.out.println("Panasonic VHSPlayer: Turning On");
        }
    }

    @Override
    public void pushCassette(Cassette cassette) {
        if (isOn) {
            if (this.cassette == null) {
                this.cassette = cassette;
                System.out.println("Panasonic VHSPlayer: Inserting Cassette: " + cassette);
            } else {
                System.out.println("Panasonic VHSPlayer: A cassette is already inside.");
            }
        } else {
            System.out.println("Panasonic VHSPlayer: Cannot insert cassette. The player is off.");
        }
    }

    public void play() {
        if (isOn) {
            if (isPlaying) {
                System.out.println("Panasonic VHSPlayer: Already playing");
            } else {
                System.out.println("Panasonic VHSPlayer: Playing..");
                isPlaying = true;
            }
        } else {
            System.out.println("Panasonic VHSPlayer: Cannot play. The player is off.");
        }
    }

    public void stop() {
        if (isOn) {
            if (isPlaying) {
                System.out.println("Panasonic VHSPlayer: Stopped..");
                isPlaying = false;
            } else {
                System.out.println("Panasonic VHSPlayer: Already stopped");
            }
        } else {
            System.out.println("Panasonic VHSPlayer: Cannot stop. The player is off.");
        }
    }

    @Override
    public Cassette rejectCassette() {
        if (isOn) {
            Cassette cassetteRejected = this.cassette;
            if (cassette != null) {
                this.cassette = null;
                System.out.println("Panasonic VHSPlayer: Rejecting Cassette: " + cassetteRejected);
                return cassetteRejected;
            } else {
                System.out.println("Panasonic VHSPlayer: There is no cassette inside");
                return null;
            }
        } else {
            System.out.println("Panasonic VHSPlayer: Cannot reject cassette. The player is off.");
            return null;
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            isPlaying = false;
            this.cassette = null;
            System.out.println("Panasonic VHSPlayer: Turning off");
        } else {
            System.out.println("Panasonic VHSPlayer: Already off");
        }
    }
}
