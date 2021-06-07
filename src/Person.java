public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public void setFirstName(String newName) { this.firstName = newName; }
    public void setLastName(String newName) { this.lastName = newName; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }

}