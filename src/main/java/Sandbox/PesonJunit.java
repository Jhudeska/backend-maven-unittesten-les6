package Sandbox;

public class PesonJunit {
    private String firstName;
    private String lastName;
    private int age;

    public PesonJunit(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean hasBirthday() {
        return this.age == 16;
    }

}
