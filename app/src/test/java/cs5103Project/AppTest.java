package cs5103Project;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAdditionOfTwoPositiveNumbers() {
        App classUnderTest = new App();
        String inputOne = "10 20 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 30", "10 + 20 = 30", classUnderTest.runCalculator());
    }

    @Test public void testAdditionOfZeroAndZero() {
        App classUnderTest = new App();
        String inputOne = "0 0 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "0 + 0 = 0", classUnderTest.runCalculator());
    }

    @Test public void testAdditionOfPositiveAndNegative() {
        App classUnderTest = new App();
        String inputOne = "15 -20 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "15 + -20 = -5", classUnderTest.runCalculator());
    }

    @Test public void testAdditionOfNegativeAndPositive() {
        App classUnderTest = new App();
        String inputOne = "-15 20 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "-15 + 20 = 5", classUnderTest.runCalculator());
    }

    @Test public void testAdditionOfTwoNegativeNumbers() {
        App classUnderTest = new App();
        String inputOne = "-15 -20 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "-15 + -20 = -35", classUnderTest.runCalculator());
    }

    @Test public void testSubtractionOfTwoPositiveNumbers() {
        App classUnderTest = new App();
        String inputOne = "15 20 - n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "15 - 20 = -5", classUnderTest.runCalculator());
    }

    @Test public void testSubtractionOfZero() {
        App classUnderTest = new App();
        String inputOne = "0 0 - n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "0 - 0 = 0", classUnderTest.runCalculator());
    }

    @Test public void testSubtractionOfTwoPositiveNumbersForPositiveOutcome() {
        App classUnderTest = new App();
        String inputOne = "3335 2000 - n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "3335 - 2000 = 1335", classUnderTest.runCalculator());
    }

    @Test public void testSubtractionOfTwoNegativeNumbers() {
        App classUnderTest = new App();
        String inputOne = "-15 -20 - n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "-15 - -20 = 5", classUnderTest.runCalculator());
    }

    @Test public void testStringOutputWithDecimal() {
        App classUnderTest = new App();
        String inputOne = "15.1 20.3 + y";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Answer should be 0", "15.1 + 20.3 = 35.40", classUnderTest.runCalculator());
    }

    @Test public void testEnteringCharacterFailure() {
        App classUnderTest = new App();
        String inputOne = "15.1 20.3 * y";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertEquals("Cannot try multiplication", "* is not a valid operator, please try again using + or -.", classUnderTest.runCalculator());
    }

}
