import java.util.ArrayList;

public class Student {
    String name;
    int rollNo;
    String department;
    ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student() {}

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        System.out.println("Student created!");
    }

    public void enrollCourse(String courseName, String courseCode, int credits) {
        Course course = new Course(courseName, courseCode, credits);
        enrolledCourses.add(course);
        System.out.println("Enrolled in course: " + courseName);
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("------ Enrolled Courses ------");
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled yet.");
        } else {
            for (Course c : enrolledCourses) {
                c.displayCourse();
            }
        }
    }
}
