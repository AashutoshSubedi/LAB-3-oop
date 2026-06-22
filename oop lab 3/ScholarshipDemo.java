abstract class Scholarship {
    abstract void checkEligibility(int marks);
}
class MeritScholarship extends Scholarship {
    @Override
    void checkEligibility(int marks) {
        if (marks >= 80) {
            System.out.println("Eligible for Merit Scholarship");
        } else {
            System.out.println("Not Eligible for Merit Scholarship");
        }}}
class NeedBasedScholarship extends Scholarship {
    @Override
    void checkEligibility(int marks) {
        if (marks >= 50) {
            System.out.println("Eligible for Need-Based Scholarship");
        } else {
            System.out.println("Not Eligible for Need-Based Scholarship");
        }}}
public class ScholarshipDemo {
    public static void main(String[] args) {
        Scholarship s1 = new MeritScholarship();
        Scholarship s2 = new NeedBasedScholarship();
        s1.checkEligibility(85);
        s2.checkEligibility(60);
    }}
