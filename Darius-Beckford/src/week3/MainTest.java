package week3;

// separate main class for testing //
public class MainTest {
    public static void main(String [] args) {

        // new object of the Wall class //
        System.out.println("Wall Class:");
        Wall myWall = new Wall("Brick", 40, 20);
        System.out.println("The wall is made of " + myWall.getMaterial());
        System.out.println("The wall has dimensions of " + myWall.getWidth() + " x " + myWall.getHeight());
        System.out.println();

        // new object of the Door class //
        System.out.println("Door Class:");
        Door myDoor = new Door("Wood", 5, 15, true);
        System.out.println("The door is made of " + myDoor.getMaterial());
        myDoor.unlock();
        myDoor.open();
        System.out.println();

        // new object for the Window class //
        System.out.println("Window Class:");
        Window myWindow = new Window("Glass", 10, 8, true, false);
        myWindow.close();
        myWindow.unlock();
        myWindow.open();
        System.out.println();

        // new object for the Vehicle class //
        System.out.println("Vehicle Class:");
        Vehicle myVehicle = new Vehicle("Ford Fusion");
        myVehicle.startEngine();
        myVehicle.setSpeed(60);
        System.out.println("The vehicles speed is now " + myVehicle.getSpeed());
        myVehicle.accelerate();
        myVehicle.brake();
        myVehicle.stopEngine();
        System.out.println();

        // new object for Car class //
        System.out.println("Car Class:");
        Car myCar = new Car("Lamb Truck", false, false);
        myCar.startEngine();
        myCar.accelerate();
        myCar.open();
        myCar.brake();
        myCar.stopEngine();
        System.out.println();

        // new object for Motorcycle class //
        System.out.println("Motorcycle Class:");
        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", false);
        myMotorcycle.startEngine();
        myMotorcycle.setSpeed(45);
        System.out.println("The Motorcycles speed is: " + myMotorcycle.getSpeed());
        myMotorcycle.doWheelie();
        myMotorcycle.stopWheelie();
        myMotorcycle.brake();
        System.out.println();

        // new object for Student class //
        System.out.println("Student Class:");
        Student myStudent = new Student("Bob", "Johnson", "Sophomore");
        myStudent.study();
        myStudent.takeTest();
        System.out.println(myStudent.getFirstName() + " " + myStudent.getLastName() + " got an 80 on his test");
        System.out.println();

        // new object for Teacher class //
        System.out.println("Teacher Class:");
        Teacher myTeacher = new Teacher("Gil", "Salu", "OOP");
        myTeacher.gradePapers();
        myTeacher.teachLesson();
        System.out.println("Our teacher, Prof. " + myTeacher.getLastName() + ", taught us about " + myTeacher.getSubject());
    }
}
