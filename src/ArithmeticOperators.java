/**
 * Class used to call a method
 * that do a certain arithmetic operation
 * @author Matteo Calenda
 */
public class ArithmeticOperators {

    /**
     * method that return the sum of the two passed param
     * @param num1 first addend
     * @param num2 second addend
     * @return sum of the two added
     */
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * method that return the subtraction of the two passed param
     * @param num1 minuend
     * @param num2 subtrahend
     * @return difference of the two numbers
     */

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    /**
     * method that return the product of the two passed param
     * @param num1 first factor
     * @param num2 second factor
     * @return product of the two factors
     */
    public int mul(int num1, int num2){
        return num1 * num2;
    }

    /**
     * method that return the quotient of the division of the two passed param
     * @param num1 dividend
     * @param num2 divisor
     * @return quotient of the two number
     */
    public int div(int num1, int num2){
        return num1 / num2;
    }
}
