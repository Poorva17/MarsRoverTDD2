package com.marsrover;

public class Parser {

    public MarsRover parse(String rawInput) {
        String[] splitRawInput =  rawInput.split(" ");
        return new MarsRover(Integer.parseInt(splitRawInput[0]), Integer.parseInt(splitRawInput[1]), splitRawInput[2]);

    }
}
