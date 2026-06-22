class Student {
    private String name;
    private int rollNo;
    private String faculty;

    public Student(String name, int rollNo, String faculty) {
        this.name = name;
        this.rollNo = rollNo;
        this.faculty = faculty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Faculty: " + faculty);
    }

    public static void main(String[] args) {
        Student s = new Student("Aashutosh", 101, "BCA");
        s.displayProfile();
    }
}
