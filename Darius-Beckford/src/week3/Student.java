package week3;

public class Student extends People {
    // private fields //
    private String gradeLevel;

    // constructors //
    public Student(String firstName, String lastName, String gradeLevel) {
        super(firstName, lastName);
        this.gradeLevel = gradeLevel;
    }

    // getters //
    public String getGradeLevel() {
        return gradeLevel;
    }

    // setters //
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    // methods //
    public void study() {
        System.out.println("The student studied for a bit");
    }

    public void takeTest() {
        System.out.println("The student took a test");
    }
}