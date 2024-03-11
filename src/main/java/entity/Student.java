package entity;

public class Student {
    private long Id;
    private String firstName;
    private String lastName;

    public long getId() {
        return Id;
    }

    public Student setId(long id) {
        Id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
