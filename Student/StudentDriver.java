public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Shreya", 101, "Computer Science");

        s1.enrollCourse("Data Structures", "CS201", 4);
        s1.enrollCourse("Operating Systems", "CS301", 3);
        s1.enrollCourse("AI Basics", "CS410", 2);

        s1.displayStudent();
    }
}
