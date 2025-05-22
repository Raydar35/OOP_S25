package Sith;

public class Sith {
    // Step 1: Declare a static counter for Sith (shared by all Sith)
    static public int sithCount = 0;
    private static final int max_sith = 2;

    // Step 2: Create an enum for SithRank (Master, Apprentice)
    enum SithRank {
        MASTER,
        APPRENTICE
    }

    // Step 3: Instance variables for Sith name and rank
    public String name;
    public SithRank rank;

    // Step 4 and 5: Constructor - When a new Sith is created, increment the counter. Enforce the Rule of Two (limit Sith to 2)
    public Sith(String name, SithRank rank) {
        if (sithCount == max_sith) {
            System.out.println("Error! Can't have more than 2 Siths.");
            return;
        }
        this.name = name;
        this.rank = rank;
        sithCount++;
    }

    // Step 6: Create a static method to print the current Sith count
    public static void printSithCount() {
        System.out.println("Sith count: " + sithCount);
    }

    // Step 7: Demonstrate memory allocation
    public void printMemoryInfo (){
        System.out.println(this + "Sith object address: " + System.identityHashCode(this));
        System.out.println(Sith.class + " class address: " + System.identityHashCode(Sith.class));
    }

    //Prints the Name of "this" Sith address of the object
    @Override
    public String toString() {
        return "Sith{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    // Step 8: Create a main method to test the class
    public static void main(String[] args) {
        Sith sith1 = new Sith("Darth Sidious", SithRank.MASTER);
        Sith sith2 = new Sith("Darth Maul", SithRank.APPRENTICE);
        Sith sith3 = new Sith("Count Dooku", SithRank.APPRENTICE);
        printSithCount();
        System.out.println();

        System.out.println("Sith 1: " + sith1);
        sith1.printMemoryInfo();
        System.out.println();

        System.out.println("Sith 2: " + sith2);
        sith2.printMemoryInfo();
    }
}
