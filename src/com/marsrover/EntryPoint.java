package com.marsrover;

public class EntryPoint {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        System.out.println(marsRover.getPosition());
    }
}
