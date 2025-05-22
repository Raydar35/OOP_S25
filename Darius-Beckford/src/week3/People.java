package week3;

public class People {
    // private fields //
    private String firstName;
    private String lastName;

    // constructors //
    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters //
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    // setters //
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
