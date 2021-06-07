import java.util.*;
import java.io.*;
import java.lang.Thread;

public class Main {

	// File Writers & Readers
	static Writer studentWriter = new Writer("C:\\Dev\\AP\\SchoolManager\\txt\\students.txt");
	static Writer teacherWriter = new Writer("C:\\Dev\\AP\\SchoolManager\\txt\\teachers.txt");
	static Writer courseWriter = new Writer("C:\\Dev\\AP\\SchoolManager\\txt\\courses.txt");

	// Scanner and Lists
	public static Scanner input = new Scanner(System.in);
	static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();

	public static void main(String[] args) throws InterruptedException, IOException {
		init();
		Thread.sleep(3000);
		commandLine();
	}

	// Initialize the System
	public static void init() {
		System.out.println("Welcome to the School Management System.\nThe System will manage all of the school's teachers, students, and courses.\nIt will automatically schedule the courses.");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.print("Enter how many courses you want to add to your school (up to five) >> ");
		int numCourses = input.nextInt();

		input.nextLine();
		System.out.println();

		String[] c = new String[numCourses];
		for(int i = 0; i < c.length; i++) {
			System.out.print("Enter the course name >> ");
			c[i] = input.nextLine();
			courses.add(new Course(c[i]));
		}

		System.out.println("\nYour courses are added! You will now see the System's command line open in 3 seconds. From there you can control your entire School. Be sure to type \"H\" to get a list of commands.");
	}

	// Command Line Loop
	public static void commandLine() throws InterruptedException, IOException {
		String s = "";
		while(!s.equals("Q")) {
			System.out.print("SCHOOL >> ");
			s = input.nextLine();

			switch(s) {
				case "H":
					System.out.println(getHelp());
					break;
				case "Q":
					System.out.println("Exiting in 5 seconds...");
					Thread.sleep(5000);
					System.exit(0);
				case "A":
					System.out.print("Do you want to add a (T)eacher, (S)tudent, or (C)ourse? >> ");
					String add = input.nextLine();
					switch(add) {
						case "T":
							System.out.print("Enter the teacher's last name >> ");
							String tLast = input.nextLine();
							System.out.print("Enter the teacher's first name >> ");
							String tFirst = input.nextLine();

							teachers.add(new Teacher(tFirst, tLast));
							teacherWriter.writeTeacher(new Teacher(tFirst, tLast));
							commandLine();
						case "S":
							System.out.print("Enter the student's last name >> ");
							String sLast = input.nextLine();
							System.out.print("Enter the student's first name >> ");
							String sFirst = input.nextLine();
							System.out.print("Enter the student's grade level >> ");
							int sGrade = input.nextInt();

							students.add(new Student(sFirst, sLast, sGrade));
							studentWriter.writeStudent(new Student(sFirst, sLast, sGrade));
							commandLine();
						case "C":
							System.out.print("Enter the course's name >> ");
							String cName = input.nextLine();

							courses.add(new Course(cName));
							courseWriter.writeCourse(new Course(cName));
							commandLine();
					}
				default:
					System.out.println("Not a valid command, restarting command line in 3 seconds...");
					Thread.sleep(3000);
					commandLine();
			}
		}
	}

	public static String getHelp() { 
		return (
			"THE COMMAND LINE IS CASE SENSITIVE\n\tH: List of Commands\n\tQ: Save and Quit Program\n\tA: Add a Teacher, Student, or Course"
		);
	}
}

