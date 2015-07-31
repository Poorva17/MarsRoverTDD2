package com.marsrover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldReturnMarsRoverInitialPosition() {

        MarsRover marsRover = new MarsRover(0, 0, "N");

        assertEquals("0 0 N", marsRover.getPosition());
    }

}
