# Student Register Application
## Description
This project is used as basis for the live coding sessions in the course "IDATA1003 Programmering 1" 
at NTNU in Ålesund.

The project is a simple student register application that can be used to register students.

The project contains 3 classes:
* **Student** - Rerpesenting a student holding the necessary information we want to 
  record (name, age and student ID)
* **StudentRegister** - Represents the register used to hold all the students. This register makes use of
  the class ArrayList to manage the collection of students. The StudentRegister class has been designed
  so that the use of ArrayList internally to the class is not "visible" from the outside of the class 
  for the objects interacting with the StudentRegister object.
* **StudentRegisterApp** - Represents the application as such. It is this class that holds the ***main()***
  -method needed for the OS to start our application, and it is also this class that handles **all** input
  and output from/to the user.

## Releases
| Release | Description                                                                                                                            |
| ------- |----------------------------------------------------------------------------------------------------------------------------------------|
| [v0.3] | Introduced the Iterator-class. Moved the **printAllStudents()**-method from the StudentRegister-class to the StudentRegisterApp-class. |
| [v0.2] | Introduced the StudentRegister-class.                                                                                                  |

