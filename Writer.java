import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private File file;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    public Writer(String path) {
        file = new File(path);
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(fileWriter);
    }

    public File getFile() { return file; }
    public FileWriter getFileWriter() { return fileWriter; }
    public BufferedWriter getBufferedWriter() { return bufferedWriter; }

    public void writeStudent(Student s) throws IOException {
		bufferedWriter.write(s.getLastName() + ", " + s.getFirstName() + ", " + s.getGradeLevel() + "\n");
		System.out.println("Student added!");
		bufferedWriter.close();
    }

    public void writeTeacher(Teacher t) throws IOException {
        bufferedWriter.write(t.getLastName() + ", " + t.getFirstName() +"\n");
		System.out.println("\nTeacher added!");
		bufferedWriter.close();
    }

    public void writeCourse(Course c) throws IOException {
        bufferedWriter.write(c.getName() + ", " + c.getTeacher().getLastName() + "\n");
		System.out.println("\nCourse added!");
		bufferedWriter.close();
    }
    
}
