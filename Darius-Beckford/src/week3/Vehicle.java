package week3;

public class Vehicle {
    // private fields //
    private String model;
    private boolean engineOn;
    private int speed;

    // constructors //
    public Vehicle(String model) {
        this.model = model;
        this.engineOn = false;
        this.speed = 0;
    }

    // getters //
    public String getModel() {
        return model;
    }
    public boolean isEngineOn() {
        return engineOn;
    }
    public int getSpeed() {
        return speed;
    }

    // setters //
    public void setModel(String model) {
        this.model = model;
    }
    public void setSpeed(int speed) {
        if (!engineOn) {
            System.out.println("Can't change speed while engine is off");
        } else if (speed < 0) {
            System.out.println("Speed can't be negative");
        } else {
            this.speed = speed;
        }
    }

    // methods //
    public void startEngine() {
        if (engineOn) {
            System.out.println("The engine is already on");
        } else {
            engineOn = true;
            System.out.println("The engine in now on");
        }
    }
    public void stopEngine() {
        if (!engineOn) {
            System.out.println("The engine is already off");
        } else if (speed > 0) {
            System.out.println("Can't turn engine off before stopping");
        } else {
            engineOn = false;
            System.out.println("The engine is now off");
        }
    }
    public void brake() {
        setSpeed(0);
        System.out.println("The vehicle has come to a stop");
    }
    public void accelerate() {
        setSpeed(speed + 10);
        System.out.println("Vehicle speed has accelerated to " + speed);
    }
}