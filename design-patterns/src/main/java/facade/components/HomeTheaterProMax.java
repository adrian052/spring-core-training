package facade.components;
public class HomeTheaterProMax implements HomeTheater {
    private AudioSpeakers audioSpeakers;
    private TV tv;
    private VHSPlayer vhsPlayer;

    public HomeTheaterProMax(AudioSpeakers audioSpeakers, TV tv, VHSPlayer vhsPlayer) {
        this.audioSpeakers = audioSpeakers;
        this.tv = tv;
        this.vhsPlayer = vhsPlayer;
    }

    @Override
    public void playMovie(Cassette cassette) {
        audioSpeakers.turnOn();
        tv.turnOn();
        vhsPlayer.turnOn();
        audioSpeakers.connectToTv(tv);
        vhsPlayer.pushCassette(cassette);
        vhsPlayer.play();
    }

    @Override
    public Cassette stopMovie() {
        vhsPlayer.stop();
        Cassette ejectedCassette = vhsPlayer.rejectCassette();
        audioSpeakers.disconnectFromTv();
        tv.turnOff();
        audioSpeakers.turnOff();
        vhsPlayer.turnOff();
        return ejectedCassette;
    }
}
