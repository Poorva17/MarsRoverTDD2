package com.marsrover;

public class EntryPoint {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        View view = new View();
        view.print("MarsRover Position:");
        view.print(marsRover.getPosition());
    }
}
