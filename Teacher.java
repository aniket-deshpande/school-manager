public class Teacher extends Person {

  private String lastName;
  private String firstName;
  private final String email;

  public Teacher(String f, String l) {
    super(f, l);
    this.email = l + "." + f + "@fakeschool.edu";
  }

  // Mutators and Accessors

  public void setFirstName(String newName) { this.firstName = newName; }
  public void setLastName(String newName) { this.lastName = newName; }


}
