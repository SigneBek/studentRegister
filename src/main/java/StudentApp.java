import java.util.Iterator;
import java.util.Scanner;

/**
 * Represents the application which can handle one or more students, and
 * calculate the average age.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp {
  /**
   * This is the method called by the JVM (Java Virtual Machine), or the operating system to
   * "start" your application. The syntax and name of this method is defined by the system, and
   * all programming languages must implement this method in order for the OS to be able to find
   * which method to call to start the application.
   *
   * <p>Since Java is a "pure" Object-Oriented language, nothing happens without an object, so the
   * first thing that we need to do in this main()-method, is to create the instance of the class
   * responsible for playing the role of the application as such; here the StudentApp-class.
   *
   * <p>After the instance have been created, we call the start()-method of the instance to
   * start executing the student application.
   */
  public static void main(String[] args) {
    StudentAppUi studentAppUi = new StudentAppUi();
    studentAppUi.start();
  }
}
