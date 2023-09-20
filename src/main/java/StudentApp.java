import java.util.Iterator;

/**
 * Represents the application which can handle one or more students, and
 * calculate the average age.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp {
  private StudentRegister studentRegister;

  /**
   * Creates an instance of StudentApp.
   */
  public StudentApp() {
    this.studentRegister = new StudentRegister();
  }

  /**
   * Prints the details about a student to the console.
   *
   * @param student the student to print the information about.
   */
  private void printStudentInfo(Student student) {
    System.out.println("Name of student: " + student.getName());
    System.out.println("Age of student: " + student.getAge());
    System.out.println("Student ID of student: " + student.getStudentId());
  }

  /**
   * Prints all students in the register to the console.
   */
  public void printAllStudents() {

    Iterator<Student> it = this.studentRegister.iterator();
    while (it.hasNext()) {
      Student student = it.next();
      printStudentInfo(student);
    }
  }

  /**
   * Starts the application. This is the main entrypoint for the instance of StudentApp.
   */
  public void start() {
    this.studentRegister.fillRegisterWithDefaultStudents();

    System.out.println("*****  Student Register App v0.2 *****");
    System.out.println(); // Prints an empty line
    System.out.println("Welcome to this fantastic application :-)");

    System.out.println("Number of students: " + this.studentRegister.getNumberOfStudents());

    // Find the student at pos 1:
    Student foundStudent = this.studentRegister.getStudentAt(1);

    // Print name of student
    System.out.println("Name of student at pos 1: " + foundStudent.getName());
    System.out.println("Age of thudent at pos 1: " + foundStudent.getAge());

    // Print all students
    this.printAllStudents();

    // Find student called Lise
    Student student = this.studentRegister.findStudentByName("Lise");

    if (student != null) {
      printStudentInfo(student);
    } else {
      System.out.println("Could not find student.");
    }
  }

  /**
   * This is the method called by the JVM (Java Virtual Machine), or the operating system to
   * "start" your application. The syntax and name of this method is defined by the system, and
   * all programming languages must implement this method in order for the OS to be able to find
   * which method to call to start the application.
   *
   * <p>Since Java is a "pure" Object Oriented language, nothing happens without an object, so the
   * first thing that we need to do in this main()-method, is to create the instance of the class
   * responsible for playing the role of the application as such; here the StudentApp-class.
   *
   * <p>After the instance have been created, we call the start()-method of the instance to
   * start executing the student application.
   */
  public static void main(String[] args) {
    StudentApp studentApp = new StudentApp();
    studentApp.start();
  }
}
