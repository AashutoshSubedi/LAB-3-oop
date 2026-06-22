abstract class StudentFee {
    abstract void calculateFee();
}

class Undergraduate extends StudentFee {
    @Override
    void calculateFee() {
        System.out.println("Undergraduate Fee = Rs. 50,000");
    }
}

class Graduate extends StudentFee {
    @Override
    void calculateFee() {
        System.out.println("Graduate Fee = Rs. 80,000");
    }
}
public class FeeSystem {
    public static void main(String[] args) {

        StudentFee s1 = new Undergraduate();
        StudentFee s2 = new Graduate();

        s1.calculateFee();
        s2.calculateFee();
    }
}