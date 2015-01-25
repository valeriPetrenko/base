package week_2.lesson_4;

public class MainTrack {
    public static void main(String[] args) {
        Track track1 = new Track();
        Track track2 = new Track();

        track1.roll();
        //track2.roll();

        track1.stop();
        track2.stop();

        track1.getTrack();
        track1.unSetTrack();
    }
}
