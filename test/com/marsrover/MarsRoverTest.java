package com.marsrover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void shouldReturnMarsRoverInitialPosition() {
        MarsRover marsRover = new MarsRover(0, 0, "N");

        assertEquals("0 0 N", marsRover.getPosition());
    }

    @Test
    public void shouldReturnMarsRoverPositionIfAssignedTo10S() {
        MarsRover marsRover = new MarsRover(1, 0, "S");

        assertEquals("1 0 S", marsRover.getPosition());
    }

    @Test
    public void shouldMove() {
        MarsRover marsRover = new MarsRover(1, 2, "N");
        marsRover.move("LMLMLMLMM");

        assertEquals("1 3 N", marsRover.getPosition());
    }
}
