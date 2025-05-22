package week3;

public class Teacher extends People {
    // private fields //
    private String subject;

    // constructors //
    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    // getters //
    public String getSubject() {
        return subject;
    }

    // setters //
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // methods //
    public void gradePapers() {
        System.out.println("The teacher graded students papers");
    }
    public void teachLesson() {
        System.out.println("The teacher taught a lesson");
    }
}
