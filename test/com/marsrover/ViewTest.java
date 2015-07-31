package com.marsrover;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream original;

    @Test
    public void shouldPrintMarsRoverPosition() {
        System.setOut(new PrintStream(outputStream));
        original = System.out;
        View view = new View();
        String marsRoverPosition = "0 0 N";
        view.print(marsRoverPosition);

        assertEquals("0 0 N\n", outputStream.toString());
        System.setOut(original);
    }

    @Test
    public void shouldAcceptInput() throws IOException {
        System.setIn(new ByteArrayInputStream("1 2 N".getBytes()));
        View view = new View();
        String input = view.acceptInput();
        assertEquals("1 2 N", input);
        System.setIn(System.in);
    }
}
