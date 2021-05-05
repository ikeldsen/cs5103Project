package cs5103Project;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAdditionHappyPath() {
        App classUnderTest = new App();
        String inputOne = "10 20 + n";
        InputStream in = new ByteArrayInputStream(inputOne.getBytes());
        System.setIn(in);

        assertNotNull("App should have no errors", classUnderTest.runCalculator());
    }

}
