import java.util.Scanner;

public class Menu {
    private Database database;
    private Scanner scanner;

    public Menu(Database database) {
        this.database = database;
        this.scanner = new Scanner(System.in);
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Print");
            System.out.println("e. Search");
            System.out.println("f. Exit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    displayAddMenu();
                    break;
                case "b":
                    
                    break;
                case "c":
                   
                    break;
                case "d":
                    displayPrintMenu();
                    break;
                case "e":
                   
                    break;
                case "f":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayAddMenu() {
        System.out.println("Add Menu:");
        System.out.println("a. Add a Student");
        System.out.println("b. Add a Course");
        System.out.println("c. Add a Faculty");

        String choice = scanner.nextLine();
        switch (choice) {
            case "a":
                addStudent();
                break;
            case "b":
                addCourse();
                break;
            case "c":
                addFaculty();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addStudent() {
        System.out.println("Enter student ID:");
        String id = scanner.nextLine();
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, age);
        database.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private void addCourse() {
        System.out.println("Enter course code:");
        String code = scanner.nextLine();
        System.out.println("Enter course name:");
        String name = scanner.nextLine();

        Course course = new Course(code, name);
        database.addCourse(course);
        System.out.println("Course added successfully.");
    }

    private void addFaculty() {
        System.out.println("Enter faculty ID:");
        String id = scanner.nextLine();
        System.out.println("Enter faculty name:");
        String name = scanner.nextLine();
        System.out.println("Enter faculty department:");
        String department = scanner.nextLine();

        Faculty faculty = new Faculty(id, name, department);
        database.addFaculty(faculty);
        System.out.println("Faculty added successfully.");
    }

    private void displayPrintMenu() {
        System.out.println("Print Menu:");
        System.out.println("a. Print all students");
        System.out.println("b. Print all courses");
        System.out.println("c. Print all faculties");

        String choice = scanner.nextLine();
        switch (choice) {
            case "a":
                printAllStudents();
                break;
            case "b":
                printAllCourses();
                break;
            case "c":
                printAllFaculties();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void printAllStudents() {
        for (Student student : database.getStudents()) {
            System.out.println(student);
        }
    }

    private void printAllCourses() {
        for (Course course : database.getCourses()) {
            System.out.println(course);
        }
    }

    private void printAllFaculties() {
        for (Faculty faculty : database.getFaculties()) {
            System.out.println(faculty);
        }
    }
}
