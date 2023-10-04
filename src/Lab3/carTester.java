//21000539 Goitseone Themba
package Lab3;

public class carTester {
    public static void main(String[] args) {

        car codeMaverick = new car("Mercedes", "SLS 200", "1000", "red", false);

        codeMaverick.setMileage(String.valueOf(Integer.parseInt(codeMaverick.getMileage()) + 15000));

        codeMaverick.setInsured(true);

        System.out.println(codeMaverick);
    }
}
