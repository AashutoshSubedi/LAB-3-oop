class Member {
    void borrowingLimit() {
        System.out.println("General Member Limit: 2 Books");
    }
}
class StudentMember extends Member {
    @Override
    void borrowingLimit() {
        System.out.println("Student Member Limit: 3 Books");
    }
}
class TeacherMember extends Member {
    @Override
    void borrowingLimit() {
        System.out.println("Teacher Member Limit: 10 Books");
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Member s = new StudentMember();
        Member t = new TeacherMember();
        s.borrowingLimit();
        t.borrowingLimit();
    }
}