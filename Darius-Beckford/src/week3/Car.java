package week3;

// makes Car a subclass of Vehicle //
public class Car extends Vehicle {
    // private fields //
    private boolean locked;
    private boolean doorOpen;

    // constructors //
    public Car(String model, boolean locked, boolean doorOpen) {
        super(model);
        this.locked = true;
        this.doorOpen = false;
    }

    // getters //
    public boolean isLocked() {
        return locked;
    }
    public boolean isDoorOpen() {
        return doorOpen;
    }

    // methods //
    public void lock() {
        if (locked) {
            System.out.println("The car door is already locked");
        } else {
            locked = true;
            System.out.println("The car door is now locked");
        }
    }
    public void unlock() {
        if (!locked) {
            System.out.println("The car door is already unlocked");
        } else {
            locked = false;
            System.out.println("The car door is now unlocked");
        }
    }
    public void open() {
        if (getSpeed() > 0) {
            System.out.println("Stop the car before opening door");
        } else if (locked) {
            System.out.println("Can't open door while car is locked");
        } else {
            doorOpen = true;
            System.out.println("The car door is now open");
        }
    }
    public void close() {
        if (!doorOpen) {
            System.out.println("The car door is already closed");
        } else {
            doorOpen = false;
            System.out.println("The car door is now closed");
        }
    }
}
