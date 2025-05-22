package week6;

// Practice creating and implementing interfaces
public interface Playable {
    void play();
    void pause();
    void stop();

    default void displayStatus(String status) {
        System.out.println("Current status: " + status);
    }
}

// First implementing class
class MusicPlayer implements Playable {
    private String currentSong;

    public MusicPlayer(String song) {
        this.currentSong = song;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}

// Second implementing class - incomplete please finish
class VideoGame implements Playable {
    private String gameName;

    public VideoGame(String name) {
        this.gameName = name;
    }

    // TODO: Implement the required methods from the Playable interface
    @Override
    public void play() {
        System.out.println("Playing video game: " + gameName);
    }

    public void pause() {
        System.out.println("Game has been paused.");
    }

    public void stop() {
        System.out.println("Game has been closed.");
    }
}

