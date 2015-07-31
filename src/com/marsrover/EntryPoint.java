package com.marsrover;

import java.io.IOException;

public class EntryPoint {
    public static void main(String[] args) throws IOException {

        View view = new View();
        Parser parser = new Parser();
        MarsRover marsRover;
        view.print("Enter Rover position");
        marsRover = parser.parse(view.acceptInput());
        view.print("Enter Instruction:");
        marsRover.move(view.acceptInput());
        view.print(marsRover.getPosition());
    }
}
