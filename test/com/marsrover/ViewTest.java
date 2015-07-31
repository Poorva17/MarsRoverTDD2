package com.marsrover;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ViewTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        original = System.out;
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

    @Test
    public void shouldPrintMarsRoverPosition() {
        View view = new View();
        String marsRoverPosition = "0 0 N";
        view.print(marsRoverPosition);

        Assert.assertEquals("0 0 N\n", outputStream.toString());
    }
}
