package com.marsrover;

public class EntryPoint {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover(1, 2, "N");
        View view = new View();
        view.print("MarsRover Position:");
        view.print(marsRover.getPosition());
        marsRover.move("LMLMLMLMM");
        view.print("MarsRover Position after instruction LMLMLMLMM:");
        view.print(marsRover.getPosition());
        MarsRover marsRover1 = new MarsRover(3, 3, "E");
        view.print("MarsRover Position:");
        view.print(marsRover1.getPosition());
        marsRover1.move("MMRMMRMRRM");
        view.print("MarsRover Position after instruction MMRMMRMRRM :");
        view.print(marsRover1.getPosition());
    }
}
