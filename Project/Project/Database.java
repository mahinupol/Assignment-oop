import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }


}
