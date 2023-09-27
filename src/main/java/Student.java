
/**
 * Represents a student with name, age and studentId.
 *
 * @author Arne
 * @version 2023-08-28
 */

public class Student {
  // Felt (variabler)
  private String name;
  private int age;
  private String studentId; //Must be 6 numbers - "032456"

  // Konstruktør(er)
  /**
   * Creates an istance of Student.
   *
   * @param studentName           Name of student
   * @param studentAge            Age of student. Must be a positive number.
   * @param studentIdentification Student identifiaction. A 6 digit number, on the form "045364"
   */
  public Student(String studentName, int studentAge, String studentIdentification) {
    name = studentName;
    setAge(studentAge);
    studentId = studentIdentification;
  }

  // Metoder (funksjon)

  /**
   * Returns the name of the student.
   *
   * @return name of the student.
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the age of the student.
   *
   * @return age of student.
   */
  public int getAge() {
    return age;
  }

  /**
   * Returns the Student ID.
   *
   * @return student ID
   */
  public String getStudentId() {
    return studentId;
  }

  /**
   * Sets the age of the student accoring to the parameter given.
   * Age must be a positive number.
   *
   * @param studentAge age to be set. Must be a positive number.
   */
  public void setAge(int studentAge) {
    if (studentAge > 0) {
      age = studentAge;
    }
  }

  /**
   * Sets the name of the student.
   *
   * @param studentName the name to be set.
   */
  public void setName(String studentName) {
    name = studentName;
  }

  /**
   * Sets the student ID of the student.
   *
   * @param studentIdentification the student ID to be set.
   */
  public void setStudentId(String studentIdentification) {
    studentId = studentIdentification;
  }


}
