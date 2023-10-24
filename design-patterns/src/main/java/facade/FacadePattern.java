package facade;

// TODO implement facade pattern
// create an interface HomeTheater and implement two methods:
// playMovie(Cassette cassette) & Cassette stopMovie(), using all

import facade.components.*;

public class FacadePattern {
    public static void main(String[] args) {

        AudioSpeakers audioSpeakers = new SonyAudioSpeakers();
        TV tv = new SamsungTV();
        VHSPlayer vhsPlayer = new PanasonicVHSPlayer();


        HomeTheater homeTheater = new HomeTheaterProMax(audioSpeakers, tv, vhsPlayer);


        Cassette cassette = new Cassette("My Favorite movie");
        homeTheater.playMovie(cassette);

        Cassette rejectedCassette = homeTheater.stopMovie();
        System.out.println("The rejected cassette is"+rejectedCassette);
    }
}
