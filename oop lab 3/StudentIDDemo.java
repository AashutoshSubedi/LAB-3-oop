public class StudentIDDemo {
    static int counter = 1000;
    int id;
    String name;
    StudentIDDemo(String name) {
        this.name = name;
        this.id = ++counter;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        StudentIDDemo s1 = new StudentIDDemo("Ram");
        StudentIDDemo s2 = new StudentIDDemo("Sita");
        StudentIDDemo s3 = new StudentIDDemo("Hari");
        s1.display();
        s2.display();
        s3.display();
    }
}
