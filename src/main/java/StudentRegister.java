//import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

/**
 * Represents a register of students.
 *
 * <p>The following functionality is implemented:
 * <ul>
 *   <li>Search for a student by name</li>
 *   <li>Add a student</li>
 *   <li>Remove student</li>
 *   <li>Get number of students</li>
 *   <li>Get a set of students based on a criterium</li>
 *   <li>List all students</li>
 * </ul>
 *
 * @author Arne Styve
 * @version 2023-09-19
 */
public class StudentRegister {
  //private ArrayList<Student> students;
  private HashMap<String, Student> students;

  /**
   * Creates an instance of StudentRegister.
   */
  public StudentRegister() {
    this.students = new HashMap<>();
  }

  /**
   * Adds a student to the register.
   *
   * @param student the student to be added.
   */
  public void addStudent(Student student) {
    this.students.put(student.getStudentId(), student);
  }

  /**
   * Returns the number of students in the register.
   *
   * @return the number of students in the register.
   */
  public int getNumberOfStudents() {
    return this.students.size();
  }

  /**
   * Returns the student at a given position in the register,
   * given by the parameter studentID.
   *
   * @param studentId the student ID of the student to return.
   *                  If no student found, null is returned
   * @return the student at a given Student ID
   */
  public Student findStudentByStudentID(String studentId) {
    return this.students.get(studentId);
  }

  /**
   * Searches the register for a student with the given name.
   * If no students found matching the name, null is returned.
   *
   * <p>In this version we use the while loop with iterator resulting in the
   * first student in the register with a matching name being returned.
   *
   * @param name the name of the student to search for
   * @return the student found with the given name
   */
  public Student findStudentByName(String name) {
    Student foundStudent = null;

    Iterator<Student> it = this.students.values().iterator();

    while ((foundStudent == null) && it.hasNext()) {
      Student student = it.next(); // Returns next student in collection

      if (student.getName().equals(name)) {
        foundStudent = student;
      }
    }

    return foundStudent;
  }

  /**
   * Fills the register with 5 default/dummy students for testing purposes only.
   */
  public void fillRegisterWithDefaultStudents() {
    this.addStudent(new Student("Lise", 34, "787878"));
    this.addStudent(new Student("Jens", 24, "625342"));
    this.addStudent(new Student("Lars", 28, "324354"));
    this.addStudent(new Student("Trine", 22, "975645"));
  }

  /**
   * Returns an iterator for the register.
   *
   * @return an iterator for the register.
   */
  public Iterator<Student> iterator() {
    return this.students.values().iterator();
  }
}
