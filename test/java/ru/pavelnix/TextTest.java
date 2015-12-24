package ru.pavelnix;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class witch test class Text
 */
public class TextTest {

    /**
     * Method check how to remove duplicates lines of text
     */
    @Test
    public void checkRemoveDuplicatesLinesText() {
        //Arrange
        String[] strings =
                {"123",
                        "456",
                        "123",
                        "123",
                        "789"};
        String[] assertStrings =
                {"123",
                        "456",
                        "789"};

        Text text = new Text(strings);

        //Act
        String[] resultStrings = text.removeDuplicatesLinesText();

        //Assert
        assertThat(resultStrings, is(assertStrings));
    }
}