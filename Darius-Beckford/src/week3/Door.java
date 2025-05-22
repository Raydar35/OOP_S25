package week3;

// makes Door a subclass of Wall //
public class Door extends Wall {
    // private fields
    private boolean locked;

    // constructors
    public Door(String material, int width, int height, boolean locked) {
        super(material, width, height);
        this.locked = locked;
    }

    // getters //
    public boolean isLocked() {
        return locked;
    }

    // setters //
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    // methods
    public void lock() {
        locked = true;
        System.out.println("The door is now locked");
    }
    public void unlock() {
        locked = false;
        System.out.println("The door is now unlocked");
    }
    public void open() {
        if (!locked) {
            System.out.println("Door opens");
        } else {
            System.out.println("Door is locked, it won't open");
        }
    }
}
