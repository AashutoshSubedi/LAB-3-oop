
    import java.util.ArrayList;
    class Course {
        String courseName;
        Course(String courseName) {
            this.courseName = courseName;}}
    class StudentData {
        String name;
        ArrayList<Course> courses = new ArrayList<>();
        StudentData(String name) {
            this.name = name;}
        void addCourse(Course course) {
            courses.add(course);}
        void displayCourses() {
            System.out.println("Student Name: " + name);
            System.out.println("Registered Courses:");
            for (Course c : courses) {
                System.out.println("- " + c.courseName);}}}
    public class StudentCourses {
        public static void main(String[] args) {
            StudentData student = new StudentData("Aashutosh");
            student.addCourse(new Course("Java"));
            student.addCourse(new Course("DBMS"));
            student.addCourse(new Course("Networking"));
            student.displayCourses();}}

