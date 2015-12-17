package ru.pavelnix;


/**
 * Class counts the values of the quadratic function on the interval
 * add
 */
public class ValuesQuadraticFunction {

    private CubeFunction cubeFunction;
    private Segment segment;

    /**
     * Constructor
     *
     * @param cubeFunction - Function with the set parameters
     * @param segment      - Segment
     */
    public ValuesQuadraticFunction(CubeFunction cubeFunction, Segment segment) {
        this.cubeFunction = cubeFunction;
        this.segment = segment;
    }

    /**
     * Method counts the values of the quadratic function on the interval
     *
     * @return values of the quadratic function on the interval
     */
    public float[] valuesQuadraticFunctionOnInterval() {
        int numberElementsInArray = segment.getPointB() / segment.getPointA(); //the number of elements in the array
        int leftPoint = segment.getPointA();
        float[] array = new float[numberElementsInArray];

        for (int i = 0; i < numberElementsInArray; i++) {
            array[i] = cubeFunction.calculate(leftPoint + i);
        }
        return array;
    }
}