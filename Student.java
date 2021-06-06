public class Student extends Person {

    private String lastName;
    private String firstName;
    private int gradeLevel;
    private final String ID;
    private final String email;

    public Student(String f, String l, int gradeLevel) {
        super(f, l);
        this.gradeLevel = gradeLevel;
        this.ID = "1000" + String.valueOf((int)(Math.random() * 9000) + 1000); // Random 4 Digit Number
        this.email = this.ID + "@fakeschool.edu";
    }

    // Mutators and Accessors

    public void setFirstName(String newName) { this.firstName = newName; }
    public void setLastName(String newName) { this.lastName = newName; }
    public void setGradeLevel(int newGrade) { this.gradeLevel = newGrade; }

    public int getGradeLevel() { return this.gradeLevel; }
    public String getID() { return this.ID; }

}
