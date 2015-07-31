package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnDomainObject() {
        MarsRover marsRover = new MarsRover(1, 2, "N");
        Parser parser = new Parser();

        assertEquals(marsRover, parser.parse("1 2 N"));
    }
}
