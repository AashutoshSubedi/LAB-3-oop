class Attendance {
    void calculateAttendance() {
        System.out.println("General Attendance Calculation");
    }
}
class EngineeringAttendance extends Attendance {
    @Override
    void calculateAttendance() {
        System.out.println("Engineering Attendance = 75%");
    }
}
class MedicalAttendance extends Attendance {
    @Override
    void calculateAttendance() {
        System.out.println("Medical Attendance = 85%");
    }
}
public class AttendanceDemo {
    public static void main(String[] args) {
        Attendance eng = new EngineeringAttendance();
        Attendance med = new MedicalAttendance();
        eng.calculateAttendance();
        med.calculateAttendance();
    }
}
