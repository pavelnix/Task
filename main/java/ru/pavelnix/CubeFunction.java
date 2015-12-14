package ru.pavelnix;

/**
 * Class CubeFunction
 */
public class CubeFunction {

    private float a;
    private float b;
    private float c;

    /**
     * Constructor of the clas
     *
     * @param a, b, c - the parameters of a quadratic function
     */
    public CubeFunction(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method calculates the value of the function at the point
     *
     * @param point - point
     * @return value of the function at the point
     */
    public float calculate(int point) {
        return a * point * point + b * point + c * point;
    }
}