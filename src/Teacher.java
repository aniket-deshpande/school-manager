public class Teacher extends Person {

  private String lastName;
  private String firstName;
  private final String email;

  public Teacher(String f, String l) {
    super(f, l);
    this.email = l + "." + f + "@fakeschool.edu";
  }

}
