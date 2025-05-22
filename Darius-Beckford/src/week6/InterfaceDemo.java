package week6;

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create objects and demonstrate polymorphism
        Playable musicApp = new MusicPlayer("Bohemian Rhapsody");

        // TODO: Create a VideoGame object
        Playable monsterHunter = new VideoGame("Monster Hunter Wilds");

        // Store both in an array of Playable type
        Playable[] mediaItems = {musicApp, monsterHunter};

        // Use polymorphism to call methods on different objects
        for (Playable item : mediaItems) {
            item.play();
            item.displayStatus("Playing");
            item.pause();
        }
    }
}
