package com.marsrover;

import java.io.IOException;

public class MarsRoverApplication {
    View view;
    Parser parser;

    public MarsRoverApplication(View view, Parser parser) {
        this.view = view;
        this.parser = parser;
    }

    public void start() throws IOException {
        view.print("Enter number of rovers:");
        String numberOfRovers;
        numberOfRovers = view.acceptInput();

        for (int i = 0; i < Integer.parseInt(numberOfRovers); i++) {
            MarsRover marsRover;
            view.print("Enter Rover position");
            marsRover = parser.parse(view.acceptInput());
            view.print("Enter Instruction:");
            marsRover.move(view.acceptInput());
            view.print(marsRover.getPosition());
        }
    }
}
