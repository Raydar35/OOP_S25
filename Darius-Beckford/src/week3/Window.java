package week3;

// makes Window a subclass of wall //
public class Window extends Wall {
    // private fields //
    private boolean locked;
    private boolean isOpen;

    // constructors //
    public Window(String material, int width, int height, boolean locked, boolean isOpen) {
        super(material, width, height);
        this.locked = locked;
        this.isOpen = isOpen;
    }

    // getters //
    public boolean isLocked() {
        return locked;
    }
    public boolean isOpen() {
        return isOpen;
    }

    // methods //
    public void lock() {
        locked = true;
        System.out.println("The window is locked");
    }
    public void unlock() {
        locked = false;
        System.out.println("The window is unlocked");
    }
    public void open() {
        if (isOpen) {
            System.out.println("Window is already open");
        } else if (!locked) {
            isOpen = true;
            System.out.println("The window has been opened");
        } else {
            System.out.println("The window is locked, it won't open");
        }
    }
    public void close() {
        if (!isOpen) {
            System.out.println("Window is already closed");
        } else {
            isOpen = false;
            System.out.println("The window has been closed");
        }
    }
}
