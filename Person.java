public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }

}