package week3;

public class Motorcycle extends Vehicle {
    // private fields //
    private boolean hasSidecar;
    private boolean wheelie;

    // constructors //
    public Motorcycle(String model, boolean hasSidecar) {
        super(model);
        this.hasSidecar = hasSidecar;
        this.wheelie = false;
    }

    // getters //
    public boolean isHasSidecar() {
        return hasSidecar;
    }
    public boolean isWheelie() {
        return wheelie;
    }

    // setters //
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    public void setWheelie(boolean wheelie) {
        this.wheelie = wheelie;
    }

    // methods //
    public void doWheelie() {
        wheelie = true;
        System.out.println("Motorcycle is doing a wheelie!");
    }
    public void stopWheelie() {
        if (!wheelie) {
            System.out.println("Motorcycle is already doing a wheelie");
        } else {
            wheelie = false;
            System.out.println("Motorcycle stopped doing a wheelie");
        }
    }
}
