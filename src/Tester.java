/**
 * Class tester to run the program
 * @author Matteo Calenda
 */
public class Tester {
    /**
     * method main
     * @param args don't know
     */
    public static void main(String[] args) {
        ArithmeticOperators operator = new ArithmeticOperators();

        int num1 = 2, num2 = 2; //

        System.out.println("Operation with 2 and 2:" + "\n" +
                "Sum:" + operator.sum(num1, num2) + "\n" +
                "Sub:" + operator.sub(num1, num2) + "\n" +
                "div:" + operator.div(num1, num2) + "\n" +
                "mul:" + operator.mul(num1, num2) );
    }
}
