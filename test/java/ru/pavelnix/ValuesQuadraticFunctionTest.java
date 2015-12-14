package ru.pavelnix;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//Static import for method assertThat()
//import static org.hamcrest.MatcherAssert.assertThat;
//Static import for method is()
//import static org.hamcrest.CoreMatchers.is;

/**
 * Class which check calculation of the quadratic function
 */
public class ValuesQuadraticFunctionTest {

    /**
     * Checking calculation of the quadratic function at the point
     */
    @Test
    public void checkCalculationQuadraticFunctionAtPoint() {
        //Arrange
        CubeFunction cubeFunction = new CubeFunction(1, 1, 1);

        //Act
        float valueOfCubeFunction = cubeFunction.calculate(1);

        //Assert
        assertThat(valueOfCubeFunction, is(3.0f));
    }

    /**
     * Checking calculation of the quadratic function on the interval
     */
    @Test
    public void checkingCalculationQuadraticFunctionOnInterval() {
        //Arrange
        CubeFunction cubeFunction = new CubeFunction(2.8f, 6, 1);
        Segment segment = new Segment(1, 3);
        float[] array = {9.8f, 25.2f, 46.199997f};
        ValuesQuadraticFunction valuesQuadraticFunction = new ValuesQuadraticFunction(cubeFunction, segment);

        //Act
        float[] valueOfInterval = valuesQuadraticFunction.valuesQuadraticFunctionOnInterval();

        //Assert
        assertThat(valueOfInterval, is(array));
    }

}