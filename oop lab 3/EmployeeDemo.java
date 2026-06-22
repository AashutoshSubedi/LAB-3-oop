
class Employee {
    public void displayDetails() {
        System.out.println("Employee Details");
    }
}
class Teacher extends Employee {
    @Override
    public void displayDetails() {
        System.out.println("Teaching Staff");
    }
}
class AdminStaff extends Employee {
    @Override
    public void displayDetails() {
        System.out.println("Administrative Staff");
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee teacher = new Teacher();
        Employee admin = new AdminStaff();
        teacher.displayDetails();
        admin.displayDetails();
    }
}