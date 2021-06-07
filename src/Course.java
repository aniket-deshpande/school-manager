import java.util.ArrayList;

public class Course {

  private String name;
  private Teacher teacher;
  private ArrayList<Student> students;
  // private Schedule timings;

  public Course(String name) {
    this.name = name;
  }

  public String getName() { return this.name; }
  public Teacher getTeacher() { return this.teacher; }

}
