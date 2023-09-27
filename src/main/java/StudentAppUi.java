import java.util.Iterator;
import java.util.Scanner;

/**
 * Represents the USer Interface of the Student Application
 */

public class StudentAppUi {


    private StudentRegister studentRegister;

    /**
     * Creates an instance of StudentApp.
     */
    public StudentAppUi() {
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

        System.out.println("*****  Student Register App v0.5 *****");
        System.out.println(); // Prints an empty line
        System.out.println("Welcome to this fantastic application :-)");

        System.out.println("Number of students: " + this.studentRegister.getNumberOfStudents());

        boolean finished = false;
        while (!finished) {
            //Ask the user to sreate new student
            //Until they are bored..
            System.out.println("Do you want to add a new a student (y/n)?");

            Scanner inputScanner = new Scanner(System.in);
            String userInput = inputScanner.nextLine();

            if (userInput.toUpperCase().startsWith("Y")) {
                //Create new student from user input
                //Gather information about the student to create

                System.out.println("Please enter name of student: ");
                String studentName = inputScanner.nextLine();

                System.out.println("Please enter ID of student: ");
                String studentID = inputScanner.nextLine();

                System.out.println("Please enter age of student: ");
                int studentAge = inputScanner.nextInt();

                //Create the student from the gathered information
                Student studentToAdd = new Student(studentName, studentAge, studentID);

                //Add the student to the register
                this.studentRegister.addStudent(studentToAdd);

            } else {
                finished = true;
            }

            this.printAllStudents();
            System.out.println("Thank you for using this Student Register App. Goodbye for now!");
        }
    }
}
