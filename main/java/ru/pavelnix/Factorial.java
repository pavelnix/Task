package ru.pavelnix;

/**
 * Class Factorial
 */
public class Factorial {
    /**
     * validate - boolean variable is true if factorial exist and false if not.
     * number - integer variable factorial of which we want to calculate/
     */
    private boolean validate;
    private int number;
/**/
    /**
     * Constructor
     */
    public Factorial(int number) {
        if (number < 0) {
            this.validate = false;
        } else {
            this.number = number;
        }
    }

    /**
     * Getter for validate
     */
    public boolean getValidate() {
        return this.validate;
    }

    /**
     * Method is count factorial
     */
    public int countFactorial() {
        int result = 1;
        for (int i = 2; i <= this.number; i++) {
            result *= i;
        }
        return result;
    }

}