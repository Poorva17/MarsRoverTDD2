package com.marsrover;

public class Parser {
    MarsRover marsRover;

    public MarsRover parse(String rawInput) {
        String[] splitRawInput =  rawInput.split(" ");
        this.marsRover = new MarsRover(Integer.parseInt(splitRawInput[0]), Integer.parseInt(splitRawInput[1]), splitRawInput[2]);
        return this.marsRover;
    }
}
