import org.example.Main;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void mainTest(){
        String input = "25\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Main.main(args);

        String expectedOutput = "Enter a number to test if is Prime: \n" +
                "The value 25 is prime : false";

        assertEquals(expectedOutput,out.toString());
    }

}
